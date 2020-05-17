package nz.op.ac.nz.nationalflowertraders.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import nz.op.ac.nz.nationalflowertraders.Activity.ListItem;
import nz.op.ac.nz.nationalflowertraders.R;

public class MainActivity extends AppCompatActivity {

    private Button loginbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginbtn = findViewById(R.id.loginbtn);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }


        });
    }
    private void openActivity() {
        Intent intent = new Intent(this, ListItem.class);
        startActivity(intent);
    }
}
