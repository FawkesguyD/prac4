package com.example.prac4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    EditText dayEditText, timeEditText, commentEditText;
    Button okButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        dayEditText = findViewById(R.id.dayEditText);
        timeEditText = findViewById(R.id.timeEditText);
        commentEditText = findViewById(R.id.commentEditText);
        okButton = findViewById(R.id.okButton);

        okButton.setOnClickListener(v -> {
            Intent resultIntent = new Intent();
            resultIntent.putExtra("DAY", dayEditText.getText().toString());
            resultIntent.putExtra("TIME", timeEditText.getText().toString());
            resultIntent.putExtra("COMMENT", commentEditText.getText().toString());
            setResult(Activity.RESULT_OK, resultIntent);
            finish();
        });
    }
}

