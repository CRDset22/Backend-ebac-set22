
import java.util.ArrayList;
import java.util.List;
public class Subconjuntos_1 {

    public static void main(String[] args) {
        int[] conjunto = {1, 2, 3,10, 48, 15};
        int n = 2;
        List<List<Integer>> resultado = encontrarSubconjuntos(conjunto, n);
        System.out.println(resultado);
    }

    public static List<List<Integer>> encontrarSubconjuntos(int[] conjunto, int n) {
        List<List<Integer>> subconjuntos = new ArrayList<>();
        encontrarSubconjuntosRecursivo(conjunto, n, 0, new ArrayList<>(), subconjuntos);
        return subconjuntos;
    }

    private static void encontrarSubconjuntosRecursivo(int[] conjunto, int n, int inicio, List<Integer> atual, List<List<Integer>> subconjuntos) {
        if (atual.size() == n) {
            subconjuntos.add(new ArrayList<>(atual));
            return;
        }

        for (int i = inicio; i < conjunto.length; i++) {
            atual.add(conjunto[i]);
            encontrarSubconjuntosRecursivo(conjunto, n, i + 1, atual, subconjuntos);
            atual.remove(atual.size() - 1);
        }
    }
}
