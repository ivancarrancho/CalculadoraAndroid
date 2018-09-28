package com.example.ivan.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    TextView result;
    int val1, val2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        result = (TextView) findViewById(R.id.result);


    }

    public void calculate(View view) {
        try {
            val1 = Integer.parseInt(num1.getText().toString());
            val2 = Integer.parseInt(num2.getText().toString());

            switch (view.getId()) {
                case R.id.btnSuma: sumar();
                    break;
                case R.id.btnResta: restar();
                    break;
                case R.id.btnMulti: multiplicar();
                    break;
                case R.id.btnDivi: dividir();
                    break;
            }
        } catch(Exception e) {
            Toast.makeText(this, "Eror inesperado", Toast.LENGTH_LONG ).show();
        }

    }

    private void sumar(){
        try {
            int suma = val1 + val2;
            result.setText("R: " + suma);
        } catch(Exception e) {
            Toast.makeText(this, "Eror inesperado", Toast.LENGTH_LONG ).show();
        }
    }

    private void restar() {
        try {
            int resta = val1 - val2;
            result.setText("R: " + resta);
        } catch(Exception e) {
            Toast.makeText(this, "Eror inesperado", Toast.LENGTH_LONG ).show();
        }
    }

    private void multiplicar() {
        try {
            int mult = val1 * val2;
            result.setText("R: " + mult);
        } catch(Exception e) {
            Toast.makeText(this, "Eror inesperado", Toast.LENGTH_LONG ).show();
        }
    }

    private void dividir() {
        try {
            if(val2 > 0){
                int div = val1 / val2;
                result.setText("R: " + div);
            } else{
                Toast.makeText(this, "No puedes dividir por menos de 0", Toast.LENGTH_LONG ).show();
            }
        } catch(Exception e) {
            Toast.makeText(this, "Eror inesperado", Toast.LENGTH_LONG ).show();
        }
    }

}
