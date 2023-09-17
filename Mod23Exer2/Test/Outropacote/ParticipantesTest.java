package Outropacote;
import TesteMod23.Participantes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

    public class ParticipantesTest {

    @Test
        void testFiltrarGeneroFeminino() {

            List<Participantes> lista;

            Participantes participantes = new Participantes();
            lista = participantes.populaParticipantes();

            Stream<Participantes> stream3 = lista.stream()
                    .filter(participante -> participante.getGenero().equals("Feminino"));

            List<Participantes> mulheres = stream3.collect(Collectors.toList()).stream()
                    .filter(participante -> participante.getGenero().equals("Feminino"))
                    .collect(Collectors.toList());


            // Verificar se o tamanho da lista é o esperado
            assertEquals(5, mulheres.size());

            // Verificar o nome de cada mulher na lista
            List<String> nomesEsperados = Arrays.asList("Alice", "Camila", "Gabriela", "Laura", "Monica");
            Assertions.assertIterableEquals(nomesEsperados, mulheres.stream().map(Participantes::getNome).collect(Collectors.toList()));
        }

}
