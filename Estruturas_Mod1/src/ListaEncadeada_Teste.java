
public class ListaEncadeada_Teste {


    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        lista.push(new Node(10));
        lista.push(new Node(20));
        lista.push(new Node(30));
        lista.printList();

        lista.insert(1, new Node(15));
        lista.printList();

        lista.remove(2);
        lista.printList();

        Node removedNode = lista.pop();
        System.out.println("Nó removido do fim: " + removedNode.data);
        lista.printList();


        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);

        // Estabelecendo as referências next
        node1.next = node2;
        node2.next = node3;

        // Imprimindo os dados de cada nó
        System.out.println("Dados dos nós da lista encadeada:");
        System.out.println("Node 1: " + node1.data);
        System.out.println("Node 2: " + node1.next.data);
        System.out.println("Node 3: " + node1.next.next.data);


        // Criando a lista encadeada com três nós
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        // Percorrendo a lista encadeada e imprimindo os elementos
        System.out.println("Elementos da lista encadeada:");
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }


        /* Complexidade assintotica

            Inserção, Remoção e Consulta:

            push (inserir no final): Tempo O(n), Espaço O(1) - Adição lenta (n) sem alocação extra.
            pop (remover do final): Tempo O(n), Espaço O(1) - Remoção lenta (n) sem alocação extra.
            insert (inserir em índice): Tempo O(n), Espaço O(1) - Inserção lenta (n) sem alocação extra.
            remove (remover por índice): Tempo O(n), Espaço O(1) - Remoção lenta (n) sem alocação extra.
            elementAt (acessar por índice): Tempo O(n), Espaço O(1) - Acesso lento (n) sem alocação extra.

            No uso de memória, os métodos push, pop, insert e remove têm complexidade de tempo e espaço O(n),
            onde n é o número de elementos na lista. Isso ocorre devido à necessidade de percorrer a lista
            para adicionar, remover ou inserir elementos. O método elementAt tem complexidade de tempo O(n) e
            complexidade de espaço O(1), pois percorre a lista até o índice especificado, mas não aloca memória
            adicional.

         */
    }

}
