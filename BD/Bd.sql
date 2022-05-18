create database lojabrinquedo;

use lojabrinquedo;

CREATE TABLE tb_perfil(
	id INT(10) NOT NULL AUTO_INCREMENT,
	nome VARCHAR(200) NOT NULL,
	descricao VARCHAR(500)  NOT NULL,
	usu_inclusao INT(10) NOT NULL,
	dt_inclusao TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	usu_exclusao INT(10) NULL,
	dt_exclusao TIMESTAMP DEFAULT CURRENT_TIMESTAMP NULL,
	CONSTRAINT pk_id_perfil PRIMARY KEY (id)	
);


CREATE TABLE tb_menu(
	id INT(10) NOT NULL AUTO_INCREMENT,
	nome VARCHAR(200) NOT NULL,
	descricao VARCHAR(500) NOT NULL,
	usu_inclusao INT(10) NOT NULL,
	dt_inclusao TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	usu_exclusao INT(10) NULL,
	dt_exclusao TIMESTAMP DEFAULT CURRENT_TIMESTAMP NULL,
	CONSTRAINT pk_id_menu PRIMARY KEY (id)	
);
 
 CREATE TABLE tb_pagamento (
	id INT(10) NOT NULL AUTO_INCREMENT,
	nome VARCHAR(200) NOT NULL,
	usu_inclusao INT(10) NOT NULL,
	dt_inclusao TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	usu_exclusao INT(10) NULL,
	dt_exclusao TIMESTAMP DEFAULT CURRENT_TIMESTAMP NULL,
	CONSTRAINT pk_id_pagamento PRIMARY KEY (id)		
);


CREATE TABLE tb_usuario (
	id INT(10) NOT NULL AUTO_INCREMENT,
	id_perfil INT(10) NOT NULL,
	nome VARCHAR(200) NOT NULL,
	cpf VARCHAR(11) NOT NULL,
	dt_nasc TIMESTAMP  DEFAULT CURRENT_TIMESTAMP NULL,
	email VARCHAR(200) NOT NULL,
	pass VARCHAR(200) NOT NULL, 
	sexo VARCHAR(20) NULL, 
	usu_inclusao INT(10) NOT NULL,
	dt_inclusao TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	usu_exclusao INT(10) NULL,
	dt_exclusao TIMESTAMP DEFAULT CURRENT_TIMESTAMP NULL,
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
	IM VARCHAR(100) NULL,
	IE VARCHAR(100) NULL,
	dt_nasc TIMESTAMP DEFAULT CURRENT_TIMESTAMP NULL,	
	sexo VARCHAR(20) NULL, 
	usu_inclusao INT(10) NOT NULL,
	dt_inclusao TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	usu_exclusao INT(10) NULL,
	dt_exclusao TIMESTAMP DEFAULT CURRENT_TIMESTAMP NULL,
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
	dt_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP NULL,
	dt_nasc_cont TIMESTAMP DEFAULT CURRENT_TIMESTAMP NULL,
	usu_inclusao INT(10) NOT NULL,
	dt_inclusao TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	usu_exclusao INT(10) NULL,
	dt_exclusao TIMESTAMP DEFAULT CURRENT_TIMESTAMP NULL,
	CONSTRAINT pk_id_fornecedor PRIMARY KEY (id)			
 );
 
 
 CREATE TABLE tb_acesso(
	id INT(10) NOT NULL AUTO_INCREMENT,
	id_perfil INT(10) NOT NULL,
	id_menu INT(10) NOT NULL,
	usu_inclusao INT(10) NOT NULL,
	dt_inclusao TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	usu_exclusao INT(10) NULL,
	dt_exclusao TIMESTAMP DEFAULT CURRENT_TIMESTAMP NULL,
	CONSTRAINT pk_id_acesso PRIMARY KEY (id)
);
 
 CREATE TABLE tb_produto (
	id INT(10) NOT NULL AUTO_INCREMENT,
	id_fornecedor int(100) NOT NULL,
	nome VARCHAR(200) NOT NULL,
	categoria VARCHAR(200) NOT NULL,
	marca VARCHAR(200) NOT NULL,
	qtd int(100) NOT NULL,
	valor float(1,0) NOT NULL,
	descricao VARCHAR(200) NOT NULL,
	avaliacao VARCHAR(200) NOT NULL,
	comentario VARCHAR(200) NOT NULL,
	validade TIMESTAMP NOT NULL,
	porcentagem_desc int(100) NOT NULL,
	usu_inclusao INT(10) NOT NULL,
	dt_inclusao TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	usu_exclusao INT(10) NULL,
	dt_exclusao TIMESTAMP DEFAULT CURRENT_TIMESTAMP NULL,	
	CONSTRAINT pk_id_produto PRIMARY KEY (id),
	CONSTRAINT fk_id_fornecedor  FOREIGN KEY (id_fornecedor) REFERENCES tb_fornecedor(ID)
 );
 

 
  CREATE TABLE tb_venda (
	id INT(10) NOT NULL AUTO_INCREMENT,
	id_produto int(100) NOT NULL,
	id_cliente int(100) NOT NULL,
	id_tipo_pagamento int(100) NOT NULL,
	qtd_produto int(100) NOT NULL,
	vlr_produto int(100) NOT NULL,
	vlr_total int(100) NOT NULL,
	vlr_desconto int(100) NOT NULL,
	pct_desconto int(100) NOT NULL,
	usu_inclusao INT(10) NOT NULL,
	dt_inclusao TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	usu_exclusao INT(10) NULL,
	dt_exclusao TIMESTAMP DEFAULT CURRENT_TIMESTAMP NULL,	
	CONSTRAINT pk_id_venda PRIMARY KEY (id),
	CONSTRAINT fk_id_produto  FOREIGN KEY (id_produto) REFERENCES tb_produto(ID),
	CONSTRAINT fk_id_cliente  FOREIGN KEY (id_cliente) REFERENCES tb_cliente(ID),
	CONSTRAINT fk_id_tipo_pagamento  FOREIGN KEY (id_tipo_pagamento) REFERENCES tb_pagamento(ID)
 );
 
  
 
 