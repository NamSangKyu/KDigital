create table board(
    bno number primary key,
    title varchar2(200),
    content varchar2(1000),
    writer varchar2(20),
    bdate date default sysdate,
    bcount number
);
alter table board modify bdate date default sysdate;
create sequence board_no start with 1;

create table board_comment(
    cno number primary key,
    bno number,
    content varchar2(300),
    writer varchar2(20),
    cdate date default sysdate
);
alter table board_comment modify cdate date default sysdate;
alter table board_comment add constraint board_comment_fk foreign key(bno) references
board(bno) on delete cascade;

create table board_like(
    bno number,
    writer varchar2(20),
    constraint board_like_pk primary key(bno,writer)    
);
alter table board_like add constraint board_like_fk foreign key(bno) references
board(bno) on delete cascade;
create table board_hate(
    bno number,
    writer varchar2(20),
    constraint board_hate_pk primary key(bno,writer)    
);
alter table board_hate add constraint board_hate_fk foreign key(bno) references
board(bno) on delete cascade;