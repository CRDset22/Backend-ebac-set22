package br.com.ebac_CadastroAnimal2.animal_service2.repositorios;

import br.com.ebac_CadastroAnimal2.animal_service2.entidades.Gato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;



public interface GatoRepository extends JpaRepository<Gato, Integer> {

        @Query("SELECT a FROM Gato a WHERE a.dataAdocao IS NULL ORDER BY a.dataEntrada")
        List<Gato> findNotAdoptedone();

        @Query("SELECT a FROM Gato a WHERE a.dataAdocao IS NOT NULL ")
        List<Gato> findAdoptedone();

    }

