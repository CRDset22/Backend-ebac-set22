import java.util.Arrays;

public class NQueens {





    public static void main(String[] args) {
        int n = 4; // Número de rainhas e tamanho do tabuleiro
        resolverNQueens(n);
    }

    public static void resolverNQueens(int n) {
        int[] rainhas = new int[n];
        Arrays.fill(rainhas, -1); // Inicializando todas as posições das rainhas como -1
        colocarRainhas(rainhas, 0, n);
    }

    public static void colocarRainhas(int[] rainhas, int linha, int n) {
        if (linha == n) { // Todas as rainhas foram colocadas com sucesso
            imprimirSolucao(rainhas);
            return;
        }

        for (int coluna = 0; coluna < n; coluna++) {
            if (ehValido(rainhas, linha, coluna)) {
                rainhas[linha] = coluna; // Coloca uma rainha na posição válida
                colocarRainhas(rainhas, linha + 1, n); // Chama recursivamente para a próxima linha
                rainhas[linha] = -1; // Backtrack, removendo a rainha para tentar outras posições
            }
        }
    }

    public static boolean ehValido(int[] rainhas, int linha, int coluna) {
        for (int i = 0; i < linha; i++) {
            // Verifica se a nova rainha ataca ou não outras rainhas já colocadas
            if (rainhas[i] == coluna || rainhas[i] - i == coluna - linha || rainhas[i] + i == coluna + linha) {
                return false;
            }
        }
        return true;
    }

    public static void imprimirSolucao(int[] rainhas) {
        int n = rainhas.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (rainhas[i] == j) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }


}
