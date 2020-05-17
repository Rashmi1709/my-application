package nz.op.ac.nz.nationalflowertraders.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import nz.op.ac.nz.nationalflowertraders.FlowerModel.FlowerGetSet;
import nz.op.ac.nz.nationalflowertraders.FlowerModel.RoseGetSet;
import nz.op.ac.nz.nationalflowertraders.R;

public class IndianRoseDetail extends AppCompatActivity {

    public static final String EXTRA_ROSE = "extra_rose";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indian_rose_detail);

        ImageView imageView = findViewById(R.id.imageViewdetail);
        TextView name = findViewById(R.id.td1);
        TextView description = findViewById(R.id.td2);
        TextView location = findViewById(R.id.td3);

        RoseGetSet f1 = getIntent().getParcelableExtra(EXTRA_ROSE);

        Glide.with(this).load(f1.getRoseimage()).into(imageView);
        name.setText(f1.getRosename());
        description.setText(f1.getRosedescription());
        location.setText(f1.getRoselocation());
    }
}
