import java.util.ArrayList;
import java.util.List;

public class Troco {

    public static void main(String[] args) {
        int quantia = 18;
        int[] moedas = {5, 2, 1};
        List<Integer> troco = darTroco(quantia, moedas);
        System.out.println(troco);
    }

    public static List<Integer> darTroco(int quantia, int[] moedas) {
        List<Integer> troco = new ArrayList<>();
        int indiceMoeda = 0;

        while (quantia > 0 && indiceMoeda < moedas.length) {
            if (moedas[indiceMoeda] <= quantia) {
                troco.add(moedas[indiceMoeda]);
                quantia -= moedas[indiceMoeda];
            } else {
                indiceMoeda++;
            }
        }

        return troco;
    }

}
