create table tbCurso (
	sigla varchar2(5) not null,
	nome varchar2(100) not null,
	cargaHoraria number (5,0) not null, 
	valor number (8,2) not null,
	dataVigencia varchar2(10) not null,
	valorHoraInstrutor number (5,2) not null,
	programa varchar2(40) not null
);

create table tbTurma (
	siglaTurma varchar2(5) not null,
	descricao varchar2(200) not null,
	dataInicio varchar2(10) not null,
	dataTermino varchar2(10) not null,
	periodo varchar2(20) not null,
	qtdVagas number (3,0) not null,
	observacoes varchar2(200) not null,
	siglaCurso varchar2(5) not null
);


create table tbInstrutor (
	nome varchar2(100) not null,
	dataNasc varchar2(10) not null,
	endereco varchar2(100) not null,
	numero number (5,0) not null,
	bairro varchar2(50) not null,
	cidade varchar2(50) not null,
	estado varchar2(20) not null,
	cep varchar2(15) not null,
	telefone varchar2(15) not null,
	celular varchar2(15) not null,
	sexo varchar2(15) not null,
	estadoCivil varchar2(20) not null,
	rg varchar2(15) not null,
	cpf varchar2(15) not null,
	email varchar2(30) not null,
	formacao varchar2(100) not null,
	areaAtuacao varchar2(100) not null 
);



create table tbAluno (
	nome varchar2(100) not null,
	dataNasc varchar2(10) not null,
	endereco varchar2(100) not null,
	numero number (5,0) not null,
	bairro varchar2(50) not null,
	cidade varchar2(50) not null,
	estado varchar2(20) not null,
	cep varchar2(15) not null,
	telefone varchar2(15) not null,
	celular varchar2(15) not null,
	sexo varchar2(15) not null,
	estadoCivil varchar2(20) not null,
	rg varchar2(15) not null,
	cpf varchar2(15) not null,
	email varchar2(30) not null,
	escolaridade varchar2(200) not null 
);


alter table tbCurso add constraint pk_tbCurso primary key (sigla);

alter table tbTurma add constraint pk_tbTurma primary key (siglaTurma);
alter table tbTurma add constraint Fk_tbTurma foreign key(siglaCurso) references tbCurso (sigla);

alter table tbInstrutor add constraint pk_tbInstrutor primary key (cpf);

alter table tbAluno add constraint pk_tbAluno primary key (cpf);