public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Cliente cliente = new Cliente(1,"Claudio","claudio.americo@bol.com");
        Produto produto = new Produto(12,"Ventilador",150.00);

        Class<Cliente> clienteClass = Cliente.class;
        if (clienteClass.isAnnotationPresent(Tabela1.class)) {
            Tabela1 tabelaAnnotation = clienteClass.getAnnotation(Tabela1.class);
            System.out.println("Classe Cliente representa a tabela 1: " + tabelaAnnotation.tabela());
        }

        Class<Produto> produtoClass = Produto.class;
        if (produtoClass.isAnnotationPresent(Tabela2.class)) {
            Tabela2 tabelaAnnotation = produtoClass.getAnnotation(Tabela2.class);
            System.out.println("Classe Produto representa a tabela 2: " + tabelaAnnotation.tabela());
        }

        System.out.println("O "+cliente.getNome()+" comprou um "+produto.getNome()+" no valor de R$"+produto.getPreco()+
                " se ele tivesse olhado o email dele ("+cliente.getEmail()+") , teria comprado mais barato.");


    }
}