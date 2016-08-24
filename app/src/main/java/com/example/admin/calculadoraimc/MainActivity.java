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

    public void calcular(View view) {
        EditText peso = (EditText) findViewById(R.id.etPeso);
        String stringPeso = peso.getText().toString().trim();
        float valorPeso = Float.parseFloat(stringPeso);

        EditText altura = (EditText) findViewById(R.id.etEstatura);
        String stringAltura = altura.getText().toString().trim();
        float valorAltura = Float.parseFloat(stringAltura) / 100;

        float resultado = valorPeso / (valorAltura * valorAltura);

        TextView tuResultado = (TextView) findViewById(R.id.tuResultado);
        assert tuResultado != null;
        tuResultado.setText("Tu resultado es " + resultado + " de IMC");

        TextView TXTIMPRIMIR = null;
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

    }
}








