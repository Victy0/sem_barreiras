-- insert tabela escolaridade
insert into escolaridade(descricao, grau) values ('Educação infantil','1');
insert into escolaridade(descricao, grau) values ('Ensino fundamental incompleto','2');
insert into escolaridade(descricao, grau) values ('Ensino fundamental completo','3');
insert into escolaridade(descricao, grau) values ('Ensino médio incompleto','4');
insert into escolaridade(descricao, grau) values ('Ensino médio completo','5');
insert into escolaridade(descricao, grau) values ('Ensino superior incompleto','6');
insert into escolaridade(descricao, grau) values ('Ensino superior completo','7');
insert into escolaridade(descricao, grau) values ('Pós-graduação incompleta','8');
insert into escolaridade(descricao, grau) values ('Pós-graduação completa','9');
insert into escolaridade(descricao, grau) values ('Mestrado incompleto','10');
insert into escolaridade(descricao, grau) values ('Mestrado completo','11');
insert into escolaridade(descricao, grau) values ('Doutorado incompleto','12');
insert into escolaridade(descricao, grau) values ('Doutorado completo','13');

-- insert na tabela de versionamento
INSERT INTO db_version(numeracao) VALUES (3);