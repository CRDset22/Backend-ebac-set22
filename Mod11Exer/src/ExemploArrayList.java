import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class ExemploArrayList {

    public static void main(String args[]) {

        exemploListaSimples1();
        exemploListaSimples2();
    }


    private static void exemploListaSimples1(){
        System.out.println(" ");
        System.out.println("exemploListaSimples1***************************************************************");
        System.out.println(" ");
        List<String> lista = new ArrayList<>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        lista.add("Fulano Qualquer");
        lista.add("Beltrano");
        lista.add("Ciclano");
        lista.add("Otaviano");


        String[] nomes = new String[lista.size()];
        System.out.println("O tamanho da lista é " + lista.size());

        System.out.println(" ");
        System.out.println(lista);
        System.out.println("O nome dessa pessoa é " + lista.get(3));
        System.out.println(" ");
        for (int i = 0; i < lista.size(); i++) {
            nomes[i] = lista.get(i);
        }

        Arrays.sort(nomes);

        for (String nome : nomes) {
            System.out.println(nome);
        }
        System.out.println(" ");
        System.out.println(" ");

    }

    private static void exemploListaSimples2(){
        System.out.println(" ");
        System.out.println("exemploListaSimples2*********************************************************************");
        System.out.println(" ");

        List<Pessoa> grupo = new ArrayList<>();

        Pessoa a = new Pessoa("Claudia","Feminina","Dançarina",5000);
        Pessoa b = new Pessoa("Ricardo","Masculino","Eletricista",3500);
        Pessoa c = new Pessoa("Manuel","Masculino","Padeiro",2890);
        Pessoa d = new Pessoa("Amanda","Feminina","Telemarketing",2700);

        grupo.add(a);
        grupo.add(b);
        grupo.add(c);
        grupo.add(d);

        System.out.println(grupo);
        System.out.println(a.getNome()+" "+a.getgenero()+" "+a.getprofissao()+" "+a.getsalario());
        System.out.println(b.getNome()+" "+b.getgenero()+" "+b.getprofissao()+" "+b.getsalario());
        System.out.println(c.getNome()+" "+c.getgenero()+" "+c.getprofissao()+" "+c.getsalario());
        System.out.println(d.getNome()+" "+d.getgenero()+" "+d.getprofissao()+" "+d.getsalario());
    }
}
