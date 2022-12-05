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


create table streaming_user(
	id int not null primary key auto_increment,
	username varchar(100) not null,
	password varchar(255) not null,
	active int not null,
	roles varchar(100) not null,
	permissions varchar(100) not null,
	email varchar(100) not null,
	name varchar(100) not null,
	surname varchar(100) not null
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
	(1, 'https://www.youtube.com/embed/fvT7W5LHxF4', 'Trailer Coraline - Latino', 'Trailer en latino de la película Coraline', 'Laika Studios'),
	(1, 'https://www.youtube.com/embed/uGU3KLfT81I', 'EL DÍA DESPÚES DE MAÑANA', 'Cuando una nueva Edad de hielo amenaza al mundo, el climatólogo Jack Hall intenta salvar a la humanidad desde Nueva York, al mismo tiempo que busca a su hijo Sam.', 'Cine Studios'),
	(1, 'https://www.youtube.com/embed/K0SKf0K3bxg', 'Juno', 'Juno Enfrentada a un embarazo no planificado, una mujer joven poco convencional toma una decisión inusual con respecto a su hijo por nacer.', 'Paramount Pictures'),
	(2, 'https://www.youtube.com/embed/4INwx_tmTKw', 'Cuerdas', 'Cuerdas" is a short film written and directed by Pedro Solís García. "Cuerdas" was the 2014 winner of the the Goya ® award for "the Best Spanish short film animation". We hope you enjoy it!', 'Disney'),
	(2, 'https://www.youtube.com/embed/SpMr8mrsct4', 'Blue', 'Roblox Rainbow Friends es un juego sobre un grupo de personas que van de viaje a un parque de diversiones llamado Strange World, pero terminan siendo secuestrados por una figura misteriosa y los jugadores se ven obligados a recolectar elementos mientras evitan los monstruos que aparecen en la noche. El juego consta de 5 noches que transcurren en un lugar extraño. En la primera noche, aparecerá el primer Rainbow Friend: Blue. Debes encontrar 24 cubos de juguete y colocarlos en el teatro. Blue deambula por el mapa buscando al jugador y te perseguirá y matará a menos que te escondas en un casillero o caja.', 'Hornstromp'),
	(2, 'https://www.youtube.com/embed/bR2X6sqsAiY', 'Contaminación ambiental', 'Animación que nos invita a hacer conciencia acerca de la contaminación y los estragos que dejan los abusos del hombre', 'Steve Cutts'),
	(3, 'https://www.youtube.com/embed/o_pZZQvizAA', '¿Como se fabrica un auto?', 'Relájate y disfruta en HD del proceso de ensamblado de un Auto explicado en pocos minutos.', 'Lobo Tec'),
	(3, 'https://www.youtube.com/embed/RXzr7g-N0-A', 'Fabirca un choce eléctrico casero', 'Buenas amigos y amigas, en este vídeo os enseñare a cómo hacer un coche elétrico casero.', 'InventorTV'),
	(4, 'https://www.youtube.com/embed/0Th6L81m8YE', 'Requiem KV 626: Lacrimosa', 'La Misa de Réquiem en re menor, K. 626, es una misa de Wolfgang Amadeus Mozart, basada en los textos latinos para el réquiem, es decir, el acto litúrgico católico celebrado tras el fallecimiento de una persona. Se trata de la decimonovena y última misa escrita por Mozart, que murió en 1791, antes de terminarla.', 'Wolfgang Amadeus Mozart'),
	(4, 'https://www.youtube.com/embed/mGQLXRTl3Z0', 'Suite No1', 'Tras estos compases (33-38) se libera parte de la tensión acumulada y el movimiento acaba de forma brillante con un amplio acorde. La allemande (4/4) posee equilibrio en las proporciones y una escritura limpia y ligera, poco usual en las allemandes de Bach.', 'Mischa Maisky'),
	(4, 'https://www.youtube.com/embed/U6fPNxPGTbk', 'SINFONIA INDIA de Carlos Chavez Dirige G Dudamel', 'Sinfonía india es la Sinfonía núm. 2 de Carlos Chávez, compuesta entre 1935 y 1936. En un solo movimiento, sus secciones siguen, sin embargo, el patrón tradicional de una sinfonía de tres movimientos. El título hace alusión al hecho de que el material temático consta de tres melodías provenientes de tribus nativas americanas del norte de México. La sinfonía es la composición más popular de Chávez.', 'G Dudamel'),
	(5, 'https://www.youtube.com/embed/MaorpnopNA4', 'Nombres de animales', 'Aprende sobre los animales con este video.', 'Safari kids'),
	(5, 'https://www.youtube.com/embed/ga9tXF4Qm2o', 'GRANDES Y PEQUEÑOS | Los extremos de la naturaleza', 'Ya sea en el reino animal o en el mundo de las plantas, nuestra Tierra está habitada por formas de vida tanto grandes como pequeñas. Enormes ballenas azules, de más de 30 metros de longitud, se mueven a la deriva por los océanos, mientras que minúsculos caballitos de mar pigmeos se refugian de las fuertes corrientes en las frágiles ramas de los arrecifes de coral.', 'Ciencia y cultura'),
	(6, 'https://www.youtube.com/embed/y2E-NE7Mx1U', 'Barcelona chocará con Cristiano y el United en octavos de UEL. Otra prueba para Xavi | Exclusivos', 'Realizado el sorteo para los octavos de final de la UEFA Europa League, el Barcelona tendrá que regresar, tres años después, a Old Trafford para enfrentar al Manchester United en la ronda de play-off de la Europa League. El partido de ida se disputará en el Camp Nou el 16 de febrero de 2023 y una semana después se jugará la vuelta en Inglaterra. Carolina Guillén, Moisés Llorens, Rodrigo Fáez y Gemma Soler analizan cómo quedaron conformados los cruces. #Exclusivos #Barcelona #ManchesterUnited | ESPN Deportes', 'ESPN Deportes'),
	(6, 'https://www.youtube.com/embed/_B-SkeCykMM', 'Final | Curling | Dobles mixto - Beijing 2022', 'Te traemos la gran final de Curling en la rama de dobles mixto de los Juegos Olímpicos de Invierno Beijing 2022 desde el Centro Acuático Nacional, evento que podrás ver en vivo y en directo por MARCA Claro y Claro Sports.', 'Claro'),
	(6, 'https://www.youtube.com/embed/jXCgE7JpvlY', 'Colombia se lleva el triunfo en un segundo tiempo de terror para la selección mexicana', 'Concluyó la fase de preparación de la Selección mexicana en el continente americano. Las giras por Estados Unidos se acabaron y el equipo de Gerardo Martino deja muchísimas dudas de cara a la gira final por Girona, tras caer ante Colombia por 2-3, en un duelo que México ganaba con comodidad y que no supo manejar.', 'Claro'),
	(7, 'https://www.youtube.com/embed/QXt21aGi_nQ', 'Costa Rica (ICT) | Promoción turística internacional', 'Campaña en Costa Rica "Vamos a A Turistear :¿A vos qué te falta sentir por primera vez?" www.vamosaturistear.com', 'ITC'),
	(7, 'https://www.youtube.com/embed/Ri6oC8GEXHM', 'TURISMO | ¿Qué es El Turismo? Beneficios y Tipos de Turistas', 'Te explicamos qué es el #turismo y cuáles son sus beneficios desde distintos puntos de vista. Además, los diferentes tipos de #turistas.', '¿Qué es?'),
	(8, 'https://www.youtube.com/embed/-K0e6YE4u0Q', 'NO PUEDES SER TÚ... | Karmaland V #47', 'Todos estamos locos', 'Rubius Z'),
	(8, 'https://www.youtube.com/embed/glRPXXIrY3M', '¡NUEVO SLIME GORDO! | Slime Rancher 2 #21', 'Seguimos explorando amigos! :D', 'Gona89'),
	(9, 'https://www.youtube.com/embed/bBTo3-gHfYk', '¡Ya no me alcanza el dinero para vivir en mi casa! | Rentas y extranjeros en CDMX', 'Un pequeño análisis de cómo se está desarrollando la “gentrificación” en ciertas colonias de la Ciudad de México; una situación que beneficia a algunos, pero afecta a otros. ¿Cuál es tu opinión?', 'Luisito Comunica'),
	(9, 'https://www.youtube.com/embed/eRRY3ovZIXY', 'VLOG EN ESPAÑOL (Una semana en mi vida...)', 'Espero y les guste! Denle LIKE si quieren ver mas videos en español! Los amo! XOXO', 'Selene Mendez'),
	(10, 'https://www.youtube.com/embed/vVItdOFIMT4', 'SI TE RÍES PIERDES NIVEL DIOS EXTREMO 999.99% IMPOSIBLE NO REÍRSE Videos De Risa Muy Graciosos', '►►►►► GRACIAS POR VER EL VÍDEO ◄◄◄◄◄', 'Fercho'),
	(10, 'https://www.youtube.com/embed/EVbU45-1Zw0', 'LOS MEJORES VIDEOS DE RISA DEL 2022', 'LOS MEJORES VIDEOS DE RISA DEL 2022', 'The Yolo'),
	(11, 'https://www.youtube.com/embed/uc4_lL0LjTA', 'Caso 905 | Caso Cerrado', 'aso Cerrado es conducido por la querida Doctora en leyes Cubana-Americana Ana María Polo. Este programa presenta casos conflictivos y conmovedores entre participantes en litigio, vas a sentirte identificado, querrás tomar partido y ser testigo de la solución y decisión basadas en la verdad y en las evidencias.', 'Telemundo'),
	(11, 'https://www.youtube.com/embed/iNZnnMGypjY', '65 Curiosidades del MUNDO que debes conocer', '65 datos del mundo que tal vez aún no conoces', 'YetiViral'),
	(12, 'https://www.youtube.com/embed/4CTr0pfFhvw', '¿QUE ES LA POLÍTICA? en minutos', '#política #Quédateencasa ¿QUE ES LA POLÍTICA?', 'En minutos'),
	(12, 'https://www.youtube.com/embed/81eWnIOLyAc', 'State of the Union 2020: Highlights from Donald Trump’s speech', 'U.S. President Donald Trump touted America’s economic growth, praised the formation of the U.S. Space Force and promised the country would be the first to plant its flag on Mars as he delivered his third State of the Union address on Tuesday, February 4, 2020.', 'Global News'),
	(13, 'https://www.youtube.com/watch?v=yEhk8PbWcHw', 'Corto sobre el esfuerzo y el poder transformador de la educación', 'El corto es una muestra de cómo crecen los niños en los procesos de aprendizaje, una reflexión sobre las consecuencias de no esforzarse en el largo camino de la educación y a través de los premios que recibe la niña, refleja la importancia de valorar el proceso mucho más que el resultado.', 'CEyAP Centro de Estudios y Atención Psicopedagógica'),
	(13, 'https://www.youtube.com/embed/ra0QjuGlk7Y', 'Versión Completa. “La educación es un arma muy importante para la autoestima”. Dr. Valentín Fuster', 'Valentín Fuster Carulla es internacionalmente reconocido como uno de los médicos y promotores de la educación de la salud más prestigiosos del mundo.', 'Aprendemos Juntos 2030'),
	(14, 'https://www.youtube.com/embed/iW9hp_Y-PdU', 'SCIENCE AND TECHNOLOGY: What are they and what are their DIFFERENCES? (with EXAMPLES)', 'Science and technology; we explain what they consist of, their characteristics, their differences and we give several examples.', 'Lifeder Education');

insert into streaming_user(username, password, active, roles, permissions, email, name, surname) values
('joelm', '$2a$12$6jU0vpw1bEzRdf7kcD8TAu9dj6DuXocjCASdB2FitgmzCN2z5nK2m', 1, 'ADMIN', 'ADMIN', 'joelm.01@gmail.com', 'Joel', 'Mora'),
('carlosmp', '$2a$12$6jU0vpw1bEzRdf7kcD8TAu9dj6DuXocjCASdB2FitgmzCN2z5nK2m', 1, 'ADMIN', 'ADMIN', 'carlos.01@gmail.com', 'Carlos', 'Meneses'),
('pablot5', '$2a$12$6jU0vpw1bEzRdf7kcD8TAu9dj6DuXocjCASdB2FitgmzCN2z5nK2m', 1, 'USER', 'USER', 'pablo_lolo@gmail.com', 'Pablo', 'Lopez');

insert into roles_tbl(roles) values ('ADMIN'), ('USER');

-- VISTA ESTADISTICAS DE VIDEO
create view statistics_video as
select c.id as id, count(v.id) as relative_count, c.name as category_name from video v inner join category c on v.category_id = c.id group by v.category_id;


-- VISTA ESTADISTICAS DE USUARIO
create view statistics_user as
select r.id as id, count(u.id) as relative_count, r.roles as role_name from streaming_user u inner join roles_tbl r on u.roles = r.roles group by r.id;

