public class Pilha {
    private int[] elementos;
    private int topo;

    public Pilha(int capacidade) {
        elementos = new int[capacidade];
        topo = -1; // Inicializa o topo como -1 (pilha vazia)
    }

    public void push(int elemento) {
        if (topo == elementos.length - 1) {
            System.out.println("Erro: Pilha cheia");
            return;
        }
        topo++;
        elementos[topo] = elemento;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Erro: Pilha vazia");
            return -1; // Valor sentinela para indicar erro
        }
        int elemento = elementos[topo];
        topo--;
        return elemento;
    }

    public int top() {
        if (isEmpty()) {
            System.out.println("Erro: Pilha vazia");
            return -1; // Valor sentinela para indicar erro
        }
        return elementos[topo];
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public int size() {
        return topo + 1;
    }

    public int countElements() {
        int count = 0;
        for (int i = 0; i <= topo; i++) {
            count++;
        }
        return count;
    }


}

