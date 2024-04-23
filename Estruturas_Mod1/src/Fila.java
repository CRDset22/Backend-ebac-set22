public class Fila {
    private int[] elementos;
    private int tamanho;
    private int inicio;
    private int fim;

    public Fila(int capacidade) {
        elementos = new int[capacidade];
        tamanho = 0;
        inicio = 0;
        fim = -1;
    }

    public void enqueue(int elemento) {
        if (tamanho == elementos.length) {
            System.out.println("Erro: Fila cheia");
            return;
        }
        fim = (fim + 1) % elementos.length;
        elementos[fim] = elemento;
        tamanho++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Erro: Fila vazia");
            return -1; // Valor sentinela para indicar erro
        }
        int elementoRemovido = elementos[inicio];
        inicio = (inicio + 1) % elementos.length;
        tamanho--;
        return elementoRemovido;
    }

    public int rear() {
        if (isEmpty()) {
            System.out.println("Erro: Fila vazia");
            return -1; // Valor sentinela para indicar erro
        }
        return elementos[fim];
    }

    public int front() {
        if (isEmpty()) {
            System.out.println("Erro: Fila vazia");
            return -1; // Valor sentinela para indicar erro
        }
        return elementos[inicio];
    }

    public int size() {
        return tamanho;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }


}
