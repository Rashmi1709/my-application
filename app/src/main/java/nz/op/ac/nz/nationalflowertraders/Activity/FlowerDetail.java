package nz.op.ac.nz.nationalflowertraders.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import nz.op.ac.nz.nationalflowertraders.FlowerModel.FlowerGetSet;
import nz.op.ac.nz.nationalflowertraders.R;

public class FlowerDetail extends AppCompatActivity {

    public static final String EXTRA_FLOWER = "extra_flower";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flower_detail);

        ImageView imageView = findViewById(R.id.imageViewdetail);
        TextView name = findViewById(R.id.td1);
        TextView description = findViewById(R.id.td2);
        TextView location = findViewById(R.id.td3);

        FlowerGetSet f1 = getIntent().getParcelableExtra(EXTRA_FLOWER);

        Glide.with(this).load(f1.getFlowerphoto()).into(imageView);
        name.setText(f1.getFlowername());
        description.setText(f1.getFlowerdescription());
        location.setText(f1.getFlowerlocation());
    }
}
