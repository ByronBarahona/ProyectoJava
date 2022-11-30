create database Examen3;
use Examen3;

create table tb_usuario(
idUsuario int(11) auto_increment primary key,
nombre varchar(30) not null,
apellido varchar(30) not null,
usuario varchar(15) not null,
password varchar(15) not null,
telefono varchar(15) not null,
estado int(1) not null
);

create table region(id_region int auto_increment primary key, descripcion varchar(30) not null);
create table comuna(id_comuna int auto_increment primary key, descripcion varchar(30) not null, id_region int not null, foreign key(id_region) references region(id_region));
create table gpg(
gpg_rut int(15) auto_increment primary key,
rso_soc varchar(60) null,
nombre varchar(60) null,
apellido varchar(60) null,
sexo boolean null,
region int(3) not null,
comuna int(3) not null,
banco int(3) not null,
tip_cuenta int(3) not null,
numero_cta int(15) not null,
tip_gpg int(3) not null,
foreign key(tip_cuenta) references par(par_cod),
foreign key(comuna) references comuna(id_comuna),
foreign key(region) references region(id_region),
foreign key(banco) references banco(id_banco),
foreign key(tip_gpg) references par(par_cod)
);

insert into tb_usuario (nombre, apellido, usuario, password, telefono, estado) values ('Byron', 'Barahona', 'bbm', 'cst2022', '+56945629353', 1);
use Examen3;
select usuario, password from tb_usuario where usuario = "bbm" and password = "cst2022";

create table par (Par_Tab int(3), par_cod int(3), par_des varchar(15));

insert into par(Par_Tab, par_cod, par_des) values (1, 1, 'Cuenta Corriente'), (1, 2, 'Cuenta Ahorro');
