create database Examen3;
use Examen3;

create table tip_usr(id_tip_usr int auto_increment primary key, nombre varchar(45) not null);

create table usuarios (ID int AUTO_INCREMENT primary key, usuario varchar(20) not null, password varchar(25) not null, nombre varchar(45) not null, correo varchar(45), ultima_conexion datetime null DEFAULT '0000-00-00 00:00:00', id_tip_usr int not null, foreign key(id_tip_usr) references tip_usr(id_tip_usr));