package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setTitle("Liborio ZS");


    }

    public void presionaBoton(View view) {

        EditText textNumOne = findViewById(R.id.numUno);
        EditText textNumTwo = findViewById(R.id.numDos);
        TextView resultLabel = findViewById(R.id.labelRes);
        Button sumButton = findViewById(R.id.btnSuma);

        String numOneString = textNumOne.getText().toString().trim();
        String numTwoString = textNumTwo.getText().toString().trim();

        if (numOneString.isEmpty() || numTwoString.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Debes ingresar un numero", Toast.LENGTH_SHORT).show();

        } else {
            int numOne = Integer.parseInt(numOneString);
            int numTwo = Integer.parseInt(numTwoString);

            int sum = numOne + numTwo;

            resultLabel.setText(String.valueOf(sum));
        }

    }
}