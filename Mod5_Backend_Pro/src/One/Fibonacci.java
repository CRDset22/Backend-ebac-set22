package One;

/**
 * A classe Fibonacci implementa um algoritmo recursivo para calcular o n-ésimo termo da sequência de Fibonacci.
 * A sequência de Fibonacci é uma série de números em que cada número é a soma dos dois números anteriores.
 */

public class Fibonacci {
    /**
     * Método estático para encontrar o n-ésimo elemento na sequência de Fibonacci.
     *
     * @param n O número do elemento desejado na sequência (n >= 0).
     * @return O valor do n-ésimo elemento na sequência de Fibonacci.
     */
    public static int encontrarElemento(int n) {
        if (n <= 1) {
            return n;
        }
        return encontrarElemento(n - 1) + encontrarElemento(n - 2);
    }

    /**
     * Método main para teste da classe Fibonacci_1.
     * Imprime o n-ésimo elemento da sequência de Fibonacci, onde n = 10.
     */
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Elemento " + n + " : " + encontrarElemento(n));
    }



}



