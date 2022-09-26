package com.example.fafire;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btCount;
    private TextView tvNumber;
    private int number = 0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btCount = findViewById(R.id.button_count);
        tvNumber = findViewById(R.id.tv_number);





    }

    @Override
    protected void onResume() {
        super.onResume();

        findViewById(R.id.button_toast).setOnClickListener(view -> {
            Toast.makeText(this, "Hello Toast!!!  " + number, Toast.LENGTH_LONG).show();
        });

        btCount.setOnClickListener(view -> {
            int count = 1 + number;
            tvNumber.setText(String.valueOf(count));
            number = count;
        });
    }
}