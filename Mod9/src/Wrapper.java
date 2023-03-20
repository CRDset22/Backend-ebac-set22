import java.util.Scanner;
public class Wrapper {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite um valor numérico: ");
        int valor = sc.nextInt();


        Integer valorWrapper = Integer.valueOf(valor);


        System.out.println("O valor digitado foi: " + valorWrapper);
    }
}
