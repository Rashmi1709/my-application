package nz.op.ac.nz.nationalflowertraders.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import nz.op.ac.nz.nationalflowertraders.Activity.PlantDetail;
import nz.op.ac.nz.nationalflowertraders.FlowerModel.PlantGetSet;
import nz.op.ac.nz.nationalflowertraders.R;

public class PlantItemAdapter extends RecyclerView.Adapter<PlantItemAdapter.PlantViewHolder>{

    private Context context;
    private ArrayList<PlantGetSet> PlantListGetSet;

    public PlantItemAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<PlantGetSet> getPlantListGetSet() {
        return PlantListGetSet;
    }

    public void setPlantListGetSet(ArrayList<PlantGetSet> plantListGetSet) {
        PlantListGetSet = plantListGetSet;
    }


    @NonNull
    @Override
    public PlantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View itemList = LayoutInflater.from(parent.getContext()).inflate(R.layout.show_plant_item,parent,false);

        return new PlantViewHolder(itemList);
    }

    @Override
    public void onBindViewHolder(@NonNull PlantItemAdapter.PlantViewHolder holder, final int position) {

        holder.txtplantnm.setText(getPlantListGetSet().get(position).getPlantname());
        holder.textplantlocation.setText(getPlantListGetSet().get(position).getPlantlocation());
        Glide.with(context).load(getPlantListGetSet().get(position).getPlantphoto()).into(holder.plantImage);
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent PlantdetailActivity = new Intent(context, PlantDetail.class);
                PlantdetailActivity.putExtra(PlantDetail.EXTRA_PLANT, getPlantListGetSet().get(position));
                context.startActivity(PlantdetailActivity);
            }
        });
    }

    @Override
    public int getItemCount() {
        return getPlantListGetSet().size();
    }

    public class PlantViewHolder extends RecyclerView.ViewHolder {
       TextView txtplantnm, textplantlocation;
       ImageView plantImage;

       RelativeLayout relativeLayout;
        public PlantViewHolder(@NonNull View itemView) {
            super(itemView);
            txtplantnm = itemView.findViewById(R.id.t11);

            textplantlocation= itemView.findViewById(R.id.t12);
            plantImage = itemView.findViewById(R.id.i2);
            relativeLayout = itemView.findViewById(R.id.relative2);

        }
    }
}