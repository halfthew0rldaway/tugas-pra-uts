package com.example.tugas_pra_uts;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Button btnBack = findViewById(R.id.btnBack);
        Button btnGoToA = findViewById(R.id.btnGoToA);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnGoToA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Return to Activity A (SecondActivity)
                // We use FLAG_ACTIVITY_REORDER_TO_FRONT or just start it
                Intent intent = new Intent(ThirdActivity.this, SecondActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(intent);
                finish();
            }
        });
    }
}
