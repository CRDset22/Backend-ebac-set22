/**
 * 
 */
package one.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import one.domain.Produto;
import one.domain.dao.IProdutoDao;
import one.domain.dao.ProdutoDao;

/**
 * 
 */
public class ProdutoTest {
	
	private IProdutoDao produtoDao;
	
	public ProdutoTest() {
		produtoDao = new ProdutoDao();
	}
	
	@Test
	public void cadastrar() {
		Produto prod = new Produto();
		prod.setCodigo("A1K48LL256");
		prod.setNome("Bitcoin");
		prod.setDescricao("Kriptomoeda");
		prod = produtoDao.cadastrar(prod);
		
		assertNotNull(prod);
		assertNotNull(prod.getId());
	}

}
