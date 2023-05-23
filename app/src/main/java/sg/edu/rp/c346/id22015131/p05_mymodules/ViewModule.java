package sg.edu.rp.c346.id22015131.p05_mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class ViewModule extends AppCompatActivity {

    TextView tv;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_module);

        ArrayList<Module> moduleList = new ArrayList<>();
        moduleList.add(new Module("C203", "Web App Development in PHP", 2023, 1, 4, "W64P"));
        moduleList.add(new Module("C206", "Software Development Process", 2023, 1, 4, "W64P"));
        moduleList.add(new Module("C346", "Mobile App Development", 2023, 1, 4, "E63A"));

        tv = findViewById(R.id.tvDisplay);
        btnBack = findViewById(R.id.buttonBack);

        Intent intentReceived = getIntent();
        String moduleSelected = intentReceived.getStringExtra("module");
        for (int i = 0; i < moduleList.size(); i++) {
            if (moduleSelected.equals(moduleList.get(i).getModuleCode())) {
                tv.setText(moduleList.get(i).display());
            }
        }

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}