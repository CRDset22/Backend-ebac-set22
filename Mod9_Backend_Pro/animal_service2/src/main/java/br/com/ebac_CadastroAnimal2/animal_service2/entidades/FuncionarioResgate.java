package br.com.ebac_CadastroAnimal2.animal_service2.entidades;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.TemporalType;
import org.springframework.data.jpa.repository.Temporal;
import jakarta.persistence.*;
import java.sql.Date;



@Entity
public class FuncionarioResgate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private int quantidadeAnimaisResgatados;

    @Column(nullable = false)
    private String estadoAnimal;

    @Column(nullable = false)
    private Date dataResgate;


    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeAnimaisResgatados() {
        return quantidadeAnimaisResgatados;
    }

    public void setQuantidadeAnimaisResgatados(int quantidadeAnimaisResgatados) {
        this.quantidadeAnimaisResgatados = quantidadeAnimaisResgatados;
    }

    public String getEstadoAnimal() {
        return estadoAnimal;
    }

    public void setEstadoAnimal(String estadoAnimal) {
        this.estadoAnimal = estadoAnimal;
    }

    public Date getDataResgate() {
        return dataResgate;
    }

    public void setDataResgate(Date dataResgate) {
        this.dataResgate = dataResgate;
    }
}
