package dao.mocks;
import dao.ContratoDao;
import dao.IContratoDao;

/**
 * @author rodrigo.pires
 */
public class ContratoDaoMock implements IContratoDao {


    @Override
    public String salvar() {
        return null;
    }

    @Override
    public String buscar() {
        return null;
    }

    @Override
    public int excluir() {
        return 0;
    }

    @Override
    public String atualizar() {
        return null;
    }
}
