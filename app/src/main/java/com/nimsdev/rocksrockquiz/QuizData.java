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
                    "FALSE, the chart shows the Mohs Hardness Scale, and identifies the materials typically used to test for the various hardness levels.",
                    false,
                    R.mipmap.mohs_scale,
                    "Mineral Hardness Scale",
                    "nature.nps.gov",
                    "https://commons.wikimedia.org/wiki/File:Rockcycle.jpg",
                    false
            ),
            new QuizItem(
                    "Your marble countertop is an example of a Metamorphic rock, which is rock that has been squeezed and 'morphed' under tremendous heat and pressure?",
                    "TRUE, Metaporphic rocks are formed by heat and pressure in the depths of the earth, you can see in the pattern of this marble how it was compressed and twisted like putty.",
                    true,
                    R.mipmap.marble,
                    "Marble photographed in the Musée des arts décoratifs de Strasbourg",
                    "Amada44",
                    "https://commons.wikimedia.org/wiki/File:Marble_pattern_008.jpg",
                    false
            ),
            new QuizItem(
                    "The largest single gold nugget ever found was located at Moliagul, Victoria, Australia. Named the 'Welcome Stranger' it weighed over 15 pounds?",
                    "FALSE, The Welcome Stranger nugget weighed a whopping 156 pounds, and would be worth over $3,000,000 today just for the weight of the gold.",
                    false,
                    R.mipmap.gold_nugget,
                    "Gold nugget from Australia, this one is only 4 pounds",
                    "Amada44",
                    "https://commons.wikimedia.org/wiki/File:Marble_pattern_008.jpg",
                    false
            ),
            new QuizItem(
                    "This large slice, clearly showing the characteristic, colorful banding in the silicate deposits, is a classic specimen of Bolivian Agate?",
                    "FALSE, Actually this is called Brazilian Agate. This abundant variety of Agate has some of the most beautiful color patterns to be found.",
                    false,
                    R.mipmap.brazilian_agate,
                    "Large agate slice showing distinctive banding.",
                    "",
                    "",
                    true
            ),
            new QuizItem(
                    "This ancient Egyptian pestle was made from a common Igneous rock chosen for it's durablility. Composed of feldspar, quartz and mica it is called Granite?",
                    "TRUE, Granite produces excellent tools due to it's sturdy composition and naturally rough surface. From axes to myriad kitchen implements, Granite has server us well.",
                    true,
                    R.mipmap.granite,
                    "Granite Pestle, Egypt, 5500 - 333 BCE.",
                    "Los Angeles County Museum of Art",
                    "https://en.wikipedia.org/wiki/en:Los_Angeles_County_Museum_of_Art",
                    true
            ),
            new QuizItem(
                    "This spectacularly colored slice, with rich reds, browns and a translucent center, is actually fossilized Dinosaur dung known as Pooprolite?",
                    "FALSE, It is definately Dino dung, but the real name is Coprolite. Most coprolites aren't so colorful, but many are still shaped much like when originally 'deposited'.",
                    false,
                    R.mipmap.coprolite,
                    "Sliced and polished Dinosaur dung specimen, Utah, US.",
                    "Dig-n-Utah",
                    "https://www.pinterest.com/pin/413486809514334586/",
                    true
            ),
            new QuizItem(
                    "Appearing in almost every color and a myriad of distinctive patterns, this opaque lapidary superstar is known as Jasper?",
                    "TRUE, Jasper, like Agate, is composed primarily of Chalcedony with various impurities imparting the colors. Jasper patterns are often very location specific.",
                    true,
                    R.mipmap.jasper,
                    "Blue Mountain rough, Oregon, US",
                    "West Coast Gems",
                    "http://stores.ebay.com/West-Coast-Gemstones-Inc",
                    true
            ),
            new QuizItem(
                    "Sometimes voids in rock, when exposed to mineral bearing liquids over time, will fill with crystal formations. These spectacular rock treasure boxes are known as Geodes?",
                    "TRUE, Geodes come in many shapes and have crystal gardens with a wide range colors. A common type of Geode is called the 'Mexican Coconut', these are mined in Chihuahua, MX",
                    true,
                    R.mipmap.geodes,
                    "Natural crystal rock gardens",
                    "Dr. Cool",
                    "https://discoverwithdrcool.wordpress.com/2011/06/08/did-you-know-that-geodes-were-formed-by-ancient-volcanoes/",
                    true
            ),
            new QuizItem(
                    "The flames of color in this Opal rough are amazing. Is it true that Opal is considered a durable gemstone which can be worn constantly without concern?",
                    "FALSE, Opal is a hydrated form os silica, containing up to 20% water, if they dry out the colors may fade. Also, with a Mohs hardness of only 6, Opals are  prone to scratching",
                    false,
                    R.mipmap.opal_rough,
                    "Increadible Opal rough specimen, Shewa Province, Ethiopia",
                    "James St. John",
                    "https://www.flickr.com/photos/jsjgeology/",
                    true
            ),
            new QuizItem(
                    "While forming interesting crystal formations, the mineral Gypsum's greatest value is not in it's beauty. Would you believe most of the homes we live in contain hundreds of pounds of Gypsum?",
                    "TRUE, Gypsum is the primary component in sheetrock, used for the surface of most interior walls. Because it is strong yet doesn't burn like wood, Gypsum helps us build better homes.",
                    true,
                    R.mipmap.gypsum,
                    "Gypsum radial actinomorphic cystal cluster",
                    "Ra'ike",
                    "https://commons.wikimedia.org/wiki/User:Ra%27ike",
                    true
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
                    "These spectacular giant crystals found in a hot, humid cave in Mexico are made of the mineral Calcite?",
                    "FALSE, Selenite, a form of the mineral Gypsum, formed these gigantic crystals, the largest of which is 39' long.",
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
                    "Dioptase mineral specimen, Museum Quality",
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
                    "Coober Pedy crystal opal from Dead Horse Gully Field",
                    "Dpulitzer",
                    "https://commons.wikimedia.org/w/index.php?title=User:Dpulitzer&action=edit&redlink=1",
                    true
            ),
            new QuizItem(
                    "With the chambers of it's shell having been filled with gorgeous mineral deposits, this fossil was from an Ammonite, a sea creature which lived from 250-65 million years ago?",
                    "TRUE, Ammonites, because of their abundance are found in many fossil records. By identifiying their particular species, Ammonites can help to establish chronology of the material deposition.",
                    true,
                    R.mipmap.ammonite,
                    "Polished Desmoceras fossil from the Cretaceous period, Madagascar",
                    "FOSSILERA",
                    "https://www.fossilera.com/fossils/2-95-desmoceras-ammonite-fossil-half--3",
                    true
            ),
            new QuizItem(
                    "Magnificent gemstones cut from the bright blue mineral Turquoise. Like many blue minerals, it is the Copper in Turquoise that produces that strong color?",
                    "TRUE, The blue is from Copper as Turquoise is a hydrated phosphate of Copper and Aluminium. These stones are specifically Lone Mountain Turquoise, many showing the 'spider web' effect.",
                    true,
                    R.mipmap.turquoise,
                    "Turquoise cabochons mined in Esmeralda County, Nevada, US",
                    "Obregonia D. Toretto from Pexels",
                    "https://www.pexels.com/photo/rare-stone-turquoise-939651/",
                    false
            ),
            new QuizItem(
                    "Sometimes Agates are formed with inclusions produced by other minerals like iron or chrome. Due to the intricate organic branching shapes, this material is known as Tree Agate?",
                    "FALSE, Moss Agate is the name given to this amazing example of nature's creative handy work. When the incluseions are created with other colors, it may also be known as Plume Agate.",
                    false,
                    R.mipmap.moss_agate,
                    "Agate slab with inclusions, India",
                    "Stoneage Industries",
                    "https://www.pinterest.com/pin/323837029438102420/",
                    false
            ),
            new QuizItem(
                    "Named for the only state where they are found, and featuring the signature rootbeer browns with black inclusions, these stones are quintessential Montana Moss Agate?",
                    "TRUE, These are typical Montana Agates, the rich brown colors are a result of iron impurities. They are only found along the Yellowstone River and it's tributaries in eastern Montana.",
                    true,
                    R.mipmap.montana_agate,
                    "Colorful Agate ear plugs",
                    "heartonsleevejewelry",
                    "https://heartonsleevejewelry.com/products/montana-moss-agate-df-stone-plugs",
                    true
            ),
            new QuizItem(
                    "Few gemstones come in as many colors as Zircon. Due to it's hardness and flash clear Zircons were once used to 'simulate' Diamonds, but are these beaties created by nature?",
                    "TRUE, Though often confused with the synthetic material Cubic Zirconium, Zircons are indeed all natural, their name deriving from the Persian word 'zargun' or gold-hued.",
                    true,
                    R.mipmap.zicons,
                    "Spectacular Zircon gemstones, Sri Lanka and Cambodia",
                    " Joel E. Arem",
                    "http://www.joelarem.com/color-encyclopedia-of-gemstones.html",
                    true
            ),
            new QuizItem(
                    "One of the cardinal gemstones, Sapphire defines it's own color of blue. Is it true that metaphysically Sapphire is associated with romantic love and attraction?",
                    "FALSE, Most cultures associate Sapphires with wisdom and spiritual enlightenment. The Greeks would wear Sapphires when they sought wisdom at the famed Oracle at Delphi.",
                    false,
                    R.mipmap.logan_sapphire,
                    "Logan Sapphire, largest ever at 432 carats, Sri Lanka.",
                    " Blue-Ridge-Riley",
                    "https://blue-ridge-riley.deviantart.com/",
                    true
            ),

        };


    // LEVEL 3 Questions
    public static QuizItem[] itemsLvl3 = new QuizItem[]{
            new QuizItem(
                    "Minerals are divided into 3 groups based on how their color is producded. Idiochromatic minerals are 'self-colored' by their composition?",
                    "TRUE, Idiochromatic minerals like Malachite, Cinnabar and Azurite, are colored by their composite elements.",
                    true,
                    R.mipmap.azurite_malachite,
                    "",
                    "James St. John (Pro)",
                    "https://www.flickr.com/photos/jsjgeology/",
                    false
            ),
            new QuizItem(
                    "Minerals are divided into 3 groups based on how their color is producded. Metamorphic minerals are 'other-colored' due to trace impurities or defects?",
                    "FALSE, Allochromatic is the proper term for these minerals like Amazonite and Rose Quartz, whose colors are not due to their own composition.",
                    false,
                    R.mipmap.rose_quartz,
                    "",
                    "Adam Dachis",
                    "https://www.flickr.com/photos/dachis/",
                    false
            ),
            new QuizItem(
                    "Minerals are divided into 3 groups based on how their color is producded. Pseudochromatic minerals are 'false-colored' due to tricks with light?",
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
                    "Beautiful specimen from La Rioja, Catamarca, Argentina",
                    "Chris857",
                    "https://commons.wikimedia.org/wiki/User:Chris857",
                    true
            ),
            new QuizItem(
                    "Some types of minerals, like azurite and malachite, can form as globular clusters. These are known as Botryoidal formations?",
                    "TRUE, producing amazing orbicular patterns when sliced, botryoidal variations of these minerals are often very vauable.",
                    true,
                    R.mipmap.botryoidal_azurite,
                    "Gorgeous, grape-like Azurite specimen",
                    "Assignment_Houston_One",
                    "https://www.flickr.com/groups/wikipedia_loves_art/pool/tags/Assignment_Houston_One/",
                    true
            ),
            new QuizItem(
                    "When lightening strikes sand, the high temperatures melt the sand forming these remarkable formations known as Lazurites?",
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
                    "This formation shows the rare phenomenon that can occur when one quartz crystal grows over another, this is known as Double Termination?",
                    "FALSE, This stone shows an example of Phantom or Ghost Crystals. while a Double Terminated crystal would have two sharp ends.",
                    false,
                    R.mipmap.ghost_quartz,
                    "Rare Quartz crystal formation, Minas Gerais, Brasil",
                    "Didier Descouens",
                    "https://commons.wikimedia.org/wiki/User:Archaeodontosaurus",
                    true
            ),
            new QuizItem(
                    "The flashes of color shown in this Oregon Sunstone are produced by foreign material in the crystal structure, the effect is called 'aventurescence' commonly known as Shiller?",
                    "TRUE, The Schiller effect in this sunstone (a type of Feldspar) is due to minute particals of copper suspended in the matrix, the gem being cut at an angle so as to enhance the flash.",
                    true,
                    R.mipmap.sunstone,
                    "Carved Oregon Sunstone gem",
                    "Jessa and Mark Anderson",
                    "https://www.flickr.com/photos/jessa1155/",
                    false
            ),
            new QuizItem(
                    "This fantastic specimen is a signature example of Blue Biggs Picture Jasper, famous for depicting rolling hills with blue-gray skys?",
                    "TRUE, Named for the nearby town of Biggs, this incredibly picturesque jasper was uncovered while building highway I-84 in Oregon and shortly thereafter had been completely dug out.",
                    true,
                    R.mipmap.biggs_jasper,
                    "Amazing picture jasper specimen, Oregon, US",
                    "Scotts Rock and Gem",
                    "https://scottsrocks.com/scotts-blog/25-reedsport-gem-show?tmpl=component&print=1",
                    false
            ),
            new QuizItem(
                    "Here is a pretty polished stone cut from Kalama River Jasper. Similar to Biggs Jasper, and found in the same area, this material has more patterns and darker browns?",
                    "FALSE, This classic picture rock is actually called Deschutes Jasper, which was discovered in the same area that Biggs was uncovered, and some say thay are different ends of the same deposit.",
                    false,
                    R.mipmap.dechuttes_jasper,
                    "Picture jasper cabochon, Oregon, US",
                    "Explore Columbia River",
                    "https://www.pinterest.com/pin/121104677460824724/",
                    false
            ),
            new QuizItem(
                    "Due to their high clarity and tendency to form double terminations that resemble facets, these crystals are known as Hercules Diamonds even though they are made of quartz?",
                    "FALSE, These quartz beauties are actually called Herkimer Diamonds, named after the town of Herkimer, NY where they are found.",
                    false,
                    R.mipmap.herkimer,
                    "Naturally double terminated crystal, New York, US",
                    "Didier Descouens",
                    "https://commons.wikimedia.org/wiki/User:Archaeodontosaurus",
                    false
            ),
            new QuizItem(
                    "Rubies, one of the most valuable gemstones, are known for their red color. The bright red colors in Rubies come from the mineral Iron being present in the gem?",
                    "FALSE, Rubies are made of corundum (aluminium oxide), and contain no Iron. The brilliant red colors are due to the arrangement of chromium and aluminum ions in the gems atomic structure",
                    false,
                    R.mipmap.ruby,
                    "Ruby crystals on white marble Burma",
                    "thisisbossi",
                    "https://www.flickr.com/people/25622716@N02",
                    true
            ),
            new QuizItem(
                    "This is the mineral Bismuth showing a kaleidoscope of colors. Bismuth exhibits the strongest diamagnetism of any metal, meaning it will be repelled by a magnet?",
                    "TRUE, Diamagnetism is like reverse magnetism, and Bizmuth will be pushed away from a magnet. Naturally a silvery white, the brilliant cascade of colors is due to surface oxidization.",
                    true,
                    R.mipmap.bismuth,
                    "Man made Bizmuth crystal specimen.",
                    "Traveller_40",
                    "https://www.flickr.com/photos/traveller_40/",
                    false
            ),
            new QuizItem(
                    "Luxurious Tiger's Eye gemstones are a metamorphic rock exhibiting brilliant bands of color. The shimmering steaks of light in this material are due to an effect known as Chatoyance?",
                    "TRUE, Chatoyancy, is an optical reflectance effect seen in some gems. In the case of Tiger's Eye it is due to the fiberous nature of it's crystaline structure.",
                    true,
                    R.mipmap.tigers_eye,
                    "Tiger's Eye polished stone and rough material.",
                    "Marek Novotnak",
                    "https://commons.wikimedia.org/w/index.php?title=User:Marek_Novotnak&action=edit&redlink=1",
                    false
            ),
            new QuizItem(
                    "A prism like play of light provides the colors in this specimen. Called Rainbow Agate, the stone itself is clear but the banding patterns work like a refraction grating?",
                    "FALSE, This rare beauty is actually called Iris Agate, maybe because the iridescent effects produce a splay of colors like a bouquet of flowers.",
                    false,
                    R.mipmap.iris_agate,
                    "Polished Agate slice from Rio Grande do Sul, Brazil",
                    "Johnbetts Fine Minerals",
                    "http://www.johnbetts-fineminerals.com/jhbnyc/mineralmuseum/picshow.php?id=29233",
                    false
            ),
            new QuizItem(
                    "A metamorphic mash-up this stunner is called Anyolite. The black material is Pargasite, the green is Zoisite but could that red crystal be a Ruby?",
                    "TRUE, That is a Ruby, and all together Anyolite polishes up to make eye-catching cabochons. The name is said to come from 'amyoli' the Massai word for green.",
                    true,
                    R.mipmap.zoisite_ruby,
                    "High grade Anyolite rough, India",
                    "Prehistoric Oregon",
                    "https://prehistoricoregon.com/ruby-in-zoisite",
                    true
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
