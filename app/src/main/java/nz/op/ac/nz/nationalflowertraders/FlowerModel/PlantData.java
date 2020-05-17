package nz.op.ac.nz.nationalflowertraders.FlowerModel;

import java.util.ArrayList;

public class PlantData {
    public static String[][] plantdata = new String[][] {

            {"Monstera",
                    "$11.99",
                "https://www.adairs.com.au/globalassets/catalogue/homewares/home-republic/37612_monstera60single/37612_monstera60single_zoom_1.jpg",
                    "The perfect pot companion for your Monstera plant. A chic white ceramic pot with a satin-matt finish. This high quality cover pot has no drainage hole.",
                    "New Zealand"
            },
            {"Areca Palm",
                    "$30",
                "https://www.adairs.com.au/globalassets/catalogue/homewares/home-republic/37612_arecapalm160/37612_arecapalm160_zoom_1.jpg",

                    "wd",
                    "New Zealand"
            },
            {"Rubber Fig",
                    "$25",
                "https://www.adairs.com.au/globalassets/catalogue/homewares/home-republic/37612_rubberfig130/37612_rubberfig130_zoom_1.jpg",

                    "ds",
                    "New Zealand"
            },
            {"Dracena",

                    "$20",
                "https://www.adairs.com.au/globalassets/catalogue/homewares/home-republic/37612_dracena/37612_dracena_zoom_1.jpg",
                  "dsd",
                  "New Zealand"
            },
            {"Pothos",
                    "$45",
                "https://www.adairs.com.au/globalassets/catalogue/homewares/home-republic/37612_pothosstanding120/37612_pothosstanding120_zoom_1.jpg",
                    "ss",
                    "New Zealand"
            },
            {"Bird Of Paradise",
                    "$50",
                "https://www.adairs.com.au/globalassets/catalogue/homewares/home-republic/37612_birdofparadise/37612_birdofparadise_zoom_1.jpg",
              "dsds",
              "New Zealand"
            },
            {"Red Philodendron",
                    "$50",
                "https://www.adairs.com.au/globalassets/catalogue/homewares/home-republic/37612_redphilodendron60/37612_redphilodendron60_zoom_1.jpg",
                    "dsd",
                    "New Zealand"
            },
            {"Fiddle Fig",
                    "$45",
                "https://www.adairs.com.au/globalassets/catalogue/homewares/home-republic/37612_fiddlefig75/37612_fiddlefig75_zoom_1.jpg",
                  "sds",
                  "New Zealand"
            },
            {"Pilea Green",
                    "$69",
                "https://www.inspirationswholesale.co.uk/img/product/artificial-pilea-green-23cm-potted-plant-29033153-1600.jpg",
                    "ass",
                    "New Zealand"
            },
            {"Potted Plant",
                    "$56",
                "https://azcd.domayne.com.au/media/catalog/product/cache/25/image/992x558/9df78eab33525d08d6e5fb8d27136e95/A/7/A75LG.jpg",
                    "The Agave Bush Potted Plant looks so real with a fleshy spined rosette and wide, flat leaves of textured green. A smooth ceramic pot makes this African Native easy to coordinate with any contemporary or classic style room.",
                    "New Zealand"
            }

    };
    public static ArrayList<PlantGetSet> getPlantListData(){
        PlantGetSet plantGetSet;
        ArrayList<PlantGetSet> list = new ArrayList<>();

        for(String[] pData:plantdata){
            plantGetSet = new PlantGetSet();
            plantGetSet.setPlantname(pData[0]);
            plantGetSet.setPlantphoto(pData[2]);
            plantGetSet.setPlantdescription(pData[1]);
            plantGetSet.setPlantlocation(pData[3]);
            list.add(plantGetSet);
        }
        return list;
    }
}
