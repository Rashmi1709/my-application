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
import nz.op.ac.nz.nationalflowertraders.Activity.IndianRoseDetail;
import nz.op.ac.nz.nationalflowertraders.FlowerModel.RoseGetSet;
import nz.op.ac.nz.nationalflowertraders.R;

public class IndianRoseAdapter extends RecyclerView.Adapter<IndianRoseAdapter.RoseViewHolder> {
    private Context context;
    private ArrayList<RoseGetSet> RoseList;

    public IndianRoseAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<RoseGetSet> getRoseList() {
        return RoseList;
    }

    public void setRoseList(ArrayList<RoseGetSet> roseList) {
        RoseList = roseList;
    }

    @NonNull
    @Override
    public RoseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View roselistitem = LayoutInflater.from(parent.getContext()).inflate(R.layout.indean_roses,parent,false);

        return new RoseViewHolder(roselistitem);
    }

    @Override
    public void onBindViewHolder(@NonNull RoseViewHolder holder, final int position) {

        holder.txtrosenm.setText(getRoseList().get(position).getRosename());
        holder.txtrosedescription.setText(getRoseList().get(position).getRosedescription());
        Glide.with(context).load(getRoseList().get(position).getRoseimage()).into(holder.roseimg);
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent RosedetailActivity = new Intent(context, IndianRoseDetail.class);
                RosedetailActivity.putExtra(IndianRoseDetail.EXTRA_ROSE, getRoseList().get(position));
                context.startActivity(RosedetailActivity);
            }
        });
    }

    @Override
    public int getItemCount() {
        return getRoseList().size();
    }

    public class RoseViewHolder extends RecyclerView.ViewHolder {
       TextView txtrosenm, txtrosedescription;
       ImageView roseimg;
      RelativeLayout relativeLayout;

        public RoseViewHolder(@NonNull View itemView) {
            super(itemView);
            txtrosenm = itemView.findViewById(R.id.tcv1);
            txtrosedescription = itemView.findViewById(R.id.tcv2);
            roseimg = itemView.findViewById(R.id.cardimage);
         relativeLayout = itemView.findViewById(R.id.relative3);
        }
    }
}
