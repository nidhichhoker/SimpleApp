package com.shama.riyas.simpleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        text = (TextView) findViewById(R.id.text);


        Bundle gt = getIntent().getExtras();
        String str = gt.getString("");
        text.setText(str);

    }



}
