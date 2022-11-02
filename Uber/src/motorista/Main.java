package motorista;

import java.util.Scanner;

public class Main {

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        FabiUber uber = new FabiUber();
        String nome = "Fabio";
        uber.setNome(nome);
        double altura = 1.98;
        uber.setAltura(altura);
        uber.setIdade(37);
        uber.setFaturamento_mês(4800);
        uber.setPrejuizo_mês(3200);

        System.out.println("Qual o nome do Uber ? ");
        System.out.println("O nome do Uber é " + uber.getNome());
        System.out.println("Qual a altura do uber ? " +" É "+ uber.getAltura()+"m !!!");
        System.out.println("A idade do uber é " + uber.getIdade() + " anos");
        System.out.println("Quanto ele faturou em valor líquido esse mês ?.Foi " + (uber.getFaturamento_mês()-uber.getPrejuizo_mês()) + " reais");
    }


}
