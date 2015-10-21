package com.mvc.mvc;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mySound;
    EditText eNum1, eNum2;
    TextView sResult;
    Button btnAdd, btnCall;
    double dNum1, dNum2, dSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mySound = MediaPlayer.create(this, R.raw.qwerty);
        eNum1 = (EditText) findViewById(R.id.inNum1);
        eNum2 = (EditText) findViewById(R.id.inNum2);
        sResult = (TextView) findViewById(R.id.txtResult);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnCall = (Button) findViewById(R.id.btnCall);

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CallStef = new Intent(Intent.ACTION_CALL);
                CallStef.setData(Uri.parse("tel:5195909836"));
                startActivity(CallStef);
            }
        });
    }

    public void OnButtonClickChangeText(View view) {
        TextView textView = (TextView) findViewById(R.id.textview1);
        textView.setText("Hello User!");
    }

    public void OnButtonClickChangeText2(View view) {
        TextView textView3 = (TextView) findViewById(R.id.textView2);
        textView3.setText("18");
    }

    public void OnButtonClickChangeText3(View view) {
        dNum1 = Double.parseDouble(eNum1.getText().toString());
        dNum2 = Double.parseDouble(eNum2.getText().toString());
        dSum = dNum1 + dNum2;
        sResult.setText(Double.toString(dSum));
    }
    public void playMusic(View view) {
        mySound.start();
    }
}

//https://www.youtube.com/watch?v=3PHDcQOGFtg   ~ How to make a phone call
//https://www.youtube.com/watch?v=zcqVrLT1-iY   ~ How to set permissions related to above
//https://www.youtube.com/watch?v=7iAm_YyOk9o   ~ How to add two numbers through EditText
//https://www.youtube.com/watch?v=V1ocJmXeQ28   ~ How to play music
//Change TextView Got help from Cameron