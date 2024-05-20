create database midasshoesbd;


create table usuario (
    id serial primary key,
    usuario varchar(100),
    senha varchar(50)
);
create table funcionario (
    id serial primary key,
    funcionario varchar(100),
    senha varchar(50)
);
create table tenis (
    id serial primary key,
    tenis varchar(100)
);
create table feedback (
    id serial primary key,
    id_pedido varchar(20),
    cpf_usuario varchar(20),
    feedback varchar(1000)
);