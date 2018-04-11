package com.nimsdev.rocksrockquiz;

/**
 * Created by jugld on 4/9/2018.
 */

public class QuizData {

    public static String[] questions = new String[]{
        "Quartz crystals are the hardest mineral on earth?",
        "When magma, or molten rock from the earth's core, flows on the surface it is called Lava?",
        "These giant crystals found in a steaming cave in Mexico are made of Calcite?",
        "The beautiful mineral formations known as Stalagmites grow down from the ceiling of a cave?",
        "The glass like rock called Obsidean is an example of an 'igneous' rock?",
        "Petrified Wood was originally real wood that turned into mineral formations over thousands of years?",
        "This common mineral, sometimes confused with gold, is called Pyrite?",
        "This orange form of Quartz, which was once more valuable than Diamonds, is known as Carborundum?",
        "Thundereggs are actually the fossilized eggs of prehistoric dinosaurs?",
        "Vikings used crystals from the Feldspar family to help then navigate their ships on cloudy days?"
    };

    public static int[] images = new int[] {
        R.mipmap.quartz, R.mipmap.volcano_lava, R.mipmap.cave_crystals,
        R.mipmap.stalagmites, R.mipmap.obsidean_rough, R.mipmap.petrified_wood,
        R.mipmap.pyrite, R.mipmap.carnelian, R.mipmap.thunderegg, R.mipmap.viking_sunstone
    };

    public static boolean[] answers = new boolean[]{
        false, true, false, false, true, true, true, false, false, true
    };

    public static String[] answersText = new String[]{
            "False, Diamonds, made from pure carbon, are the hardest crytstal.",
            "True, Lava is the name for magma when it flows on the earth's surface.",
            "False, These famous giant crystals are formed from the mineral Selenite.",
            "False, Stalagtites grow down from the ceiing, Stalagmites grow up from the floor of  a cave.",
            "True, Obsidean is a type of igneous rock, characterized by being formed from cooling magma or lava.",
            "True, Once buried in the ground, the organic wood is slowly replaced by silicate minerals.",
            "True, Pyrite, which often occurs as small flakes, has broken the hearts of many gold miners.",
            "False, actually known as Carnelian, this beautiful stone ranges in color from amber to orange.",
            "False, Thundereggs form in flows of rhyolite lava, where gas pockets gradually fill with chalcedony",
            "True, Vikings did use crystals to navigate, also known as Sunstones, they were probably Iceland Spar. "
    };
}
