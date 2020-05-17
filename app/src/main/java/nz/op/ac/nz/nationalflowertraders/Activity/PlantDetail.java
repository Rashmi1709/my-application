package nz.op.ac.nz.nationalflowertraders.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import nz.op.ac.nz.nationalflowertraders.FlowerModel.FlowerGetSet;
import nz.op.ac.nz.nationalflowertraders.FlowerModel.PlantGetSet;
import nz.op.ac.nz.nationalflowertraders.R;

public class PlantDetail extends AppCompatActivity {

    public static final String EXTRA_PLANT = "extra_plant";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant_detail);
        ImageView imageView = findViewById(R.id.imageViewdetail);
        TextView name = findViewById(R.id.td1);
        TextView description = findViewById(R.id.td2);
        TextView location = findViewById(R.id.td3);

        PlantGetSet f1 = getIntent().getParcelableExtra(EXTRA_PLANT);

        Glide.with(this).load(f1.getPlantphoto()).into(imageView);
        name.setText(f1.getPlantname());
        description.setText(f1.getPlantdescription());
        location.setText(f1.getPlantlocation());
    }
}
