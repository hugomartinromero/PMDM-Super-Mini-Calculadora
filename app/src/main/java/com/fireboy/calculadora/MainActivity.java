package com.fireboy.calculadora;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText txtNumero1;
    EditText txtNumero2;
    TextView lblResultado;
    Button btnSuma;
    Button btnResta;
    Button btnMultiplicacion;
    Button btnDivision;
    Button btnBorrar;
    double numero1;
    double numero2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNumero1 = findViewById(R.id.txtNumero1);
        txtNumero2 = findViewById(R.id.txtNumero2);
        lblResultado = findViewById(R.id.lblResultado);
        btnSuma = findViewById(R.id.btnSuma);
        btnResta = findViewById(R.id.btnResta);
        btnMultiplicacion = findViewById(R.id.btnMultiplicacion);
        btnDivision = findViewById(R.id.btnDivision);
        btnBorrar = findViewById(R.id.btnBorrar);

        btnSuma.setOnClickListener(v -> sumar());
        btnResta.setOnClickListener(v -> restar());
        btnMultiplicacion.setOnClickListener(v -> multiplicar());
        btnDivision.setOnClickListener(v -> dividir());
        btnBorrar.setOnClickListener(v -> borrar());
    }

    private void sumar() {
            numero1 = Double.parseDouble(txtNumero1.getText().toString());
            numero2 = Double.parseDouble(txtNumero2.getText().toString());

            double resultado = numero1 + numero2;
            lblResultado.setText(String.valueOf(resultado));
    }

    private void restar() {
        numero1 = Double.parseDouble(txtNumero1.getText().toString());
        numero2 = Double.parseDouble(txtNumero2.getText().toString());

        double resultado = numero1 - numero2;
        lblResultado.setText(String.valueOf(resultado));
    }

    private void multiplicar() {
        numero1 = Double.parseDouble(txtNumero1.getText().toString());
        numero2 = Double.parseDouble(txtNumero2.getText().toString());

        double resultado = numero1 * numero2;
        lblResultado.setText(String.valueOf(resultado));
    }

    private void dividir() {
        if (Double.parseDouble(txtNumero2.getText().toString()) != 0) {
            numero1 = Double.parseDouble(txtNumero1.getText().toString());
            numero2 = Double.parseDouble(txtNumero2.getText().toString());

            double resultado = numero1 / numero2;
            lblResultado.setText(String.valueOf(resultado));
        } else {
            lblResultado.setText(R.string.error);
        }
    }

    private void borrar() {
        lblResultado.setText("");
        txtNumero1.setText("");
        txtNumero2.setText("");
    }
}