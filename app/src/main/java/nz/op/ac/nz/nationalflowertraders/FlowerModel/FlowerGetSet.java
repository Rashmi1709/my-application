package nz.op.ac.nz.nationalflowertraders.FlowerModel;

import android.os.Parcel;
import android.os.Parcelable;

public class FlowerGetSet implements Parcelable {

    // create implementation Parcelable to this class
    private String flowername, flowerphoto, flowerdescription, flowerlocation;

    public String getFlowername() {
        return flowername;
    }

    public void setFlowername(String flowername) {
        this.flowername = flowername;
    }

    public String getFlowerphoto() {
        return flowerphoto;
    }

    public void setFlowerphoto(String flowerphoto) {
        this.flowerphoto = flowerphoto;
    }

    public String getFlowerdescription() {
        return flowerdescription;
    }

    public void setFlowerdescription(String flowerdescription) {
        this.flowerdescription = flowerdescription;
    }

    public String getFlowerlocation() {
        return flowerlocation;
    }

    public void setFlowerlocation(String flowerlocation) {
        this.flowerlocation = flowerlocation;
    }

    public FlowerGetSet() {
    }

    public static Creator<FlowerGetSet> getCREATOR() {
        return CREATOR;
    }

    protected FlowerGetSet(Parcel in) {
        flowername = in.readString();
        flowerphoto = in.readString();
        flowerdescription = in.readString();
        flowerlocation = in.readString();
    }

    public static final Creator<FlowerGetSet> CREATOR = new Creator<FlowerGetSet>() {
        @Override
        public FlowerGetSet createFromParcel(Parcel in) {
            return new FlowerGetSet(in);
        }

        @Override
        public FlowerGetSet[] newArray(int size) {
            return new FlowerGetSet[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(flowername);
        dest.writeString(flowerphoto);
        dest.writeString(flowerdescription);
        dest.writeString(flowerlocation);
    }
}
