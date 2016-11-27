package com.example.gnawi.regime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Dialogue extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialogue);


        ////
        // Array of choices
        String genre[] = {"Homme","","Femme"};

// Selection of the spinner
        Spinner spinner = (Spinner) findViewById(R.id.genre);

// Application of the Array to the Spinner
        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(this,   android.R.layout.simple_spinner_item, genre);
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // The drop down view
        spinner.setAdapter(spinnerArrayAdapter);

    }
    ///////////////////
    public void onClikC(View view) {
        Intent i3 = new Intent(Dialogue.this, ResultatTest.class);
        startActivity(i3);

    }

        ///////houssem



        //TextView Taille = findViewById(R.id.Tai);
        //String T = Taille.getText().toString();
        //TextView Poids = findViewById(R.id.Poi);
        //String P = Poids.getText().toString();
        //TextView Age = findViewById(R.id.Age);
        //String A = Age.getText().toString();
        //Spinner i = (Spinner)findViewById(R.id.genre);
        //String sexe = (String)i.getSelectedItem();

    }

