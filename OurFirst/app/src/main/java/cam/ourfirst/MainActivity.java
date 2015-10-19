package cam.ourfirst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnChangeImg;
    ImageView ivImage;
    EditText eTAnswer;
    TextView tV1, tV2;
    Character cH1, cH2;
    int nAnswer, n1, n2, n3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        btnChangeImg = (Button) findViewById(R.id.btnChangeImg);
        ivImage = (ImageView) findViewById(R.id.ivImage);
        eTAnswer = (EditText) findViewById(R.id.editText);
        tV1 = (TextView) findViewById(R.id.tV1);
        tV2 = (TextView) findViewById(R.id.tV2);

        btnChangeImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 =(int)Math.random();
                n2 =(int)Math.random();
                nAnswer = n1 +n2;
                n3 = eTAnswer.getText();
                if(n3 = nAnswer) {
                    ivImage.setX(ivImage.getX() + 10);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
