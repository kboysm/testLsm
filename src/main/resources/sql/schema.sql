CREATE TABLE List_Board( 
idx NUMBER NOT NULL,
title VARCHAR2(20) NOT NULL,
writer VARCHAR2(20) NOT NULL,
content VARCHAR2(300) NOT NULL,
reg_date  DATE DEFAULT SYSDATE,
view_cnt NUMBER DEFAULT 0,
PRIMARY KEY(idx)
);

create sequence List_Board_seq start with 1 increment by 1 nomaxvalue nocache;  