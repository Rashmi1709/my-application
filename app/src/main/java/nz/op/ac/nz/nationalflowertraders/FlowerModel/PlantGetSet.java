package nz.op.ac.nz.nationalflowertraders.FlowerModel;

import android.os.Parcel;
import android.os.Parcelable;

public class PlantGetSet implements Parcelable {

    //create implementation
    private String plantname, plantphoto, plantdescription, plantlocation;

    public String getPlantname() {
        return plantname;
    }

    public void setPlantname(String plantname) {
        this.plantname = plantname;
    }

    public String getPlantphoto() {
        return plantphoto;
    }

    public void setPlantphoto(String plantphoto) {
        this.plantphoto = plantphoto;
    }

    public String getPlantdescription() {
        return plantdescription;
    }

    public void setPlantdescription(String plantdescription) {
        this.plantdescription = plantdescription;
    }

    public String getPlantlocation() {
        return plantlocation;
    }

    public void setPlantlocation(String plantlocation) {
        this.plantlocation = plantlocation;
    }

    public PlantGetSet() {
    }

    protected PlantGetSet(Parcel in) {
        plantname = in.readString();
        plantphoto = in.readString();
        plantdescription = in.readString();
        plantlocation = in.readString();
    }

    public static final Creator<PlantGetSet> CREATOR = new Creator<PlantGetSet>() {
        @Override
        public PlantGetSet createFromParcel(Parcel in) {
            return new PlantGetSet(in);
        }

        @Override
        public PlantGetSet[] newArray(int size) {
            return new PlantGetSet[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(plantname);
        dest.writeString(plantphoto);
        dest.writeString(plantdescription);
        dest.writeString(plantlocation);
    }
}
