package com.example.gnawi.regime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class ResultatTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultat_test);
    }

    public void onClikBa(View view) {
        Intent i2 = new Intent(ResultatTest.this,Dialogue.class);
        startActivity(i2);
    }
}
