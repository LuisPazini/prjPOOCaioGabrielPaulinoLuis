create table tbCurso (
	sigla varchar2(8) not null,
	nome varchar2(100) not null,
	cargaHoraria number (5,0), 
	valor number (8,2),
	dataVigencia varchar2(10),
	valorHoraInstrutor number (5,2),
	programa varchar2(40)
);

create table tbTurma (
	siglaTurma varchar2(15) not null,
	descricao varchar2(200) not null,
	dataInicio varchar2(10),
	dataTermino varchar2(10),
	periodo varchar2(20),
	qtdVagas number (3,0),
	observacoes varchar2(200),
	siglaCurso varchar2(8)
);


create table tbInstrutor (
	nome varchar2(100) not null,
	dataNasc varchar2(10),
	endereco varchar2(100),
	numero number (5,0),
	bairro varchar2(50),
	cidade varchar2(50),
	estado varchar2(20),
	cep varchar2(15),
	telefone varchar2(15),
	celular varchar2(15),
	sexo varchar2(15),
	estadoCivil varchar2(20),
	rg varchar2(15) not null,
	cpf varchar2(14) not null,
	email varchar2(30),
	formacao varchar2(100),
	areaAtuacao varchar2(100)
);



create table tbAluno (
	nome varchar2(100) not null,
	dataNasc varchar2(10),
	endereco varchar2(100),
	numero number (5,0),
	bairro varchar2(50),
	cidade varchar2(50),
	estado varchar2(20),
	cep varchar2(15),
	telefone varchar2(15),
	celular varchar2(15),
	sexo varchar2(15),
	estadoCivil varchar2(20),
	rg varchar2(15) not null,
	cpf varchar2(14) not null,
	email varchar2(30),
	escolaridade varchar2(200) 
);


alter table tbCurso add constraint pk_tbCurso primary key (sigla);


alter table tbTurma add constraint fk_tbTurma foreign key(siglaCurso) references tbCurso (sigla);
alter table tbTurma add constraint pk_tbTurma primary key (siglaTurma);


alter table tbInstrutor add constraint pk_tbInstrutor primary key (cpf);

alter table tbAluno add constraint pk_tbAluno primary key (cpf);