package One;

/**
 * A classe DocumentaCalc tem o objetivo de documentar a classe Calculadora.
 * A classe Calculadora implementa operações matemáticas básicas, como adição, subtração, multiplicação e divisão.
 *
 */

    /* Você conseguiria entender o código que escreveu sem documentá-lo? Justifique sua resposta.
    Resposta: Sim. Por ser um código mais simples, mas para boa prática de programação, facilitar a compreensão,
    promover colaboração, auxiliar na manutenção, reduzir erros de interpretação, melhorar legibilidade, facilitar
    depuração, melhorar integração, reutilização, aumentar confiança no código e transição de equipe, sim documentaria
    tanto um código simples quanto um mais complexo.
     */

public class DocumentaCalculadora {

    /**
     * Realiza a adição de dois números inteiros.
     *
     * @param a O primeiro número a ser somado.
     * @param b O segundo número a ser somado.
     * @return O resultado da adição dos números a e b.
     */
    private int adicionar(int a, int b) {
        return a + b;
    }

    /**
     * Realiza a subtração de dois números inteiros.
     *
     * @param a O número do qual será subtraído o valor de b.
     * @param b O número que será subtraído de a.
     * @return O resultado da subtração de a por b.
     */
    private int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Realiza a multiplicação de dois números inteiros.
     *
     * @param a O primeiro número a ser multiplicado.
     * @param b O segundo número a ser multiplicado.
     * @return O resultado da multiplicação dos números a e b.
     */
    private int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Realiza a divisão de dois números inteiros.
     *
     * @param a O dividendo da divisão.
     * @param b O divisor da divisão.
     * @return O resultado da divisão de a por b.
     * @throws ArithmeticException Se o divisor b for zero, uma exceção é lançada.
     */
    private int dividir(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

}
