/**
 * 
 */
package one.services.service;

import one.domain.dao.IProdutoDAO;
import one.domain.Produto;
import one.services.generic.GenericService;


public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
