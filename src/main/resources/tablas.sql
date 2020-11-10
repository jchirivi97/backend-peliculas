
create table categoria (
	id int,
	nombre varchar(255),
)

create table pelicula(
	id int,
	calificacion int,
	descripcion varchar(225),
	duracion varchar(225),
	estreno date,
	imagen varchar(225),
	titulo varchar(225),
	trailervarchar(255)
)

create table pelicula_categoria(
	id int,
	categoria int,
	pelicula int
)

alter table pelicula_categoria add constraint fk_peliculaCat foreign key (categoria) references categoria(id)
alter table pelicula_categoria add constraint fk_peliculaCat2 foreign key (pelicula) references pelicula(id)

create table usuario(
	nickname varchar(225),
	nombre varchar(225),
	password varchar(225)
)

create table vista(
	id int,
	pelicula int,
	usuario varchar(225)
)

alter table vista add constraint fk_vista foreign key (pelicula) references pelicula(id)
alter table vista add constraint fk_vista2 foreign key (usuario) references usuario(nickname)