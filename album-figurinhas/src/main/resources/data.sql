CREATE TABLE TB_TECNICOS(
    ID_TECNICO INTEGER PRIMARY KEY AUTO_INCREMENT,
    NOME_TECNICO VARCHAR(100),
    IDADE_TECNICO INTEGER
);

CREATE TABLE TB_ALBUM(
    ID_ALBUM INTEGER PRIMARY KEY AUTO_INCREMENT,
    NOME_ALBUM VARCHAR(100),
    DESCRICAO_ALBUM VARCHAR(100)
);

CREATE TABLE TB_USUARIO (
    ID_USUARIO INTEGER PRIMARY KEY AUTO_INCREMENT,
    NOME_USUARIO VARCHAR(100),
    SENHA_USUARIO VARCHAR(100),
    ALBUM_ID INTEGER REFERENCES TB_ALBUM(ID_ALBUM)
);

CREATE TABLE TB_SELECOES(
    ID_SELECAO INTEGER PRIMARY KEY AUTO_INCREMENT,
    NOME_SELECAO VARCHAR(100),
    DESCRICAO_SELECAO VARCHAR(100),
    EMBLEMA_SELECAO VARCHAR(100),
    ALBUM_ID INTEGER REFERENCES TB_ALBUM(ID_ALBUM),
    TECNICO_ID INTEGER REFERENCES TB_TECNICOS(ID_TECNICO)
);

CREATE TABLE TB_JOGADORES(
    ID_JOGADOR INTEGER PRIMARY KEY AUTO_INCREMENT,
    NOME_JOGADOR VARCHAR(100),
    IDADE_JOGADOR INTEGER,
    SELECAO_ID INTEGER REFERENCES TB_SELECOES(ID_SELECAO)
);

CREATE TABLE TB_TITULOS(
    ID_TITULO INTEGER PRIMARY KEY AUTO_INCREMENT,
    NOME_TITULO VARCHAR(100)
);

CREATE TABLE TB_PACOTE(
    ID_PACOTE INTEGER PRIMARY KEY AUTO_INCREMENT
);

CREATE TABLE TB_TITULOS_JOGADOR(
    ID_TITULO_JOGADOR INTEGER PRIMARY KEY AUTO_INCREMENT,
    JOGADOR_ID INTEGER REFERENCES TB_JOGADORES(ID_JOGADOR),
    TITULO_ID INTEGER REFERENCES TB_TITULOS(ID_TITULO)
);

CREATE TABLE TB_TITULOS_TECNICO(
    ID_TITULO_TECNICO INTEGER PRIMARY KEY AUTO_INCREMENT,
    TECNICO_ID INTEGER REFERENCES TB_TECNICOS(ID_TECNICO),
    TITULO_ID INTEGER REFERENCES TB_TITULOS(ID_TITULO)
);

CREATE TABLE TB_TITULOS_SELECAO(
    ID_TITULO_SELECAO INTEGER PRIMARY KEY AUTO_INCREMENT,
    SELECAO_ID INTEGER REFERENCES TB_SELECOES(ID_SELECAO),
    TITULO_ID INTEGER REFERENCES TB_TITULOS(ID_TITULO)
);

CREATE TABLE TB_PACOTE_JOGADORES(
    ID_PACOTE_JOGADORES INTEGER PRIMARY KEY AUTO_INCREMENT,
    JOGADOR_ID INTEGER REFERENCES TB_JOGADORES(ID_JOGADOR),
    PACOTE_ID INTEGER REFERENCES TB_PACOTE(ID_PACOTE)
);


insert into tb_album (nome_album, descricao_album)
values ('Album copa 2022', 'Album de figurinhas');

insert into tb_tecnicos (nome_tecnico, idade_tecnico)
values ('Adenor Leonardo Bachi', 61);

insert into tb_tecnicos (nome_tecnico, idade_tecnico)
values ('Lionel Sebastián Scaloni', 44);

insert into tb_selecoes (nome_selecao, descricao_selecao, emblema_selecao, album_id, tecnico_id)
values ('Brasil', 'Selecão Brasileira de Futebol', 'Canarinho', 1 , 1);

insert into tb_selecoes (nome_selecao, descricao_selecao, emblema_selecao, album_id, tecnico_id)
values ('Argentina', 'Selecão Argentina de Futebol', 'La Albiceleste', 1 , 2);

insert into tb_jogadores (nome_jogador, idade_jogador, selecao_id)
values ('Neymar da Silva Santos Júnior', 30, 1);

insert into tb_jogadores (nome_jogador, idade_jogador, selecao_id)
values ('Alisson Ramses Becker', 29, 1);

insert into tb_jogadores (nome_jogador, idade_jogador, selecao_id)
values ('Vinícius José Paixão de Oliveira Júnior', 22, 1);

insert into tb_jogadores (nome_jogador, idade_jogador, selecao_id)
values ('Antony Matheus dos Santos', 22, 1);

insert into tb_jogadores (nome_jogador, idade_jogador, selecao_id)
values ('Carlos Henrique Casimiro', 30, 1);

insert into tb_jogadores (nome_jogador, idade_jogador, selecao_id)
values ('Thiago Emiliano da Silva ', 37, 1);

insert into tb_jogadores (nome_jogador, idade_jogador, selecao_id)
values ('Marcos Aoás Corrêa', 28, 1);

insert into tb_jogadores (nome_jogador, idade_jogador, selecao_id)
values ('Daniel Alves da Silva', 39, 1);

insert into tb_titulos (nome_titulo)
values ('Copa das Confederações');

insert into tb_titulos (nome_titulo)
values ('Olimpiadas');

insert into tb_titulos (nome_titulo)
values ('Copa do Mundo');

insert into tb_titulos_jogador (jogador_id, titulo_id)
values (1,1);

insert into tb_titulos_jogador (jogador_id, titulo_id)
values (1,2);

insert into tb_titulos_selecao (selecao_id, titulo_id)
values (1, 3);

insert into tb_titulos_tecnico (tecnico_id, titulo_id)
values (1, 1);