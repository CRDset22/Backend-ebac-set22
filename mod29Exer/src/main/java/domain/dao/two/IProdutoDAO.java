/**
 * 
 */
package domain.dao.two;
import java.util.List;

import domain.two.Produto;

/**
 * 
 */
public interface IProdutoDAO {
	
	Integer cadastrar(Produto produto) throws Exception;

    Integer atualizar(Produto produto) throws Exception;

    Produto buscar(String codigo) throws Exception;

    Integer excluir(Produto produto) throws Exception;

    List<Produto> buscarTodos() throws Exception;

}
