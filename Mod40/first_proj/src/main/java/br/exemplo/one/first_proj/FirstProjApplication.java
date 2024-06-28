package br.exemplo.one.first_proj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.exemplo.one.first_proj.domain.Cliente;
import br.exemplo.one.first_proj.repository.IClienteRepository;

@SpringBootApplication
@Configuration
@EnableJpaRepositories(basePackages = "br.exemplo.one.first_proj.repository")
@EntityScan("br.exemplo.one.first_proj.*")  
@ComponentScan(basePackages = "br.exemplo.one.first_proj")
public class FirstProjApplication implements CommandLineRunner {
	
	private static final Logger log = LoggerFactory.getLogger(FirstProjApplication.class);
	
	@Autowired
	private IClienteRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(FirstProjApplication.class, args);
	}
	
	@Override
    public void run(String... args) throws Exception {
        log.info("StartApplication...");
        
        Cliente cliente1 = createCliente("Osbaldo", "osbaldo@dibalde.com", 12312312310L, 10203040L, "Rua do Balde", 102, "Dos Baldes", "SP");
        Cliente cliente2 = createCliente("Isnaldo", "isnaldo@sounaldo.com", 98765432100L, 20304050L, "Rua do Ronaldo", 203, "Solouco", "RJ");
        Cliente cliente3 = createCliente("Asnésio", "asnesio@semremedio.com", 11122233344L, 30405060L, "Av. Asno Principal", 50, "Das Antas", "MG");
        Cliente cliente4 = createCliente("Valdonaldo", "valdonaldo@souvaldo.com", 55566677788L, 40506070L, "Praça Central do Valdo", 405, "Pão Sovado", "BA");
        Cliente cliente5 = createCliente("Rodrinaldo", "rodrinaldo@soudigo.com", 25687647928L, 359741685L, "Praça do ÉÉÉÉÉÉÉÉ", 171, "Pesquisanogoogle", "BA");

        repository.save(cliente1);
        repository.save(cliente2);
        repository.save(cliente3);
        repository.save(cliente4);
        repository.save(cliente5);
    }
    
    private Cliente createCliente(String nome, String email, Long cpf, Long tel, String end, int numero, String cidade, String estado) {
        return Cliente.builder()
        		.nome(nome)
                .email(email)
                .cpf(cpf)
                .tel(tel)
                .end(end)
                .numero(numero)
                .cidade(cidade)
                .estado(estado)
                .build();
    }
}