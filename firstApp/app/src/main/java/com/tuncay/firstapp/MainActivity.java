package com.tuncay.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    boolean tuncay = true;
    public void changeImage(View view) {
        ImageView imageView = findViewById(R.id.imageView);
        if(tuncay){
            imageView.setImageResource(R.drawable.cakir);
            tuncay = false;
        }
        else{
            imageView.setImageResource(R.drawable.cakir1);
            tuncay = true;
        }
    }
}
