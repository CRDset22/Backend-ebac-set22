package motorista;

/**
 * Um cidadão que sempre foi balconista e como era entusiasta do "movimento uber" resolver ser tornar um, isso há dois anos virou um uber também.
 */
public class FabiUber {

    private String nome;
    private double altura;
    private int idade;
    private int faturamento_mês;
    private int prejuizo_mês;

    public String getNome() {
        return nome;
    }

    /**
     *
     * @param nome Nome do elemento: Fabio Uber Domeniku
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    /**
     *
     * @param altura Tem que ajustar o banco  o tempo todo para não bater a acabeça no teto
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    /**
     *
     * @param idade Sempre trabalhou como balconista e agora uber
     */
    public void setIdade(int idade) {
        this.idade = idade = idade;
    }

    public int getFaturamento_mês() {
        return faturamento_mês;
    }

    /**
     *
     * @param faturamento_mês Gasta mais do que ganha e isso fora as multas
     */
    public void setFaturamento_mês(int faturamento_mês) {
        this.faturamento_mês = faturamento_mês;
    }

    public int getPrejuizo_mês() {
        return prejuizo_mês;
    }

    /**
     *
     * @param prejuizo_mês Foram R$ 800,00 só de multa por alta velocidade
     */
    public void setPrejuizo_mês(int prejuizo_mês) {
        this.prejuizo_mês = prejuizo_mês;
    }
}


