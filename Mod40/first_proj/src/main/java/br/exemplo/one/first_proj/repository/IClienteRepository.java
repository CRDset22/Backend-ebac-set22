package br.exemplo.one.first_proj.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.exemplo.one.first_proj.domain.Cliente;


@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Long>{

}
