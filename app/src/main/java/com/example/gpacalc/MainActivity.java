package com.example.gpacalc;

import android.graphics.LinearGradient;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText course1;
    private EditText course2;
    private EditText course3;
    private EditText course4;
    private EditText course5;
    private Button calc;
    private TextView textView7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        course1 = (EditText) findViewById(R.id.editText);
        course2 = (EditText) findViewById(R.id.editText2);
        course3 = (EditText) findViewById(R.id.editText3);
        course4 = (EditText) findViewById(R.id.editText4);
        course5 = (EditText) findViewById(R.id.editText5);
        final TextView result = findViewById(R.id.textView7);
        calc = (Button) findViewById(R.id.result);


        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                float number1 = Integer.parseInt(course1.getText().toString());
                float number2 = Integer.parseInt(course2.getText().toString());
                float number3 = Integer.parseInt(course3.getText().toString());
                float number4 = Integer.parseInt(course4.getText().toString());
                float number5 = Integer.parseInt(course5.getText().toString());
                float sum = number1 + number2 + number3 + number4 + number5;
                float res = sum/5;

                result.setText("GPA: " + String.valueOf(res));


            }
        });

    }

}