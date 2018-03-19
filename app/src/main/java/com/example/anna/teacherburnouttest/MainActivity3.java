package com.example.anna.teacherburnouttest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

/**
 * Created by Anna on 3/17/2018.
 */

public class MainActivity3 extends AppCompatActivity {
    CheckBox insomnia_Check;
    CheckBox appetite_Check;
    CheckBox physical_Check;
    CheckBox fatigue_Check;

    RadioButton irritation_Radio;
    RadioButton social_Radio;
    RadioButton complain_Radio;
    RadioButton focus_Radio;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        insomnia_Check = (CheckBox) findViewById(R.id.insomnia);
        appetite_Check = (CheckBox) findViewById(R.id.appetite);
        physical_Check = (CheckBox) findViewById(R.id.physical);
        fatigue_Check = (CheckBox) findViewById(R.id.fatigue);

        irritation_Radio = (RadioButton) findViewById(R.id.first_yes);
        social_Radio = (RadioButton) findViewById(R.id.second_yes);
        complain_Radio = (RadioButton) findViewById(R.id.third_yes);
        focus_Radio = (RadioButton) findViewById(R.id.fourth_yes);
    }

public void testScore(View view){

        int score = 0;
        if (insomnia_Check.isChecked()) {score+=0.25;}
        if (appetite_Check.isChecked()) {score+=0.25;}
        if (physical_Check.isChecked()) {score+=0.25;}
        if (fatigue_Check.isChecked()) {score+=0.25;}
        if (irritation_Radio.isChecked()) {score++;}
        if (social_Radio.isChecked()) {score++;}
        if (complain_Radio.isChecked()) {score++;}
        if (focus_Radio.isChecked()) {score++;}

        if (score>3){Intent myIntent = new Intent(MainActivity3.this, MainActivity4.class);
            MainActivity3.this.startActivity(myIntent);}
        if (score<2) {Intent myIntent = new Intent(MainActivity3.this, MainActivity5.class);
            MainActivity3.this.startActivity(myIntent);}
        else {Intent myIntent = new Intent(MainActivity3.this, MainActivity6.class);
            MainActivity3.this.startActivity(myIntent);}
}


}