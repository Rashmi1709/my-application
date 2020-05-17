package nz.op.ac.nz.nationalflowertraders;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import nz.op.ac.nz.nationalflowertraders.Adapter.IndianRoseAdapter;
import nz.op.ac.nz.nationalflowertraders.FlowerModel.RoseData;
import nz.op.ac.nz.nationalflowertraders.FlowerModel.RoseGetSet;
import nz.op.ac.nz.nationalflowertraders.R;

public class ShowIndianRoses extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<RoseGetSet> roseList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_indian_roses);

        recyclerView = findViewById(R.id.ReviewR3);
        recyclerView.setHasFixedSize(true);

        roseList = new ArrayList<>();
        roseList.addAll(RoseData.getRoselistdata());
        showRecycleRoseData();

    }

    private void showRecycleRoseData() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        IndianRoseAdapter indianRoseAdapter = new IndianRoseAdapter(this);
        indianRoseAdapter.setRoseList(roseList);;
        recyclerView.setAdapter(indianRoseAdapter);
    }
}
