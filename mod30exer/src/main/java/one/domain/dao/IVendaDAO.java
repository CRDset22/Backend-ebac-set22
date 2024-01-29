/**
 * 
 */
package one.domain.dao;

import one.domain.dao.generic.IGenericDAO;
import one.domain.Venda;
import one.exceptions.DAOException;
import one.exceptions.TipoChaveNaoEncontradaException;


public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
