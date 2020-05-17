package nz.op.ac.nz.nationalflowertraders.FlowerModel;

import android.os.Parcel;
import android.os.Parcelable;

public class RoseGetSet implements Parcelable {
    private String rosename, roseimage, rosedescription, roselocation;

    public String getRosename() {
        return rosename;
    }

    public void setRosename(String rosename) {
        this.rosename = rosename;
    }

    public String getRoseimage() {
        return roseimage;
    }

    public void setRoseimage(String roseimage) {
        this.roseimage = roseimage;
    }

    public String getRosedescription() {
        return rosedescription;
    }

    public void setRosedescription(String rosedescription) {
        this.rosedescription = rosedescription;
    }

    public String getRoselocation() {
        return roselocation;
    }

    public void setRoselocation(String roselocation) {
        this.roselocation = roselocation;
    }

    public RoseGetSet() {
    }

    protected RoseGetSet(Parcel in) {
        rosename = in.readString();
        roseimage = in.readString();
        rosedescription = in.readString();
        roselocation = in.readString();
    }

    public static final Creator<RoseGetSet> CREATOR = new Creator<RoseGetSet>() {
        @Override
        public RoseGetSet createFromParcel(Parcel in) {
            return new RoseGetSet(in);
        }

        @Override
        public RoseGetSet[] newArray(int size) {
            return new RoseGetSet[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(rosename);
        dest.writeString(roseimage);
        dest.writeString(rosedescription);
        dest.writeString(roselocation);
    }
}
