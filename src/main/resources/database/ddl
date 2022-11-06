drop database project;
create database project;
use project;

create table category(
	id int not null primary key auto_increment,
	name varchar(100) unique not null
);

create table video(
	id int not null primary key auto_increment,
	category_id int not null,
	foreign key (category_id) references category(id),
	video_source varchar(150) not null,
	name varchar(100) not null,
	description varchar(1000) not null,
	author varchar(100) not null
);


create table user(
	id int not null primary key auto_increment,
	username varchar(100) not null,
	password varchar(100) not null,
	email varchar(100) not null,
	name varchar(100) not null
);

insert into category (name) values 
	('Peliculas'),
	('Animación'),
	('Autos'),
	('Música'),
	('Animales'),
	('Deportes'),
	('Viajes y turismo'),
	('Videojuegos'),
	('Blogs'),
	('Comedia'),
	('Entretenimiento'),
	('Política'),
	('Educación'),
	('Ciencia y tecnológia'),
	('Documentales');

insert into video(category_id, video_source, name, description, author) values
	(1, 'https://youtube.com/embed/fvT7W5LHxF4', 'Trailer Coraline - Latino', 'Trailer en latino de la película Coraline', 'Laika Studios'),
	(1, 'https://youtube.com/embed/WLniDsuVzuc', 'EL DÍA DESPÚES DE MAÑANA', 'Cuando una nueva Edad de hielo amenaza al mundo, el climatólogo Jack Hall intenta salvar a la humanidad desde Nueva York, al mismo tiempo que busca a su hijo Sam.', 'Cine Studios'),
	(1, 'https://youtube.com/embed/P7ND_UtFOD0', 'Juno', 'Juno Enfrentada a un embarazo no planificado, una mujer joven poco convencional toma una decisión inusual con respecto a su hijo por nacer.', 'Paramount Pictures'),
	(12, 'https://www.youtube.com/embed/81eWnIOLyAc', 'State of the Union 2020: Highlights from Donald Trump’s speech', 'U.S. President Donald Trump touted America’s economic growth, praised the formation of the U.S. Space Force and promised the country would be the first to plant its flag on Mars as he delivered his third State of the Union address on Tuesday, February 4, 2020.', 'Global News')

insert into user(username, password, email, name) values
	('joelm', 'Joel123#', 'joelm.01@gmail.com', 'Joel Mora'),
	('carlosmp', 'Carlos123#', 'carlos.01@gmail.com', 'Carlos Meneses'),
	('pablot5', 'Pablito123#', 'pablo_lolo@gmail.com', 'Pablo Lopez');