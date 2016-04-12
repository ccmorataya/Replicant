package com.example.ccmorataya.replicant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
//    EditText editText;
    Button button;
    TextView textView;
    CheckBox ch1, ch2;
//    String texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        editText = (EditText) findViewById(R.id.username);
        button = (Button) findViewById(R.id.send);
        textView = (TextView) findViewById(R.id.show);

        ch1 = (CheckBox) findViewById(R.id.chk1);
        ch2 = (CheckBox) findViewById(R.id.chk2);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.send:
                    if (ch1.isChecked() == true)
                    {
                        textView.setText("Buenos días Señor");
                    }
                    else if (ch2.isChecked() == true)
                    {
                        textView.setText("Buenos dias Señora");
                    }
                break;
            default:
                break;
        }
    }
}
