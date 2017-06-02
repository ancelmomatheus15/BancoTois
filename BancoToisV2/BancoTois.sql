CREATE TABLE correntista(
nome VARCHAR (100) not null,
RG VARCHAR (9) not null,
CPF VARCHAR (11)not null,
endereco VARCHAR(100)not null,
familiar VARCHAR(100),
parentesco VARCHAR(50),
emprego CHAR(1),
PRIMARY KEY(CPF)
);

CREATE TABLE conta(
correntista VARCHAR (11) not null,
numConta VARCHAR (6) not null,
numAgencia VARCHAR (6)not null,
tipo VARCHAR(100)not null,
taxa VARCHAR(100),
anuidade FLOAT,
saldo FLOAT not null,
senha VARCHAR (6) not null,
PRIMARY KEY(numConta),
FOREIGN KEY(correntista) REFERENCES correntista (CPF)
);

CREATE TABLE transacoes(
codTransacao VARCHAR(6) NOT NULL,
valor FLOAT not null,
contaFrom VARCHAR(6) not null,
contaTo VARCHAR(6) not null,
PRIMARY KEY(codTransacao),
FOREIGN KEY(contaFrom) REFERENCES conta (numConta),
FOREIGN KEY(contaTo) REFERENCES conta (numConta)
)

