package nz.op.ac.nz.nationalflowertraders.Activity;

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
import nz.op.ac.nz.nationalflowertraders.R;

public class MainFlowerShowActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_flower_show);
    }

}
