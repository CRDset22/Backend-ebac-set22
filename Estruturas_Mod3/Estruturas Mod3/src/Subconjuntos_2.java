
import java.util.ArrayList;
import java.util.List;
public class Subconjuntos_2 {

    public static void main(String[] args) {
        int[] conjunto = {1, 2, 3, 4};
        int n = 4;
        List<List<Integer>> subconjuntos = new ArrayList<>();
        encontrarSubconjuntos(conjunto, n, 0, new ArrayList<>(), subconjuntos);
        System.out.println(subconjuntos);
    }

    public static void encontrarSubconjuntos(int[] conjunto, int n, int inicio, List<Integer> atual, List<List<Integer>> subconjuntos) {
        if (atual.size() == n) {
            subconjuntos.add(new ArrayList<>(atual));
            return;
        }

        for (int i = inicio; i < conjunto.length; i++) {
            atual.add(conjunto[i]);
            encontrarSubconjuntos(conjunto, n, i + 1, atual, subconjuntos);
            atual.remove(atual.size() - 1);
        }
    }

}
