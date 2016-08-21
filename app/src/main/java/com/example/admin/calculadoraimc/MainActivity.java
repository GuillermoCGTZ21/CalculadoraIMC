package com.example.admin.calculadoraimc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void CALCULAR (View view) {
        TextView TXTESTATURA = (EditText) findViewById(R.id.TXTESTATURA);
        TextView TXTPESO = (EditText) findViewById(R.id.TXTPESO);

        double ESTATURA = Double.parseDouble(TXTESTATURA.getText().toString());
        double PESO = Double.parseDouble(TXTPESO.getText().toString());

        double resultado = PESO / (Math.pow(ESTATURA, 2));

        TextView TXTIMPRIMIR = (TextView) findViewById(R.id.TXTIMPRIMIR);


        if (resultado < 18) {
            TXTIMPRIMIR.setText("PESO BAJO");
        } else if (resultado < 24.9) {
            TXTIMPRIMIR.setText("NORMAL");
        } else if (resultado < 26.9) {
            TXTIMPRIMIR.setText("SOBREPESO");
        } else if (resultado < 29.9) {
            TXTIMPRIMIR.setText("OBESIDAD GRADO 1");
        } else if (resultado < 39.9) {
            TXTIMPRIMIR.setText("OBESIDAD GRADO 2");
        } else if (resultado > 40) {
            TXTIMPRIMIR.setText("OBESIDAD GRADO 3");
        }
    }}