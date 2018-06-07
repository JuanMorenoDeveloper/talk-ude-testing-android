package uy.edu.ude.calculator;

import static junit.framework.Assert.assertEquals;

import junit.framework.Assert;
import org.junit.Test;
import uy.edu.ude.calculator.logic.Sumar;
import uy.edu.ude.calculator.logic.SumarEntero;

public class SumarEnteroUnitTest {

  @Test
  public void givenDosNumeros_whenSumar_thenGetResultado() {
    Sumar sumar = new SumarEntero();
    int n1 = 5;
    int n2 = 10;
    int esperado = 15;

    int resultado = sumar.sumar(n1, n2);

    assertEquals(esperado, resultado);
  }
}
