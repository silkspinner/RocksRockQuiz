package com.nimsdev.rocksrockquiz;

import android.text.InputFilter;
import android.widget.Toast;

import java.util.Random;

/**
 * rock quiz data set
 * Questions have 3 levels of difficulty
 * Level 1 - Common knowledge for the general public
 * Level 2 - Common knowledge for average rock hounds
 * Level 3 - Esoteric knowledge familiar to more advanced rock hounds
 */

// LEVEL 1 Questions
public class QuizData {
    public static QuizItem[] itemsLvl1 = new QuizItem[]{

            new QuizItem(
                    "Quartz crystals are the hardest mineral on earth?",
                    "FALSE, Diamonds, made from pure carbon, are the hardest crytstal with a maximum Mohs scale value of 10.",
                    false,
                    R.mipmap.quartz,
                    "Quartz crystal formation, Minas Gerais, Brasil",
                    "Didier Descouens",
                    "https://commons.wikimedia.org/wiki/User:Archaeodontosaurus",
                    false
            ),
            new QuizItem(
                    "Most of the planet Earth is made of molten rock also called Magma, but when it flows on the surface it is called Lava?",
                    "TRUE, Molten rock inside the Earth is known as Magma, Lava is the correct name when escapes to the planets surface.",
                    true,
                    R.mipmap.volcano_lava,
                    "Eruption at Kalapana, Hawaii",
                    "Jeff Moore",
                    "https://www.flickr.com/photos/jeffgmoore/",
                    false
            ),
            new QuizItem(
                    "Petrified Wood was originally real wood that turned into mineral formations over thousands of years?",
                    "TRUE, Once buried in the ground, the organic wood is slowly replaced by silicate minerals.",
                    true,
                    R.mipmap.petrified_wood,
                    "Petrified wood, Petrified Forest National Park, US",
                    "Daniel Schwen",
                    "https://en.wikipedia.org/wiki/User:Dschwen",
                    false
            ),
            new QuizItem(
                    "Thundereggs are actually the fossilized eggs of prehistoric dinosaurs, also known as Thunder Lizards?",
                    "FALSE, Thundereggs actually form in rhyolite lava flows, where empty gas pockets gradually fill with chalcedony silicate deposits.",
                    false,
                    R.mipmap.thunderegg,
                    "H2L mine thunderegg",
                    "RhyoR (Pro)",
                    "https://www.flickr.com/photos/rhyor/",
                    false
            ),
            new QuizItem(
                    "Broad, U-shaped valleys are typically a product of earthquake activity?",
                    "FALSE, Glaciers carrying tons of ice carve these signature U-shaped valleys slowly as they flow down the mountains.",
                    false,
                    R.mipmap.glacial_valley,
                    " Rocky Mountains, US",
                    "Ken Lund",
                    "https://www.flickr.com/photos/kenlund/",
                    false
            ),
            new QuizItem(
                    "The bowl that typically occurs at the top of a volcano is referred to as the Caldera?",
                    "TRUE, As Volcanoes go through the process of repeated eruptions, a bowl shaped depression often forms at the peak.",
                    true,
                    R.mipmap.caldera,
                    "Okmok volcano cone D in Alaska, US",
                    "Christina Neal",
                    "https://commons.wikimedia.org/wiki/File:OkmokVolcano.jpg",
                    false
            ),
            new QuizItem(
                    "Known by their signature star pattern of light reflection, these beautiful gems are called Star Sapphires",
                    "TRUE, The star in Star Sapphires is an effect known as 'Asterism' caused by needle-like inclusions in the underlying crystal.",
                    true,
                    R.mipmap.sapphire,
                    "Star of Asia, 330 carats Burma",
                    "thisisbossi",
                    "https://www.flickr.com/people/25622716@N02",
                    false
            ),
            new QuizItem(
                    "Cabochon is the term that refers to gemstones with curved surface that have been shaped and polished, as opposed to faceted?",
                    "TRUE, From the French word caboche (head), cabochons can come in many sizes and shapes but they will all have curved surfaces.",
                    true,
                    R.mipmap.cabochon,
                    "Moonstone pendants in a jeweller’s window",
                    "Arpingstone",
                    "https://commons.wikimedia.org/wiki/User:Arpingstone",
                    false
            ),
            new QuizItem(
                    "This nturally occuring magnetic mineral is Magnetite, also commonly known as Compass-stone?",
                    "FALSE, Magnetite is also known as Lodestone, but it was used to create the earliest form of compasses.",
                    false,
                    R.mipmap.lodestone,
                    "It's a natural attraction",
                    "Ryan Somma",
                    "https://www.flickr.com/people/14405058@N08",
                    true
            ),
            new QuizItem(
                    "One of the three main categories of rocks, Sedimentary rocks are made up of accumulated layers of sediment laid down over years?",
                    "TRUE, Sedimentary rocks, like this sandstone, have layers of sediments and often contain fossil remains of organic materials that were present.",
                    true,
                    R.mipmap.sandstone_fossil,
                    "Many fossils in fine grained deposit from Tenor Mtn, Ohio, US",
                    "James St. John",
                    "https://www.flickr.com/photos/jsjgeology/",
                    true
            ),
            new QuizItem(
                    "As shown on this rock lifecycle diagram, the three main categories of rocks are Igneous, Sedimentary and Metamorphic?",
                    "TRUE, rock passes through those categories, Born as igneous, erodes and reforms as sedimentary, then heated and compressed into metamorphic.",
                    true,
                    R.mipmap.rock_lifecycle,
                    "Rock Lifecycle",
                    "Woudloper/Woodwalker",
                    "https://commons.wikimedia.org/wiki/File:Rockcycle.jpg",
                    true
            ),
            new QuizItem(
                    "A standard tool for identifying rocks and minerals is the Mike's Hardness Scale, as depicted in this chart?",
                    "FALSE, the chart shows the Mohs Hardness Scale, and shows the materials typically used to test for the various hardness levels.",
                    false,
                    R.mipmap.mohs_scale,
                    "Mineral Hardness Scale",
                    "nature.nps.gov",
                    "https://commons.wikimedia.org/wiki/File:Rockcycle.jpg",
                    false
            ),
        };

    // LEVEL 2 Questions
    public static QuizItem[] itemsLvl2 = new QuizItem[]{

            new QuizItem(
                    "This orange form of Quartz, which was once more valuable than Diamonds, is known as Carborundum?",
                    "FALSE, actually known as Carnelian, this beautiful stone ranges in color from amber to orange.",
                    false,
                    R.mipmap.carnelian,
                    "Faceted Gemstones, India",
                    "",
                    "",
                    false
            ),
            new QuizItem(
                    "The glass like rock called Obsidean is a classic example of an 'igneous' rock?",
                    "TRUE, Obsidean is a type of igneous rock, rocks whch are formed from cooling magma or lava.",
                    true,
                    R.mipmap.obsidean_rough,
                    "Obsidian with well-developed conchoidal fractures",
                    "Kevin Walsh (Pro)",
                    "https://www.flickr.com/photos/86624586@N00/",
                    false
            ),
            new QuizItem(
                    "These giant crystals found in a hot, humid cave in Mexico are made of Calcite?",
                    "FALSE, Selenite is the mineral that formed these gigantic crystals, the largest of which is 39' long.",
                    false,
                    R.mipmap.cave_crystals,
                    "The Cave of Giant Crystals, Naica, Mexico",
                    "Paul Williams",
                    "https://www.flickr.com/photos/ironammonite/",
                    false
            ),
            new QuizItem(
                    "This common mineral, also known as Fool's Gold because it can be confused for real Gold, is called Pyrite?",
                    "TRUE, Pyrite, which often occurs as small flakes, has broken the hearts of many gold miners.",
                    true,
                    R.mipmap.pyrite,
                    "Crystal formation",
                    "stephwalther",
                    "https://pixabay.com/en/pyrite-fool-s-gold-specimen-1435118/",
                    false
            ),
            new QuizItem(
                    "The beautiful mineral formations known as Stalagmites grow down from the ceiling of a cave?",
                    "FALSE, In aa cave Stalagtites grow down from the ceiing, while Stalagmites grow up from the floor.",
                    false,
                    R.mipmap.stalagmites,
                    "Luray Caverns, Virginia, US",
                    "Tomandjerry211",
                    "https://commons.wikimedia.org/wiki/User:Tomandjerry211",
                    false
            ),
            new QuizItem(
                    "Vikings used crystals from the Feldspar family to help then navigate their ships on cloudy days?",
                    "TRUE, Vikings did use crystals to navigate, also known as Sunstones, they were probably Iceland Spar. ",
                    true,
                    R.mipmap.viking_sunstone,
                    "Iceland spar",
                    "ArniEin",
                    "https://commons.wikimedia.org/w/index.php?title=User:ArniEin&action=edit&redlink=1",
                    false
            ),
            new QuizItem(
                    "The elements oxygen, silicon, aluminum, iron, calcium, sodium, potassium, and magnesium make up 50% of the minerals on earth?",
                    "FALSE, Actually those eight fundemental elements make up 99% of all the minerals on our planet.",
                    false,
                    R.mipmap.earth,
                    "Planet Earth is made of minerals",
                    "",
                    "",
                    true
            ),
            new QuizItem(
                    "Gold, silver or black the inclusions in these crystals, called 'rutiles', add to the beauty of what is known as Rutilated Quartz?",
                    "TRUE, Rutilated Quartz like this is highly sought after, showing that sometimes inclusions can enhance the value of a gemstone.",
                    true,
                    R.mipmap.quartz_rutile,
                    "Faceted quartz gemstone from Minas Gerais, Brasil ",
                    "Didier Descouens",
                    "https://creativecommons.org/licenses/by-sa/3.0",
                    false
            ),
            new QuizItem(
                    "No, these are not fossilized flowers, Desert Rose crystal formations are another beautiful expression of the mineral Bauxite?",
                    "FALSE, The amazing crystal formations known as Desert Roses are actually made from deposits of Gypsum or Baryte.",
                    false,
                    R.mipmap.desert_rose,
                    "Desert Rose formation from Cleveland County, Oklahoma, US",
                    "Rob Lavinsky",
                    "https://commons.wikimedia.org/wiki/Commons:Robert_Lavinsky",
                    false
            ),
            new QuizItem(
                    "When these beautiful inclusions form in agate they are called Dendrites, from the Greek 'tree-like'?",
                    "TRUE, Dendrites form in agates when traces of iron or manganese seep in along tiny fractures in the host material.",
                    true,
                    R.mipmap.dendritic_agate,
                    "Agate slice from Ken River, Bundelkhand Region, India",
                    "峠 武宏",
                    "https://commons.wikimedia.org/w/index.php?title=User:%E5%B3%A0_%E6%AD%A6%E5%AE%8F&action=edit&redlink=1",
                    false
            ),
            new QuizItem(
                    "A gorgeous member of the Beryl family, this blue-green crystal is called Topaz and is often faceted into stunning gemstones?",
                    "FALSE, Named for it's color, this stone is Aquamarine. Other types of Beryl that are also used for gemstones include Emerald and Heliodor.",
                    false,
                    R.mipmap.aquamarine,
                    "Large natural Beryl crystal from Bahia, Brasil",
                    "Rob Lavinsky",
                    "https://commons.wikimedia.org/wiki/Commons:Robert_Lavinsky",
                    true
            ),
            new QuizItem(
                    "The region where one tektonic plate is disappearing under another plate is known as the Subtraction Zone?",
                    "FALSE, That is actually called the Subduction Zone, and is responsible for increased volcanic activity along the top plate.",
                    false,
                    R.mipmap.subduction,
                    "Diagram of geological plate tektonics",
                    "KDS4444",
                    "https://commons.wikimedia.org/wiki/User:KDS4444",
                    false
            ),
            new QuizItem(
                    "The earth's crust is made up of around 300 different types of minerals?",
                    "FALSE, There are over 3000 distinct mineral types known on earth, though 90% of the crust is made from silicate family.",
                    false,
                    R.mipmap.dioptase,
                    "Dioptase mineral speciminepecimen, Museum Quality",
                    "Chmee2",
                    "https://www.flickr.com/photos/cobalt/",
                    false
            ),
            new QuizItem(
                    "The famous tourist site known as The Giant's Causeway is an interesting example of the common Igneous rock called Basalt?",
                    "TRUE, The Causeway looks like stepping stones for a giant but is really just cooled basalt lava that naturally formed these hexagonal columns.",
                    true,
                    R.mipmap.basalt,
                    "The Giant's Causeway, Northern Ireland",
                    "cobalt123",
                    "https://commons.wikimedia.org/wiki/User:Chmee2",
                    true
            ),
            new QuizItem(
                    "This spectacular formation of Quartz crystals, is defined by it's lovely purple color as being Amethyst?",
                    "TRUE, purple Quartz is called Amethyst. Due to it's color, the Greeks who named it believed Amethyst crystals could keep you from becoming inebriated.",
                    true,
                    R.mipmap.amethyst,
                    "Large cluster of purple Quartz crystals",
                    "Didier Descouens",
                    "https://commons.wikimedia.org/wiki/User:Archaeodontosaurus",
                    true
            ),
            new QuizItem(
                    "The jaw dropping flashes of color in this Australian Opal are produced by the crystalime structure bending light, an effect known as Reflection?",
                    "FALSE, the effect that causes these brilliant colors is called Refraction. Due to this color's elusive nature, polishing an Opal is also known as 'Chasing the Fire'.",
                    false,
                    R.mipmap.opal_fire,
                    " Coober Pedy crystal opal from Dead Horse Gully Field",
                    "Dpulitzer",
                    "https://commons.wikimedia.org/w/index.php?title=User:Dpulitzer&action=edit&redlink=1",
                    true
            ),
        };


    // LEVEL 3 Questions
    public static QuizItem[] itemsLvl3 = new QuizItem[]{
            new QuizItem(
                    "Type of color divides minerals into 3 groups. Idiochromatic minerals are 'self-colored' by their composition?",
                    "TRUE, Idiochromatic minerals like Malachite, Cinnabar and Azurite, are colored by their composite elements.",
                    true,
                    R.mipmap.azurite_malachite,
                    "",
                    "James St. John (Pro)",
                    "https://www.flickr.com/photos/jsjgeology/",
                    false
            ),
            new QuizItem(
                    "Type of color divides minerals into 3 groups. Metamorphic minerals are 'other-colored' due to trace impurities or defects?",
                    "FALSE, Allochromatic minerals like Amazonite and Rose Quartz, are colored by trace impurities or defects.",
                    false,
                    R.mipmap.rose_quartz,
                    "",
                    "Adam Dachis",
                    "https://www.flickr.com/photos/dachis/",
                    false
            ),
            new QuizItem(
                    "Type of color divides minerals into 3 groups. Pseudochromatic minerals are 'false-colored' due to tricks with light?",
                    "TRUE, Pseudochromatic minerals like Opal, Sunstone and Labradorite, derive their gorgeous colors by refracting light.",
                    true,
                    R.mipmap.labradorite,
                    "",
                    "Awiejekeal",
                    "https://commons.wikimedia.org/wiki/File:Labradorite_with_rare_colours.JPG",
                    false
            ),
            new QuizItem(
                    "One of the more valuable lapidary materials, with beautiful bands ranging from white to pink, this stone is called Rhodinite?",
                    "FALSE, this stunning material is actually called Rhodocrosite, a manganese carbonate mineral.",
                    false,
                    R.mipmap.rhodocrosite,
                    "Beautiful specimine from La Rioja, Catamarca, Argentina",
                    "Chris857",
                    "https://commons.wikimedia.org/wiki/User:Chris857",
                    true
            ),
            new QuizItem(
                    "Some types of minerals, like azurite and malachite, can form as globular clusters. These are known as Botryoidal formations?",
                    "TRUE, producing amazing orbicular patterns when sliced, botryoidal variations of these minerals are often very vauable.",
                    true,
                    R.mipmap.botryoidal_azurite,
                    "Gorgeous, grape-like Azurite specimine",
                    "Assignment_Houston_One",
                    "https://www.flickr.com/groups/wikipedia_loves_art/pool/tags/Assignment_Houston_One/",
                    true
            ),
            new QuizItem(
                    "When lightening strikes sand, the high temperatures melt the sand forming these remarkable formations known as Feldspares?",
                    "FALSE, These amaxing, intricate structures created from the melted silicas in sand are called Fulurites.",
                    false,
                    R.mipmap.fulgurite,
                    "Mother Nature's artistery in sand",
                    "yoyoj3d1",
                    "https://www.flickr.com/photos/37135205@N07/",
                    true
            ),
            new QuizItem(
                    "Plain old table salt, which can create lovely crystals, is a mineral composed of 2 elements, Sodium and Calcium?",
                    "FALSE, Salt is the mineral Sodium Chloride, composed of Sodium and Chlorine. Salt was once worth it's weight in gold! .",
                    false,
                    R.mipmap.salt,
                    "A macro shot of salt crystals, Natural History Museum of Vienna",
                    "w?odi",
                    "https://www.flickr.com/people/19716902@N00",
                    true
            ),
            new QuizItem(
                    "Coming in many colors, Agates are a common form of Chalcedony, which is the mineral Quartz when it occurs in microcrystalline form?",
                    "TRUE, Chalcedony is microcrystalline Quartz, which occurs in many forms including; Agate, Petrified Wood and Tiger's Eye.",
                    true,
                    R.mipmap.lace_agate,
                    "Large slab specimen of lace agate",
                    "cobalt123",
                    "https://www.flickr.com/photos/cobalt/",
                    true
            ),
            new QuizItem(
                    "One of the most valuable forms of Chalcedony, this gemmy bright green mineral is called Chrysocolla?",
                    "FALSE, Actually called Chrysoprase, this stone gets it's green color from Nickel impurities and produces stunning faceted stones.",
                    false,
                    R.mipmap.chysoprase,
                    "Gorgeous green material",
                    "Lech Darski",
                    "https://commons.wikimedia.org/wiki/User:Elade53",
                    true
            ),
            new QuizItem(
                    "This formation shows the rare phenomenon that can occur when one quartz crystal grows over another, is known as Double Termination?",
                    "FALSE, This stone shows an example of Phantom or Ghost Crystals. while a Double Terminated crystal would have two sharp ends.",
                    false,
                    R.mipmap.ghost_quartz,
                    "Rare Quartz crystal formation, Minas Gerais, Brasil",
                    "Didier Descouens",
                    "https://commons.wikimedia.org/wiki/User:Archaeodontosaurus",
                    true
            ),
            new QuizItem(
                    "THe flashes of color shown in this Oregon Sunstone are produced by foreign material in the crystal structure, the effect is called 'aventurescence' commonly known as Shiller?",
                    "TRUE, The Schiller effect in this sunstone (a type of Feldspar) is due to minute particals of copper suspended in the matrix, the gem being cut at an angle so as to enhance the flash.",
                    true,
                    R.mipmap.sunstone,
                    "Carved Oregon Sunstone gem",
                    "Jessa and Mark Anderson",
                    "https://www.flickr.com/photos/jessa1155/",
                    false
            ),
        };

    public static QuizItem[] QuizList(int quantity, int level) {
        /* build a list of random quiz items
        * length of list defined by quantity
        * level determines difficulty distribution
        * level 1 - (4) lvl1, (2) lvl2, (0) lvl3
        * level 2 - (2) lvl1, (2) lvl2, (2) lvl3
        * level 3 - (0) lvl1, (2) lvl2, (4) lvl3
        */


        QuizItem[] list = new QuizItem[quantity]; // array of quiz items to return

        // select appropriate level distribution String
        // which determines difficult of questions chosen
        String lvlDist;
        switch(level){
                case 3:
                        lvlDist="223333";
                        break;
                case 2:
                        lvlDist="112233";
                        break;
                default:
                        lvlDist="111122";
                        break;
        }

        Random r = new Random();

        // build list of quizItems with length of (quantity)
        for(int x = 0; x < quantity; x++){
            Boolean gotOne = false;
            int choice;
            while(!gotOne) {
                //choose a random level from lvlDist
                choice = r.nextInt(lvlDist.length());
                String questLvl = lvlDist.substring(choice, choice+1);

                //String questLvl = "1";

                switch (questLvl) {
                    case "1":
                        choice = r.nextInt(itemsLvl1.length);
                        if (!itemsLvl1[choice].used) {
                            list[x] = itemsLvl1[choice];
                            itemsLvl1[choice].used = true;
                            gotOne = true;
                        }
                        break;
                    case "2":
                        choice = r.nextInt(itemsLvl2.length);
                        if (!itemsLvl2[choice].used) {
                            list[x] = itemsLvl2[choice];
                            itemsLvl2[choice].used = true;
                            gotOne = true;
                        }
                        break;
                    case "3":
                        choice = r.nextInt(itemsLvl3.length);
                        if (!itemsLvl3[choice].used) {
                            list[x] = itemsLvl3[choice];
                            itemsLvl3[choice].used = true;
                            gotOne = true;
                        }
                        break;
                }
            }      }
        return list;
    };
}
