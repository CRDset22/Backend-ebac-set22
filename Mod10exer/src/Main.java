import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Média Aluno");
        System.out.println(" ");
        System.out.println("Nota 1: ");
        double a = sc.nextDouble();
        System.out.println("Nota 2: ");
        double b = sc.nextDouble();
        System.out.println("Nota 3: ");
        double c = sc.nextDouble();
        System.out.println("Nota 4: ");
        double d = sc.nextDouble();

        double soma = a + b + c + d;
        double media = soma/4;
        System.out.println(" ");

        if(media >= 7){
            System.out.println(" Sua nota é " + media + ", Ok! Aprovado!!!");
        } else if (media < 7 && media >= 5) {
            System.out.println(" Sua nota é " + media + ", Está de recuperação!!!");
        } else {
            System.out.println(" Sua nota é " + media + ", Está reprovado!!!");
        }

        }
    }
