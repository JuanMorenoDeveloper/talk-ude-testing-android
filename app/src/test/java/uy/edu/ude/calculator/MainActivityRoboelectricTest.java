package uy.edu.ude.calculator;

import static junit.framework.Assert.assertEquals;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import uy.edu.ude.calculator.ui.MainActivity;

@RunWith(RobolectricTestRunner.class)
public class MainActivityRoboelectricTest {

  @Test
  public void givenDosNumeros_whenSumar_thenGetResultado() {
    MainActivity activity = Robolectric.setupActivity(MainActivity.class);
    Button btnSum = activity.findViewById(R.id.btn_sum);
    EditText edN1 = activity.findViewById(R.id.ed_n1);
    EditText edN2 = activity.findViewById(R.id.ed_n2);
    TextView tvResultado = activity.findViewById(R.id.tv_result);
    int n1 = 5;
    int n2 = 10;
    int esperado = 15;

    edN1.setText(String.valueOf(n1));
    edN2.setText(String.valueOf(n2));
    btnSum.performClick();
    int resultado = Integer.parseInt(tvResultado.getText().toString());

    assertEquals(esperado, resultado);
  }
}
