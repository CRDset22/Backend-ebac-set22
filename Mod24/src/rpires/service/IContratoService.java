package rpires.service;

import dao.ContratoDao;


public interface IContratoService {
    String salvar();


    String buscar();

    int excluir() ;


    String atualizar();


}


    //TODO
    //Fazer métodos de buscar, excluir e atualizar