package me.abdulajet.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    int counter = 0;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.textView);

        Button subtract = (Button) findViewById(R.id.subBtn);
        Button reset = (Button) findViewById(R.id.resetBtn);
        Button add = (Button) findViewById(R.id.addBtn);

        subtract.setOnClickListener(this);
        reset.setOnClickListener(this);
        add.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.subBtn:
                if (counter != 0) {
                counter--;
                text.setText(String.valueOf(counter));
            }
                break;

            case R.id.resetBtn:
                counter = 0;
                text.setText(String.valueOf(counter));
                break;

            case R.id.addBtn:
                counter++;
                text.setText(String.valueOf(counter));
                break;

        }



    }
}
