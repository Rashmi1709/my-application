package nz.op.ac.nz.nationalflowertraders;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import nz.op.ac.nz.nationalflowertraders.Adapter.ItemFlowerListAdapter;
import nz.op.ac.nz.nationalflowertraders.FlowerModel.FlowerGetSet;
import nz.op.ac.nz.nationalflowertraders.FlowerModel.FlowerListModel;

public class ShowList extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<FlowerGetSet> list;
    int mode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_list);

        recyclerView = findViewById(R.id.rv1);
        recyclerView.setHasFixedSize(true);

        list = new ArrayList<>();
       list.addAll(FlowerListModel.getListData());
       showRecycleViewList();
    }

    private void showRecycleViewList() {

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ItemFlowerListAdapter itemFlowerListAdapter = new ItemFlowerListAdapter(this);
        itemFlowerListAdapter.setListFlowerGetSet(list);
        recyclerView.setAdapter(itemFlowerListAdapter);
    }
}
