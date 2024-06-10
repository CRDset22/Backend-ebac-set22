CREATE TABLE gato (
  id INT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
   nome_provisorio VARCHAR(255) NOT NULL,
   idade_estimada INT NOT NULL,
   raca VARCHAR(255) NOT NULL,
   data_entrada date NOT NULL,
   data_adocao date,
   condicoes_chegada VARCHAR(255) NOT NULL,
   nome_recebedor VARCHAR(255) NOT NULL,
   data_obito date,
   porte VARCHAR(255) NOT NULL,
   CONSTRAINT pk_gato PRIMARY KEY (id)
);

CREATE TABLE cachorro (
  id INT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
   nome_provisorio VARCHAR(255) NOT NULL,
   idade_estimada INT NOT NULL,
   raca VARCHAR(255) NOT NULL,
   data_entrada date NOT NULL,
   data_adocao date,
   condicoes_chegada VARCHAR(255) NOT NULL,
   nome_recebedor VARCHAR(255) NOT NULL,
   data_obito date,
   porte VARCHAR(255) NOT NULL,
   CONSTRAINT pk_cachorro PRIMARY KEY (id)
);

CREATE TABLE funcionario_resgate (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    quantidade_animais_resgatados INT,
    estado_animal VARCHAR(255),
    data_resgate DATE
);