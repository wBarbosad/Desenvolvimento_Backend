create database hospital;
use hospital;

create table medico(
	crm int primary key,
    nome varchar(30),
    especialidade varchar(30)
);

insert into medico(crm, nome, especialidade)
values(1458635, 'Wesley', 'Trauma');

insert into medico(crm, nome, especialidade)
values(3498935, 'Fernanda', 'Ortopedista');

insert into medico(crm, nome, especialidade)
values(5438645, 'Marcia', 'Cardiologista');

update medico set especialidade="Neurologista" where crm = 1458635;

select * from medico;

delete from medico where crm = 5438645;

