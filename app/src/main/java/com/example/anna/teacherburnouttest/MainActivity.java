package com.example.anna.teacherburnouttest;

import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void goToScreen2 (View view){
        Intent myIntent = new Intent(MainActivity.this, MainActivity2.class);
        //myIntent.putExtra("key", value); //Optional parameters
        MainActivity.this.startActivity(myIntent);
        //Intent intent = new Intent (this, MainActivity2.class);
       // startActivity(intent);
    }
}