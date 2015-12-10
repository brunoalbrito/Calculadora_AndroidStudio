package com.example.bruno.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtnumber1,txtnumber2,txtresult;
    Button btnsoma,btnsub,btndiv,btnmult,btnlimpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnumber1 = (EditText) findViewById(R.id.txtn1);
        txtnumber2 = (EditText) findViewById(R.id.txtn2);
        txtresult  = (EditText) findViewById(R.id.txtresultado);

        btnsoma    = (Button) findViewById(R.id.btnsoma);
        btnsub    = (Button) findViewById(R.id.btnsub);
        btndiv    = (Button) findViewById(R.id.btndiv);
        btnmult    = (Button) findViewById(R.id.btnmult);
        btnlimpar    = (Button) findViewById(R.id.btnlimpar);


        btnsoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calc.start_Clear(txtresult);
                txtresult.setText(Calc.Soma(Double.parseDouble(txtnumber1.getText().toString()), Double.parseDouble(txtnumber2.getText().toString())));
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calc.start_Clear(txtresult);
                txtresult.setText(Calc.Sub(Double.parseDouble(txtnumber1.getText().toString()), Double.parseDouble(txtnumber2.getText().toString())));
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calc.start_Clear(txtresult);
                String resp = Calc.Div(Double.parseDouble(txtnumber1.getText().toString()), Double.parseDouble(txtnumber2.getText().toString()));
                if(resp=="erro"){
                    Toast.makeText(MainActivity.this,"Valores Inválidos",Toast.LENGTH_SHORT).show();
                }else{
                    txtresult.setText(resp);
                }
            }
        });

        btnmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calc.start_Clear(txtresult);
                txtresult.setText(Calc.Mult(Double.parseDouble(txtnumber1.getText().toString()),Double.parseDouble(txtnumber2.getText().toString())));
            }
        });

        btnlimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calc.Clear(txtnumber1, txtnumber2, txtnumber2);
            }
        });


    }
}