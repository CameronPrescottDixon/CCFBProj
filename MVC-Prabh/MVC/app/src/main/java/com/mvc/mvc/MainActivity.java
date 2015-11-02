package com.mvc.mvc;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mySound;
    EditText firstNumber;
    EditText secondNumber;
    TextView addResult;
    Button btnAdd, btnCall;
    double num1, num2, sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mySound = MediaPlayer.create(this, R.raw.qwerty);
        firstNumber = (EditText) findViewById(R.id.txtNumber1);
        secondNumber = (EditText) findViewById(R.id.txtNumber2);
        addResult = (TextView) findViewById(R.id.txtResult);
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
        num1 = Double.parseDouble(firstNumber.getText().toString());
        num2 = Double.parseDouble(secondNumber.getText().toString());
        sum = num1 + num2;
        addResult.setText(Double.toString(sum));
    }

    public void playMusic(View view) {
        mySound.start();
    }
}
