CREATE TABLE persona(
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(200) NOT NULL,
    apellido VARCHAR(200),
    correo VARCHAR(200) UNIQUE NOT NULL,
    fecha_nacimiento DATE NOT NULL
);

CREATE TABLE usuario(
    id SERIAL PRIMARY KEY,
    username VARCHAR(150) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    persona_id INT UNIQUE NOT NULL,

    CONSTRAINT fk_persona_id FOREIGN KEY (persona_id) REFERENCES persona(id)
);

CREATE TABLE registro(
    id SERIAL PRIMARY KEY,
    tipo BOOLEAN NOT NULL,
    categoria VARCHAR(100) NOT NULL,
    valor DECIMAL(15,4) NOT NULL,
    descripcion VARCHAR(255),
    fecha DATE NOT NULL,
    usuario_id INT NOT NULL,

    CONSTRAINT fk_usuario_id FOREIGN KEY (usuario_id) REFERENCES usuario(id)
);

CREATE TABLE ahorro(
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(200) NOT NULL,
    valor DECIMAL(15,4) NOT NULL,
    fecha_inicio DATE NOT NULL,
    fecha_final DATE NOT NULL,
    usuario_id INT NOT NULL,

    CONSTRAINT fk_usuario_id FOREIGN KEY (usuario_id) REFERENCES usuario(id)
);

CREATE TABLE alerta(
    id SERIAL PRIMARY KEY,
    estado VARCHAR(1000) NOT NULL,
    porcentaje INT NOT NULL,
    fecha DATE NOT NULL,
    ahorro_id INT NOT NULL,

    CONSTRAINT fk_ahorro_id FOREIGN KEY (ahorro_id) REFERENCES ahorro(id)
);
