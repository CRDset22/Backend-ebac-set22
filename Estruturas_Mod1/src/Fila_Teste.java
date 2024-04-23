
public class Fila_Teste{

    public static void main(String[] args) {
        Fila fila = new Fila(5);
        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);

        System.out.println("Frente da fila: " + fila.front());
        System.out.println("Fim da fila: " + fila.rear());
        System.out.println("Tamanho da fila: " + fila.size());

        System.out.println("Elementos removidos da fila:");
        while (!fila.isEmpty()) {
            System.out.println(fila.dequeue());
        }

        System.out.println("Tamanho da fila após remoção: " + fila.size());
    }

    /*
        Complexidade Assintotica

        Inserção, Remoção e Consulta:

            enqueue (inserir): Tempo O(1), Espaço O(1) - Adição rápida sem alocação extra.
            dequeue (remover): Tempo O(1), Espaço O(1) - Remoção rápida sem alocação extra.
            rear (final): Tempo O(1), Espaço O(1) - Consulta rápida sem alocação extra.
            front (frente): Tempo O(1), Espaço O(1) - Consulta rápida sem alocação extra.

            Com um array de tamanho fixo para implementar a fila e mantendo o controle do início e do fim da fila.
            Essa abordagem permite que as operações sejam realizadas em tempo constante,
            independentemente do número de elementos na fila.
     */


}




