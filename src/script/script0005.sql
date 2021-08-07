Delete from public.estado
where id > 2;

--tabela cidade
insert into cidade(nome, id_estado) values ('Macaé', 1);
insert into cidade(nome, id_estado) values ('Duque de Caxias', 1);
insert into cidade(nome, id_estado) values ('Itaperuna', 1);
insert into cidade(nome, id_estado) values ('Parati', 1);
insert into cidade(nome, id_estado) values ('Piraí', 1);
insert into cidade(nome, id_estado) values ('Rio das Ostras', 1);
insert into cidade(nome, id_estado) values ('Saquarema', 1);
insert into cidade(nome, id_estado) values ('Teresópolis', 1);
insert into cidade(nome, id_estado) values ('Porto Real', 1);
insert into cidade(nome, id_estado) values ('Guarulhos', 2);
insert into cidade(nome, id_estado) values ('Campinas', 2);
insert into cidade(nome, id_estado) values ('São Bernardo do Campo', 2);
insert into cidade(nome, id_estado) values ('São José dos Campos', 2);
insert into cidade(nome, id_estado) values ('Santo André', 2);
insert into cidade(nome, id_estado) values ('Ribeirão Preto', 2);
insert into cidade(nome, id_estado) values ('Osasco', 2);
insert into cidade(nome, id_estado) values ('Sorocaba',2 );
insert into cidade(nome, id_estado) values ('Mogi das Cruzes',2 );
insert into cidade(nome, id_estado) values ('Santos',2 );
insert into cidade(nome, id_estado) values ('Diadema',2 );




-- tabela area_atuacao

insert into area_atuacao(descricao) values ('Varejo');
insert into area_atuacao(descricao) values ('Entretenimento');
insert into area_atuacao(descricao) values ('Educação fisica');
insert into area_atuacao(descricao) values ('Moda');
insert into area_atuacao(descricao) values ('Audiovisual');
insert into area_atuacao(descricao) values ('Gastronomia');
insert into area_atuacao(descricao) values ('Transporte');
insert into area_atuacao(descricao) values ('Logistica');
insert into area_atuacao(descricao) values ('Eletrônica');
insert into area_atuacao(descricao) values ('Farmacia');
insert into area_atuacao(descricao) values ('Educação');

-- tabela curso
insert into curso(nome, descricao, hiperlink, preco) 
values ('Curso de Corte e Costura– 50 Horas', 'Aprenda os fundamnetos do corte é costura ', 'https://certificadocursosonline.com/cursos/curso-de-corte-e-costura/', '49.90');
insert into curso(nome, descricao, hiperlink, preco) 
values ('Curso online de como fazer Hamburgueria Gourmet', 'Este Curso de Hamburgueria Gourmet, na área de Culinária, Gastronomia e Confeitaria, você aprende a selecionar as carnes e a fazer o blend, que é a mistura das carnes para um hambúrguer perfeito. Além disso, você vai aprender a fazer montagem de sanduíches tradicionais e inovações do mercado. Você vai ver também como fazer molhos, batata frita, batata rústica com um sabor especial, onion rings, e uma deliciosa cebola caramelizada na cerveja, para acompanhar os seus lanches.', 'https://www.iped.com.br/culinaria-gastronomia/curso/hamburgueria-gourmet', '79.90');
insert into curso(nome, descricao, hiperlink, preco) 
values ('Curso online de como fazer Fotografia e Vídeo com Celular', 'No Curso de Fotografia e Vídeo com Celular, da área Comunicação, marketing e vendas, você aprende a diferença entre fotografar e filmar, como usar - e criar - a melhor luz, Regra dos Terços, como usar as cores nas imagens, como usar ferramentas de edição de foto e vídeo no celular, e muito mais.', 'https://www.iped.com.br/publicidade-marketing/curso/fotografia-video-celular', '39.40');
insert into curso(nome, descricao, hiperlink, preco) 
values ('Curso online de Podologia', ' O Curso de Podologia, da área Estética e Beleza, você aprende sobre práticas podógicas, técnicas do trabalho podológico, exemplos de alguns procedimentos e também o trabalho e os limites do podólogo.', 'https://www.iped.com.br/estetica-e-beleza/curso/podologia','79.90');
insert into curso(nome, descricao, hiperlink, preco) 
values ('Curso online de Comunicação Assertiva na Prática', 'No Comunicação Assertiva na Prática, da área Comunicação, marketing e vendas, aborda técnicas de comunicação, comunicação verbal e não verbal, e-learning, EAD, assertividade na palma das mãos, o passo para você iniciar a ser um comunicador assertivo, melhorar sua comunicação e mudar sua vida através da felicidade profissional.', 'https://www.iped.com.br/publicidade-marketing/curso/comunicacao-assertiva-pratica', '79.90');
insert into curso(nome, descricao, hiperlink, preco) 
values ('Curso online de como se tornar Telefonista e Recepcionista', 'Este Curso de Telefonista e Recepcionista, na área de Comunicação, marketing e vendas, aborda sobre lidar com clientes difíceis, recepcionar com elegância, técnicas de atendimento e muito mais.', 'https://www.iped.com.br/publicidade-marketing/curso/telefonista-recepcionista', '99.90');

-- tabela empresa
insert into empresa(nome, nomeFantasia, cnpj, email, endereco, telefone, id_cidade) values
('Supermercados Marques S/a','Marques Supermercados','0000000001','marques.super@contato.com','R. Y, 135, sala 302','0000000001',3);
insert into empresa(nome, nomeFantasia, cnpj, email, endereco, telefone, id_cidade) values
('Academia Froes','Fit Fróes','0000000002','froes@fit.com','R. H, 521, bloco d','0000000002',4);
insert into empresa(nome, nomeFantasia, cnpj, email, endereco, telefone, id_cidade) values
('Construtora Albino','Albino Construções','0000000003','construalbino@outlook.com','R. K, 302, galpão 3','0000000003',5);
insert into empresa(nome, nomeFantasia, cnpj, email, endereco, telefone, id_cidade) values
('Restaurante Azevedo','Azevedo Massas','0000000004','azevedo@massas.com','R. X, 125, sala 302','0000000004',6);

-- tabela vaga
insert into vaga(resumo, data_criacao, funcao, nivel, descricao, requisitos_necessarios, requisitos_desejados, beneficios,
				jornada_trabalho, duracao_vaga, id_area_atuacao, id_escolaridade, id_empresa) 
values ('Atendente em academia', CURRENT_DATE, 'Atendente', 'pleno', 'atendente em  uma renomada academia  ', 'boa comunicação com o publico alvo', 
		'curso de atendimento  ao publico', 'VT, VR, Seguro de vida, Plano médico, Plano odontológico', 
		'5', 30, 13, 5, 3);
insert into vaga(resumo, data_criacao, funcao, nivel, descricao, requisitos_necessarios, requisitos_desejados, beneficios,
				jornada_trabalho, duracao_vaga, id_area_atuacao, id_escolaridade, id_empresa) 
values ('Chapeiro', CURRENT_DATE, 'Chapeiro', 'pleno', 'Chapeiro de hamburgueria ', 'Exeriencia com chapa inddustrial,  experiencia com diveros tipos de blend de carne', 
		'experiencia com grelha , experiencia com ovo caipira', ' Plano médico, Plano odontológico', 
		'5', 30, 13, 4, 5);

insert into vaga(resumo, data_criacao, funcao, nivel, descricao, requisitos_necessarios, requisitos_desejados, beneficios,
				jornada_trabalho, duracao_vaga, id_area_atuacao, id_escolaridade, id_empresa) 
values ('Engenheiro civil', CURRENT_DATE, 'Engenheiro Civil', 'pleno', 'Engenheiro civil, para construçõesde casas de baixa renda ', 'Experiencia com grandes projetos , experiência com autocad', 
		'facilidade de aprendizado em novas ferramentas', 'Vale transporte , Vale Alimentação ,Plano médico, Plano odontológico', 
		'8', 60, 13, 7, 4);	

		insert into vaga(resumo, data_criacao, funcao, nivel, descricao, requisitos_necessarios, requisitos_desejados, beneficios,
				jornada_trabalho, duracao_vaga, id_area_atuacao, id_escolaridade, id_empresa) 
values ('Caixa', CURRENT_DATE, 'Caixa de Supermercado', 'Clt', 'Caixa  de uma rede de supermercados local ', 'sem requisitos,', 
		'morar perto do local de  trabalho', 'Vale transporte , Vale Alimentação ', 
		'8', 60, 11, 5, 2);		

-- tabela vaga_x_curso
insert into vaga_x_curso(id_vaga, id_curso) values (1,1);
insert into vaga_x_curso(id_vaga, id_curso) values (2,2);
insert into vaga_x_curso(id_vaga, id_curso) values (5,6);


-- tabela vaga_x_deficiencia
insert into vaga_x_deficiencia(id_vaga, id_deficiencia) values (1,1);
insert into vaga_x_deficiencia(id_vaga, id_deficiencia) values (2,3);
insert into vaga_x_deficiencia(id_vaga, id_deficiencia) values (4,2);
insert into vaga_x_deficiencia(id_vaga, id_deficiencia) values (4,1);
insert into vaga_x_deficiencia(id_vaga, id_deficiencia) values (4,3);
insert into vaga_x_deficiencia(id_vaga, id_deficiencia) values (5,2);
insert into vaga_x_deficiencia(id_vaga, id_deficiencia) values (5,3);
insert into vaga_x_deficiencia(id_vaga, id_deficiencia) values (6,2);
insert into vaga_x_deficiencia(id_vaga, id_deficiencia) values (6,3);
insert into vaga_x_deficiencia(id_vaga, id_deficiencia) values (6,2);
insert into vaga_x_deficiencia(id_vaga, id_deficiencia) values (6,1);

