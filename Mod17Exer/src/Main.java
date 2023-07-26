import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Garagem<Carro> garagem = new Garagem<>();

        Carro audi1 = new Audi("A4", 2020,"Alemanha");
        Carro audi2 = new Audi("Q5", 2021,"Alemanha");
        Carro hyundai1 = new Hyundai("i30", 2019,"Coréia do Sul");
        Carro hyundai2 = new Hyundai("Tucson", 2022,"Coréia do Sul");

        garagem.adicionarCarro(audi1);
        garagem.adicionarCarro(audi2);
        garagem.adicionarCarro(hyundai1);
        garagem.adicionarCarro(hyundai2);

        List<Carro> carrosNaGaragem = garagem.getCarros();
        for (Carro carro : carrosNaGaragem) {
            System.out.println("Marca: " + carro.getMarca() + ", Modelo: " + carro.getModelo() + ", Ano: " + carro.getAno()+
                    " País de Origem => " + carro.getpaisOrigin());
        }
    }
}