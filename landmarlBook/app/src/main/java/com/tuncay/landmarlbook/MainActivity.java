package com.tuncay.landmarlbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.listView);
        ArrayList<String> landmarksNames = new ArrayList<>();
        landmarksNames.add("Pisa");
        landmarksNames.add("Eiffel");
        landmarksNames.add("Colesseo");
        landmarksNames.add("London Bridge");

        ArrayList<String> countryNames = new ArrayList<>();
        countryNames.add("Italy");
        countryNames.add("France");
        countryNames.add("Italy");
        countryNames.add("United Kingdom");

        Bitmap pisa = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.pisa);
        Bitmap eiffel = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.eiffel);
        Bitmap colesseo = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.collesseo);
        Bitmap londonbridge = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.londonbridge);
        ArrayList<Bitmap> landmarImages= new ArrayList<>();
        landmarImages.add(pisa);
        landmarImages.add(eiffel);
        landmarImages.add(colesseo);
        landmarImages.add(londonbridge);




        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,landmarksNames);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            Intent intent = new Intent(getApplicationContext(),DetailActivity.class);
            intent.putExtra("name",landmarksNames.get(position));
            intent.putExtra("country",countryNames.get(position));
            Singleton singleton = Singleton.getInstance();
            singleton.setChosenImage(landmarImages.get(position));
            startActivity(intent);


            }
        });
    }
}