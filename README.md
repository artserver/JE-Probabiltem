# Probabiltem
아이템 획득률을 추가합니다.

### 주의!
본 플러그인은 DataStorage 를 사용합니다.

## 사용 방법
메이븐을 통해 본 플러그인을 라이브러리에 추가할 수 있습니다.

### Repositories
```xml
    <repositories>
        <repository>
            <id>laeng-maven-repo</id>
            <url>https://github.com/Laeng/maven-repo/raw/master/snapshots</url>
        </repository>
    </repositories>
```
### Dependencies
```xml
    <dependencies>
        <dependency>
            <groupId>kr.laeng</groupId>
            <artifactId>Probabiltem</artifactId>
            <version>1.0-SNAPSHOT</version>
            <scope>provided</scope>
        </dependency>
    </dependencies>
```

## 예제
일요일마다 아이템 획득률을 10만큼 올려주는 플러그인
```java
package kr.laeng.plugin;

import kr.laeng.probabiltem.ProbabiltemAPI;
import kr.laeng.probabiltem.event.player.*;

import kr.laeng.probabiltem.material.MaterialType;import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.Calendar;

public final class Plugin extends JavaPlugin implements Listener {
    
    @Override
    public void onEnable() {
        
    }

    @EventHandler
    public void onPlayerItemGetEvent(PlayerItemGetEvent event) {
        //아이템 획득시 발생하는 이벤트입니다. 

        double probability = event.getProbability();
        if(Calendar.getInstance().get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            event.addExtraPoint(10);
        }
        
        event.getPlayer().sendMessage(String.format("기존 획득 성공률: %.2f%% 추가 획득 성공률: %.2f%%", probability, event.getExtraPoint));
    }

    @EventHandler
    public void onPlayerProbabilityCheckEvent(PlayerProbabilityCheckEvent event) {
        //칼을 들고 오른쪽 클릭시 나오는 아이템 획득률을 확인할때 발생하는 이벤트입니다.
        
        if(Calendar.getInstance().get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            event.addExtraPoint(10);
        }
    }
    
    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent event) {
        //접속할때마다 아이템 획득률을 증가시킵니다.

        ProbabiltemAPI.addPlayerProbability(event.getPlayer(), MaterialType.GATHERING, 0.1);
        ProbabiltemAPI.addPlayerProbability(event.getPlayer(), MaterialType.FARMING, 0.1);
                
    }

    @Override
    public void onDisable() {
        
    }
}
```

## API 
아이템 획득률을 가져옵니다.
```
double getPlayerProbability(Player player, MaterialType materialType)
```

아이템 획득률을 가져옵니다.
```
double getPlayerProbability(Player player, MaterialType materialType, FileConfiguration data)
```

아이템 획득률을 높힙니다.
```
void addPlayerProbability(Player player, MaterialType materialType, double point)
```

아이템 획득률을 높힙니다.
```
void addPlayerProbability(Player player, MaterialType materialType, FileConfiguration data, double point)
```

아이템 획득률을 설정합니다.
```
void setPlayerProbability(Player player, MaterialType materialType, FileConfiguration data, double point)
```


## Jar 다운로드
[JAR 다운로드](https://github.com/artserver/Probabiltem/raw/master/out/artifacts/Probabiltem/Probabiltem.jar)

## 추가할 기능
- 