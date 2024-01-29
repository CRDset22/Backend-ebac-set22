/**
 * 
 */
package one.services.service;

import one.domain.Cliente;
import one.exceptions.DAOException;
import one.exceptions.TipoChaveNaoEncontradaException;
import one.services.generic.IGenericService;


public interface IClienteService extends IGenericService<Cliente, Long> {

//	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
	Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
