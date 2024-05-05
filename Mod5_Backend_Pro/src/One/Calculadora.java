package One;

import java.util.Scanner;

public class Calculadora {

        static int somar(int a, int b) {
            return a + b;
        }

        static int subtrair(int a, int b) {
            return a - b;
        }

        static int multiplicar(int a, int b) {
            return a * b;
        }

        static int dividir(int a, int b) {
        if (a == 0) {

        }
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a operação (+, -, *, /): ");
        String operacao = scanner.nextLine().trim();

        if (!operacao.matches("[+\\-*/]")) {
            System.out.println("Operação inválida. Por favor, escolha +, -, * ou /.");
            return;
        }

        System.out.print("Digite o valor de 'a': ");
        int a = scanner.nextInt();

        System.out.print("Digite o valor de 'b': ");
        int b = scanner.nextInt();

        switch (operacao) {
            case "+":
                System.out.println("Resultado: " + somar(a, b));
                break;
            case "-":
                System.out.println("Resultado: " + subtrair(a, b));
                break;
            case "*":
                System.out.println("Resultado: " + multiplicar(a, b));
                break;
            case "/":
                try {
                    System.out.println("Resultado: " + dividir(a, b));
                } catch (ArithmeticException e) {
                    System.out.println("Erro: " + e.getMessage());
                }
                break;
        }

        scanner.close();
    }
    }


