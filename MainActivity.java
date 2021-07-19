package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addbutton = (Button) findViewById(R.id.addbutton);
        addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText) ;
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText) ;
                TextView result= (TextView) findViewById(R.id.result) ;
                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumEditText.getText().toString());
                int res = num1+num2;
                result.setText(res + "");
            }
        });

        Button subbutton = (Button) findViewById(R.id.subbutton);
        subbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText) ;
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText) ;
                TextView result= (TextView) findViewById(R.id.result) ;
                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumEditText.getText().toString());
                int res = num1-num2;
                result.setText(res + "");
            }
        });


        Button multbutton = (Button) findViewById(R.id.multbutton);
        multbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText) ;
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText) ;
                TextView result= (TextView) findViewById(R.id.result) ;
                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumEditText.getText().toString());
                int res = num1*num2;
                result.setText(res + "");
            }
        });

        Button divbutton = (Button) findViewById(R.id.divbutton);
        divbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText) ;
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText) ;
                TextView result= (TextView) findViewById(R.id.result) ;

                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumEditText.getText().toString());
                if (num2 == 0) result.setText("Error");
                float res = (float) num1/(float)num2;
                result.setText(res + "");
            }
        });
    }
}
