package com.example.calci;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etFirstValue ,etSecondValue;
    TextView tvAns;
    Button btnAdd, btnSubtract ,btnMultiply ,btnDivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstValue=findViewById(R.id.etFirstValue);
        etSecondValue=findViewById(R.id.etSecondValue);

        tvAns=findViewById(R.id.tvAns);

        btnAdd=findViewById(R.id.btnAdd);
        btnSubtract=findViewById(R.id.btnSubtract);
        btnMultiply=findViewById(R.id.btnMultiply);
        btnDivide=findViewById(R.id.btnDivide);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v)
            {
                int firstValue, secondValue, ans;
                firstValue= Integer.parseInt(etFirstValue.getText().toString());
                secondValue= Integer.parseInt(etSecondValue.getText().toString());
                ans=firstValue+secondValue;

                tvAns.setText(""+ans);

            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v)
            {
                int firstValue, secondValue, ans;
                firstValue= Integer.parseInt(etFirstValue.getText().toString());
                secondValue= Integer.parseInt(etSecondValue.getText().toString());
                ans=firstValue-secondValue;

                tvAns.setText(""+ans);

            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v)
            {
                int firstValue, secondValue, ans;
                firstValue= Integer.parseInt(etFirstValue.getText().toString());
                secondValue= Integer.parseInt(etSecondValue.getText().toString());
                ans=firstValue*secondValue;

                tvAns.setText(""+ans);

            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v)
            {
                int firstValue, secondValue, ans;
                firstValue= Integer.parseInt(etFirstValue.getText().toString());
                secondValue= Integer.parseInt(etSecondValue.getText().toString());
                ans=firstValue/secondValue;

                tvAns.setText(""+ans);

            }
        });
    }
}
