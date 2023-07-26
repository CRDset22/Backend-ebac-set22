import java.util.List;
import java.util.ArrayList;

public class Garagem<T extends Carro>{

    private List<T> carros;

    public Garagem() {
        carros = new ArrayList<T>();
    }

    public void adicionarCarro(T carro) {
        carros.add(carro);
    }

    public List<Carro> getCarros() {
        return (List<Carro>) carros;
    }


}
