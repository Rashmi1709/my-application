package nz.op.ac.nz.nationalflowertraders.FlowerModel;

import java.util.ArrayList;

public class FlowerListModel {

    //array to store data that will be display on RecycleView
    public static String[][] flowerdata = new String[][] {

            {"Lily",
                    "$11",
                    "https://wallpapertag.com/wallpaper/middle/0/9/1/701965-amazing-beautiful-flowers-wallpaper-2560x1600-4k.jpg#.XrqArTSOobQ.link",
                    "Farmland",
                    "New Zealand"},
            {"Pink Carnation",
                    "$15",
                    "https://fancycrave.com/wp-content/uploads/2019/02/Stunning-Pink-Carnation-Flowers-inside-a-Home.jpg",  "Beautiful carnation flowers placed in a vase.",
                    "Beautiful carnation flowers placed in a vase.",
                    "India"},
            {"Plant",
                    "$19.99",
                    "https://wallpapertag.com/wallpaper/middle/b/d/d/701970-amazing-beautiful-flowers-wallpaper-1920x1080-samsung-galaxy.jpg#.XrqArSl-SlU.link",
                    "Growers",
                    "India"},
            {"Gebra",
                    "4.99",
                "https://fancycrave.com/wp-content/uploads/2015/12/tumblr_nxlvbuWbOu1ted1sho1_1280.jpg",
                "The fifth most popular flower in the world, Gerbera daisies can mean innocence, purity, and cheerfulness.",

            },
            {"Magnificent",
                    "$19.99",
                    "https://fancycrave.com/wp-content/uploads/2019/03/Close-up-Shot-of-Magnificent-White-Flowers.jpg",
                    "Beautiful white flowers in the form of a ball photographed in the sunlight.",
                    "India"},
            {"Pink Geranium",
                    "$9.99",
                    "https://fancycrave.com/wp-content/uploads/2019/04/Close-up-Shot-of-Pink-Geranium-Flowers.jpg",
                    "Stunning pink flowers photographed in the sunlight.",
                    "New Zealand"
            },
            {"Cherry",
                    "$20.99",
                    "https://fancycrave.com/wp-content/uploads/2017/05/Spring-Time.jpg",
                    "Cherry blossom flowers in the morning.",
                    "New Zealand"
            },


    };

    //created flowerlist model
    public static ArrayList<FlowerGetSet> getListData(){
        FlowerGetSet flowerGetSet;
        ArrayList<FlowerGetSet> list = new ArrayList<>();
        for(String[] mData: flowerdata){
           flowerGetSet = new FlowerGetSet();
           flowerGetSet.setFlowername(mData[0]);
           flowerGetSet.setFlowerphoto(mData[2]);
           flowerGetSet.setFlowerdescription(mData[1]);
           flowerGetSet.setFlowerlocation(mData[3]);
           list.add(flowerGetSet);
        }
        return list;
    }


}
