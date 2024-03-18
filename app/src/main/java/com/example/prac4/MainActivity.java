package com.example.prac4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText nameEditText, surnameEditText;
    Button nextButton;
    public static final String EXTRA_NAME = "com.example.YOUR_APP_NAME.NAME";
    public static final String EXTRA_SURNAME = "com.example.YOUR_APP_NAME.SURNAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = findViewById(R.id.nameEditText);
        surnameEditText = findViewById(R.id.surnameEditText);
        nextButton = findViewById(R.id.nextButton);

        nextButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra(EXTRA_NAME, nameEditText.getText().toString());
            intent.putExtra(EXTRA_SURNAME, surnameEditText.getText().toString());
            startActivity(intent);
        });
    }
}
