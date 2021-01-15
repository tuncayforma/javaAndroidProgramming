package com.tuncay.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText number1Text;
    EditText number2Text;
    TextView resultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1Text = findViewById(R.id.editTextNumber);
        number2Text = findViewById(R.id.editTextNumber2);
        resultText = findViewById(R.id.textView);
    }
    public void topla(View view){
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            resultText.setText("Boş Bırakamazsın!");
        }
        else{
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());
            int result = number1 + number2;
            resultText.setText("Sonuç: "+result);
        }
    }
    public void cikart(View view){
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            resultText.setText("Boş Bırakamazsın!");
        }
        else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());
            int result = number1 - number2;
            resultText.setText("Sonuç: " + result);
        }
    }
    public void carp(View view){
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            resultText.setText("Boş Bırakamazsın!");
        }
        else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());
            int result = number1 * number2;
            resultText.setText("Sonuç: " + result);
        }
    }
    public void bol(View view){
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            resultText.setText("Boş Bırakamazsın!");
        }
        else {
            double number1 = Double.parseDouble(number1Text.getText().toString());
            double number2 = Double.parseDouble(number2Text.getText().toString());
            double result = number1 / number2;
            resultText.setText("Sonuç: " + new DecimalFormat("##.##").format(result));
        }
    }
}