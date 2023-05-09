
public class PessoaFisica extends Pessoa {


    private String imovel;

    private Integer patrao;

    public String getImovel() {

        return imovel;
    }

    public void setImovel(String imovel) {

        this.imovel = imovel;
    }



    @Override
    public Double salario() {

        return 3500.0;

    }
}
