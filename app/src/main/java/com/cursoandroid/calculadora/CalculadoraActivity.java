package com.cursoandroid.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculadoraActivity extends AppCompatActivity implements View.OnClickListener {

    EditText num1, num2;
    TextView result;
    Button add, sub, div, mul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        result = findViewById(R.id.result);
        add = findViewById(R.id.btnAdd);
        sub = findViewById(R.id.btnSub);
        mul = findViewById(R.id.btnMul);
        div = findViewById(R.id.btnDiv);

        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String num1S = num1.getText().toString();
        String num2S = num2.getText().toString();

        int n1 = Integer.parseInt(num1S);
        int n2 = Integer.parseInt(num2S);
        int r = 0;

        switch (v.getId()){
            case R.id.btnAdd: r = n1 + n2; break;
            case R.id.btnSub: r = n1 - n2; break;
            case R.id.btnMul: r = n1 * n2; break;
            case R.id.btnDiv: r = n1 / n2; break;
        }

        result.setText(""+r);
    }
}
