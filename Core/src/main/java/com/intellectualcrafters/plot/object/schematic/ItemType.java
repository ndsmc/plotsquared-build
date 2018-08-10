package com.intellectualcrafters.plot.object.schematic;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum ItemType {
    AIR("air", 0), STONE("stone", 1), GRANITE("stone", 1, 1), POLISHED_GRANITE("stone", 1,
        2), DIORITE("stone", 1, 3), POLISHED_DIORITE("stone", 1, 4), ANDESITE("stone", 1,
        5), POLISHED_ANDESITE("stone", 1, 6), GRASS("grass", 2), DIRT("dirt", 3), COARSE_DIRT(
        "dirt", 3, 1), PODZOL("dirt", 3, 2), COBBLESTONE("cobblestone", 4), OAK_WOOD_PLANK("planks",
        5), SPRUCE_WOOD_PLANK("planks", 5, 1), BIRCH_WOOD_PLANK("planks", 5, 2), JUNGLE_WOOD_PLANK(
        "planks", 5, 3), ACACIA_WOOD_PLANK("planks", 5, 4), DARK_OAK_WOOD_PLANK("planks", 5,
        5), OAK_SAPLING("sapling", 6), SPRUCE_SAPLING("sapling", 6, 1), BIRCH_SAPLING("sapling", 6,
        2), JUNGLE_SAPLING("sapling", 6, 3), ACACIA_SAPLING("sapling", 6, 4), DARK_OAK_SAPLING(
        "sapling", 6, 5), BEDROCK("bedrock", 7), FLOWING_WATER("flowing_water", 8), STILL_WATER(
        "water", 9), FLOWING_LAVA("flowing_lava", 10), STILL_LAVA("lava", 11), SAND("sand",
        12), RED_SAND("sand", 12, 1), GRAVEL("gravel", 13), GOLD_ORE("gold_ore", 14), IRON_ORE(
        "iron_ore", 15), COAL_ORE("coal_ore", 16), OAK_WOOD("log", 17), SPRUCE_WOOD("log", 17,
        1), BIRCH_WOOD("log", 17, 2), JUNGLE_WOOD("log", 17, 3), OAK_LEAVES("leaves",
        18), SPRUCE_LEAVES("leaves", 18, 1), BIRCH_LEAVES("leaves", 18, 2), JUNGLE_LEAVES("leaves",
        18, 3), SPONGE("sponge", 19), WET_SPONGE("sponge", 19, 1), GLASS("glass",
        20), LAPIS_LAZULI_ORE("lapis_ore", 21), LAPIS_LAZULI_BLOCK("lapis_block", 22), DISPENSER(
        "dispenser", 23), SANDSTONE("sandstone", 24), CHISELED_SANDSTONE("sandstone", 24,
        1), SMOOTH_SANDSTONE("sandstone", 24, 2), NOTE_BLOCK("noteblock", 25), BED("bed",
        26), POWERED_RAIL("golden_rail", 27), DETECTOR_RAIL("detector_rail", 28), STICKY_PISTON(
        "sticky_piston", 29), COBWEB("web", 30), DEAD_SHRUB("tallgrass", 31), TALLGRASS("tallgrass",
        31, 1), FERN("tallgrass", 31, 2), DEAD_SHRUB1("deadbush", 32), PISTON("piston",
        33), PISTON_HEAD("piston_head", 34), WHITE_WOOL("wool", 35), ORANGE_WOOL("wool", 35,
        1), MAGENTA_WOOL("wool", 35, 2), LIGHT_BLUE_WOOL("wool", 35, 3), YELLOW_WOOL("wool", 35,
        4), LIME_WOOL("wool", 35, 5), PINK_WOOL("wool", 35, 6), GRAY_WOOL("wool", 35,
        7), LIGHT_GRAY_WOOL("wool", 35, 8), CYAN_WOOL("wool", 35, 9), PURPLE_WOOL("wool", 35,
        10), BLUE_WOOL("wool", 35, 11), BROWN_WOOL("wool", 35, 12), GREEN_WOOL("wool", 35,
        13), RED_WOOL("wool", 35, 14), BLACK_WOOL("wool", 35, 15), DANDELION("yellow_flower",
        37), POPPY("red_flower", 38), BLUE_ORCHID("red_flower", 38, 1), ALLIUM("red_flower", 38,
        2), AZURE_BLUET("red_flower", 38, 3), RED_TULIP("red_flower", 38, 4), ORANGE_TULIP(
        "red_flower", 38, 5), WHITE_TULIP("red_flower", 38, 6), PINK_TULIP("red_flower", 38,
        7), OXEYE_DAISY("red_flower", 38, 8), BROWN_MUSHROOM("brown_mushroom", 39), RED_MUSHROOM(
        "red_mushroom", 40), GOLD_BLOCK("gold_block", 41), IRON_BLOCK("iron_block",
        42), DOUBLE_STONE_SLAB("double_stone_slab", 43), DOUBLE_SANDSTONE_SLAB("double_stone_slab",
        43, 1), DOUBLE_WOODEN_SLAB("double_stone_slab", 43, 2), DOUBLE_COBBLESTONE_SLAB(
        "double_stone_slab", 43, 3), DOUBLE_BRICK_SLAB("double_stone_slab", 43,
        4), DOUBLE_STONE_BRICK_SLAB("double_stone_slab", 43, 5), DOUBLE_NETHER_BRICK_SLAB(
        "double_stone_slab", 43, 6), DOUBLE_QUARTZ_SLAB("double_stone_slab", 43, 7), STONE_SLAB(
        "stone_slab", 44), SANDSTONE_SLAB("stone_slab", 44, 1), WOODEN_SLAB("stone_slab", 44,
        2), COBBLESTONE_SLAB("stone_slab", 44, 3), BRICK_SLAB("stone_slab", 44,
        4), STONE_BRICK_SLAB("stone_slab", 44, 5), NETHER_BRICK_SLAB("stone_slab", 44,
        6), QUARTZ_SLAB("stone_slab", 44, 7), BRICKS("brick_block", 45), TNT("tnt", 46), BOOKSHELF(
        "bookshelf", 47), MOSS_STONE("mossy_cobblestone", 48), OBSIDIAN("obsidian", 49), TORCH(
        "torch", 50), FIRE("fire", 51), MONSTER_SPAWNER("mob_spawner", 52), OAK_WOOD_STAIRS(
        "oak_stairs", 53), CHEST("chest", 54), REDSTONE_WIRE("redstone_wire", 55), DIAMOND_ORE(
        "diamond_ore", 56), DIAMOND_BLOCK("diamond_block", 57), CRAFTING_TABLE("crafting_table",
        58), WHEAT_CROPS("wheat", 59), FARMLAND("farmland", 60), FURNACE("furnace",
        61), BURNING_FURNACE("lit_furnace", 62), STANDING_SIGN_BLOCK("standing_sign",
        63), OAK_DOOR_BLOCK("wooden_door", 64), LADDER("ladder", 65), RAIL("rail",
        66), COBBLESTONE_STAIRS("stone_stairs", 67), WALL_MOUNTED_SIGN_BLOCK("wall_sign",
        68), LEVER("lever", 69), STONE_PRESSURE_PLATE("stone_pressure_plate", 70), IRON_DOOR_BLOCK(
        "iron_door", 71), WOODEN_PRESSURE_PLATE("wooden_pressure_plate", 72), REDSTONE_ORE(
        "redstone_ore", 73), GLOWING_REDSTONE_ORE("lit_redstone_ore", 74), REDSTONE_TORCH_OFF(
        "unlit_redstone_torch", 75), REDSTONE_TORCH_ON("redstone_torch", 76), STONE_BUTTON(
        "stone_button", 77), SNOW("snow_layer", 78), ICE("ice", 79), SNOW_BLOCK("snow", 80), CACTUS(
        "cactus", 81), CLAY("clay", 82), SUGAR_CANES("reeds", 83), JUKEBOX("jukebox",
        84), OAK_FENCE("fence", 85), PUMPKIN("pumpkin", 86), NETHERRACK("netherrack",
        87), SOUL_SAND("soul_sand", 88), GLOWSTONE("glowstone", 89), NETHER_PORTAL("portal",
        90), JACK_OLANTERN("lit_pumpkin", 91), CAKE_BLOCK("cake", 92), REDSTONE_REPEATER_BLOCK_OFF(
        "unpowered_repeater", 93), REDSTONE_REPEATER_BLOCK_ON("powered_repeater",
        94), WHITE_STAINED_GLASS("stained_glass", 95), ORANGE_STAINED_GLASS("stained_glass", 95,
        1), MAGENTA_STAINED_GLASS("stained_glass", 95, 2), LIGHT_BLUE_STAINED_GLASS("stained_glass",
        95, 3), YELLOW_STAINED_GLASS("stained_glass", 95, 4), LIME_STAINED_GLASS("stained_glass",
        95, 5), PINK_STAINED_GLASS("stained_glass", 95, 6), GRAY_STAINED_GLASS("stained_glass", 95,
        7), LIGHT_GRAY_STAINED_GLASS("stained_glass", 95, 8), CYAN_STAINED_GLASS("stained_glass",
        95, 9), PURPLE_STAINED_GLASS("stained_glass", 95, 10), BLUE_STAINED_GLASS("stained_glass",
        95, 11), BROWN_STAINED_GLASS("stained_glass", 95, 12), GREEN_STAINED_GLASS("stained_glass",
        95, 13), RED_STAINED_GLASS("stained_glass", 95, 14), BLACK_STAINED_GLASS("stained_glass",
        95, 15), WOODEN_TRAPDOOR("trapdoor", 96), STONE_MONSTER_EGG("monster_egg",
        97), COBBLESTONE_MONSTER_EGG("monster_egg", 97, 1), STONE_BRICK_MONSTER_EGG("monster_egg",
        97, 2), MOSSY_STONE_BRICK_MONSTER_EGG("monster_egg", 97,
        3), CRACKED_STONE_BRICK_MONSTER_EGG("monster_egg", 97, 4), CHISELED_STONE_BRICK_MONSTER_EGG(
        "monster_egg", 97, 5), STONE_BRICKS("stonebrick", 98), MOSSY_STONE_BRICKS("stonebrick", 98,
        1), CRACKED_STONE_BRICKS("stonebrick", 98, 2), CHISELED_STONE_BRICKS("stonebrick", 98,
        3), RED_MUSHROOM_CAP("stonebrick", 99), BROWN_MUSHROOM_CAP("stonebrick", 100), IRON_BARS(
        "iron_bars", 101), GLASS_PANE("glass_pane", 102), MELON_BLOCK("melon_block",
        103), PUMPKIN_STEM("pumpkin_stem", 104), MELON_STEM("melon_stem", 105), VINES("vine",
        106), OAK_FENCE_GATE("fence_gate", 107), BRICK_STAIRS("brick_stairs",
        108), STONE_BRICK_STAIRS("stone_brick_stairs", 109), MYCELIUM("mycelium", 110), LILY_PAD(
        "waterlily", 111), NETHER_BRICK("nether_brick", 112), NETHER_BRICK_FENCE(
        "nether_brick_fence", 113), NETHER_BRICK_STAIRS("nether_brick_stairs", 114), NETHER_WART(
        "nether_wart", 115), ENCHANTMENT_TABLE("enchanting_table", 116), BREWING_STAND(
        "brewing_stand", 117), CAULDRON("cauldron", 118), END_PORTAL("end_portal",
        119), END_PORTAL_FRAME("end_portal_frame", 120), END_STONE("end_stone", 121), DRAGON_EGG(
        "dragon_egg", 122), REDSTONE_LAMP_INACTIVE("redstone_lamp", 123), REDSTONE_LAMP_ACTIVE(
        "lit_redstone_lamp", 124), DOUBLE_OAK_WOOD_SLAB("double_wooden_slab",
        125), DOUBLE_SPRUCE_WOOD_SLAB("double_wooden_slab", 125, 1), DOUBLE_BIRCH_WOOD_SLAB(
        "double_wooden_slab", 125, 2), DOUBLE_JUNGLE_WOOD_SLAB("double_wooden_slab", 125,
        3), DOUBLE_ACACIA_WOOD_SLAB("double_wooden_slab", 125, 4), DOUBLE_DARK_OAK_WOOD_SLAB(
        "double_wooden_slab", 125, 5), OAK_WOOD_SLAB("wooden_slab", 126), SPRUCE_WOOD_SLAB(
        "wooden_slab", 126, 1), BIRCH_WOOD_SLAB("wooden_slab", 126, 2), JUNGLE_WOOD_SLAB(
        "wooden_slab", 126, 3), ACACIA_WOOD_SLAB("wooden_slab", 126, 4), DARK_OAK_WOOD_SLAB(
        "wooden_slab", 126, 5), COCOA("cocoa", 127), SANDSTONE_STAIRS("sandstone_stairs",
        128), EMERALD_ORE("emerald_ore", 129), ENDER_CHEST("ender_chest", 130), TRIPWIRE_HOOK(
        "tripwire_hook", 131), TRIPWIRE("tripwire_hook", 132), EMERALD_BLOCK("emerald_block",
        133), SPRUCE_WOOD_STAIRS("spruce_stairs", 134), BIRCH_WOOD_STAIRS("birch_stairs",
        135), JUNGLE_WOOD_STAIRS("jungle_stairs", 136), COMMAND_BLOCK("command_block", 137), BEACON(
        "beacon", 138), COBBLESTONE_WALL("cobblestone_wall", 139), MOSSY_COBBLESTONE_WALL(
        "cobblestone_wall", 139, 1), FLOWER_POT("flower_pot", 140), CARROTS("carrots",
        141), POTATOES("potatoes", 142), WOODEN_BUTTON("wooden_button", 143), MOB_HEAD("skull",
        144), ANVIL("anvil", 145), TRAPPED_CHEST("trapped_chest",
        146), WEIGHTED_PRESSURE_PLATE_LIGHT("light_weighted_pressure_plate",
        147), WEIGHTED_PRESSURE_PLATE_HEAVY("heavy_weighted_pressure_plate",
        148), REDSTONE_COMPARATOR_INACTIVE("unpowered_comparator", 149), REDSTONE_COMPARATOR_ACTIVE(
        "powered_comparator", 150), DAYLIGHT_SENSOR("daylight_detector", 151), REDSTONE_BLOCK(
        "redstone_block", 152), NETHER_QUARTZ_ORE("quartz_ore", 153), HOPPER("hopper",
        154), QUARTZ_BLOCK("quartz_block", 155), CHISELED_QUARTZ_BLOCK("quartz_block", 155,
        1), PILLAR_QUARTZ_BLOCK("quartz_block", 155, 2), QUARTZ_STAIRS("quartz_stairs",
        156), ACTIVATOR_RAIL("activator_rail", 157), DROPPER("dropper", 158), WHITE_STAINED_CLAY(
        "stained_hardened_clay", 159), ORANGE_STAINED_CLAY("stained_hardened_clay", 159,
        1), MAGENTA_STAINED_CLAY("stained_hardened_clay", 159, 2), LIGHT_BLUE_STAINED_CLAY(
        "stained_hardened_clay", 159, 3), YELLOW_STAINED_CLAY("stained_hardened_clay", 159,
        4), LIME_STAINED_CLAY("stained_hardened_clay", 159, 5), PINK_STAINED_CLAY(
        "stained_hardened_clay", 159, 6), GRAY_STAINED_CLAY("stained_hardened_clay", 159,
        7), LIGHT_GRAY_STAINED_CLAY("stained_hardened_clay", 159, 8), CYAN_STAINED_CLAY(
        "stained_hardened_clay", 159, 9), PURPLE_STAINED_CLAY("stained_hardened_clay", 159,
        10), BLUE_STAINED_CLAY("stained_hardened_clay", 159, 11), BROWN_STAINED_CLAY(
        "stained_hardened_clay", 159, 12), GREEN_STAINED_CLAY("stained_hardened_clay", 159,
        13), RED_STAINED_CLAY("stained_hardened_clay", 159, 14), BLACK_STAINED_CLAY(
        "stained_hardened_clay", 159, 15), WHITE_STAINED_GLASS_PANE("stained_glass_pane",
        160), ORANGE_STAINED_GLASS_PANE("stained_glass_pane", 160, 1), MAGENTA_STAINED_GLASS_PANE(
        "stained_glass_pane", 160, 2), LIGHT_BLUE_STAINED_GLASS_PANE("stained_glass_pane", 160,
        3), YELLOW_STAINED_GLASS_PANE("stained_glass_pane", 160, 4), LIME_STAINED_GLASS_PANE(
        "stained_glass_pane", 160, 5), PINK_STAINED_GLASS_PANE("stained_glass_pane", 160,
        6), GRAY_STAINED_GLASS_PANE("stained_glass_pane", 160, 7), LIGHT_GRAY_STAINED_GLASS_PANE(
        "stained_glass_pane", 160, 8), CYAN_STAINED_GLASS_PANE("stained_glass_pane", 160,
        9), PURPLE_STAINED_GLASS_PANE("stained_glass_pane", 160, 10), BLUE_STAINED_GLASS_PANE(
        "stained_glass_pane", 160, 11), BROWN_STAINED_GLASS_PANE("stained_glass_pane", 160,
        12), GREEN_STAINED_GLASS_PANE("stained_glass_pane", 160, 13), RED_STAINED_GLASS_PANE(
        "stained_glass_pane", 160, 14), BLACK_STAINED_GLASS_PANE("stained_glass_pane", 160,
        15), ACACIA_LEAVES("leaves2", 161), DARK_OAK_LEAVES("leaves2", 161, 1), ACACIA_WOOD("log2",
        162), DARK_OAK_WOOD("log2", 162, 1), ACACIA_WOOD_STAIRS("acacia_stairs",
        163), DARK_OAK_WOOD_STAIRS("dark_oak_stairs", 164), SLIME_BLOCK("slime", 165), BARRIER(
        "barrier", 166), IRON_TRAPDOOR("iron_trapdoor", 167), PRISMARINE("prismarine",
        168), PRISMARINE_BRICKS("prismarine", 168, 1), DARK_PRISMARINE("prismarine", 168,
        2), SEA_LANTERN("sea_lantern", 169), HAY_BALE("hay_block", 170), WHITE_CARPET("carpet",
        171), ORANGE_CARPET("carpet", 171, 1), MAGENTA_CARPET("carpet", 171, 2), LIGHT_BLUE_CARPET(
        "carpet", 171, 3), YELLOW_CARPET("carpet", 171, 4), LIME_CARPET("carpet", 171,
        5), PINK_CARPET("carpet", 171, 6), GRAY_CARPET("carpet", 171, 7), LIGHT_GRAY_CARPET(
        "carpet", 171, 8), CYAN_CARPET("carpet", 171, 9), PURPLE_CARPET("carpet", 171,
        10), BLUE_CARPET("carpet", 171, 11), BROWN_CARPET("carpet", 171, 12), GREEN_CARPET("carpet",
        171, 13), RED_CARPET("carpet", 171, 14), BLACK_CARPET("carpet", 171, 15), HARDENED_CLAY(
        "hardened_clay", 172), BLOCK_OF_COAL("coal_block", 173), PACKED_ICE("packed_ice",
        174), SUNFLOWER("double_plant", 175), LILAC("double_plant", 175, 1), DOUBLE_TALLGRASS(
        "double_plant", 175, 2), LARGE_FERN("double_plant", 175, 3), ROSE_BUSH("double_plant", 175,
        4), PEONY("double_plant", 175, 5), FREE_STANDING_BANNER("standing_banner",
        176), WALL_MOUNTED_BANNER("wall_banner", 177), INVERTED_DAYLIGHT_SENSOR(
        "daylight_detector_inverted", 178), RED_SANDSTONE("red_sandstone",
        179), SMOOTH_RED_SANDSTONE("red_sandstone", 179, 1), CHISELED_RED_SANDSTONE("red_sandstone",
        179, 2), RED_SANDSTONE_STAIRS("red_sandstone_stairs", 180), DOUBLE_RED_SANDSTONE_SLAB(
        "stone_slab2", 181), RED_SANDSTONE_SLAB("double_stone_slab2", 182), SPRUCE_FENCE_GATE(
        "spruce_fence_gate", 183), BIRCH_FENCE_GATE("birch_fence_gate", 184), JUNGLE_FENCE_GATE(
        "jungle_fence_gate", 185), DARK_OAK_FENCE_GATE("dark_oak_fence_gate",
        186), ACACIA_FENCE_GATE("acacia_fence_gate", 187), SPRUCE_FENCE("spruce_fence",
        188), BIRCH_FENCE("birch_fence", 189), JUNGLE_FENCE("jungle_fence", 190), DARK_OAK_FENCE(
        "dark_oak_fence", 191), ACACIA_FENCE("acacia_fence", 192), SPRUCE_DOOR_BLOCK("spruce_door",
        193), BIRCH_DOOR_BLOCK("birch_door", 194), JUNGLE_DOOR_BLOCK("jungle_door",
        195), ACACIA_DOOR_BLOCK("acacia_door", 196), DARK_OAK_DOOR_BLOCK("dark_oak_door",
        197), IRON_SHOVEL("iron_shovel", 256), IRON_PICKAXE("iron_pickaxe", 257), IRON_AXE(
        "iron_axe", 258), FLINT_AND_STEEL("flint_and_steel", 259), APPLE("apple", 260), BOW("bow",
        261), ARROW("arrow", 262), COAL("coal", 263), CHARCOAL("coal", 263, 1), DIAMOND("diamond",
        264), IRON_INGOT("iron_ingot", 265), GOLD_INGOT("gold_ingot", 266), IRON_SWORD("iron_sword",
        267), WOODEN_SWORD("wooden_sword", 268), WOODEN_SHOVEL("wooden_shovel",
        269), WOODEN_PICKAXE("wooden_pickaxe", 270), WOODEN_AXE("wooden_axe", 271), STONE_SWORD(
        "stone_sword", 272), STONE_SHOVEL("stone_shovel", 273), STONE_PICKAXE("stone_pickaxe",
        274), STONE_AXE("stone_axe", 275), DIAMOND_SWORD("diamond_sword", 276), DIAMOND_SHOVEL(
        "diamond_shovel", 277), DIAMOND_PICKAXE("diamond_pickaxe", 278), DIAMOND_AXE("diamond_axe",
        279), STICK("stick", 280), BOWL("bowl", 281), MUSHROOM_STEW("mushroom_stew",
        282), GOLDEN_SWORD("golden_sword", 283), GOLDEN_SHOVEL("golden_shovel",
        284), GOLDEN_PICKAXE("golden_pickaxe", 285), GOLDEN_AXE("golden_axe", 286), STRING("string",
        287), FEATHER("feather", 288), GUNPOWDER("gunpowder", 289), WOODEN_HOE("wooden_hoe",
        290), STONE_HOE("stone_hoe", 291), IRON_HOE("iron_hoe", 292), DIAMOND_HOE("diamond_hoe",
        293), GOLDEN_HOE("golden_hoe", 294), WHEAT_SEEDS("wheat_seeds", 295), WHEAT("wheat",
        296), BREAD("bread", 297), LEATHER_HELMET("leather_helmet", 298), LEATHER_TUNIC(
        "leather_chestplate", 299), LEATHER_PANTS("leather_leggings", 300), LEATHER_BOOTS(
        "leather_boots", 301), CHAINMAIL_HELMET("chainmail_helmet", 302), CHAINMAIL_CHESTPLATE(
        "chainmail_chestplate", 303), CHAINMAIL_LEGGINGS("chainmail_leggings",
        304), CHAINMAIL_BOOTS("chainmail_boots", 305), IRON_HELMET("iron_helmet",
        306), IRON_CHESTPLATE("iron_chestplate", 307), IRON_LEGGINGS("iron_leggings",
        308), IRON_BOOTS("iron_boots", 309), DIAMOND_HELMET("diamond_helmet",
        310), DIAMOND_CHESTPLATE("diamond_chestplate", 311), DIAMOND_LEGGINGS("diamond_leggings",
        312), DIAMOND_BOOTS("diamond_boots", 313), GOLDEN_HELMET("golden_helmet",
        314), GOLDEN_CHESTPLATE("golden_chestplate", 315), GOLDEN_LEGGINGS("golden_leggings",
        316), GOLDEN_BOOTS("golden_boots", 317), FLINT("flint_and_steel", 318), RAW_PORKCHOP(
        "porkchop", 319), COOKED_PORKCHOP("cooked_porkchop", 320), PAINTING("painting",
        321), GOLDEN_APPLE("golden_apple", 322), ENCHANTED_GOLDEN_APPLE("golden_apple", 322,
        1), SIGN("sign", 323), OAK_DOOR("wooden_door", 324), BUCKET("bucket", 325), WATER_BUCKET(
        "water_bucket", 326), LAVA_BUCKET("lava_bucket", 327), MINECART("minecart", 328), SADDLE(
        "saddle", 329), IRON_DOOR("iron_door", 330), REDSTONE("redstone", 331), SNOWBALL("snowball",
        332), BOAT("boat", 333), LEATHER("leather", 334), MILK_BUCKET("milk_bucket", 335), BRICK(
        "brick", 336), CLAY1("clay_ball", 337), SUGAR_CANES1("reeds", 338), PAPER("paper",
        339), BOOK("book", 340), SLIMEBALL("slime_ball", 341), MINECART_WITH_CHEST("chest_minecart",
        342), MINECART_WITH_FURNACE("furnace_minecart", 343), EGG("egg", 344), COMPASS("compass",
        345), FISHING_ROD("fishing_rod", 346), CLOCK("clock", 347), GLOWSTONE_DUST("glowstone_dust",
        348), RAW_FISH("fish", 349), RAW_SALMON("fish", 349, 1), CLOWNFISH("fish", 349,
        2), PUFFERFISH("fish", 349, 3), COOKED_FISH("cooked_fish", 350), COOKED_SALMON(
        "cooked_fish", 350, 1), INK_SACK("dye", 351), ROSE_RED("dye", 351, 1), CACTUS_GREEN("dye",
        351, 2), COCO_BEANS("dye", 351, 3), LAPIS_LAZULI("dye", 351, 4), PURPLE_DYE("dye", 351,
        5), CYAN_DYE("dye", 351, 6), LIGHT_GRAY_DYE("dye", 351, 7), GRAY_DYE("dye", 351,
        8), PINK_DYE("dye", 351, 9), LIME_DYE("dye", 351, 10), DANDELION_YELLOW("dye", 351,
        11), LIGHT_BLUE_DYE("dye", 351, 12), MAGENTA_DYE("dye", 351, 13), ORANGE_DYE("dye", 351,
        14), BONE_MEAL("dye", 351, 15), BONE("bone", 352), SUGAR("sugar", 353), CAKE("cake",
        354), BED1("bed", 355), REDSTONE_REPEATER("repeater", 356), COOKIE("cookie", 357), MAP(
        "filled_map", 358), SHEARS("shears", 359), MELON("melon", 360), PUMPKIN_SEEDS(
        "pumpkin_seeds", 361), MELON_SEEDS("melon_seeds", 362), RAW_BEEF("beef", 363), STEAK(
        "cooked_beef", 364), RAW_CHICKEN("chicken", 365), COOKED_CHICKEN("cooked_chicken",
        366), ROTTEN_FLESH("rotten_flesh", 367), ENDER_PEARL("ender_pearl", 368), BLAZE_ROD(
        "blaze_rod", 369), GHAST_TEAR("ghast_tear", 370), GOLD_NUGGET("gold_nugget",
        371), NETHER_WART1("nether_wart", 372), POTION("potion", 373), GLASS_BOTTLE("glass_bottle",
        374), SPIDER_EYE("spider_eye", 375), FERMENTED_SPIDER_EYE("fermented_spider_eye",
        376), BLAZE_POWDER("blaze_powder", 377), MAGMA_CREAM("magma_cream", 378), BREWING_STAND1(
        "brewing_stand", 379), CAULDRON1("cauldron", 380), EYE_OF_ENDER("ender_eye",
        381), GLISTERING_MELON("speckled_melon", 382), SPAWN_CREEPER("spawn_egg", 383,
        50), SPAWN_SKELETON("spawn_egg", 383, 51), SPAWN_SPIDER("spawn_egg", 383, 52), SPAWN_ZOMBIE(
        "spawn_egg", 383, 54), SPAWN_SLIME("spawn_egg", 383, 55), SPAWN_GHAST("spawn_egg", 383,
        56), SPAWN_PIGMAN("spawn_egg", 383, 57), SPAWN_ENDERMAN("spawn_egg", 383,
        58), SPAWN_CAVE_SPIDER("spawn_egg", 383, 59), SPAWN_SILVERFISH("spawn_egg", 383,
        60), SPAWN_BLAZE("spawn_egg", 383, 61), SPAWN_MAGMA_CUBE("spawn_egg", 383, 62), SPAWN_BAT(
        "spawn_egg", 383, 65), SPAWN_WITCH("spawn_egg", 383, 66), SPAWN_ENDERMITE("spawn_egg", 383,
        67), SPAWN_GUARDIAN("spawn_egg", 383, 68), SPAWN_PIG("spawn_egg", 383, 90), SPAWN_SHEEP(
        "spawn_egg", 383, 91), SPAWN_COW("spawn_egg", 383, 92), SPAWN_CHICKEN("spawn_egg", 383,
        93), SPAWN_SQUID("spawn_egg", 383, 94), SPAWN_WOLF("spawn_egg", 383, 95), SPAWN_MOOSHROOM(
        "spawn_egg", 383, 96), SPAWN_OCELOT("spawn_egg", 383, 98), SPAWN_HORSE("spawn_egg", 383,
        100), SPAWN_RABBIT("spawn_egg", 383, 101), SPAWN_VILLAGER("spawn_egg", 383,
        120), BOTTLE_O_ENCHANTING("experience_bottle", 384), FIRE_CHARGE("fire_charge",
        385), BOOK_AND_QUILL("writable_book", 386), WRITTEN_BOOK("written_book", 387), EMERALD(
        "emerald", 388), ITEM_FRAME("item_frame", 389), FLOWER_POT1("flower_pot", 390), CARROT(
        "carrot", 391), POTATO("potato", 392), BAKED_POTATO("baked_potato", 393), POISONOUS_POTATO(
        "poisonous_potato", 394), EMPTY_MAP("map", 395), GOLDEN_CARROT("golden_carrot",
        396), MOB_HEAD_SKELETON("skull", 397), MOB_HEAD_WITHER_SKELETON("skull", 397,
        1), MOB_HEAD_ZOMBIE("skull", 397, 2), MOB_HEAD_HUMAN("skull", 397, 3), MOB_HEAD_CREEPER(
        "skull", 397, 4), CARROT_ON_A_STICK("carrot_on_a_stick", 398), NETHER_STAR("nether_star",
        399), PUMPKIN_PIE("pumpkin_pie", 400), FIREWORK_ROCKET("fireworks", 401), FIREWORK_STAR(
        "firework_charge", 402), ENCHANTED_BOOK("enchanted_book", 403), REDSTONE_COMPARATOR(
        "comparator", 404), NETHER_BRICK1("netherbrick", 405), NETHER_QUARTZ("quartz",
        406), MINECART_WITH_TNT("tnt_minecart", 407), MINECART_WITH_HOPPER("hopper_minecart",
        408), PRISMARINE_SHARD("prismarine_shard", 409), PRISMARINE_CRYSTALS("prismarine_crystals",
        410), RAW_RABBIT("rabbit", 411), COOKED_RABBIT("cooked_rabbit", 412), RABBIT_STEW(
        "rabbit_stew", 413), RABBITS_FOOT("rabbit_foot", 414), RABBIT_HIDE("rabbit_hide",
        415), ARMOR_STAND("armor_stand", 416), IRON_HORSE_ARMOR("iron_horse_armor",
        417), GOLDEN_HORSE_ARMOR("golden_horse_armor", 418), DIAMOND_HORSE_ARMOR(
        "diamond_horse_armor", 419), LEAD("lead", 420), NAME_TAG("name_tag",
        421), MINECART_WITH_COMMAND_BLOCK("command_block_minecart", 422), RAW_MUTTON("mutton",
        423), COOKED_MUTTON("cooked_mutton", 424), BANNER("banner", 425), SPRUCE_DOOR("spruce_door",
        427), BIRCH_DOOR("birch_door", 428), JUNGLE_DOOR("jungle_door", 429), ACACIA_DOOR(
        "acacia_door", 430), DARK_OAK_DOOR("dark_oak_door", 431), DISC_13("record_13",
        2256), CAT_DISC("record_cat", 2257), BLOCKS_DISC("record_blocks", 2258), CHIRP_DISC(
        "record_chirp", 2259), FAR_DISC("record_far", 2260), MALL_DISC("record_mall",
        2261), MELLOHI_DISC("record_mellohi", 2262), STAL_DISC("record_stal", 2263), STRAD_DISC(
        "record_strad", 2264), WARD_DISC("record_ward", 2265), DISC_11("record_11",
        2266), WAIT_DISC("record_wait", 2267), END_ROD("end_rod", 198), CHORUS_PLANT("chorus_plant",
        199), CHORUS_FLOWER("chorus_flower", 200), PURPUR_BLOCK("purpur_block", 201), PURPUR_PILLAR(
        "purpur_pillar", 202), PURPUR_STAIRS("purpur_stairs", 203), PURPUR_DOUBLE_SLAB(
        "purpur_double_slab", 204), PURPUR_SLAB("purpur_slab", 205), END_BRICKS("end_bricks",
        206), BEETROOTS("beetroots", 207), GRASS_PATH("grass_path", 208), END_GATEWAY("end_gateway",
        209), REPEATING_COMMAND_BLOCK("repeating_command_block", 210), CHAIN_COMMAND_BLOCK(
        "chain_command_block", 211), FROSTED_ICE("frosted_ice", 212), STRUCTURE_BLOCK(
        "structure_block", 255);

    private static final Map<String, Integer> ids = new HashMap<>();
    private static final Map<String, Byte> datas = new HashMap<>();

    static {
        for (ItemType type : EnumSet.allOf(ItemType.class)) {
            ids.put(type.name, type.id);
            datas.put(type.name, type.data);
        }
    }

    private final int id;
    private final byte data;
    private final String name;

    ItemType(String name, int id) {
        this.id = id;
        this.data = 0;
        this.name = name;
    }

    ItemType(String name, int id, int data) {
        this.id = id;
        this.data = (byte) data;
        this.name = name;
    }

    public static int getId(String name) {
        Integer value = ids.get(name);
        if (value == null) {
            return 0;
        }
        return value;
    }

    public static byte getData(String name) {
        Byte value = datas.get(name);
        if (value == null) {
            return 0;
        }
        return value;
    }
}
