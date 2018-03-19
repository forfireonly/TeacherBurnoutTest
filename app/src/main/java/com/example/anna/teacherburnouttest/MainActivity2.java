package com.example.anna.teacherburnouttest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Anna on 3/16/2018.
 */


public class MainActivity2 extends AppCompatActivity {

    public static String name;
    public static String purpose;

    EditText nameView;
    EditText namePurpose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nameView = findViewById(R.id.yourname);
        namePurpose = findViewById(R.id.purpose);
//        if(savedInstanceState != null)
//        {
//            nameView.setText(savedInstanceState.getString("Name"));
//            namePurpose.setText(savedInstanceState.getString("Purpose"));
//        }

    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        name=nameView.getText().toString();
        purpose = namePurpose.getText().toString();

        outState.putString("Name", name);
        outState.putString("Purpose", purpose);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        name = savedInstanceState.getString("Name");
        nameView.setText(name);
        purpose = savedInstanceState.getString("Purpose");
        namePurpose.setText(purpose);

    }


    public void goToScreen3(View view) {

        nameView = findViewById(R.id.yourname);
        nameView.getText().toString();

        namePurpose = findViewById(R.id.purpose);
        purpose = namePurpose.getText().toString();


        Intent myIntent = new Intent(MainActivity2.this, MainActivity3.class);
        //myIntent.putExtra("Name", name);
        //myIntent.putExtra("Purpose", purpose);

        MainActivity2.this.startActivity(myIntent);

    }
}

