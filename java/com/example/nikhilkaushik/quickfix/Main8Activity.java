package com.example.nikhilkaushik.quickfix;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import static com.example.nikhilkaushik.quickfix.GlobalVariables.url;

public class Main8Activity extends AppCompatActivity {

    Button btn1;
    EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);












            btn1=(Button)findViewById(R.id.button8);
            et1=(EditText)findViewById(R.id.editText9);
            btn1.setOnClickListener(new View.OnClickListener(){


                @Override
                public void onClick(View view) {
                    String m=et1.getText().toString();
                    url = m;

                    Intent intent=new Intent(view.getContext(), MainActivity.class);
                    startActivity(intent);

                }
            });







}}
