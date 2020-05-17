package nz.op.ac.nz.nationalflowertraders;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import nz.op.ac.nz.nationalflowertraders.Adapter.PlantItemAdapter;
import nz.op.ac.nz.nationalflowertraders.FlowerModel.PlantData;
import nz.op.ac.nz.nationalflowertraders.FlowerModel.PlantGetSet;

public class ShowPlant extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<PlantGetSet> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_plant);

        recyclerView = findViewById(R.id.plantR2);
        recyclerView.setHasFixedSize(true);
        list = new ArrayList<>();
        list.addAll(PlantData.getPlantListData());
        showRecyclePlantlist();
    }

    private void showRecyclePlantlist() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        PlantItemAdapter plantItemAdapter = new PlantItemAdapter(this);
        plantItemAdapter.setPlantListGetSet(list);
        recyclerView.setAdapter(plantItemAdapter);
    }
}
