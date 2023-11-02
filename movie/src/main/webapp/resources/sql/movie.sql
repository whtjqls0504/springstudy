DROP SEQUENCE MOVIE_SEQ;
CREATE SEQUENCE MOVIE_SEQ NOCACHE;

DROP TABLE MOVIE;
CREATE TABLE MOVIE(
    NO          NUMBER          NOT NULL,
    TITLE       VARCHAR2(100 BYTE),
    GENRE       VARCHAR2(100 BYTE),
    DESCRIPTION VARCHAR2(500 BYTE),
    STAR        NUMBER,
    CONSTRAINT PK_MOVIE PRIMARY KEY(NO)
);

INSERT INTO MOVIE VALUES(MOVIE_SEQ.NEXTVAL, '터미네이터',               'SF', '인간과 기계의 대전쟁', '5');
INSERT INTO MOVIE VALUES(MOVIE_SEQ.NEXTVAL, '아바타',                   'SF', '판도라 행성으로 향한 인류', '5');
INSERT INTO MOVIE VALUES(MOVIE_SEQ.NEXTVAL, '에일리언',                 '공포', '에일리언과의 사투', '4.5');
INSERT INTO MOVIE VALUES(MOVIE_SEQ.NEXTVAL, '엑소시스트',               '공포', '악마의 말은 듣지말게', '3.5');
INSERT INTO MOVIE VALUES(MOVIE_SEQ.NEXTVAL, '쇼생크탈출',               '드라마', '희망은 너를자유롭게 하리라', '5');
INSERT INTO MOVIE VALUES(MOVIE_SEQ.NEXTVAL, '집으로',                   '드라마', '할머니 저 왔어요', '3');
INSERT INTO MOVIE VALUES(MOVIE_SEQ.NEXTVAL, '그대들은 어떻게 살 것인가', '애니메이션', '미야자키 하야오의 은퇴작', '3.5');
INSERT INTO MOVIE VALUES(MOVIE_SEQ.NEXTVAL, '센과 치히로의 행방불명',    '애니메이션', '금지된 신들의 세계로 온 치히로', '4.5');
INSERT INTO MOVIE VALUES(MOVIE_SEQ.NEXTVAL, '하울의 움직이는 성',        '애니메이션', '인생은 회전목마', '2.3');
INSERT INTO MOVIE VALUES(MOVIE_SEQ.NEXTVAL, '벼랑위의 포뇨',             '애니메이션', '미운 4살', '4');
