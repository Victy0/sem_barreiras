-- Ser executado somente se não tiver sido criado o usuario 'postgres'
-- SOMENTE CASO NÃO TENHA INSTALDO O POSTGRES PELA INSTALAÇÃO PADRÃO     
CREATE USER postgres WITH PASSWORD 'postgres';
--

-- Ser executado somente se já tiver sido criado o usuario 'postgres' (usuário criado na instalação padrão do postgres)
-- AO ALTERAR O USUÁRIO, A SENHA PARA ACESSAR O pgAdmin TAMBÉM SERÀ ALTERADA
ALTER USER postgres WITH PASSWORD 'postgres';
--

-- CASO NÂO QUEIRA CRIAR OU ALTERAR O USUÁRIO DO POSTGRES, PODE ALTERAR AS CONFIGURAÇÕES DO BANCO NO ARQUIVO 'aplication.properties'

-- criacao da DATABASE necessária para a aplicação
CREATE DATABASE "semBarreiras"
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    CONNECTION LIMIT = -1;

-- criacao tabela de versionamento
CREATE TABLE db_version
(
	id SERIAL NOT NULL,
	numeracao INTEGER NOT NULL,
	CONSTRAINT PK_db_version PRIMARY KEY(id)
);

-- criacao tabela estado
CREATE TABLE estado
(
    id SERIAL NOT NULL,
    uf VARCHAR(2) NOT NULL,
    CONSTRAINT PK_estado PRIMARY KEY (id)
);

-- criacao tabela cidade
CREATE TABLE cidade
(
    id SERIAL NOT NULL,
    nome VARCHAR(50) NOT NULL,
    id_estado SERIAL NOT NULL,
    CONSTRAINT PK_cidade PRIMARY KEY (id),
    CONSTRAINT FK_cidade_x_estado FOREIGN KEY (id_estado) REFERENCES estado(id)
);

-- criacao tabela area_atuacao
CREATE TABLE area_atuacao
(
    id SERIAL NOT NULL,
    descricao VARCHAR(50) NOT NULL,
    CONSTRAINT PK_area_atuacao PRIMARY KEY (id)
);

-- criacao tabela empresa
CREATE TABLE empresa 
(
	id SERIAL NOT NULL,
    nome VARCHAR(100) NOT NULL,
	nomeFantasia VARCHAR(100) NULL,
    cnpj VARCHAR(50) NOT NULL,
	email VARCHAR(50) NOT NULL,
	endereco VARCHAR(50) NULL,
	telefone VARCHAR(50) NOT NULL,
    id_cidade SERIAL NOT NULL,
	CONSTRAINT PK_empresa PRIMARY KEY (id),
    CONSTRAINT FK_empresa_x_cidade FOREIGN KEY (id_cidade) REFERENCES cidade(id)
);

-- criacao tabela escolaridade
CREATE TABLE escolaridade
(
    id SERIAL NOT NULL,
    descricao VARCHAR(50) NOT NULL,
    grau INTEGER NOT NULL,
    CONSTRAINT PK_escolaridade PRIMARY KEY (id)
);

-- criacao tabela vaga
CREATE TABLE vaga 
(
	id SERIAL NOT NULL,
    resumo VARCHAR(100),
	data_criacao DATE NOT NULL,
    remuneracao DECIMAL NULL,
    funcao VARCHAR(50) NOT NULL,
	nivel VARCHAR(50) NOT NULL,
	descricao VARCHAR(5000) NULL,
	requisitos_necessarios VARCHAR(1000),
    requisitos_desejados VARCHAR(1000),
    beneficios VARCHAR(1000),
    jornada_trabalho VARCHAR(100),
    duracao_vaga INTEGER NOT NULL,
    id_area_atuacao SERIAL NOT NULL,
    id_escolaridade SERIAL NOT NULL,
    id_empresa SERIAL NOT NULL,
	CONSTRAINT PK_vaga PRIMARY KEY (id),
    CONSTRAINT FK_vaga_x_area_atuacao FOREIGN KEY (id_area_atuacao) REFERENCES area_atuacao(id),
    CONSTRAINT FK_vaga_x_escolaridade FOREIGN KEY (id_escolaridade) REFERENCES escolaridade(id),
    CONSTRAINT FK_vaga_x_empresa FOREIGN KEY (id_empresa) REFERENCES empresa(id)
);

-- criacao tabela curso
CREATE TABLE curso 
(
	id SERIAL NOT NULL,
    nome VARCHAR(200),
    descricao VARCHAR(500) NOT NULL,
	hiperlink VARCHAR(100) NOT NULL,
	preco DECIMAL NULL,
	CONSTRAINT PK_curso PRIMARY KEY (id)
);

-- criacao tabela deficiencia
CREATE TABLE deficiencia
(
	id SERIAL NOT NULL,
    descricao VARCHAR(50) NOT NULL,
    necessidade_rampa BOOLEAN NULL,
	necessidade_piso_tatil BOOLEAN NULL,
    necessidade_sonora BOOLEAN NULL,
	CONSTRAINT PK_deficiencia PRIMARY KEY (id)
);

-- criacao tabela vaga_x_deficiencia
CREATE TABLE vaga_x_deficiencia
(
    id_vaga INTEGER NOT NULL,
    id_deficiencia INTEGER NOT NULL,
    CONSTRAINT FK_deficiencia_X_vaga FOREIGN KEY (id_vaga) REFERENCES vaga(id),
    CONSTRAINT FK_vaga_X_deficiencia FOREIGN KEY (id_deficiencia) REFERENCES deficiencia(id)
);

-- criacao tabela vaga_x_curso
CREATE TABLE vaga_x_curso
(
    id_curso INTEGER NOT NULL,
    id_vaga INTEGER NOT NULL,
    CONSTRAINT FK_vaga_X_curso FOREIGN KEY (id_curso) REFERENCES curso(id),
    CONSTRAINT FK_curso_X_vaga FOREIGN KEY (id_vaga) REFERENCES vaga(id)
);

-- insert na tabela de versionamento
INSERT INTO db_version(numeracao) VALUES (1);


