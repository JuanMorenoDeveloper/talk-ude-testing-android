package uy.edu.ude.calculator.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import uy.edu.ude.calculator.R;
import uy.edu.ude.calculator.logic.Sumar;
import uy.edu.ude.calculator.logic.SumarEntero;

public class MainActivity extends AppCompatActivity {

  Sumar sumar;
  EditText edNumero1;
  EditText edNumero2;
  TextView tvResultado;
  Button btnSumar;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    sumar = new SumarEntero();
    edNumero1 = findViewById(R.id.ed_n1);
    edNumero2 = findViewById(R.id.ed_n2);
    tvResultado = findViewById(R.id.tv_result);
  }

  public void sumar(View v) {
    //Faltan validaciones
    int n1 = Integer.parseInt(edNumero1.getText().toString());
    int n2 = Integer.parseInt(edNumero2.getText().toString());
    int resultado = sumar.sumar(n1, n2);
    tvResultado.setText(resultado);
  }
}
