public class Pilha_Teste {
    public static void main(String[] args) {



        Pilha pilha = new Pilha(5);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);



        System.out.println("Topo da pilha: " + pilha.top());
        System.out.println("Tamanho da pilha: " + pilha.size());

        System.out.println("Elementos retirados da pilha:");
        while (!pilha.isEmpty()) {
            System.out.println(pilha.pop());
        }

        System.out.println("A pilha está vazia ? " + pilha.isEmpty());

        System.out.println("Tamanho da pilha após retirada: " + pilha.size());

        /* Complexidade Assintotica

        Inserção e Remoção em Pilhas:

            Push (inserir):
            Tempo: O(1) - Rápido, apenas uma atribuição.
            Espaço: O(1) - Eficiente, sem alocação extra.

            Pop (remover):
            Tempo: O(1) - Rápido, apenas uma atribuição.
            Espaço: O(1) - Eficiente, sem alocação extra.

            Usando um array de tamanho fixo para implementar a pilha. Se estivéssemos usando uma lista ligada,
            por exemplo, a complexidade de tempo de push e pop poderia ser diferente (O(1) para pop e O(n)
            para push em uma lista ligada simplesmente encadeada, por exemplo).

         */





    }
}