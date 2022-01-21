--------------------------------------------------------
--  ������ ������ - �ݿ���-1��-21-2022   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table STUDENT
--------------------------------------------------------

  CREATE TABLE "STUDENT" 
   (	"STUDENT_NO" VARCHAR2(8 BYTE), 
	"NAME" VARCHAR2(30 BYTE), 
	"MAJOR_NO" NUMBER(2,0), 
	"SCORE" NUMBER(3,2)
   ) ;
--------------------------------------------------------
--  DDL for Table MAJOR
--------------------------------------------------------

  CREATE TABLE "MAJOR" 
   (	"MAJOR_NO" NUMBER(2,0), 
	"MAJOR_NAME" VARCHAR2(30 BYTE)
   ) ;
REM INSERTING into STUDENT
SET DEFINE OFF;
Insert into STUDENT (STUDENT_NO,NAME,MAJOR_NO,SCORE) values ('20171955','������',5,1.45);
Insert into STUDENT (STUDENT_NO,NAME,MAJOR_NO,SCORE) values ('20191770','������',5,3.89);
Insert into STUDENT (STUDENT_NO,NAME,MAJOR_NO,SCORE) values ('20181265','������',5,1.83);
Insert into STUDENT (STUDENT_NO,NAME,MAJOR_NO,SCORE) values ('20201524','������',2,2.33);
Insert into STUDENT (STUDENT_NO,NAME,MAJOR_NO,SCORE) values ('20171888','�赿��',10,3.15);
Insert into STUDENT (STUDENT_NO,NAME,MAJOR_NO,SCORE) values ('20161508','�赿��',4,0.61);
Insert into STUDENT (STUDENT_NO,NAME,MAJOR_NO,SCORE) values ('20201847','�谭��',6,3.2);
Insert into STUDENT (STUDENT_NO,NAME,MAJOR_NO,SCORE) values ('20161781','��ǿ�',7,3.38);
Insert into STUDENT (STUDENT_NO,NAME,MAJOR_NO,SCORE) values ('20181392','�ΰ��',8,1.4);
Insert into STUDENT (STUDENT_NO,NAME,MAJOR_NO,SCORE) values ('20211911','�ͻ���',9,0.76);
Insert into STUDENT (STUDENT_NO,NAME,MAJOR_NO,SCORE) values ('20201933','�����',9,4.16);
Insert into STUDENT (STUDENT_NO,NAME,MAJOR_NO,SCORE) values ('20211767','������',8,1.88);
Insert into STUDENT (STUDENT_NO,NAME,MAJOR_NO,SCORE) values ('20191428','������',7,3.91);
Insert into STUDENT (STUDENT_NO,NAME,MAJOR_NO,SCORE) values ('20201205','�μ���',6,0.61);
Insert into STUDENT (STUDENT_NO,NAME,MAJOR_NO,SCORE) values ('20211382','�ں���',6,2.66);
Insert into STUDENT (STUDENT_NO,NAME,MAJOR_NO,SCORE) values ('20201702','�ں���',9,2.24);
Insert into STUDENT (STUDENT_NO,NAME,MAJOR_NO,SCORE) values ('20171759','�ڻ��',8,3.15);
Insert into STUDENT (STUDENT_NO,NAME,MAJOR_NO,SCORE) values ('20161902','�ڼ���',7,1.84);
Insert into STUDENT (STUDENT_NO,NAME,MAJOR_NO,SCORE) values ('20161002','������',9,1.5);
Insert into STUDENT (STUDENT_NO,NAME,MAJOR_NO,SCORE) values ('20201696','���μ�',3,0.88);
Insert into STUDENT (STUDENT_NO,NAME,MAJOR_NO,SCORE) values ('20191563','������',9,1.13);
Insert into STUDENT (STUDENT_NO,NAME,MAJOR_NO,SCORE) values ('20161776','������',1,2.13);
Insert into STUDENT (STUDENT_NO,NAME,MAJOR_NO,SCORE) values ('20211835','�۱�â',10,1.04);
Insert into STUDENT (STUDENT_NO,NAME,MAJOR_NO,SCORE) values ('20161717','�Źμ�',2,0.82);
Insert into STUDENT (STUDENT_NO,NAME,MAJOR_NO,SCORE) values ('20171770','�Ž¹�',7,2.49);
Insert into STUDENT (STUDENT_NO,NAME,MAJOR_NO,SCORE) values ('20181636','��ȫ��',6,2.47);
Insert into STUDENT (STUDENT_NO,NAME,MAJOR_NO,SCORE) values ('20181678','������',3,3.47);
Insert into STUDENT (STUDENT_NO,NAME,MAJOR_NO,SCORE) values ('20171926','������',2,3.36);
Insert into STUDENT (STUDENT_NO,NAME,MAJOR_NO,SCORE) values ('20181190','�쵿��',4,3.85);
Insert into STUDENT (STUDENT_NO,NAME,MAJOR_NO,SCORE) values ('20181875','������',8,2.2);
Insert into STUDENT (STUDENT_NO,NAME,MAJOR_NO,SCORE) values ('20219988','ȫ�浿',3,3.15);
REM INSERTING into MAJOR
SET DEFINE OFF;
Insert into MAJOR (MAJOR_NO,MAJOR_NAME) values (1,'���ڰ��а�');
Insert into MAJOR (MAJOR_NO,MAJOR_NAME) values (2,'ȭ�а��а�');
Insert into MAJOR (MAJOR_NO,MAJOR_NAME) values (3,'������а�');
Insert into MAJOR (MAJOR_NO,MAJOR_NAME) values (4,'�濵�а�');
Insert into MAJOR (MAJOR_NO,MAJOR_NAME) values (5,'��ǻ�Ͱ��а�');
Insert into MAJOR (MAJOR_NO,MAJOR_NAME) values (6,'������ϰ�');
Insert into MAJOR (MAJOR_NO,MAJOR_NAME) values (7,'������а�');
Insert into MAJOR (MAJOR_NO,MAJOR_NAME) values (8,'�����а�');
Insert into MAJOR (MAJOR_NO,MAJOR_NAME) values (9,'����ɸ��а�');
Insert into MAJOR (MAJOR_NO,MAJOR_NAME) values (10,'ȯ����а�');
Insert into MAJOR (MAJOR_NO,MAJOR_NAME) values (11,'�׽�Ʈ');
--------------------------------------------------------
--  DDL for Index SYS_C007020
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYS_C007020" ON "STUDENT" ("STUDENT_NO") 
  ;
--------------------------------------------------------
--  DDL for Index SYS_C007021
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYS_C007021" ON "MAJOR" ("MAJOR_NO") 
  ;
--------------------------------------------------------
--  DDL for Trigger UPDATE_MAJOR
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UPDATE_MAJOR" 
after delete or insert or update
of major_no, major_name on major
for each row
begin
    insert into log values(log_seq.nextval,sysdate,:new.major_no || ' ' || :new.major_name);
end;
/
ALTER TRIGGER "UPDATE_MAJOR" ENABLE;
--------------------------------------------------------
--  Constraints for Table STUDENT
--------------------------------------------------------

  ALTER TABLE "STUDENT" ADD CONSTRAINT "NOT_SPACE" CHECK (instr(name, ' ')=0) ENABLE;
  ALTER TABLE "STUDENT" ADD CONSTRAINT "CHECK_SCORE" CHECK (score >= 0.0 and score <= 4.5) ENABLE;
  ALTER TABLE "STUDENT" ADD PRIMARY KEY ("STUDENT_NO") ENABLE;
--------------------------------------------------------
--  Constraints for Table MAJOR
--------------------------------------------------------

  ALTER TABLE "MAJOR" ADD PRIMARY KEY ("MAJOR_NO") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table STUDENT
--------------------------------------------------------

  ALTER TABLE "STUDENT" ADD CONSTRAINT "MAJOR_NO_FK" FOREIGN KEY ("MAJOR_NO")
	  REFERENCES "MAJOR" ("MAJOR_NO") ON DELETE CASCADE ENABLE;
