package sg.edu.rp.c346.id22015131.p05_mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView c346, c203, c206;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c346 = findViewById(R.id.c236);
        c203 = findViewById(R.id.c203);
        c206 = findViewById(R.id.c206);

        c203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ViewModule.class);
                intent.putExtra("module", "C203");
                startActivity(intent);
            }
        });

        c206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ViewModule.class);
                intent.putExtra("module", "C206");
                startActivity(intent);
            }
        });

        c346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ViewModule.class);
                intent.putExtra("module", "C346");
                startActivity(intent);
            }
        });
    }
}

