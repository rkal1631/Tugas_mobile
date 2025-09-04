package com.example.tugas_layout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class RelativeActivity extends AppCompatActivity {

    Button btnBackRelative;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);

        btnBackRelative = findViewById(R.id.btnBackRelative);

        btnBackRelative.setOnClickListener(v -> {
            Intent i = new Intent(RelativeActivity.this, MainActivity.class);
            startActivity(i);
            finish();
        });
    }
}
