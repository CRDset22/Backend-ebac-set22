package rpires.service;

import dao.ContratoDao;
import dao.IContratoDao;
import dao.IContratoDao;

/**
 * @author rodrigo.pires
 */
public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }



    @Override
    public String salvar() {
        contratoDao.salvar();
        return "sucesso";
    }

    @Override
    public String buscar() {
        return "buscando arquivo";
    }

    @Override
    public int excluir() {
        return 12;
    }


    @Override
    public String atualizar() {

        return "Atualizado";
    }
}
