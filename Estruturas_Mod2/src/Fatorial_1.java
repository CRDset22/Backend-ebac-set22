
                                            //EXERCICIO 1
public class Fatorial_1 {
    public static void main(String[] args) {


        int num1 = 3;
        int num2 = 7;
        int num3 = 10;
        int num4 = 19;
        int num5 = 20;
        int num6 = 25;
        int num7 = 30;
        int num8 = 33;
        int num9 = 34;
        int num10 = 100;


        System.out.println("Fatorial de " + num1 + ": " + fatorial(num1));
        System.out.println("Fatorial de " + num2 + ": " + fatorial(num2));
        System.out.println("Fatorial de " + num3 + ": " + fatorial(num3));
        System.out.println("Fatorial de " + num4 + ": " + fatorial(num4));
        System.out.println("Fatorial de " + num5 + ": " + fatorial(num5));
        System.out.println("Fatorial de " + num6 + ": " + fatorial(num6));
        System.out.println("Fatorial de " + num7 + ": " + fatorial(num7));
        System.out.println("Fatorial de " + num8 + ": " + fatorial(num8));
        System.out.println("Fatorial de " + num9 + ": " + fatorial(num9));
        System.out.println("Fatorial de " + num10 + ": " + fatorial(num10));
    }

    public static int fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }
}
/*              Essa fórmula começa crescente, depois alterna entre números positivos e negativos grandes e conforme
                aumenta os números ele zera, chegou no n = 34 só retornava 0    */