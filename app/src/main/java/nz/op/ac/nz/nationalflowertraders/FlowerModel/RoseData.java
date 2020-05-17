package nz.op.ac.nz.nationalflowertraders.FlowerModel;

import java.util.ArrayList;

public class RoseData {

    public static String[][] rosedata = new String[][] {
            {
                "Red rose",
                    "$11",
                    "https://images.pexels.com/photos/56866/garden-rose-red-pink-56866.jpeg?cs=srgb&dl=red-garden-plant-green-56866.jpg&fm=jpg",
                    "dsd",
                    "India"
            },
            {
                "Pink Rose",
                    "$9.99",
                "https://images-na.ssl-images-amazon.com/images/I/41-SYJSrDgL.jpg",
                    "sd",
                    "India"
            },
            {
                "Yellow Roses",
                    "$21",
                    "https://images.unsplash.com/photo-1552034602-da2ee2dd724b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=752&q=80",
                    "df",
                    "India"
            },
            {
                "Pink Rose",
                    "$11",
                    "https://images.unsplash.com/photo-1531874824027-2a0d33bd6338?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=634&q=80",
                    "dd",
                    "India"
            },
            {
                "Light pink Rose",
                    "$21",
                    "https://images.unsplash.com/photo-1578972497170-bfc780c65f65?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=633&q=80",
                    "ddd",
                    "India"
            },
            {
                "White Rose",
                    "$15",
                    "https://images.unsplash.com/photo-1495231916356-a86217efff12?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=676&q=80",
                    "dds",
                    "India"
            },
            {
                "Blue rose",
                    "$9.99",
                    "https://images.unsplash.com/photo-1549982559-f563a1432d3b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=658&q=80",
                    "dff",
                    "New Zealand"
            },
            {"Light orange roses",
                    "$11",
                    "https://images.unsplash.com/photo-1579053778004-3a4d3f0fae19?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=747&q=80",
                    "Close-up shot of amazing roses with white and pink colors.",
                    "Indian Rose"},
            {"Orange roses",
                    "$15",
                    "https://images.unsplash.com/photo-1553650489-f4ea0f66d392?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80",
                    "Farmland",
                    "India"},
            {"Pink",
                    "$19.99",
                    "https://images.unsplash.com/photo-1586082206933-91a73ba77139?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80",
                    "Growers",
                    "India"},
    };
    public static ArrayList<RoseGetSet> getRoselistdata(){
        RoseGetSet roseGetSet;
        ArrayList<RoseGetSet> roselist = new ArrayList<>();

        for(String[] rData: rosedata){
            roseGetSet = new RoseGetSet();
            roseGetSet.setRosename(rData[0]);
            roseGetSet.setRoseimage(rData[2]);
            roseGetSet.setRosedescription(rData[1]);
            roseGetSet.setRoselocation(rData[3]);
            roselist.add(roseGetSet);
        }
        return roselist;
    }
}
