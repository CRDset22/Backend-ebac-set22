import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConcatenarStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite 1 para função Nomes1 ou qualquer outra coisa para Nomes2");
        Integer nome = sc.nextInt();

        if(nome == 1){
        Nomes1();
        }
        else {
            Nomes2();
        }
    }

    public static void Nomes1(){

        Scanner sc = new Scanner(System.in);

        // Leitura dos arrays
        System.out.print("Digite o tamanho do primeiro conjunto de nomes: ");
        int tamanho1 = sc.nextInt();
        String[] array1 = new String[tamanho1];
        for (int i = 0; i < tamanho1; i++) {
            System.out.print("Digite o nome da posição " + i + " do primeiro array: ");
            array1[i] = sc.next();
        }

        System.out.print("Digite o tamanho do segundo conjunto de nomes: ");
        int tamanho2 = sc.nextInt();
        String[] array2 = new String[tamanho2];
        for (int i = 0; i < tamanho2; i++) {
            System.out.print("Digite o nome da posição " + i + " do segundo array: ");
            array2[i] = sc.next();
        }

        // Concatenação dos arrays
        String[] resultado = new String[tamanho1 + tamanho2];
        int posicao = 0;



        for (int i = 0; i < tamanho1; i++) {
            resultado[posicao] = array1[i];
            posicao++;
        }

        for (int i = 0; i < tamanho2; i++) {
            resultado[posicao] = array2[i];
            posicao++;
        }

        // Impressão do resultado em colunas
        System.out.println("Resultado da concatenação:");
        System.out.println("Nomes 1\t\t\t\t\t\tNomes 2");
        for (int i = 0; i < resultado.length; i++) {
            if (i < tamanho1) {
                System.out.print(array1[i] + "\t\t\t");
            } else {
                //System.out.print("\t\t\t\t\t\t");
            }
            /*if (i - tamanho1 < tamanho2) {
                System.out.print(array2[i - tamanho1]);
            }*/
            if (i < tamanho2) {
                System.out.print("\t\t\t"+array2[i]);//Modificado
            }
            System.out.println();
        }

        sc.close();
    }

    public static void Nomes2(){

        Scanner sc = new Scanner(System.in);

        Map<String, String> lista = new HashMap<>();

        System.out.println("Informe os nomes e sexos (M ou F) separados por espaço (ex: João M):");
        while (sc.hasNext()) {
            String nome = sc.next();
            String sexo = sc.next();
            lista.put(nome, sexo);
            System.out.println("Deseja continuar? (S/N)");
            String continuar = sc.next();
            if (!continuar.equalsIgnoreCase("S")) {
                break;
            }
        }

        System.out.println("Lista de nomes e sexos:");
        for (Map.Entry<String, String> entry : lista.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }


}