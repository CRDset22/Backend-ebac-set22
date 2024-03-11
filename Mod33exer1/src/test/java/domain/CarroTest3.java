/**
 * 
 */
package domain;


import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import one.domain.Marca;
import one.domain.Carro;
import one.domain.Acessorio;
import one.domain.dao.MarcaDao;
import one.domain.dao.CarroDao;
import one.domain.dao.AcessorioDao;
import one.domain.dao.IMarcaDao;
import one.domain.dao.ICarroDao;
import one.domain.dao.IAcessorioDao;


/**
 * 
 */
public class CarroTest3 {
	
	private ICarroDao carroDao;
    private IAcessorioDao acessorioDao;
    private IMarcaDao marcaDao;

    public CarroTest3() {
        carroDao = new CarroDao();
        acessorioDao = new AcessorioDao();
        marcaDao = new MarcaDao();
    }

    @Test
    public void cadastrarCarro() {
        Carro carro = new Carro();
        Marca marca = criarMarca("01");
        Acessorio acessorio = CriarAcessorio("7A885B1");

        carro.setCodigo("123456");
        carro.setPlaca("ABC-1234");
        carro.setModelo("Gol");
        carro.setMarca(marca);
        carro.setAcessorios(acessorio);

        carro = carroDao.cadastrar(carro);

        assertNotNull(carro);
        assertNotNull(carro.getId());
    }

    private Acessorio CriarAcessorio(String codigo) {
    	Acessorio acessorio = new Acessorio();
    	acessorio.setCodigo(codigo);
    	acessorio.setDescricao("Ar Condicionado");
    	return acessorioDao.cadastrar(acessorio);
    }

    private Marca criarMarca(String codigo) {
        Marca marca = new Marca();
        marca.setCodigo(codigo);
        marca.setNome("Volkswagen");
        marca.setDescricao("Marca alemã");
        return marcaDao.cadastrar(marca);
    }


}
