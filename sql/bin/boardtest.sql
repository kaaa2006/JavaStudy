create table member(
mno number(5) not null, 
bwriter nvarchar2(10) not null, 
id nvarchar2(10) primary key,--무조건 들어가야 하기떄문에 not null  board 테이블의 bwriter 를 fk 관계 설정하려함(타입일치)
pw nvarchar2(10) not null,
regidate date default sysdate not null 
) 
--시퀀스 객체는 이미 1개 있으니 보드시퀄을 같이 사용
drop table member -- 멤버 테이블 삭제용 
-----------부모 더미 입력
insert into member (mno,bwriter,id,pw)
values (board_seq.nextval,'김기원','kkw','1234')
insert into member (mno,bwriter,id,pw)
values (board_seq.nextval,'이채윤','lcy','1234')
insert into member (mno,bwriter,id,pw)
values (board_seq.nextval,'권정인','kwon','1234')
insert into member (mno,bwriter,id,pw)
values (board_seq.nextval,'김수아','ksa','1234')
insert into member (mno,bwriter,id,pw)
values (board_seq.nextval,'전우신','jws','1234')
insert into member (mno,bwriter,id,pw)
values (board_seq.nextval,'이준영','ljy','1234')
insert into member (mno,bwriter,id,pw)
values (board_seq.nextval,'호지수','ho','1234')
select * from member

----------------------------------------------- member의 자식 board 외래키 생성 필수 --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------








drop table board
drop sequence board_seq 

create table board(
bno number(5) primary key,
btitle nvarchar2(30) not null,
bcontent nvarchar2(1000) not null,
bwriter nvarchar2(10) not null,
bdate date not null
)

create sequence board_seq increment by 1 start with 1 nocycle nocache

alter table board add constraint board_member_fk foreign key (bwriter) references member(id)

--board 테이블은 member의 자식 테이블로 member에 id과 board에 bwriter를 관계 설정 (외래키)------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
--ORA-02267: column type  -> pk와 fk를 붙여야함
-- 부모 테이블에 김기원이라는 값이 없음 kkw로 변경
delete from board -- 조건없이 delete를 실행하면 모든 테이터가 삭제됨 -> 외래키를 다시 지정


insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '비오내요~', '비오는데 등교하시는냐고 고생 하셨습니다.', 'kkw', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '안녕하세요~', '비오는데 등교하시는냐고 고생 하셨습니다.', 'lcy', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '감사합니다.~', '비오는데 등교하시는냐고 고생 하셨습니다.', 'kwon', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '수고하셨내요~', '비오는데 등교하시는냐고 고생 하셨습니다.', 'ho', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '화이팅하세요~', '비오는데 등교하시는냐고 고생 하셨습니다.', 'ljy', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '방갑습니다.~', '비오는데 등교하시는냐고 고생 하셨습니다.', 'jws', sysdate)


select * from board		



select b.*, m.bwriter from member m inner join board b on m.id = b.bwriter where id='ho'