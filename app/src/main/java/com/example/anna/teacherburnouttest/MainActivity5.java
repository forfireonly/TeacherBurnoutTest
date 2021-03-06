package com.example.anna.teacherburnouttest;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import static com.example.anna.teacherburnouttest.MainActivity2.name;
import static com.example.anna.teacherburnouttest.MainActivity2.purpose;

/**
 * Created by Anna on 3/18/2018.
 */

public class MainActivity5 extends AppCompatActivity {

    TextView dearName;
    TextView yourReason;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        dearName = (TextView) findViewById(R.id.dear_name);
        dearName.setText("Dear "+name+", " +"you are NOT experiencing \"Teacher Burnout\"  syndrom" );
        dearName.setTextColor(Color.parseColor("#4CAF50"));

        yourReason = (TextView) findViewById(R.id.my_reason);
        yourReason.setText("Remember why you became a teacher - "+purpose);


    }
}
