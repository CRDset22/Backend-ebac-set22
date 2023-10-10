package dao;

/**
 * @author rodrigo.pires
 */
public class ContratoDao implements IContratoDao {


    @Override
    public String salvar() {
        throw new UnsupportedOperationException("Não funciona com o banco");
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


