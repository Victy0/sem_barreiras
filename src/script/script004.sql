-- insert para testes

-- tabela area_atuacao
insert into area_atuacao(descricao) values ('administração');
insert into area_atuacao(descricao) values ('medicina');
insert into area_atuacao(descricao) values ('pedagogia');
insert into area_atuacao(descricao) values ('psicologia');
insert into area_atuacao(descricao) values ('tecnologia da informação');
insert into area_atuacao(descricao) values ('publicidade');
insert into area_atuacao(descricao) values ('engenharia civil');
insert into area_atuacao(descricao) values ('engenharia mecânica');
insert into area_atuacao(descricao) values ('direito');
insert into area_atuacao(descricao) values ('telecomunicação');

-- tabela cidade
insert into cidade(nome, id_estado) values ('Niterói', 1);
insert into cidade(nome, id_estado) values ('Rio de Janeiro', 1);
insert into cidade(nome, id_estado) values ('São Gonçalo', 1);
insert into cidade(nome, id_estado) values ('Maricá', 1);
insert into cidade(nome, id_estado) values ('São Paulo', 2);

-- tabela curso
insert into curso(nome, descricao, hiperlink, preco) 
values ('Programação em Python do básico ao avançado', 'Aprenda Python 3.8.5 com Expressões Lambdas, Iteradores, Geradores, Orientação a Objetos e muito mais!', 'https://www.udemy.com/course/curso-de-programacao-em-python-do-basico-ao-avancado/', '39.40');

-- tabela deficiencia
insert into deficiencia(descricao, necessidade_rampa, necessidade_piso_tatil, necessidade_sonora) 
values ('auditiva', false, false, false);

insert into deficiencia(descricao, necessidade_rampa, necessidade_piso_tatil, necessidade_sonora) 
values ('visual', false, true, true);

insert into deficiencia(descricao, necessidade_rampa, necessidade_piso_tatil, necessidade_sonora) 
values ('motora', true, false, false);

-- tabela empresa
insert into empresa(nome, nomeFantasia, cnpj, email, endereco, telefone, id_cidade) values
('Sem Barreiras Vagas LTDA','Sem Barreiras','0000000000','sem.barreiras.vagas@gmail.com','R. X, 125, sala 302','0000000000',1)

-- tabela vaga
insert into vaga(resumo, data_criacao, funcao, nivel, descricao, requisitos_necessarios, requisitos_desejados, beneficios,
				jornada_trabalho, duracao_vaga, id_area_atuacao, id_escolaridade, id_empresa) 
values ('Programdor Júnior Python', CURRENT_DATE, 'Programador', 'júnior', 'Vaga teste', 'sem requisitos listados', 
		'sem requisitos listados', 'VT, VR, Seguro de vida, Plano médico, Plano odontológico', 
		'5', 30, 5, 7, 1);

-- tabela vaga_x_curso
insert into vaga_x_curso(id_vaga, id_curso) values (1,1);

-- tabela vaga_x_deficiencia
insert into vaga_x_deficiencia(id_vaga, id_deficiencia) values (1,1);

-- insert na tabela de versionamento
INSERT INTO db_version(numeracao) VALUES (4);