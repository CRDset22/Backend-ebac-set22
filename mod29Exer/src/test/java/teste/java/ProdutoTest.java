/**
 * 
 */
package teste.java;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import domain.dao.two.IProdutoDAO;
import domain.dao.two.ProdutoDAO;
import domain.two.Produto;

/**
 * 
 */
public class ProdutoTest {
	
	private IProdutoDAO produtoDAO;

    @Test
    public void cadastrarTest() throws Exception {
        produtoDAO = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigo("1001");
        produto.setNome("Produto Teste");
        produto.setCidade("Cidade Teste");
        produto.setQuantidade(10);
        produto.setData("2023-01-01");

        Integer countCad = produtoDAO.cadastrar(produto);
        assertTrue(countCad == 1);

        Produto produtoBD = produtoDAO.buscar("1001");
        assertNotNull(produtoBD);
        assertEquals(produto.getCodigo(), produtoBD.getCodigo());
        assertEquals(produto.getNome(), produtoBD.getNome());
        assertEquals(produto.getCidade(), produtoBD.getCidade());
        assertEquals(produto.getQuantidade(), produtoBD.getQuantidade());
        assertEquals(produto.getData(), produtoBD.getData());

        Integer countDel = produtoDAO.excluir(produtoBD);
        assertTrue(countDel == 1);
    }

    @Test
    public void buscarTest() throws Exception {
        produtoDAO = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigo("2002");
        produto.setNome("Produto Teste 2");
        produto.setCidade("Cidade Teste 2");
        produto.setQuantidade(5);
        produto.setData("2023-02-01");

        Integer countCad = produtoDAO.cadastrar(produto);
        assertTrue(countCad == 1);

        Produto produtoBD = produtoDAO.buscar("2002");
        assertNotNull(produtoBD);
        assertEquals(produto.getCodigo(), produtoBD.getCodigo());
        assertEquals(produto.getNome(), produtoBD.getNome());
        assertEquals(produto.getCidade(), produtoBD.getCidade());
        assertEquals(produto.getQuantidade(), produtoBD.getQuantidade());
        assertEquals(produto.getData(), produtoBD.getData());

        Integer countDel = produtoDAO.excluir(produtoBD);
        assertTrue(countDel == 1);
    }

    @Test
    public void excluirTest() throws Exception {
        produtoDAO = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigo("3003");
        produto.setNome("Produto Teste 3");
        produto.setCidade("Cidade Teste 3");
        produto.setQuantidade(20);
        produto.setData("2023-03-01");

        Integer countCad = produtoDAO.cadastrar(produto);
        assertTrue(countCad == 1);

        Produto produtoBD = produtoDAO.buscar("3003");
        assertNotNull(produtoBD);
        assertEquals(produto.getCodigo(), produtoBD.getCodigo());
        assertEquals(produto.getNome(), produtoBD.getNome());
        assertEquals(produto.getCidade(), produtoBD.getCidade());
        assertEquals(produto.getQuantidade(), produtoBD.getQuantidade());
        assertEquals(produto.getData(), produtoBD.getData());

        Integer countDel = produtoDAO.excluir(produtoBD);
        assertTrue(countDel == 1);
    }

    @Test
    public void buscarTodosTest() throws Exception {
        produtoDAO = new ProdutoDAO();

        Produto produto1 = new Produto();
        produto1.setCodigo("4004");
        produto1.setNome("Produto Teste 4");
        produto1.setCidade("Cidade Teste 4");
        produto1.setQuantidade(15);
        produto1.setData("2023-04-01");

        Integer countCad1 = produtoDAO.cadastrar(produto1);
        assertTrue(countCad1 == 1);

        Produto produto2 = new Produto();
        produto2.setCodigo("5005");
        produto2.setNome("Produto Teste 5");
        produto2.setCidade("Cidade Teste 5");
        produto2.setQuantidade(8);
        produto2.setData("2023-05-01");

        Integer countCad2 = produtoDAO.cadastrar(produto2);
        assertTrue(countCad2 == 1);

        List<Produto> list = produtoDAO.buscarTodos();
        assertNotNull(list);
        assertEquals(2, list.size());

        int countDel = 0;
        for (Produto prod : list) {
            produtoDAO.excluir(prod);
            countDel++;
        }
        assertEquals(list.size(), countDel);

        list = produtoDAO.buscarTodos();
        assertEquals(list.size(), 0);
    }

    @Test
    public void atualizarTest() throws Exception {
        produtoDAO = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigo("6006");
        produto.setNome("Produto Teste 6");
        produto.setCidade("Cidade Teste 6");
        produto.setQuantidade(12);
        produto.setData("2023-06-01");

        Integer countCad = produtoDAO.cadastrar(produto);
        assertTrue(countCad == 1);

        Produto produtoBD = produtoDAO.buscar("6006");
        assertNotNull(produtoBD);
        assertEquals(produto.getCodigo(), produtoBD.getCodigo());
        assertEquals(produto.getNome(), produtoBD.getNome());
        assertEquals(produto.getCidade(), produtoBD.getCidade());
        assertEquals(produto.getQuantidade(), produtoBD.getQuantidade());
        assertEquals(produto.getData(), produtoBD.getData());

        produtoBD.setCodigo("7007");
        produtoBD.setNome("Produto Atualizado");
        produtoBD.setCidade("Cidade Atualizada");
        produtoBD.setQuantidade(25);
        produtoBD.setData("2023-07-01");

        Integer countUpdate = produtoDAO.atualizar(produtoBD);
        assertTrue(countUpdate == 1);

        Produto produtoBD1 = produtoDAO.buscar("6006");
        assertNull(produtoBD1);

        Produto produtoBD2 = produtoDAO.buscar("7007");
        assertNotNull(produtoBD2);
        assertEquals(produtoBD.getId(), produtoBD2.getId());
        assertEquals(produtoBD.getCodigo(), produtoBD2.getCodigo());
        assertEquals(produtoBD.getNome(), produtoBD2.getNome());
        assertEquals(produtoBD.getCidade(), produtoBD2.getCidade());
        assertEquals(produtoBD.getQuantidade(), produtoBD2.getQuantidade());
        assertEquals(produtoBD.getData(), produtoBD2.getData());

        List<Produto> list = produtoDAO.buscarTodos();
        for (Produto prod : list) {
            produtoDAO.excluir(prod);
        }
    }

}
