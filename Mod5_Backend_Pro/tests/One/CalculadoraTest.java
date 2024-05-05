package One;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculadoraTest {



    @Test
    public void testSomar() {
        Calculadora calc = new Calculadora();
        int resultado = calc.somar(3, 5);
        assertEquals(8, resultado);
    }

    @Test
    public void testSubtrair() {
        Calculadora calc = new Calculadora();
        int resultado = calc.subtrair(10, 4);
        assertEquals(6, resultado);
    }

    @Test
    public void testMultiplicar() {
        Calculadora calc = new Calculadora();
        int resultado = calc.multiplicar(6, 7);
        assertEquals(42, resultado);
    }

    @Test
    public void testDividir() {
        Calculadora calc = new Calculadora();
        int resultado = calc.dividir(15, 3);
        assertEquals(5, resultado);
    }



}
