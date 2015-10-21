package com.mvc.mvcpart2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button btnGuess;
    EditText eGuess;
    int nRan, nGuess = 0;
    String sRan;
    TextView txtDebug, txtOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtDebug = (TextView) findViewById(R.id.txtDebug);
        txtOut = (TextView) findViewById(R.id.txtOut);
        eGuess = (EditText) findViewById(R.id.inGuess);
        btnGuess = (Button) findViewById(R.id.btnGuess);

        nRan = (int) (Math.random() * 100) + 1;
        sRan = Integer.toString(nRan);
        txtDebug.setText(sRan);

        btnGuess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nGuess = Integer.parseInt(eGuess.getText().toString());
                while (nGuess != nRan) {
                    txtOut.setText("");
                    if (nGuess > nRan) {
                        txtOut.setText("Guess Lower");
                    } else if (nGuess < nRan) {
                        txtOut.setText("Guess Higher");
                    }
                }
                txtOut.setText("You Guessed Right!!!!");
            }
        });
    }
}

//Used Code from MVC and code from SS3-E3L