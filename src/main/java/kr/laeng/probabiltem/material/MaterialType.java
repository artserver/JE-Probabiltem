package kr.laeng.probabiltem.material;

import org.bukkit.block.Block;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.Map;

public enum  MaterialType {
    FARMING("Farming"), MINING("Mining"), GATHERING("Gathering"), FELLING("Felling"), HUNTING("Hunting"),
    CRAFTING_TOOL("Crafting_Tool"), CRAFTING_CLOTHES("Crafting_Clothes"), CRAFTING_FOOD("Crafting_Food"),
    CRAFTING_WOODWORK("Crafting_Woodwork"), CRAFTING_MASON("Crafting_Mason"), CRAFTING_CRAFT("Crafting_Craft"), CRAFTING_IRONWORK("Crafting_Ironwork"),
    FURNACE_FOOD("Furnace_Food"), FURNACE_SMELT("Furnace_Smelt"), FURNACE_CRAFT("Furnace_Craft"),
    UNKNOWN("Unknown");

    final private String type;

    MaterialType(String type) { this.type = type; }

    public String getType() {
        return type;
    }

    private static Map<Material, MaterialType> items = new HashMap<Material, MaterialType>() {
        {
            //1.12.2
            //ARTSERVER - LAENG

            //put(Material., ItemSkillType.); //

            //FARMING - 농사
            put(Material.CROPS, MaterialType.FARMING); //밀 59
            put(Material.SOIL, MaterialType.FARMING); //갈은 흙 60
            put(Material.CACTUS, MaterialType.FARMING); //선인장 81
            put(Material.SUGAR_CANE_BLOCK, MaterialType.FARMING); //사탕수수 블록 83
            put(Material.PUMPKIN, MaterialType.FARMING); //호박 86
            put(Material.MELON_BLOCK, MaterialType.FARMING); //수박 103
            put(Material.PUMPKIN_STEM, MaterialType.FARMING); //호박 줄기 104
            put(Material.MELON_STEM, MaterialType.FARMING); //수박 줄기 105
            put(Material.NETHER_WARTS, MaterialType.FARMING); //네더와트 115
            put(Material.COCOA, MaterialType.FARMING); //코코아 127
            put(Material.CARROT, MaterialType.FARMING); //당근 141
            put(Material.POTATO, MaterialType.FARMING); //감자 142
            put(Material.HAY_BLOCK, MaterialType.FARMING); //건초 170
            put(Material.BEETROOT_BLOCK, MaterialType.FARMING); //사탕무 블록 207
            put(Material.NETHER_WART_BLOCK, MaterialType.FARMING); //네더와트 블록 214
            put(Material.SEEDS, MaterialType.FARMING); //씨앗 295
            put(Material.WHEAT, MaterialType.FARMING); //밀 296
            put(Material.SUGAR_CANE, MaterialType.FARMING); //사탕수수 338
            put(Material.MELON, MaterialType.FARMING); //수박 360
            put(Material.PUMPKIN_SEEDS, MaterialType.FARMING); //호박씨앗 361
            put(Material.MELON_SEEDS, MaterialType.FARMING); //수박씨앗 362
            put(Material.NETHER_STALK, MaterialType.FARMING); //네더 와트 씨앗 372
            put(Material.CARROT_ITEM, MaterialType.FARMING); //당근 391
            put(Material.POTATO_ITEM, MaterialType.FARMING); //감자 392
            put(Material.POISONOUS_POTATO, MaterialType.FARMING); //독 감자 393
            put(Material.CHORUS_FRUIT, MaterialType.FARMING); //후렴과 439
            put(Material.BEETROOT, MaterialType.FARMING); //사탕무 434
            put(Material.BEETROOT_SEEDS, MaterialType.FARMING); //사탕무 씨앗 435


            //MINING - 채굴
            put(Material.STONE, MaterialType.MINING); //돌 1
            put(Material.COBBLESTONE, MaterialType.MINING); //조약돌 4
            put(Material.BEDROCK, MaterialType.MINING); //기반암 7
            put(Material.GOLD_ORE, MaterialType.MINING); //금광석 14
            put(Material.IRON_ORE, MaterialType.MINING); //철광석 15
            put(Material.COAL_ORE, MaterialType.MINING); //석탄광석 16
            put(Material.LAPIS_ORE, MaterialType.MINING); //청금석광석 21
            put(Material.MOSSY_COBBLESTONE, MaterialType.MINING); //이끼긴 조약돌 48
            put(Material.OBSIDIAN, MaterialType.MINING); //옵시디언 49
            put(Material.DIAMOND_ORE, MaterialType.MINING); //다이아몬드광석
            put(Material.REDSTONE_ORE, MaterialType.MINING); //레드스톤 광석 73
            put(Material.GLOWING_REDSTONE_ORE, MaterialType.MINING); //빛나는 레드스톤 광석 74
            put(Material.CLAY, MaterialType.MINING); //점토 82
            put(Material.NETHERRACK, MaterialType.MINING); //지옥석 87
            put(Material.ENDER_STONE, MaterialType.MINING); //엔더 돌 121
            put(Material.EMERALD_ORE, MaterialType.MINING); //에메랄드 광석 129
            put(Material.QUARTZ_ORE, MaterialType.MINING); //석영광석 153
            put(Material.PRISMARINE, MaterialType.MINING); //프레이즈마린 168
            put(Material.MAGMA, MaterialType.MINING); //마그마 블록 213
            put(Material.COAL, MaterialType.MINING); //석탄 263
            put(Material.DIAMOND, MaterialType.MINING); //다이아몬드 264
            put(Material.FLINT, MaterialType.MINING); //부싯돌 318
            put(Material.REDSTONE, MaterialType.MINING); //레드스톤 331
            put(Material.EMERALD, MaterialType.MINING); //에메랄드 388
            put(Material.QUARTZ, MaterialType.MINING); //석영 406


            //GATHERING - 채집
            put(Material.GRASS, MaterialType.GATHERING); //잔디 2
            put(Material.DIRT, MaterialType.GATHERING); //흙 3
            put(Material.WATER, MaterialType.GATHERING); //물 8
            put(Material.STATIONARY_WATER, MaterialType.GATHERING); //흐르는 물 9
            put(Material.LAVA, MaterialType.GATHERING); //용암 10
            put(Material.STATIONARY_LAVA, MaterialType.GATHERING); //흐르는 용암 11
            put(Material.SAND, MaterialType.GATHERING); //모래 12
            put(Material.GRAVEL, MaterialType.GATHERING); //자갈 13
            put(Material.SPONGE, MaterialType.GATHERING); //스폰지 19
            put(Material.SANDSTONE, MaterialType.GATHERING); //사암 24
            put(Material.WEB, MaterialType.GATHERING); //거미줄 30
            put(Material.LONG_GRASS, MaterialType.GATHERING); //풀 31
            put(Material.DEAD_BUSH, MaterialType.GATHERING); //죽은 덩쿨 32
            put(Material.WOOL, MaterialType.GATHERING); //양털 35
            put(Material.YELLOW_FLOWER, MaterialType.GATHERING); //꽃 37
            put(Material.RED_ROSE, MaterialType.GATHERING); //꽃 38
            put(Material.BROWN_MUSHROOM, MaterialType.GATHERING); //버섯 39
            put(Material.RED_MUSHROOM, MaterialType.GATHERING); //버섯 40
            put(Material.FIRE, MaterialType.GATHERING); //불 51
            put(Material.SNOW, MaterialType.GATHERING); //눈 78
            put(Material.ICE, MaterialType.GATHERING); //얼음 79
            put(Material.SNOW_BLOCK, MaterialType.GATHERING); //눈 블럭 80
            put(Material.SOUL_SAND, MaterialType.GATHERING); //소울 샌드 88
            put(Material.HUGE_MUSHROOM_1, MaterialType.GATHERING); //거대 버섯 99
            put(Material.HUGE_MUSHROOM_2, MaterialType.GATHERING); //거대 버섯 100
            put(Material.VINE, MaterialType.GATHERING); //줄기 106
            put(Material.MYCEL, MaterialType.GATHERING); //포자 흙 110
            put(Material.WATER_LILY, MaterialType.GATHERING); //연꽃 112
            put(Material.DRAGON_EGG, MaterialType.GATHERING); //엔더 드래곤 알 122
            put(Material.PACKED_ICE, MaterialType.GATHERING); //포장된 얼음 173
            put(Material.DOUBLE_PLANT, MaterialType.GATHERING); //식물 175
            put(Material.RED_SANDSTONE, MaterialType.GATHERING); //빨간 사암 179
            put(Material.CHORUS_PLANT, MaterialType.GATHERING); //후렴과 줄기 199
            put(Material.CHORUS_FLOWER, MaterialType.GATHERING); //후렴과 꽃 200
            put(Material.GRASS_PATH, MaterialType.GATHERING); //다져진 흙 208
            put(Material.FROSTED_ICE, MaterialType.GATHERING); //얼어붙은 얼음 212
            put(Material.SNOW_BALL, MaterialType.GATHERING); //스노우 볼 332
            put(Material.CLAY_BALL, MaterialType.GATHERING); //점토 337
            put(Material.EGG, MaterialType.GATHERING); //달걀 344
            put(Material.GLOWSTONE_DUST, MaterialType.GATHERING); //발광석 가루 348
            put(Material.EYE_OF_ENDER, MaterialType.GATHERING); //엔더의 눈 381
            put(Material.MONSTER_EGG, MaterialType.GATHERING); //스폰알 383
            put(Material.NETHER_STAR, MaterialType.GATHERING); //네더의 별 398
            put(Material.DRAGONS_BREATH, MaterialType.GATHERING); //용의 숨결 398
            put(Material.SHULKER_SHELL, MaterialType.GATHERING); //쉘커 셀 450
            put(Material.GOLD_RECORD, MaterialType.GATHERING); //음반 2256
            put(Material.GREEN_RECORD, MaterialType.GATHERING); //음반 2257
            put(Material.RECORD_3, MaterialType.GATHERING); //음반 2258
            put(Material.RECORD_4, MaterialType.GATHERING); //음반 2259
            put(Material.RECORD_5, MaterialType.GATHERING); //음반 2260
            put(Material.RECORD_6, MaterialType.GATHERING); //음반 2261
            put(Material.RECORD_7, MaterialType.GATHERING); //음반 2262
            put(Material.RECORD_8, MaterialType.GATHERING); //음반 2263
            put(Material.RECORD_9, MaterialType.GATHERING); //음반 2264
            put(Material.RECORD_10, MaterialType.GATHERING); //음반 2265
            put(Material.RECORD_11, MaterialType.GATHERING); //음반 2266
            put(Material.RECORD_12, MaterialType.GATHERING); //음반 2267

            //FELLING - 벌목
            put(Material.SAPLING, MaterialType.FELLING); //묘목 6
            put(Material.LOG, MaterialType.FELLING); //나무 17
            put(Material.LEAVES, MaterialType.FELLING); //잎 18
            put(Material.LEAVES_2, MaterialType.FELLING); //잎 161
            put(Material.LOG_2, MaterialType.FELLING); //나무 162

            //HUNTING - 사냥
            put(Material.FEATHER, MaterialType.HUNTING); //깃털 288
            put(Material.SULPHUR, MaterialType.HUNTING); //화약 289
            put(Material.PORK, MaterialType.HUNTING); //돼지 고기 319
            put(Material.LEATHER, MaterialType.HUNTING); //가죽 334
            put(Material.SLIME_BALL, MaterialType.HUNTING); //슬라임 볼 341
            put(Material.RAW_FISH, MaterialType.HUNTING); //물고기 349
            put(Material.BONE, MaterialType.HUNTING); //뼈 352
            put(Material.RAW_BEEF, MaterialType.HUNTING); //소고기 363
            put(Material.RAW_CHICKEN, MaterialType.HUNTING); //닭고기 365
            put(Material.ROTTEN_FLESH, MaterialType.HUNTING); //썩은고기 367
            put(Material.ENDER_PEARL, MaterialType.HUNTING); //엔더진주 368
            put(Material.BLAZE_ROD, MaterialType.HUNTING); //블레이즈 막대 369
            put(Material.GHAST_TEAR, MaterialType.HUNTING); //가스트의 눈물 370
            put(Material.SPIDER_EYE, MaterialType.HUNTING); //거미 눈 375
            put(Material.PRISMARINE_SHARD, MaterialType.HUNTING); //프라이즈마린 조각 409
            put(Material.PRISMARINE_CRYSTALS, MaterialType.HUNTING); //프라이즈마린 크리스탈 410
            put(Material.RABBIT, MaterialType.HUNTING); //토끼 고기 411
            put(Material.RABBIT_FOOT, MaterialType.HUNTING); //토끼 발 414
            put(Material.RABBIT_HIDE, MaterialType.HUNTING); //토끼 가죽 415
            put(Material.MUTTON, MaterialType.HUNTING); //양 고기 423


            //CRAFTING_TOOL - 제작(도구)
            put(Material.IRON_SPADE, MaterialType.CRAFTING_TOOL); //철 삽 256
            put(Material.IRON_PICKAXE, MaterialType.CRAFTING_TOOL); //철 곡괭이 257
            put(Material.IRON_AXE, MaterialType.CRAFTING_TOOL); //철 도끼 258
            put(Material.FLINT_AND_STEEL, MaterialType.CRAFTING_TOOL); //라이터 259
            put(Material.BOW, MaterialType.CRAFTING_TOOL); //활 261
            put(Material.ARROW, MaterialType.CRAFTING_TOOL); //화살 262
            put(Material.IRON_SWORD, MaterialType.CRAFTING_TOOL); //철칼 267
            put(Material.WOOD_SWORD, MaterialType.CRAFTING_TOOL); //나무 칼 268
            put(Material.WOOD_SPADE, MaterialType.CRAFTING_TOOL); //나무 삽 269
            put(Material.WOOD_PICKAXE, MaterialType.CRAFTING_TOOL); //나무 곡괭이 270
            put(Material.WOOD_AXE, MaterialType.CRAFTING_TOOL); //나무 도끼 271
            put(Material.STONE_SWORD, MaterialType.CRAFTING_TOOL); //돌 칼 272
            put(Material.STONE_SPADE, MaterialType.CRAFTING_TOOL); //돌 삽 273
            put(Material.STONE_PICKAXE, MaterialType.CRAFTING_TOOL); //돌 곡괭이 274
            put(Material.STONE_AXE, MaterialType.CRAFTING_TOOL); //돌 도끼 275
            put(Material.DIAMOND_SWORD, MaterialType.CRAFTING_TOOL); //다이아몬드 칼 276
            put(Material.DIAMOND_SPADE, MaterialType.CRAFTING_TOOL); //다이아몬드 삽 277
            put(Material.DIAMOND_PICKAXE, MaterialType.CRAFTING_TOOL); //다이아몬드 곡괭이 278
            put(Material.DIAMOND_AXE, MaterialType.CRAFTING_TOOL); //다이아몬드 도끼
            put(Material.GOLD_SWORD, MaterialType.CRAFTING_TOOL); //금 칼 283
            put(Material.GOLD_SPADE, MaterialType.CRAFTING_TOOL); //금 삽 284
            put(Material.GOLD_PICKAXE, MaterialType.CRAFTING_TOOL); //금 곡괭이 285
            put(Material.GOLD_AXE, MaterialType.CRAFTING_TOOL); //금 도끼 286
            put(Material.WOOD_HOE, MaterialType.CRAFTING_TOOL); //나무 괭이 290
            put(Material.STONE_HOE, MaterialType.CRAFTING_TOOL); //돌 괭이 291
            put(Material.IRON_HOE, MaterialType.CRAFTING_TOOL); //철 괭이 292
            put(Material.DIAMOND_HOE, MaterialType.CRAFTING_TOOL); //다이아몬드 괭이 293
            put(Material.GOLD_HOE, MaterialType.CRAFTING_TOOL); //금 괭이 294
            put(Material.COMPASS, MaterialType.CRAFTING_TOOL); //나침반 345
            put(Material.FISHING_ROD, MaterialType.CRAFTING_TOOL); //낚시대 346
            put(Material.WATCH, MaterialType.CRAFTING_TOOL); //시계 347
            put(Material.SHEARS, MaterialType.CRAFTING_TOOL); //가위 359
            put(Material.CARROT_STICK, MaterialType.CRAFTING_TOOL); //당근 낚시대 398
            put(Material.SPECTRAL_ARROW, MaterialType.CRAFTING_TOOL); //화살 439
            put(Material.TIPPED_ARROW, MaterialType.CRAFTING_TOOL); //화살 440

            //CRAFTING_CLOTHES - 제작 (옷)
            put(Material.CARPET, MaterialType.CRAFTING_CLOTHES); //카펫 171 - 염색을 하기때문에.
            put(Material.STANDING_BANNER, MaterialType.CRAFTING_CLOTHES); //배너 176
            put(Material.WALL_BANNER, MaterialType.CRAFTING_CLOTHES); //배너 177
            put(Material.LEATHER_HELMET, MaterialType.CRAFTING_CLOTHES); //가죽 투구 298
            put(Material.LEATHER_CHESTPLATE, MaterialType.CRAFTING_CLOTHES); //가죽 흉갑 299
            put(Material.LEATHER_LEGGINGS, MaterialType.CRAFTING_CLOTHES); //가죽 각반 300
            put(Material.LEATHER_BOOTS, MaterialType.CRAFTING_CLOTHES); //가죽 부츠 301
            put(Material.CHAINMAIL_HELMET, MaterialType.CRAFTING_CLOTHES); //체인 투구 302
            put(Material.CHAINMAIL_CHESTPLATE, MaterialType.CRAFTING_CLOTHES); //체인 흉갑 303
            put(Material.CHAINMAIL_LEGGINGS, MaterialType.CRAFTING_CLOTHES); //체인 각반 304
            put(Material.CHAINMAIL_BOOTS, MaterialType.CRAFTING_CLOTHES); //체인 부츠 305
            put(Material.IRON_HELMET, MaterialType.CRAFTING_CLOTHES); //철 투구 306
            put(Material.IRON_CHESTPLATE, MaterialType.CRAFTING_CLOTHES); //철 흉갑 307
            put(Material.IRON_LEGGINGS, MaterialType.CRAFTING_CLOTHES); //철 레깅스 308
            put(Material.IRON_BOOTS, MaterialType.CRAFTING_CLOTHES); //철 부츠 309
            put(Material.DIAMOND_HELMET, MaterialType.CRAFTING_CLOTHES); //다이아몬드 투구 310
            put(Material.DIAMOND_CHESTPLATE, MaterialType.CRAFTING_CLOTHES); //다이아몬드 흉갑 311
            put(Material.DIAMOND_LEGGINGS, MaterialType.CRAFTING_CLOTHES); //다이아몬드 각반 312
            put(Material.DIAMOND_BOOTS, MaterialType.CRAFTING_CLOTHES); //다이아몬드 부츠 313
            put(Material.GOLD_HELMET, MaterialType.CRAFTING_CLOTHES); //금 투구 314
            put(Material.GOLD_CHESTPLATE, MaterialType.CRAFTING_CLOTHES); //금 흉갑 315
            put(Material.GOLD_LEGGINGS, MaterialType.CRAFTING_CLOTHES); //금 레깅스 316
            put(Material.GOLD_BOOTS, MaterialType.CRAFTING_CLOTHES); //금 부츠 317
            put(Material.IRON_BARDING, MaterialType.CRAFTING_CLOTHES); //철 말 갑옷 417
            put(Material.GOLD_BARDING, MaterialType.CRAFTING_CLOTHES); //금 말 갑옷 418
            put(Material.DIAMOND_BARDING, MaterialType.CRAFTING_CLOTHES); //다이이몬드 말 갑옷 419

            //CRAFTING_FOOD - 제작 (음식)
            put(Material.CAKE_BLOCK, MaterialType.CRAFTING_FOOD); //케이크 블록 92
            put(Material.APPLE, MaterialType.CRAFTING_FOOD); //사과 260
            put(Material.MUSHROOM_SOUP, MaterialType.CRAFTING_FOOD); //버섯 스튜 282
            put(Material.BREAD, MaterialType.CRAFTING_FOOD); //빵 297
            put(Material.GOLDEN_APPLE, MaterialType.CRAFTING_FOOD); //황금사과 322
            put(Material.MILK_BUCKET, MaterialType.CRAFTING_FOOD); //우유 335
            put(Material.SUGAR, MaterialType.CRAFTING_FOOD); //설탕 353
            put(Material.COOKIE, MaterialType.CRAFTING_FOOD); //빵 357
            put(Material.POTION, MaterialType.CRAFTING_FOOD); //포션 373
            put(Material.FERMENTED_SPIDER_EYE, MaterialType.CRAFTING_FOOD); //발효된 거미 눈 376
            put(Material.SPECKLED_MELON, MaterialType.CRAFTING_FOOD); //조각 수박 382
            put(Material.GOLDEN_CARROT, MaterialType.CRAFTING_FOOD); //황금 당근 396
            put(Material.PUMPKIN_PIE, MaterialType.CRAFTING_FOOD); //호박파이 400
            put(Material.RABBIT_STEW, MaterialType.CRAFTING_FOOD); //토끼고기 스튜 413
            put(Material.BEETROOT_SOUP, MaterialType.CRAFTING_FOOD); //사탕무 스튜 436
            put(Material.SPLASH_POTION, MaterialType.CRAFTING_FOOD); //포션 438
            put(Material.LINGERING_POTION, MaterialType.CRAFTING_FOOD); //포션 441


            //CRAFTING_WOODWORK - 제작 (목공)
            put(Material.WOOD, MaterialType.CRAFTING_WOODWORK); //판자 5
            put(Material.NOTE_BLOCK, MaterialType.CRAFTING_WOODWORK); //노트블록 25
            put(Material.BED_BLOCK, MaterialType.CRAFTING_WOODWORK); //침대블록 26
            put(Material.BOOKSHELF, MaterialType.CRAFTING_WOODWORK); //책꽂이 47
            put(Material.TORCH, MaterialType.CRAFTING_WOODWORK); //횃불 50
            put(Material.WOOD_STAIRS, MaterialType.CRAFTING_WOODWORK); //참나무 계단 53
            put(Material.CHEST, MaterialType.CRAFTING_WOODWORK); //상자 54
            put(Material.WORKBENCH, MaterialType.CRAFTING_WOODWORK); //작업대 58
            put(Material.SIGN_POST, MaterialType.CRAFTING_WOODWORK); //표지판 63
            put(Material.WOODEN_DOOR, MaterialType.CRAFTING_WOODWORK); //문 64
            put(Material.LADDER, MaterialType.CRAFTING_WOODWORK); //사다리 65
            put(Material.WALL_SIGN, MaterialType.CRAFTING_WOODWORK); //표지판 68
            put(Material.LEVER, MaterialType.CRAFTING_WOODWORK); //레버 69
            put(Material.WOOD_PLATE, MaterialType.CRAFTING_WOODWORK); //나무 발판 72
            put(Material.JUKEBOX, MaterialType.CRAFTING_WOODWORK); //주크박스 84
            put(Material.FENCE, MaterialType.CRAFTING_WOODWORK); //울타리 85
            put(Material.TRAP_DOOR, MaterialType.CRAFTING_WOODWORK); //나무 다락문 96
            put(Material.FENCE_GATE, MaterialType.CRAFTING_WOODWORK); //나무 울타리 문 107
            put(Material.WOOD_DOUBLE_STEP, MaterialType.CRAFTING_WOODWORK); //합쳐진 나무 반블록 125
            put(Material.WOOD_STEP, MaterialType.CRAFTING_WOODWORK); //나무 반블럭 126
            put(Material.SPRUCE_WOOD_STAIRS, MaterialType.CRAFTING_WOODWORK); //가문비 나무 계단 134
            put(Material.BIRCH_WOOD_STAIRS, MaterialType.CRAFTING_WOODWORK); //자작나무 계단 135
            put(Material.JUNGLE_WOOD_STAIRS, MaterialType.CRAFTING_WOODWORK); //정글나무 계단 136
            put(Material.WOOD_BUTTON, MaterialType.CRAFTING_WOODWORK); //나무 버튼 143
            put(Material.SKULL, MaterialType.CRAFTING_WOODWORK); //스컬 144
            put(Material.TRAPPED_CHEST, MaterialType.CRAFTING_WOODWORK); //트랩상자 146
            put(Material.DAYLIGHT_DETECTOR, MaterialType.CRAFTING_WOODWORK); //햇빛 감지기 151
            put(Material.ACACIA_STAIRS, MaterialType.CRAFTING_WOODWORK); //아카시아 나무 계단 163
            put(Material.DARK_OAK_STAIRS, MaterialType.CRAFTING_WOODWORK); //짙은 참나무 계단 164
            put(Material.DAYLIGHT_DETECTOR_INVERTED, MaterialType.CRAFTING_WOODWORK); //햇빛 감지지 인버티드 178
            put(Material.SPRUCE_FENCE_GATE, MaterialType.CRAFTING_WOODWORK); //가문비나무 울타리 문 183
            put(Material.BIRCH_FENCE_GATE, MaterialType.CRAFTING_WOODWORK); //자작나무 울타리 문 184
            put(Material.JUNGLE_FENCE_GATE, MaterialType.CRAFTING_WOODWORK); //정글나무 울타리 문 190
            put(Material.DARK_OAK_FENCE_GATE, MaterialType.CRAFTING_WOODWORK); //짙은 참나무 울타리 문 186
            put(Material.ACACIA_FENCE_GATE, MaterialType.CRAFTING_WOODWORK); //아카시아나무 울타리 문 187
            put(Material.SPRUCE_FENCE, MaterialType.CRAFTING_WOODWORK); //가문비나무 울타리 188
            put(Material.BIRCH_FENCE, MaterialType.CRAFTING_WOODWORK); //자작나무 울타리 189
            put(Material.JUNGLE_FENCE, MaterialType.CRAFTING_WOODWORK); //정글나무 울타리 190
            put(Material.DARK_OAK_FENCE, MaterialType.CRAFTING_WOODWORK); //짙은 참나무 울타리 191
            put(Material.ACACIA_FENCE, MaterialType.CRAFTING_WOODWORK); //아카시아나무 울타리문 192
            put(Material.SPRUCE_DOOR, MaterialType.CRAFTING_WOODWORK); //가문비나무 문 193
            put(Material.BIRCH_DOOR, MaterialType.CRAFTING_WOODWORK); //자작나무 문 194
            put(Material.JUNGLE_DOOR, MaterialType.CRAFTING_WOODWORK); //정글나무 문 195
            put(Material.ACACIA_DOOR, MaterialType.CRAFTING_WOODWORK); //아카시아나무 문 196
            put(Material.DARK_OAK_DOOR, MaterialType.CRAFTING_WOODWORK); //짙은 참나무 문 197
            put(Material.STICK, MaterialType.CRAFTING_WOODWORK); //막대기 280
            put(Material.BOWL, MaterialType.CRAFTING_WOODWORK); //접시 281
            put(Material.SIGN, MaterialType.CRAFTING_WOODWORK); //표지판 323
            put(Material.WOOD_DOOR, MaterialType.CRAFTING_WOODWORK); //나무 문 324
            put(Material.BOAT, MaterialType.CRAFTING_WOODWORK); //보트 333
            put(Material.STORAGE_MINECART, MaterialType.CRAFTING_WOODWORK); //상자 카트 342
            put(Material.POWERED_MINECART, MaterialType.CRAFTING_WOODWORK); //파워 카트 343
            put(Material.BED, MaterialType.CRAFTING_WOODWORK); //침대 355
            put(Material.ITEM_FRAME, MaterialType.CRAFTING_WOODWORK); //아이템 액자 389
            put(Material.SPRUCE_DOOR_ITEM, MaterialType.CRAFTING_WOODWORK); //자작나무 문 427
            put(Material.BIRCH_DOOR_ITEM, MaterialType.CRAFTING_WOODWORK); //가문비나무 문 428
            put(Material.JUNGLE_DOOR_ITEM, MaterialType.CRAFTING_WOODWORK); //정글나무 문 429
            put(Material.ACACIA_DOOR_ITEM, MaterialType.CRAFTING_WOODWORK); //아카시아나무 문 430
            put(Material.DARK_OAK_DOOR_ITEM, MaterialType.CRAFTING_WOODWORK); //짙은 참나무 문 431
            put(Material.SHIELD, MaterialType.CRAFTING_WOODWORK); //방패 442
            put(Material.BOAT_SPRUCE, MaterialType.CRAFTING_WOODWORK); //자작나무 보트 444
            put(Material.BOAT_BIRCH, MaterialType.CRAFTING_WOODWORK); //가문비나무 보트 445
            put(Material.BOAT_JUNGLE, MaterialType.CRAFTING_WOODWORK); //정글나무 보트 446
            put(Material.BOAT_ACACIA, MaterialType.CRAFTING_WOODWORK); //아카시아나무 보트 447
            put(Material.BOAT_DARK_OAK, MaterialType.CRAFTING_WOODWORK); //짙은 참나무 보트 448

            //CRAFTING_MASON - 제작 (석공)
            put(Material.DISPENSER, MaterialType.CRAFTING_MASON); //디스펜서 23
            put(Material.PISTON_STICKY_BASE, MaterialType.CRAFTING_MASON); //끈끈이 피스톤 베이스 29
            put(Material.PISTON_BASE, MaterialType.CRAFTING_MASON); //피스톤 베이스 33
            put(Material.PISTON_EXTENSION, MaterialType.CRAFTING_MASON); //피스톤 익스텐션 34
            put(Material.PISTON_MOVING_PIECE, MaterialType.CRAFTING_MASON); //피스톤 무빙 피스 36
            put(Material.DOUBLE_STEP, MaterialType.CRAFTING_MASON); //합쳐진 반블록 43
            put(Material.STEP, MaterialType.CRAFTING_MASON); //반블록 44
            put(Material.FURNACE, MaterialType.CRAFTING_MASON); //화로 61
            put(Material.BURNING_FURNACE, MaterialType.CRAFTING_MASON); //작동중인 화로 62
            put(Material.COBBLESTONE_STAIRS, MaterialType.CRAFTING_MASON); //조약돌 계단 67
            put(Material.STONE_PLATE, MaterialType.CRAFTING_MASON); //돌 발판 70
            put(Material.STONE_BUTTON, MaterialType.CRAFTING_MASON); //돌 버튼 77
            put(Material.DIODE_BLOCK_OFF, MaterialType.CRAFTING_MASON); //다이오드 블록 꺼짐 93
            put(Material.DIODE_BLOCK_ON, MaterialType.CRAFTING_MASON); //다이오드 블록 켜짐 94
            put(Material.SMOOTH_BRICK, MaterialType.CRAFTING_MASON); //연마된 돌블록 98
            put(Material.SMOOTH_STAIRS, MaterialType.CRAFTING_MASON); //연마된 돌블록 109
            put(Material.ENCHANTMENT_TABLE, MaterialType.CRAFTING_MASON); //인챈트 테이블 116
            put(Material.ENDER_PORTAL_FRAME, MaterialType.CRAFTING_MASON); //엔더포탈프레임 120
            put(Material.SANDSTONE_STAIRS, MaterialType.CRAFTING_MASON); //사암 계단 128
            put(Material.ENDER_CHEST, MaterialType.CRAFTING_MASON); //엔더 상자
            put(Material.COBBLE_WALL, MaterialType.CRAFTING_MASON); //조약돌 담장
            put(Material.REDSTONE_COMPARATOR_OFF, MaterialType.CRAFTING_MASON); //레드스톤 비교기 OFF 149
            put(Material.REDSTONE_COMPARATOR_ON, MaterialType.CRAFTING_MASON); //레드스톤 비교기 ON 150
            put(Material.DROPPER, MaterialType.CRAFTING_MASON); //드롭퍼 158
            put(Material.RED_SANDSTONE_STAIRS, MaterialType.CRAFTING_MASON); //빨간 사암 계단 180
            put(Material.END_BRICKS, MaterialType.CRAFTING_MASON); //연마된 엔드 블록 206
            put(Material.OBSERVER, MaterialType.CRAFTING_MASON); //옵저버 218
            put(Material.WHITE_GLAZED_TERRACOTTA, MaterialType.CRAFTING_MASON); //테라코타 235
            put(Material.ORANGE_GLAZED_TERRACOTTA, MaterialType.CRAFTING_MASON); //테라코타 236
            put(Material.MAGENTA_GLAZED_TERRACOTTA, MaterialType.CRAFTING_MASON); //테라코타 237
            put(Material.LIGHT_BLUE_GLAZED_TERRACOTTA, MaterialType.CRAFTING_MASON); //테라코타 238
            put(Material.YELLOW_GLAZED_TERRACOTTA, MaterialType.CRAFTING_MASON); //테라코타 239
            put(Material.LIME_GLAZED_TERRACOTTA, MaterialType.CRAFTING_MASON); //테라코타 240
            put(Material.PINK_GLAZED_TERRACOTTA, MaterialType.CRAFTING_MASON); //테라코타 241
            put(Material.GRAY_GLAZED_TERRACOTTA, MaterialType.CRAFTING_MASON); //테라코타 242
            put(Material.SILVER_GLAZED_TERRACOTTA, MaterialType.CRAFTING_MASON); //테라코타 243
            put(Material.CYAN_GLAZED_TERRACOTTA, MaterialType.CRAFTING_MASON); //테라코타 244
            put(Material.PURPLE_GLAZED_TERRACOTTA, MaterialType.CRAFTING_MASON); //테라코타 245
            put(Material.BLUE_GLAZED_TERRACOTTA, MaterialType.CRAFTING_MASON); //테라코타 246
            put(Material.BROWN_GLAZED_TERRACOTTA, MaterialType.CRAFTING_MASON); //테라코타 247
            put(Material.GREEN_GLAZED_TERRACOTTA, MaterialType.CRAFTING_MASON); //테라코타 248
            put(Material.RED_GLAZED_TERRACOTTA, MaterialType.CRAFTING_MASON); //테라코타 249
            put(Material.BLACK_GLAZED_TERRACOTTA, MaterialType.CRAFTING_MASON); //테라코타 250
            put(Material.DIODE, MaterialType.CRAFTING_MASON); //레드스톤 리피터 356
            put(Material.FLOWER_POT_ITEM, MaterialType.CRAFTING_MASON); //화분 356
            put(Material.REDSTONE_COMPARATOR, MaterialType.CRAFTING_MASON); //레드스톤 컴패터 356

            //CRAFTING_CRAFT - 제작 (공예)
            put(Material.LAPIS_BLOCK, MaterialType.CRAFTING_CRAFT); //청금석블록 22
            put(Material.GOLD_BLOCK, MaterialType.CRAFTING_CRAFT); //금 블록 41
            put(Material.IRON_BLOCK, MaterialType.CRAFTING_CRAFT); //철 블록 42
            put(Material.TNT, MaterialType.CRAFTING_CRAFT); //TNT 46
            put(Material.REDSTONE_WIRE, MaterialType.CRAFTING_CRAFT); //레드스폰 와이어 55
            put(Material.DIAMOND_BLOCK, MaterialType.CRAFTING_CRAFT); //다이아몬드블록 57
            put(Material.REDSTONE_TORCH_OFF, MaterialType.CRAFTING_CRAFT); //레드스톤 토치 꺼짐 75
            put(Material.REDSTONE_TORCH_ON, MaterialType.CRAFTING_CRAFT); //레드스톤 토치 켜짐 76
            put(Material.GLOWSTONE, MaterialType.CRAFTING_CRAFT); //발광석 89
            put(Material.PORTAL, MaterialType.CRAFTING_CRAFT); //포탈 90
            put(Material.JACK_O_LANTERN, MaterialType.CRAFTING_CRAFT); //잭오랜턴 91
            put(Material.STAINED_GLASS, MaterialType.CRAFTING_CRAFT); //색깔 유리 95
            put(Material.MONSTER_EGGS, MaterialType.CRAFTING_CRAFT); //몬스터 에그 97
            put(Material.THIN_GLASS, MaterialType.CRAFTING_CRAFT); //유리창 102
            put(Material.BRICK_STAIRS, MaterialType.CRAFTING_CRAFT); //벽돌계단 108
            put(Material.NETHER_BRICK, MaterialType.CRAFTING_CRAFT); //네더 벽돌 112
            put(Material.NETHER_FENCE, MaterialType.CRAFTING_CRAFT); //네더 울타리 113
            put(Material.NETHER_BRICK_STAIRS, MaterialType.CRAFTING_CRAFT); //네더 블럭 계단 114
            put(Material.ENDER_PORTAL, MaterialType.CRAFTING_CRAFT); //엔더포탈 119
            put(Material.REDSTONE_LAMP_OFF, MaterialType.CRAFTING_CRAFT); //레드스톤 램프 꺼짐 123
            put(Material.REDSTONE_LAMP_ON, MaterialType.CRAFTING_CRAFT); //레드스톤 램프 켜짐
            put(Material.EMERALD_BLOCK, MaterialType.CRAFTING_CRAFT); //에멜랄드 블럭 129
            put(Material.BEACON, MaterialType.CRAFTING_CRAFT); //비콘 138
            put(Material.FLOWER_POT, MaterialType.CRAFTING_CRAFT); //화분 140
            put(Material.REDSTONE_BLOCK, MaterialType.CRAFTING_CRAFT); //레드스톤 블록 152
            put(Material.QUARTZ_BLOCK, MaterialType.CRAFTING_CRAFT); //석영 블록 155
            put(Material.QUARTZ_STAIRS, MaterialType.CRAFTING_CRAFT); //석영 계단 156
            put(Material.STAINED_CLAY, MaterialType.CRAFTING_CRAFT); //염색된 점토 159
            put(Material.STAINED_GLASS_PANE, MaterialType.CRAFTING_CRAFT); //염색된 유리창 160
            put(Material.SLIME_BLOCK, MaterialType.CRAFTING_CRAFT); //슬라임 블럭 165
            put(Material.BARRIER, MaterialType.CRAFTING_CRAFT); //베리어 166
            put(Material.SEA_LANTERN, MaterialType.CRAFTING_CRAFT); //바다 랜턴 169
            put(Material.HARD_CLAY, MaterialType.CRAFTING_CRAFT); //딱딱한 점토 172
            put(Material.COAL_BLOCK, MaterialType.CRAFTING_CRAFT); //석탄 블록 173
            put(Material.END_ROD, MaterialType.CRAFTING_CRAFT); //엔더 로드 198
            put(Material.PURPUR_BLOCK, MaterialType.CRAFTING_CRAFT); //퍼퍼 블록 201
            put(Material.PURPUR_PILLAR, MaterialType.CRAFTING_CRAFT); //퍼퍼 필러 202
            put(Material.PURPUR_STAIRS, MaterialType.CRAFTING_CRAFT); //퍼퍼 계단 203
            put(Material.PURPUR_DOUBLE_SLAB, MaterialType.CRAFTING_CRAFT); //퍼퍼 반블록 합침 204
            put(Material.PURPUR_SLAB, MaterialType.CRAFTING_CRAFT); //퍼퍼 반블록 205
            put(Material.END_GATEWAY, MaterialType.CRAFTING_CRAFT); //엔드 게이트웨이 209
            put(Material.RED_NETHER_BRICK, MaterialType.CRAFTING_CRAFT); //네더와트 벽돌블록 215
            put(Material.BONE_BLOCK, MaterialType.CRAFTING_CRAFT); //뼈 블록 215
            put(Material.WHITE_SHULKER_BOX, MaterialType.CRAFTING_CRAFT); // 셜커 상자 219
            put(Material.ORANGE_SHULKER_BOX, MaterialType.CRAFTING_CRAFT); // 셜커 상자 220
            put(Material.MAGENTA_SHULKER_BOX, MaterialType.CRAFTING_CRAFT); // 셜커 상자 221
            put(Material.LIGHT_BLUE_SHULKER_BOX, MaterialType.CRAFTING_CRAFT); // 셜커 상자 222
            put(Material.YELLOW_SHULKER_BOX, MaterialType.CRAFTING_CRAFT); // 셜커 상자 223
            put(Material.LIME_SHULKER_BOX, MaterialType.CRAFTING_CRAFT); // 셜커 상자 224
            put(Material.PINK_SHULKER_BOX, MaterialType.CRAFTING_CRAFT); // 셜커 상자 225
            put(Material.GRAY_SHULKER_BOX, MaterialType.CRAFTING_CRAFT); // 셜커 상자 226
            put(Material.SILVER_SHULKER_BOX, MaterialType.CRAFTING_CRAFT); // 셜커 상자 227
            put(Material.CYAN_SHULKER_BOX, MaterialType.CRAFTING_CRAFT); // 셜커 상자 228
            put(Material.PURPLE_SHULKER_BOX, MaterialType.CRAFTING_CRAFT); // 셜커 상자 229
            put(Material.BLUE_SHULKER_BOX, MaterialType.CRAFTING_CRAFT); // 셜커 상자 230
            put(Material.BROWN_SHULKER_BOX, MaterialType.CRAFTING_CRAFT); // 셜커 상자 231
            put(Material.GREEN_SHULKER_BOX, MaterialType.CRAFTING_CRAFT); // 셜커 상자 232
            put(Material.RED_SHULKER_BOX, MaterialType.CRAFTING_CRAFT); // 셜커 상자 233
            put(Material.BLACK_SHULKER_BOX, MaterialType.CRAFTING_CRAFT); // 셜커 상자 234
            put(Material.CONCRETE, MaterialType.CRAFTING_CRAFT); //콘크리트 251 - 콘크리트 가루에 물을 뭍혀야 콘크리트 됨
            put(Material.CONCRETE_POWDER, MaterialType.CRAFTING_CRAFT); //콘크리트 가루 252
            put(Material.STRING, MaterialType.CRAFTING_CRAFT); //줄 287
            put(Material.PAINTING, MaterialType.CRAFTING_CRAFT); //그림 312
            put(Material.SADDLE, MaterialType.CRAFTING_CRAFT); //안장 329
            put(Material.PAPER, MaterialType.CRAFTING_CRAFT); //종이 339
            put(Material.BOOK, MaterialType.CRAFTING_CRAFT); //책 340
            put(Material.INK_SACK, MaterialType.CRAFTING_CRAFT); //염료 351
            put(Material.MAP, MaterialType.CRAFTING_CRAFT); //지도 358
            put(Material.GLASS_BOTTLE, MaterialType.CRAFTING_CRAFT); //유리병 374
            put(Material.BLAZE_POWDER, MaterialType.CRAFTING_CRAFT); //블레이즈 가루 377
            put(Material.MAGMA_CREAM, MaterialType.CRAFTING_CRAFT); //마그마 크림 378
            put(Material.EXP_BOTTLE, MaterialType.CRAFTING_CRAFT); //경험치 병 384
            put(Material.FIREBALL, MaterialType.CRAFTING_CRAFT); //화염볼 385
            put(Material.BOOK_AND_QUILL, MaterialType.CRAFTING_CRAFT); //책 386
            put(Material.WRITTEN_BOOK, MaterialType.CRAFTING_CRAFT); //책 387
            put(Material.EMPTY_MAP, MaterialType.CRAFTING_CRAFT); //지도 395
            put(Material.SKULL_ITEM, MaterialType.CRAFTING_CRAFT); //몬스터 알 397
            put(Material.FIREWORK, MaterialType.CRAFTING_CRAFT); //폭죽 401
            put(Material.FIREWORK_CHARGE, MaterialType.CRAFTING_CRAFT); //폭죽 기폭제 402
            put(Material.ENCHANTED_BOOK, MaterialType.CRAFTING_CRAFT); //인챈트 책 397
            put(Material.LEASH, MaterialType.CRAFTING_CRAFT); //끈 420
            put(Material.NAME_TAG, MaterialType.CRAFTING_CRAFT); //네임태그 421
            put(Material.BANNER, MaterialType.CRAFTING_CRAFT); //배너 425
            put(Material.END_CRYSTAL, MaterialType.CRAFTING_CRAFT); //엔더 크리스탈 421
            put(Material.ELYTRA, MaterialType.CRAFTING_CRAFT); //날개 443
            put(Material.KNOWLEDGE_BOOK, MaterialType.CRAFTING_CRAFT); //책 452

            //CRAFTING_IRONWORK - 제작 (철공)
            put(Material.POWERED_RAIL, MaterialType.CRAFTING_IRONWORK); //파워레일 27
            put(Material.DETECTOR_RAIL, MaterialType.CRAFTING_IRONWORK); //디텍터 레일 28
            put(Material.MOB_SPAWNER, MaterialType.CRAFTING_IRONWORK); //몹스포너 52
            put(Material.RAILS, MaterialType.CRAFTING_IRONWORK); //레일 66
            put(Material.IRON_DOOR_BLOCK, MaterialType.CRAFTING_IRONWORK); //철문 블록 71
            put(Material.IRON_FENCE, MaterialType.CRAFTING_IRONWORK); //철 펜스 101
            put(Material.BREWING_STAND, MaterialType.CRAFTING_IRONWORK); //양조대 117
            put(Material.CAULDRON, MaterialType.CRAFTING_IRONWORK); //가마솥 118
            put(Material.TRIPWIRE_HOOK, MaterialType.CRAFTING_IRONWORK); //트랩 후크 131
            put(Material.TRIPWIRE, MaterialType.CRAFTING_IRONWORK); //트랩 와이어 132
            put(Material.COMMAND, MaterialType.CRAFTING_IRONWORK); //커맨드 137
            put(Material.ANVIL, MaterialType.CRAFTING_IRONWORK); //모루 145
            put(Material.GOLD_PLATE, MaterialType.CRAFTING_IRONWORK); //금 발판 147
            put(Material.IRON_PLATE, MaterialType.CRAFTING_IRONWORK); //철 발판 148
            put(Material.HOPPER, MaterialType.CRAFTING_IRONWORK); //깔대기 154
            put(Material.ACTIVATOR_RAIL, MaterialType.CRAFTING_IRONWORK); //액티베이터 레일 157
            put(Material.IRON_TRAPDOOR, MaterialType.CRAFTING_IRONWORK); //철 다락문 167
            put(Material.COMMAND_REPEATING, MaterialType.CRAFTING_IRONWORK); //커맨드 리피팅 210
            put(Material.COMMAND_CHAIN, MaterialType.CRAFTING_IRONWORK); //커맨드 체인 211
            put(Material.STRUCTURE_BLOCK, MaterialType.CRAFTING_IRONWORK); //구조물 블록 255
            put(Material.BUCKET, MaterialType.CRAFTING_IRONWORK); //양동이 325
            put(Material.WATER_BUCKET, MaterialType.CRAFTING_IRONWORK); //물 양동이 326
            put(Material.LAVA_BUCKET, MaterialType.CRAFTING_IRONWORK); //용암 양동이 327
            put(Material.MINECART, MaterialType.CRAFTING_IRONWORK); //마인카드 328
            put(Material.IRON_DOOR, MaterialType.CRAFTING_IRONWORK); //철 문 330
            put(Material.GOLD_NUGGET, MaterialType.CRAFTING_IRONWORK); //금조각 371
            put(Material.BREWING_STAND_ITEM, MaterialType.CRAFTING_IRONWORK); //양조대 379
            put(Material.CAULDRON_ITEM, MaterialType.CRAFTING_IRONWORK); //가마솥 380
            put(Material.EXPLOSIVE_MINECART, MaterialType.CRAFTING_IRONWORK); //TNT 마인카트 407
            put(Material.HOPPER_MINECART, MaterialType.CRAFTING_IRONWORK); //호퍼 마인카트 408
            put(Material.COMMAND_MINECART, MaterialType.CRAFTING_IRONWORK); //커맨드 마인카트 422
            put(Material.IRON_NUGGET, MaterialType.CRAFTING_IRONWORK); //철조각 452

            //FURNACE_FOOD - 화로 (음식)
            put(Material.GRILLED_PORK, MaterialType.FURNACE_FOOD); //구운 돼지고기 319
            put(Material.COOKED_FISH, MaterialType.FURNACE_FOOD); //구운 물고기 350
            put(Material.COOKED_BEEF, MaterialType.FURNACE_FOOD); //구운 소고기 364
            put(Material.COOKED_CHICKEN, MaterialType.FURNACE_FOOD); //구운 닭고기 366
            put(Material.BAKED_POTATO, MaterialType.FURNACE_FOOD); //구운 감자 393
            put(Material.COOKED_RABBIT, MaterialType.FURNACE_FOOD); //구운 토끼고기 411
            put(Material.COOKED_MUTTON, MaterialType.FURNACE_FOOD); //구운 양고기 423
            put(Material.CHORUS_FRUIT_POPPED, MaterialType.FURNACE_FOOD); //구운 후렴과 433

            //FURNACE_SMELT - 화로 (제련)
            put(Material.IRON_INGOT, MaterialType.FURNACE_SMELT); //철괴 265
            put(Material.GOLD_INGOT, MaterialType.FURNACE_SMELT); //금괴 266

            //FURNACE_CRAFT - 화로 (공예)
            put(Material.GLASS, MaterialType.FURNACE_CRAFT); //유리 20
            put(Material.BRICK, MaterialType.FURNACE_CRAFT); //벽돌블록 45
            put(Material.CLAY_BRICK, MaterialType.FURNACE_CRAFT); //클레이 브릭 336
            put(Material.NETHER_BRICK_ITEM, MaterialType.FURNACE_CRAFT); //네더 브릭 336
        }
    };

    public static Map<Material, MaterialType> getAll() {
        return items;
    }

    public static MaterialType get(Map<Material, MaterialType> items, ItemStack item) {
        Material material = item.getType();

        if (items.containsKey(material)) {
            return items.get(material);
        }

        return MaterialType.UNKNOWN;
    }

    public static MaterialType get(ItemStack item) {
        Material material = item.getType();
        int itemMata = item.getDurability();

        if (material.equals(Material.STONE)) { //1
            switch (itemMata) {
                case 2:
                case 4:
                case 6:
                    return MaterialType.CRAFTING_MASON;
            }
        }

        if (material.equals(Material.SANDSTONE)) { //24
            switch (itemMata) {
                case 1:
                case 2:
                    return MaterialType.CRAFTING_MASON;
            }
        }

        if (material.equals(Material.DOUBLE_STEP)) { //43
            switch (itemMata) {
                case 2:
                    return MaterialType.CRAFTING_WOODWORK;
                case 1:
                case 3:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return MaterialType.CRAFTING_MASON;
            }
        }

        if (material.equals(Material.STEP)) { //44
            switch (itemMata) {
                case 2:
                    return MaterialType.CRAFTING_WOODWORK;
                case 1:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    return MaterialType.CRAFTING_MASON;
            }
        }

        if (material.equals(Material.SMOOTH_BRICK)) { //98
            if (itemMata == 2) {
                return MaterialType.FURNACE_CRAFT;
            }
        }

        if (material.equals(Material.PRISMARINE)) { //168
            switch (itemMata) {
                case 1:
                case 2:
                    return MaterialType.CRAFTING_MASON;
            }
        }

        if (material.equals(Material.RED_SANDSTONE)) { //179
            switch (itemMata) {
                case 1:
                case 2:
                    return MaterialType.CRAFTING_MASON;
            }
        }

        if (material.equals(Material.COAL)) { //263
            if (itemMata == 1) {
                return MaterialType.FURNACE_SMELT;
            }
        }

        if (items.containsKey(material)) {
            return items.get(material);
        }

        return MaterialType.UNKNOWN;
    }
}
