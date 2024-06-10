INSERT
INTO
  gato
  (nome_provisorio, idade_estimada, raca, data_entrada, condicoes_chegada, nome_recebedor, porte)
VALUES
  ('Gato Ebac', 5, 'SRD', current_date, 'Pulguento', 'Cleber', 'Pequeno');

INSERT
INTO
  gato
  (nome_provisorio, idade_estimada, raca, data_entrada, condicoes_chegada, nome_recebedor, porte)
VALUES
  ('Frajola', 2, 'SRD', current_date - 5, 'Faminto', 'Romano', 'Pequeno');

INSERT
INTO
  gato
  (nome_provisorio, idade_estimada, raca, data_entrada, condicoes_chegada, nome_recebedor, porte, data_adocao)
VALUES
  ('Leon', 3, 'Munchin', current_date - 2, 'Cansado', 'Zico', 'Pequeno', current_date - 1);

INSERT
INTO
  gato
  (nome_provisorio, idade_estimada, raca, data_entrada, condicoes_chegada, nome_recebedor, porte)
VALUES
  ('Petros', 5, 'Persa', current_date , 'Fraqueza', 'Amanda', 'Pequeno');



INSERT
INTO
  cachorro
  (nome_provisorio, idade_estimada, raca, data_entrada, condicoes_chegada, nome_recebedor, porte)
VALUES
  ('Cachorrinho Ebac', 5, 'SRD', current_date, 'Pulguento', 'Cleber', 'Pequeno');

INSERT
INTO
  cachorro
  (nome_provisorio, idade_estimada, raca, data_entrada, condicoes_chegada, nome_recebedor, porte, data_adocao)
VALUES
  ('Outro Cachorrinho Ebac', 8, 'Puggy', current_date - 10, 'Velhinho', 'Renato', 'Pequeno', current_date - 1);

INSERT
INTO
  cachorro
  (nome_provisorio, idade_estimada, raca, data_entrada, condicoes_chegada, nome_recebedor, porte)
VALUES
  ('Rambo', 5, 'Dobermam', current_date - 2, 'Faminto', 'Alberto', 'Grande');


INSERT
INTO
  funcionario_resgate
   (nome, quantidade_animais_resgatados, estado_animal, data_resgate)
VALUES ('Ana', 10, 'Saudável', '2023-01-15');
INSERT
INTO
  funcionario_resgate
   (nome, quantidade_animais_resgatados, estado_animal, data_resgate)
VALUES ('Carlos', 5, 'Ferido', '2023-02-20');

INSERT
INTO
  funcionario_resgate
   (nome, quantidade_animais_resgatados, estado_animal, data_resgate)
VALUES ('Jonas', 35, 'Ferido', '2023-02-20');

INSERT
INTO
  funcionario_resgate
   (nome, quantidade_animais_resgatados, estado_animal, data_resgate)
VALUES ('Vanessa', 29, 'Ferido', '2023-03-20');

