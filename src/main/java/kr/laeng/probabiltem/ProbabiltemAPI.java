package kr.laeng.probabiltem;

import aren227.configmanager.ConfigManager;
import kr.laeng.datastorage.DataStorageAPI;
import kr.laeng.probabiltem.material.MaterialType;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class ProbabiltemAPI {
    /**
     * 아이템 획득률을 가져옵니다.
     * @param player org.bukkit.entity.Player
     * @param materialType kr.laeng.probabiltem.material.MaterialType
     * @return 아이템 획득성공률
     */
    public static double getPlayerProbability(Player player, MaterialType materialType) {
        FileConfiguration data = getPlayerData(player);
        return getPlayerProbability(player, materialType, data);
    }

    /**
     * 아이템 획득률을 가져옵니다.
     * @param player org.bukkit.entity.Player
     * @param materialType kr.laeng.probabiltem.material.MaterialType
     * @param data DataStorage 로 가져온 플레이어 데이터
     * @return 아이템 획득성공률
     */
    public static double getPlayerProbability(Player player, MaterialType materialType, FileConfiguration data) {
        if(materialType == MaterialType.UNKNOWN) return 100.0D;

        DecimalFormat df = new DecimalFormat("#.####");
        df.setRoundingMode(RoundingMode.DOWN);

        return Double.parseDouble(df.format(data.getDouble("PR_" + materialType.getType())));
    }

    /**
     * 아이템 획득률을 높힙니다.
     * @param player org.bukkit.entity.Player
     * @param materialType kr.laeng.probabiltem.material.MaterialType
     * @param point 추가할 확률
     */
    public static void addPlayerProbability(Player player, MaterialType materialType, double point) {
        FileConfiguration data = getPlayerData(player);
        addPlayerProbability(player, materialType, data, point);
    }

    /**
     * 아이템 획득률을 높힙니다.
     * @param player org.bukkit.entity.Player
     * @param materialType kr.laeng.probabiltem.material.MaterialType
     * @param data DataStorage 로 가져온 플레이어 데이터
     * @param point 추가할 확률
     */
    public static void addPlayerProbability(Player player, MaterialType materialType, FileConfiguration data, double point) {
        double old = getPlayerProbability(player, materialType, data);
        setPlayerProbability(player, materialType, data, old + point);
    }

    /**
     * 아이템 획득률을 설정합니다.
     * @param player org.bukkit.entity.Player
     * @param materialType kr.laeng.probabiltem.material.MaterialType
     * @param data DataStorage 로 가져온 플레이어 데이터
     * @param point 설정할 확률
     */
    public static void setPlayerProbability(Player player, MaterialType materialType, FileConfiguration data, double point) {
        data.set("PR_" + materialType.getType(), Math.min(point, 100.0d));
    }


    private static FileConfiguration getPlayerData(Player player) {
        FileConfiguration data = DataStorageAPI.getPlayerData(player);

        if (!data.contains("Probabiltem") || data.getLong("Probabiltem") != 20200309) {
            for (MaterialType mType : MaterialType.values()) {
                addInitialPlayerData(data, mType.getType());
            }

            data.set("Probabiltem", 20200309);
        }

        return data;
    }

    private static void addInitialPlayerData(FileConfiguration data, String type) {
        String key = "PR_" + type;

        if (!data.contains(key)) {
            data.set(key, 0); //TODO 기본값 지정이 필요하다면 구현하기
        }
    }
}
