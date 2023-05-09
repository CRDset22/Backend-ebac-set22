public class Main {
    public static void main(String[] args) {
        System.out.println(" ");
        PessoaFisica pf0 = new PessoaFisica();
        PessoaFisica pf1 = new PessoaFisica();
        PessoaJuridica pj = new PessoaJuridica();

        pf0.setNome("Osbaldo");
        pf0.setCpf(123);
        pf0.setCarro("Fusca 2000");
        pf0.setImovel("Terreno em Itaquera");

        pf1.setNome("Afanásio");
        pf1.setCpf(125);
        pf1.setCarro("Nissan 2005");
        pf1.setImovel("Casa em Itapevi");

        pj.setNome("Garcia");
        pj.setCpf(456);
        pj.setCarro("Cheroke");
        pj.setImovel("");
        pj.setEmpregado(2);

        System.out.println("Nome do empregado "+pf0.getNome()+", sálario R$"+pf0.salario());
        System.out.println("Nome do empregado "+pf1.getNome()+", sálario R$"+(pf1.salario()+(pf1.salario()*0.55)));
        System.out.println("Nome do patrão "+pj.getNome()+ ", sálario do patrão R$"+pj.salario());
        System.out.println("");
        System.out.println("Moradia do "+pf0.getNome()+" fica em um "+ pf0.getImovel());
        System.out.println("Moradia do "+pf1.getNome()+" fica em uma "+ pf1.getImovel());
        System.out.println("Moradia do "+pj.getNome()+" fica em uma "+ pj.getImovel());
        System.out.println("");
        System.out.println("Carro do "+pf0.getNome()+" é um "+ pf0.getCarro());
        System.out.println("Carro do "+pf1.getNome()+" é um "+ pf1.getCarro());
        System.out.println("Carro do "+pj.getNome()+" é um "+ pj.getCarro());
    }
}