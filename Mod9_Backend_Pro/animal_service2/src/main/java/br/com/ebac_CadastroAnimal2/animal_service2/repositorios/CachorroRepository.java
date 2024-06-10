package br.com.ebac_CadastroAnimal2.animal_service2.repositorios;

import br.com.ebac_CadastroAnimal2.animal_service2.entidades.Cachorro;
import br.com.ebac_CadastroAnimal2.animal_service2.entidades.FuncionarioResgate;
import br.com.ebac_CadastroAnimal2.animal_service2.entidades.Gato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface CachorroRepository extends JpaRepository<Cachorro, Integer> {

        @Query("SELECT a FROM Cachorro a WHERE a.dataAdocao IS NULL ORDER BY a.dataEntrada")
        List<Cachorro> findNotAdopted();

        @Query("SELECT a FROM Cachorro a WHERE a.dataAdocao IS NOT NULL ")
        List<Cachorro> findAdopted();

    }



    /*public interface FuncionarioResgateRepository extends JpaRepository<FuncionarioResgate, Integer> {
    }*/

