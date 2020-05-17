package nz.op.ac.nz.nationalflowertraders.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

import nz.op.ac.nz.nationalflowertraders.Adapter.ItemFlowerListAdapter;
import nz.op.ac.nz.nationalflowertraders.FlowerModel.FlowerGetSet;
import nz.op.ac.nz.nationalflowertraders.R;
import nz.op.ac.nz.nationalflowertraders.ShowIndianRoses;
import nz.op.ac.nz.nationalflowertraders.ShowList;
import nz.op.ac.nz.nationalflowertraders.ShowPlant;

public class ListItem extends AppCompatActivity {

    private CardView cardView, c3;
    private CardView cv;
    private ImageView img;
    private RecyclerView recyclerView;
    private ArrayList<FlowerGetSet> list;

    final String FLOWER_TITLE="Flower_titile";
    final String FLOWER_LIST = "flower_list";
    final String FLOWER_MODE = "flower_mode";
    int mode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_item);


        cardView = findViewById(R.id.card1);
        cv = findViewById(R.id.card2);
        c3 = findViewById(R.id.card3);
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCard3Activity();
            }


        });
        cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCardActivity();
            }
        });
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });
    }
    private void openCard3Activity() {
        Intent intent = new Intent(this, ShowPlant.class);
        startActivity(intent);
    }
    private void openCardActivity(){
        Intent intent = new Intent(this, ShowList.class);
        startActivity(intent);
    }
    private void openActivity() {
        Intent intent = new Intent(this, ShowIndianRoses.class);
        startActivity(intent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        setMode(item.getItemId());

        return super.onOptionsItemSelected(item);
    }

    private void setMode(int itemId) {
        String title = null;
        switch (itemId){

            case R.id.action_list:
                title="List Mode";
                showRecycleViewList();
                break;

            case R.id.action_grid:
                title="Grid Mode";
                showRecycleViewGrid();
                break;

            case R.id.action_cardview:
                title="CardView Mode";
                showRecycleCardView();
                break;
        }
        mode=itemId;
        setActionBarTitle(title);

    }

    private void showRecycleCardView() {

    }

    private void showRecycleViewGrid() {

    }

    private void showRecycleViewList() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ItemFlowerListAdapter itemFlowerListAdapter = new ItemFlowerListAdapter(this);
        itemFlowerListAdapter.setListFlowerGetSet(list);
        recyclerView.setAdapter(itemFlowerListAdapter);

    }

    private void setActionBarTitle(String title) {

    }


}
