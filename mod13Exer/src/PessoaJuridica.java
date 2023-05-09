
public class PessoaJuridica extends Pessoa {

    PessoaFisica pf0 = new PessoaFisica();

    private String imovel;

    private Integer empregado;

    public String getImovel() {
        return imovel;
    }

    public void setImovel(String imovel) {

        this.imovel = "Casa em Jardins Paulista" ;
    }

    public Integer getEmpregado() {
        return empregado;
    }

    public void setEmpregado(Integer empregado) {
        this.empregado = empregado;
    }

    @Override
    public Double salario() {

        return 7.5 * pf0.salario();
    }
}
