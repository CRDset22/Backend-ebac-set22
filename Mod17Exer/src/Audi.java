public class Audi implements Carro {

    private String marca;
    private String modelo;
    private String paisOrigin;
    private int ano;

    public Audi(String modelo, int ano) {
        this.marca = "Audi";
        this.modelo = modelo;
        this.ano = ano;

    }

    public Audi(String modelo, int ano, String paisOrigin) {
        this.marca = "Audi";
        this.modelo = modelo;
        this.ano = ano;
        this.paisOrigin = paisOrigin;

    }





    @Override
    public String getpaisOrigin() {
        return paisOrigin;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public int getAno() {
        return ano;
    }
}
