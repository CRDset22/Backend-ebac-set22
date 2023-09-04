import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Participantes> lista = new Participantes().populaParticipantess();

        lista.stream().forEach(Participantes -> System.out.println(Participantes.getNome()));

        System.out.println("*********");
        System.out.println(" ");
        System.out.println("*********");

        lista.stream()
                .filter(Participantes -> Participantes.getEscolaridade().equals("Ensino Médio"))
                .forEach(p -> System.out.println(p.getNome() +" "+ p.getPais()+" -----> Turma do Ensino Médio"));

        System.out.println("*********");
        System.out.println(" ");
        System.out.println("*********");

        lista.stream()
                .filter(Participantes -> Participantes.getIdade() < 25)
                .forEach(p -> System.out.println(p.getNome() +" "+p.getIdade()+" "+ p.getPais()+" -----> Turma dos Menores de 25 anos"));


        System.out.println("*********");
        System.out.println(" ");
        System.out.println("*********");



        lista.stream()
                .filter(Participantes -> Participantes.getIdade() >= 30)
                .forEach(p -> System.out.println(p.getNome() +" "+p.getIdade()+" "+ p.getPais()+" -----> Turma dos 30 anos ou mais"));


        System.out.println("*********");
        System.out.println(" ");
        System.out.println("*********");



        Stream<Participantes> stream = lista.stream()
                .filter(Participantes -> Participantes.getSituacaoCivil().equals("Divorciado(a)"));

        stream.forEach(p -> System.out.println(p.getNome()+" -----> Turma dos Divorciados"));

        System.out.println("*********");
        System.out.println(" ");
        System.out.println("*********");


        Stream<Participantes> stream1 = lista.stream()
                .filter(Participantes -> Participantes.getCor().equals("Parda"));

        stream1.forEach(p -> System.out.println(p.getNome()+" "+ p.getPais()+" -----> Turma dos Pardos"));

        System.out.println("*********");
        System.out.println(" ");
        System.out.println("*********");


        Stream<Participantes> stream2 = lista.stream()
                .filter(Participantes -> Participantes.getProfissao().equals("Engenheiro(a)"));

        stream2.forEach(p -> System.out.println(p.getNome()+" "+ p.getPais()+" "+ p.getProfissao()+" -----> Turma dos Engenheiros"));

        System.out.println("*********");
        System.out.println(" ");
        System.out.println("*********");

        NumberFormat formatter = DecimalFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(3);


        lista.stream()
                .filter(Participantes -> Participantes.getSalario() < 10.000)
                .forEach(p -> System.out.println(p.getNome() + " " + p.getIdade() + " " + p.getPais() + " " +"$ "+formatter.format(p.getSalario()*1000)+" -----> Turma do Salário abaixo de $ 10,000"));



        System.out.println("*********");
        System.out.println(" ");
        System.out.println("*********");

        lista.stream()
                .filter(Participantes -> Participantes.getSalario() >= 20.000)
                .forEach(p -> System.out.println(p.getNome() + " " + p.getIdade() + " " + p.getPais() + " " +"$ "+formatter.format(p.getSalario()*1000)+" -----> Turma do Salário acima de $ 20,000"));

        System.out.println("*********");
        System.out.println(" ");
        System.out.println("*********");

        Stream<Participantes> stream4 = lista.stream()
                .filter(Participantes -> Participantes.getPais().equals("Brasil"));

        stream4.forEach(p -> System.out.println(p.getNome()+" -----> Turma do Brasil"));

        System.out.println("*********");
        System.out.println(" ");
        System.out.println("*********");

        Stream<Participantes> stream3 = lista.stream()
                .filter(Participantes -> Participantes.getGenero().equals("Feminino"));

        stream3.forEach(p -> System.out.println(p.getNome()+" -----> Turma das Meninas"));



    }
}