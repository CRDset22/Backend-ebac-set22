package br.com.ebac_CadastroAnimal2.animal_service2.repositorios;

import br.com.ebac_CadastroAnimal2.animal_service2.entidades.Cachorro;
import br.com.ebac_CadastroAnimal2.animal_service2.entidades.FuncionarioResgate;
import br.com.ebac_CadastroAnimal2.animal_service2.entidades.Gato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ResgateRepository extends JpaRepository<FuncionarioResgate, Integer> {

    @Query("SELECT a FROM FuncionarioResgate a WHERE a.quantidadeAnimaisResgatados > 30 ")
    List<FuncionarioResgate> above30any();
}
