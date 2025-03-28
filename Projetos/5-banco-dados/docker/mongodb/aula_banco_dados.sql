CREATE TABLE aula-banco-dados.usuarios (
	id INT,
	nome VARCHAR(255) NOT NULL COMMENT 'Nome do usuário',
	email VARCHAR(255) NOT NULL UNIQUE COMMENT 'E-mail do usuário',
	endereco VARCHAR(50) NOT NULL COMMENT 'Endereço do usuário',
	data_nascimento DATE NOT NULL COMMENT 'Data de nascimento do usuário'
);

CREATE TABLE aula-banco-dados.destinos (
	id INT,
	nome VARCHAR(255) NOT NULL UNIQUE COMMENT 'Nome do destino',
	descricao VARCHAR(255) NOT NULL COMMENT 'Descrição do destino'
);

CREATE TABLE reservas (
	id INT COMMENT 'Identificacao único da reserva',
	id_usuario INT COMMENT 'Referência ao ID do usuário que fez a reserva',
	id_destino INT COMMENT 'Referência ao ID do destino da reserva',
	data DATE COMMENT 'Data da reserva',
	status VARCHAR(255) DEFAULT 'pendente' COMMENT 'Status da reserva (confirmada, pendente, cancelada, etc.)'
);

ALTER TABLE usuarios MODIFY COLUMN id INT PRIMARY KEY AUTO_INCREMENT;
ALTER TABLE destinos MODIFY COLUMN id INT PRIMARY KEY AUTO_INCREMENT;
ALTER TABLE reservas MODIFY COLUMN id INT PRIMARY KEY AUTO_INCREMENT;
ALTER TABLE reservas ADD CONSTRAINT fk_reservas_usuarios FOREIGN KEY(id_usuario) REFERENCES usuarios(id) ON DELETE CASCADE;
ALTER TABLE reservas ADD CONSTRAINT fk_reservas_destinos FOREIGN KEY(id_destino) REFERENCES destinos(id) ON DELETE CASCADE;