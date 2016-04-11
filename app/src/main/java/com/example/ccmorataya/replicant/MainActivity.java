package com.example.ccmorataya.replicant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText editText;
    Button button;
    TextView textView;
    String texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.username);
        button = (Button) findViewById(R.id.send);
        textView = (TextView) findViewById(R.id.show);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.send:
                texto = editText.getText().toString();
                textView.setText(texto);
                break;
            default:
                break;
        }
    }
}
