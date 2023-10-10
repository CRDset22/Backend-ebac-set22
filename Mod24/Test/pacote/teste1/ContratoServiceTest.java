package pacote.teste1;
import dao.ContratoDao;
import org.junit.Assert;
import org.junit.Test;
import dao.IContratoDao;
import dao.mocks.ContratoDaoMock;
import rpires.service.ContratoService;
import rpires.service.IContratoService;

public class ContratoServiceTest {

    @Test
    public void salvarTest(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void TestDeErroEsperado(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("sucesso", retorno);
    }

    @Test
    public void buscaTest(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar();
        Assert.assertEquals("buscando arquivo", retorno);
    }

    @Test
    public void excluirTest(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        int retorno = service.excluir();
        Assert.assertEquals(12, retorno);
    }

    @Test
    public void atualizarTest(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.atualizar();
        Assert.assertEquals("Atualizado", retorno);
    }


}
