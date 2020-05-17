package nz.op.ac.nz.nationalflowertraders.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import nz.op.ac.nz.nationalflowertraders.Activity.FlowerDetail;
import nz.op.ac.nz.nationalflowertraders.FlowerModel.FlowerGetSet;
import nz.op.ac.nz.nationalflowertraders.R;

public class ItemFlowerListAdapter extends RecyclerView.Adapter<ItemFlowerListAdapter.FlowerListViewHolder> {
    private Context context;
    private ArrayList<FlowerGetSet> listFlowerGetSet;


    public ItemFlowerListAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<FlowerGetSet> getListFlowerGetSet() {
        return listFlowerGetSet;
    }

    public void setListFlowerGetSet(ArrayList<FlowerGetSet> listFlowerGetSet) {
        this.listFlowerGetSet = listFlowerGetSet;
    }

    @NonNull
    @Override
    public FlowerListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemList = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main_flower_show,parent,false);

        return new FlowerListViewHolder(itemList);
    }

    @Override
    public void onBindViewHolder(@NonNull FlowerListViewHolder holder, final int position) {

        holder.tvName.setText(getListFlowerGetSet().get(position).getFlowername());
        holder.tvLocation.setText(getListFlowerGetSet().get(position).getFlowerlocation());

        Glide.with(context).load(getListFlowerGetSet().get(position).getFlowerphoto()).into(holder.img);

        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent FlowerdetailActivity = new Intent(context, FlowerDetail.class);
                FlowerdetailActivity.putExtra(FlowerDetail.EXTRA_FLOWER, listFlowerGetSet.get(position));
                context.startActivity(FlowerdetailActivity);
            }
        });

    }

    @Override
    public int getItemCount() {
        return getListFlowerGetSet().size();
    }

    public class FlowerListViewHolder extends RecyclerView.ViewHolder {

        TextView tvName,tvLocation;
        ImageView img;
        RelativeLayout relativeLayout;
        public FlowerListViewHolder(@NonNull View itemView) {

            super(itemView);

            tvName = itemView.findViewById(R.id.t1);
            img = itemView.findViewById(R.id.i1);
            tvLocation = itemView.findViewById(R.id.t2);
            relativeLayout = itemView.findViewById(R.id.relative1);
        }
    }
}
