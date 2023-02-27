package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setTitle("Liborio ZS");


    }

    @Override
    public void onClick(View view) {
        //Set operators buttons find-view
        Button sumButton = findViewById(R.id.btnSuma);
        Button resButton = findViewById(R.id.btnResta);
        Button multButton = findViewById(R.id.btnMult);
        Button divButton = findViewById(R.id.btnDiv);

        //Find edittext and label to show result
        EditText textNumOne = findViewById(R.id.numUno);
        EditText textNumTwo = findViewById(R.id.numDos);
        TextView resultLabel = findViewById(R.id.labelRes);
        TextView titleLabel = findViewById(R.id.labelTitle);

        //convert to string edittext, gettext and delete blank spaces
        String numOneString = textNumOne.getText().toString().trim();
        String numTwoString = textNumTwo.getText().toString().trim();

        //add event click listener to buttons
        sumButton.setOnClickListener(this);
        resButton.setOnClickListener(this);
        multButton.setOnClickListener(this);
        divButton.setOnClickListener(this);

        //check if one of my text is empty and show a Toast
        if (numOneString.isEmpty() || numTwoString.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Debes ingresar un numero", Toast.LENGTH_SHORT).show();

        } else {
            // Convert string to Int
            int numOne = Integer.parseInt(numOneString);
            int numTwo = Integer.parseInt(numTwoString);
            //Switch case check the id of my view
            switch (view.getId()) {
                //case 1 id btn suma, this name is set in activity_main xml
                case R.id.btnSuma:
                    //make sum into the new variable int sum
                    int sum = numOne + numTwo;
                    //set result in my result-label and convert to string
                    resultLabel.setText(String.valueOf(sum));
                    titleLabel.setText("Suma de dos numeros");
                    break;
                //case 2 id btn resta, this name is set in activity_main xml
                case R.id.btnResta:
                    //make rest into the new variable int res
                    int res = numTwo - numOne;
                    //set result in my result-label and convert to string
                    resultLabel.setText(String.valueOf(res));
                    titleLabel.setText("Resta de dos numeros");
                    break;
                case R.id.btnMult:
                    int mult = numOne * numTwo;
                    //set result in my result-label and convert to string
                    resultLabel.setText(String.valueOf(mult));
                    titleLabel.setText("Multiplicacion de dos numeros");
                    break;
                case R.id.btnDiv:
                    int div = numOne / numTwo;
                    //set result in my result-label and convert to string
                    resultLabel.setText(String.valueOf(div));
                    titleLabel.setText("Division de dos numeros");
                default:
                    break;


            }
        }

    }
}