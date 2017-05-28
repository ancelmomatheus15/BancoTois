CREATE DATABASE BancoTois
USE BancoTois

CREATE TABLE correntista(
id INT IDENTITY (101, 1) not null,
nome VARCHAR (100) not null,
RG VARCHAR (9) not null,
CPF VARCHAR (11)not null,
endereco VARCHAR(100)not null,
familiar VARCHAR(100),
parentesco VARCHAR(50),
emprego BIT
PRIMARY KEY(CPF)
)

CREATE TABLE conta(
id INT IDENTITY (201, 1) not null,
correntista VARCHAR (11) not null,
numConta VARCHAR (6) not null,
numAgencia VARCHAR (6)not null,
tipo VARCHAR(100)not null,
taxa VARCHAR(100),
anuidade FLOAT,
saldo FLOAT not null,
senha VARCHAR (6) not null
PRIMARY KEY(numConta)
FOREIGN KEY(correntista) REFERENCES correntista (CPF)
)

CREATE TABLE transacoes(
id INT IDENTITY (301, 1) not null,
valor FLOAT not null,
contaFrom VARCHAR(6) not null,
contaTo VARCHAR(6) not null
PRIMARY KEY(id)
FOREIGN KEY(contaFrom) REFERENCES conta (numConta),
FOREIGN KEY(contaTo) REFERENCES conta (numConta)
)

INSERT INTO correntista VALUES
('Matheus', '000000000', '00000000001', 'rua pao com ovo, 333', 'Iraide', 'mae', 1),
('Claudio', '000000000', '00000000002', 'rua das couves, 123', 'Mariana', 'filha', 1),
('Iraide', '000000000', '00000000003', 'alameda do bolo, 761', 'Matheus', 'filho', 1),
('Mariana', '000000000', '00000000004', 'avenida bizarra, 649', 'Claudio', 'pai', 0)

INSERT INTO conta VALUES
('00000000001', '123456', '321123', 'Corrente', '0,3', 12.4, 00.00, '150796'),
('00000000002', '456654', '321123', 'Corrente', '0,5', 50.7, 00.00, '150796'),
('00000000003', '123890', '321123', 'Corrente', '0,5', 50.7, 00.00, '150796'),
('00000000004', '567432', '321123', 'Poupanca', '0,0', 00.0, 00.00, '150796')

SELECT * FROM conta
SELECT * FROM correntista