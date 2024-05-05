package One;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    /**
     * Testa se o método encontrarElemento retorna corretamente 0 para n = 0.
     */
    @Test
    public void testFibonacciParaZero() {
        assertEquals(0, Fibonacci.encontrarElemento(0));
    }

    /**
     * Testa se o método encontrarElemento retorna corretamente 1 para n = 1.
     */
    @Test
    public void testFibonacciParaUm() {
        assertEquals(1, Fibonacci.encontrarElemento(1));
    }

    /**
     * Testa se o método encontrarElemento retorna corretamente 1 para n = 2.
     */
    @Test
    public void testFibonacciParaDois() {
        assertEquals(1, Fibonacci.encontrarElemento(2));
    }

    /**
     * Testa se o método encontrarElemento retorna corretamente 5 para n = 5.
     */
    @Test
    public void testFibonacciParaCinco() {
        assertEquals(5, Fibonacci.encontrarElemento(5));
    }

    /**
     * Testa se o método encontrarElemento retorna corretamente 55 para n = 10.
     */
    @Test
    public void testFibonacciParaDez() {
        assertEquals(55, Fibonacci.encontrarElemento(10));
    }

}
