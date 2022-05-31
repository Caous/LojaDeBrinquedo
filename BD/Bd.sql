create database lojabrinquedo;

use lojabrinquedo;

CREATE TABLE tb_perfil(
	id INT(10) NOT NULL AUTO_INCREMENT,
	nome VARCHAR(200) NOT NULL,
	descricao VARCHAR(500)  NOT NULL,
	usu_inclusao INT(10) NOT NULL,
	dt_inclusao TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	usu_exclusao INT(10) NULL,
	dt_exclusao TIMESTAMP NULL,
	CONSTRAINT pk_id_perfil PRIMARY KEY (id)	
);


CREATE TABLE tb_menu(
	id INT(10) NOT NULL AUTO_INCREMENT,
	nome VARCHAR(200) NOT NULL,
	descricao VARCHAR(500) NOT NULL,
	usu_inclusao INT(10) NOT NULL,
	dt_inclusao TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	usu_exclusao INT(10) NULL,
	dt_exclusao TIMESTAMP NULL,
	CONSTRAINT pk_id_menu PRIMARY KEY (id)	
);
 
 CREATE TABLE tb_pagamento (
	id INT(10) NOT NULL AUTO_INCREMENT,
	descricao VARCHAR(200) NOT NULL,
	usu_inclusao INT(10) NOT NULL,
	dt_inclusao TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	usu_exclusao INT(10) NULL,
	dt_exclusao TIMESTAMP NULL,
	CONSTRAINT pk_id_pagamento PRIMARY KEY (id)		
);


CREATE TABLE tb_usuario (
	id INT(10) NOT NULL AUTO_INCREMENT,
	id_perfil INT(10) NOT NULL,
	nome VARCHAR(200) NOT NULL,
	cpf VARCHAR(11) NOT NULL,
	dt_nasc TIMESTAMP NULL,
	email VARCHAR(200) NOT NULL,
	pass VARCHAR(200) NOT NULL, 
	sexo VARCHAR(20) NULL, 
	est_civil VARCHAR(50) NULL,
	usu_inclusao INT(10) NOT NULL,
	dt_inclusao TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	usu_exclusao INT(10) NULL,
	dt_exclusao TIMESTAMP NULL,
	CONSTRAINT pk_id_usuario PRIMARY KEY (id),
	CONSTRAINT fk_id_perfil  FOREIGN KEY (id_perfil) REFERENCES tb_perfil(ID)	
 );
 
 
CREATE TABLE tb_cliente (
	id INT(10) NOT NULL AUTO_INCREMENT,
	tipo_pessoa INT(1) NOT NULL,
	nome VARCHAR(200) NOT NULL,
	nome_fantasia VARCHAR(200) NULL,
	cpfcpnj VARCHAR(14) NOT NULL,
	endereco VARCHAR(200) NULL,
	cep VARCHAR(8) NULL,
	estado VARCHAR(200) NULL,
	municipio VARCHAR(200) NULL,
	telefone VARCHAR(14) NULL,
	celular VARCHAR(14) NULL,
	email VARCHAR(200) NOT NULL,
	cont_resp VARCHAR(100) NULL,
	est_civil VARCHAR(50) NULL,
	IM VARCHAR(100) NULL,
	EM VARCHAR(100) NULL,
	dt_nasc TIMESTAMP NULL,	
	sexo VARCHAR(20) NULL, 
	usu_inclusao INT(10) NOT NULL,
	dt_inclusao TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	usu_exclusao INT(10) NULL,
	dt_exclusao TIMESTAMP NULL,
	CONSTRAINT pk_id_cliente PRIMARY KEY (id)		
 );
 

 
 CREATE TABLE tb_fornecedor (
	id INT(10) NOT NULL AUTO_INCREMENT,
	nome VARCHAR(200) NOT NULL,
	nome_fantasia VARCHAR(200) NOT NULL,
	cpnj VARCHAR(14) NOT NULL,
	endereco VARCHAR(200) NULL,
	cep VARCHAR(8) NULL,
	estado VARCHAR(200) NULL,
	municipio VARCHAR(200) NULL,
	telefone VARCHAR(14) NULL,
	celular VARCHAR(14) NULL,
	email VARCHAR(200) NOT NULL,
	cont_resp VARCHAR(100) NULL,
	IM VARCHAR(100) NULL,
	IE VARCHAR(100) NULL,
	dt_criacao TIMESTAMP NULL,
	dt_nasc_cont TIMESTAMP NULL,
	usu_inclusao INT(10) NOT NULL,
	dt_inclusao TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	usu_exclusao INT(10) NULL,
	dt_exclusao TIMESTAMP NULL,
	CONSTRAINT pk_id_fornecedor PRIMARY KEY (id)			
 );
 
 
 CREATE TABLE tb_acesso(
	id INT(10) NOT NULL AUTO_INCREMENT,
	id_perfil INT(10) NOT NULL,
	id_menu INT(10) NOT NULL,
	usu_inclusao INT(10) NOT NULL,
	dt_inclusao TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	usu_exclusao INT(10) NULL,
	dt_exclusao TIMESTAMP NULL,
	CONSTRAINT pk_id_acesso PRIMARY KEY (id)
);
 
 CREATE TABLE tb_produto (
	id INT(10) NOT NULL AUTO_INCREMENT,
	id_fornecedor int(100) NOT NULL,
	nome VARCHAR(200) NOT NULL,
	categoria VARCHAR(200) NOT NULL,
	marca VARCHAR(200) NOT NULL,
	qtd int(100) NOT NULL,
	valor DECIMAL(4,2)  NOT NULL,
	descricao VARCHAR(200)  NULL,
	avaliacao int(10)  NULL,
	comentario VARCHAR(200)  NULL,
	validade TIMESTAMP  NULL,
	porcentagem_desc int(100)  NULL,
	usu_inclusao INT(10) NOT NULL,
	dt_inclusao TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	usu_exclusao INT(10) NULL,
	dt_exclusao TIMESTAMP NULL,	
	CONSTRAINT pk_id_produto PRIMARY KEY (id),
	CONSTRAINT fk_id_fornecedor  FOREIGN KEY (id_fornecedor) REFERENCES tb_fornecedor(ID)
 );
 

 
  CREATE TABLE tb_venda (
	id INT(10) NOT NULL AUTO_INCREMENT,
	id_cliente int(100) NOT NULL,
	id_tipo_pagamento int(100) NOT NULL,
	vlr_total DECIMAL(4,2)  NOT NULL,
	vlr_desconto DECIMAL(4,2)  NOT NULL,
	pct_desconto int(100) NOT NULL,
	usu_inclusao INT(10) NOT NULL,
	dt_inclusao TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	usu_exclusao INT(10) NULL,
	dt_exclusao TIMESTAMP NULL,	
	CONSTRAINT pk_id_venda PRIMARY KEY (id),
	CONSTRAINT fk_id_cliente  FOREIGN KEY (id_cliente) REFERENCES tb_cliente(ID),
	CONSTRAINT fk_id_tipo_pagamento  FOREIGN KEY (id_tipo_pagamento) REFERENCES tb_pagamento(ID)
 );
 
  CREATE TABLE tb_item_venda(
	id int(10) NOT NULL AUTO_INCREMENT,
	id_venda int(10) NOT NULL,
	id_produto int(100) NOT NULL,
	usu_inclusao INT(10) NOT NULL,
	qtd_produto int(100) NOT NULL,
	vlr_produto DECIMAL(4,2)  NOT NULL,
	dt_inclusao TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	usu_exclusao INT(10) NULL,
	dt_exclusao TIMESTAMP NULL,	
	CONSTRAINT pk_item_venda PRIMARY KEY (id),
	CONSTRAINT fk_id_produto  FOREIGN KEY (id_produto) REFERENCES tb_produto(ID),
	CONSTRAINT fk_id_venda  FOREIGN KEY (id_venda) REFERENCES tb_venda(ID)
  );
 
 INSERT INTO tb_perfil (nome, descricao, usu_inclusao) values ("Admin", "Administrador TI", 1);
 
 INSERT INTO tb_usuario (id_perfil,	nome, cpf, dt_nasc,	email, pass, sexo, est_civil,usu_inclusao) values (1,'Administrador TI','00000000000',  STR_TO_DATE('22-05-2022', '%d-%m-%Y'), 'admin@admin.com', '123456', 'N/A', 1, 1 );
 
 INSERT INTO tb_menu (nome,	descricao,usu_inclusao) values ("Login","Tela de login",1);
  
 INSERT INTO tb_pagamento (descricao,usu_inclusao) values ('Cartão de crédito', 1);
 
 INSERT INTO tb_cliente (tipo_pessoa, nome, cpfcpnj, email, usu_inclusao) values (1,'Gustavo','00011122233','teste@tes.com','05-04-2000');
 
 INSERT INTO tb_fornecedor (nome,	nome_fantasia, cpnj, email, cont_resp, dt_criacao, dt_nasc_cont, usu_inclusao) values ('Nike Futebol', 'Nike', '0542451','teste@teste.com','Gustavo', '05-04-2000', '05-04-2000', 1);
 
 INSERT INTO tb_acesso (id_perfil, id_menu,	usu_inclusao) values (1,1,1);
 
 