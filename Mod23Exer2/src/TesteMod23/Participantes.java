package TesteMod23;

import java.util.List;

public class Participantes {
    private int idade;
    private double salario;
    private String nome;
    private String pais;
    private String escolaridade;
    private String profissao;
    private String situacaoCivil;
    private double altura;
    private String cor;

    private String genero;

    public Participantes() {

    }

    public Participantes(String nome, String pais, int idade, double altura, String cor, String genero) {
        this.nome = nome;
        this.pais = pais;
        this.idade = idade;
        this.altura = altura;
        this.cor = cor;
        this.genero = genero;
    }

    public Participantes(String nome, String pais, int idade, double altura, String cor,
                         String escolaridade, String profissao, double salario, String situacaoCivil, String genero) {
        this.nome = nome;
        this.pais = pais;
        this.idade = idade;
        this.altura = altura;
        this.cor = cor;
        this.escolaridade = escolaridade;
        this.profissao = profissao;
        this.salario = salario;
        this.situacaoCivil = situacaoCivil;
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getSituacaoCivil() {
        return situacaoCivil;
    }

    public void setSituacaoCivil(String situacaoCivil) {
        this.situacaoCivil = situacaoCivil;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String cor) {
        this.genero = genero;
    }

    public List<Participantes> populaParticipantes() {
        Participantes Participantes1 = new Participantes("Alice","Brasil",20,1.55,"Branca","Ensino Médio","Costureiro(a)",5.000,"Solteiro(a)","Feminino");
        Participantes Participantes2 = new Participantes("Bruno","Uruguai",22,1.70,"Parda","Ensino Fundamental","Vendedor(a)",7.000,"Casado(a)","Masculino");
        Participantes Participantes3 = new Participantes("Camila","Argentina",25,1.66,"Branca","Superior","Médico(a)",13.000,"Solteiro(a)","Feminino");
        Participantes Participantes4 = new Participantes("Daniel","Chile",31,1.75,"Parda","Ensino Médio","Agricultor(a)",18.000,"Casado(a)","Masculino");
        Participantes Participantes5 = new Participantes("Gabriela","França",30,1.70,"Branca","Superior","Engenheiro(a)",31.000,"Solteiro(a)","Feminino");
        Participantes Participantes6 = new Participantes("João","Brasil",30,1.75,"Branca","Superior","Engenheiro(a)",8.000,"Casado(a)","Masculino");
        Participantes Participantes7 = new Participantes("Laura","Inglaterra",27,1.77,"Branca","Superior","Desenvolvedor(a) Web",12.000,"Divorciado(a)","Feminino");
        Participantes Participantes8 = new Participantes("Monica","Brasil",24,1.60,"Amarela","Doutorado","Médico(a)",17.000,"Solteiro(a)","Feminino");
        Participantes Participantes9 = new Participantes("Fernando","Uruguai",34,1.78,"Parda","Superior","Engenheiro(a)",9.000,"Divorciado(a)","Masculino");
        Participantes Participantes10 = new Participantes("Gary","Estados Unidos",29,1.91,"Branca","Superior","Analista",29.000,"Solteiro(a)","Masculino");

        return List.of(Participantes1,Participantes2,Participantes3,Participantes4,Participantes5,Participantes6,Participantes7,Participantes8,Participantes9,Participantes10);
    }

    @Override
    public String toString() {
        return "TesteMod23.Participantes{" +
                "idade=" + idade +
                ", salario=" + salario +
                ", nome='" + nome + '\'' +
                ", pais='" + pais + '\'' +
                ", escolaridade='" + escolaridade + '\'' +
                ", profissao='" + profissao + '\'' +
                ", situacaoCivil='" + situacaoCivil + '\'' +
                ", altura=" + altura +
                ", cor='" + cor + '\'' +
                '}';
    }
}
