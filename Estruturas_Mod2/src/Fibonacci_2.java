

public class Fibonacci_2 {


    public static int encontrarElemento(int n) {
        int[] memo = new int[n + 1];
        return fibonacciRecursivo(n, memo);
    }

    public static int fibonacciRecursivo(int n, int[] memo) {
        if (n <= 1) {
            return n;
        }
        if (memo[n] != 0) {
            return memo[n];
        }
        memo[n] = fibonacciRecursivo(n - 1, memo) + fibonacciRecursivo(n - 2, memo);
        return memo[n];
    }

    public static void main(String[] args) {
        int n = 100;
        System.out.println("Elemento " + n + " : " + encontrarElemento(n));
    }



}
                        /* Essa abordagem melhora a performance do código, pois evita recalcular
                        elementos da sequência de Fibonacci que já foram calculados anteriormente.
                         Em vez de calcular cada elemento a partir do zero, podemos reutilizar os
                         resultados intermediários armazenados no array memo, o que reduz
                         significativamente a quantidade de cálculos necessários e, portanto,
                         melhora a eficiência do algoritmo.
                         */