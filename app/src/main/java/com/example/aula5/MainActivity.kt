package com.example.aula5

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    EditText txtTempoGasto;
    EditText txtVelocidadeMedia;
    EditText txtRendimentoVeiculo;
    EditText txtDistancia;
    EditText txtConsumo;

    protected void onCreat(.....) {
    }
}
    txtTempoGasto = findViewById(R.id.txtTempoGasto);

}
    public void onCalcular (View v) {

    double tg = Double.parseDouble(txtTempoGasto.getText().toString();
    int vm = Inter.parseInt(txtVelocidadeMedia.getText().toString();

    double distancia = tg * vm;

    lblDistance2.setText(distancia);

}
