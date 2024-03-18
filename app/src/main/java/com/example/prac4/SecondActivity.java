package com.example.prac4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView nameTextView, surnameTextView;
    EditText subjectEditText;
    Button enterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        nameTextView = findViewById(R.id.nameTextView);
        surnameTextView = findViewById(R.id.surnameTextView);
        subjectEditText = findViewById(R.id.subjectEditText);
        enterButton = findViewById(R.id.enterButton);

        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.EXTRA_NAME);
        String surname = intent.getStringExtra(MainActivity.EXTRA_SURNAME);

        nameTextView.setText(name);
        surnameTextView.setText(surname);

        enterButton.setOnClickListener(v -> {
            Intent intentToThird = new Intent(SecondActivity.this, ThirdActivity.class);
            startActivity(intentToThird);
        });
    }
}

