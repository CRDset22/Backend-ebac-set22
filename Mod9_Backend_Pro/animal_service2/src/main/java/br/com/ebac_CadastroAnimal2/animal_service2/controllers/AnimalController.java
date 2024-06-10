package br.com.ebac_CadastroAnimal2.animal_service2.controllers;

import br.com.ebac_CadastroAnimal2.animal_service2.entidades.Cachorro;
import br.com.ebac_CadastroAnimal2.animal_service2.entidades.FuncionarioResgate;
import br.com.ebac_CadastroAnimal2.animal_service2.entidades.Gato;
import br.com.ebac_CadastroAnimal2.animal_service2.repositorios.GatoRepository;
import br.com.ebac_CadastroAnimal2.animal_service2.repositorios.CachorroRepository;
import br.com.ebac_CadastroAnimal2.animal_service2.repositorios.ResgateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/animais")
public class AnimalController {


        private CachorroRepository dogrepository;

        private GatoRepository catrepository;

        private ResgateRepository rescuerepository;

        //Esse é o construtor
        @Autowired
        private AnimalController(CachorroRepository dogrepository, GatoRepository catrepository, ResgateRepository rescuerepository){
            this.dogrepository = dogrepository;
            this.catrepository = catrepository;
            this.rescuerepository = rescuerepository;
        }

        // CRUD para Cachorro
        @PostMapping("/cachorros")
        private Cachorro createCachorro(@RequestBody Cachorro cachorro) {
            return dogrepository.save(cachorro);
        }

        @GetMapping("/cachorros")
        private List<Cachorro> getAllCachorros() {
            return dogrepository.findAll();
        }

        @GetMapping("/cachorros/not-adopted")
        private List<Cachorro> findNotAdopted(){
            return dogrepository.findNotAdopted();
        }

        @GetMapping("/cachorros/adopted")
        private List<Cachorro> findAdopted(){
            return dogrepository.findAdopted();
        }





        //Esse é o construtor
        public AnimalController(GatoRepository catrepository){
            this.catrepository = catrepository;
        }

        // CRUD para Gato (mesma lógica)
        @PostMapping("/gatos")
        private Gato createGato(@RequestBody Gato gato) {
            return catrepository.save(gato);
        }

        @GetMapping("/gatos")
        private List<Gato> getAllGatos() {
            return catrepository.findAll();
        }

        @GetMapping("/gatos/not-adopted")
        private List<Gato> findNotAdoptedone(){
            return catrepository.findNotAdoptedone();
        }

        @GetMapping("/gatos/adopted")
        private List<Gato> findAdoptedone(){
            return catrepository.findAdoptedone();
        }

        @GetMapping("/rescue")
        private List<FuncionarioResgate> getAllFuncionarioResgate() {
            return rescuerepository.findAll();
        }

        @GetMapping("/rescue/trinta")
        private List<FuncionarioResgate> above30any() {
            return rescuerepository.above30any();
        }
    }

