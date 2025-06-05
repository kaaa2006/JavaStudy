/* Formatted on 2025/06/02 오후 1:15:35 (QP5 v5.336) */
DESC emp;            -- emp 테이블 구조보기

SELECT * FROM emp;  -- emp 테이블 내용보기

DESC dept;  -- dept 테이블 구조보기

SELECT * FROM dept;       -- dept 테이블 내용보기

DESC bonus; -- bonus 테이블 구조보기

SELECT * FROM bonus;     -- bonus 테이블 내용보기

DESC salgrade;    --salgrade 테이블 구조보기

SELECT * FROM salgrade;    -- salgrade 테이블 내용보기
-- order by  오름차순 정렬

  SELECT *
    FROM emp
ORDER BY sal;       -- order by 오름차순으로 sal 정렬
-- 테이블 부분 열 빠로 빼기

SELECT empno FROM emp;      -- 테이블 부분 열 empno 만 출력

SELECT ename FROM emp;        -- 테이블 부분 열 ename 만 출력

SELECT deptno FROM emp;         -- 테이블 부분 열 deptno 만 출력

SELECT empno, ename, deptno FROM emp;          -- 열을 쉼표로 구분하여 출력

SELECT DISTINCT deptno
  FROM emp;        -- distinct로 열 중복 제거하기  (열이 한 개인 경우)

SELECT DISTINCT job, deptno
  FROM emp;             -- 여러 개 열을 명시하여 중복 제거하기

SELECT ALL job, deptno
  FROM emp;           -- 중복되는 열 상관없이 그대로 출력직책,부서 번호 출력하기 (all사용)

SELECT ename, sal, sal * 12 + comm, comm FROM emp;     -- 열에 연산식을 사용하여 출력하기

SELECT ename,
       sal,
         sal
       + sal
       + sal
       + sal
       + sal
       + sal
       + sal
       + sal
       + sal
       + sal
       + sal
       + sal
       + comm,
       comm
  FROM emp;          -- sal*12을 하지 않으면 다 더해야한다.

SELECT ename, sal, sal * 12 + comm AS annsal, comm FROM emp;        --별칭지정하는 방식

SELECT ename, sal, sal * 12 + comm "annsal", comm FROM emp;         --문장 이후 한 칸 띄우고 별칭을 ("")로 묶어 지정

SELECT ename, sal, sal * 12 + comm AS annsal, comm FROM emp;        -- 가공된 문장 이후 as 별칭 지정

SELECT ename, sal, sal * 12 + comm AS "annsal", comm FROM emp;      -- 가공된 문장 이후 as 한칸 뒤에 별칭을 큰 ("")로 묵어 지정

--STRING SQL = "select ename, sal,sal*12+comm as "annsal", comm from emp";

select * from emp order by sal; -- 테이블의 모든 열을 급여 기준으로 오름차순 정렬하기  

select * from emp order by sal desc; -- 내림차순

select * from emp order by deptno asc,sal desc; -- 테이블의 전체 열을 부서 번호(오름차순)와 급여(내림차순)로 정렬하기

select * from emp; -- emp 테이블의 모든 열 출력

select * from emp where deptno = 30; -- 부서 번호 30인 데이터 출력

select * from emp where empno = 7499; -- 사원번호가 7499인 사원만 출력

select * from emp where deptno = 30 and job = 'salesman'; -- and 연산자로 여러개의 조건식 사용하기

select * from emp where deptno = 30 or job = 'clerk';-- or 연산자로 여러개의 출력조건 사용하기

select * from emp where deptno = 20 or job ='salesman'; -- 부서번호가 20 이거나 salesman인 데이터를 출력

select * from emp where sal*12 = 36000; -- 곱셈 연산 연산자를 사용한 예
    
select * from emp where sal >= 3000; -- 대소 비교 연산자를 사용하여 출력하기

select * from emp where ename >= 'f'; -- 문자를 대소 비교 연산자로 비교하기

select * from emp where  ename <= 'froz'; -- 문자열을 대소 비교 연산자로 비교


-- a와 b값이 다를 경우 true,같을 경우 false 반환
select * from emp where  sal !=  3000; -- 등가 비교 연사자(!=)

select * from emp where sal <> 3000; 

select * from emp where sal ^= 3000;

select * from emp where not sal = 3000; -- not 연산자를 사용하여 출력

select * from emp where JOB IN ('manager','salesman','clerk'); -- in연산자

select * from emp where job != 'manager' and job <> 'salesman' and job ^= 'clerk' ;--등가 비교 연산자와 and 연산자를 사용하여 출력

select * from emp where job not in ('manager','salesman','clerk'); -- analyst,president 인 데이터만출력

select * from emp where sal >= 2000 and sal <= 3000;  -- 최고,최소값 범위를 지정하여 해당 범위 내의 데이터만 조회 할 경우 between a and b연산자를 사용하면 더 간단하게 표현 할 수 있습니다
-- select [조회할 열 1 이름],[조회할 열 2이름]....[열 n이름] from [조회할 테이블 이름] where 열 이름 between 최솟값 and 최대값;
select * from emp where sal between 2000 and 3000; -- between a and b 연산자를 사용

select * from emp where sal not between 2000 and 3000; -- not 연산자 사용 between a and b 출력 

SELECT * FROM EMP WHERE ENAME LIKE 'S%'; -- ENAME LIKE 'S%'조건식은 ENAME열 값이 대문자 S로 시작하는 데이터를 조회하라는 뜻이다.

SELECT * FROM EMP WHERE ENAME LIKE '_L%'; -- 이름 두번째L이 들어간 사원만 출력 ( _ )을 넣어서 두번쨀  L 지정할수 있게 
 
SELECT * FROM EMP WHERE ENAME NOT LIKE '%AM%'; -- NOT 조건식을 붙여 AM이 들어간 이름 출력만 나오지 않게 지정출력

--SELECT * FROM SOME_TABLE  WHERE SOME_COLUMN LIKE 'A\_A%' ESCAPE '\' ;

SELECT  ENAME, SAL,SAL*12+COMM AS ANNSAL,COMM FROM EMP;   -- 별칭을 사용하여 열 이름을 출력

SELECT * FROM EMP WHERE  COMM = NULL; -- NULL 비교

SELECT * FROM EMP WHERE COMM IS NULL; -- COMM이 널이면 출력하도록  IS NULL 연산자

SELECT * FROM EMP WHERE MGR IS NOT NULL; -- MGR이 널이 아닌 데이터만 출력하도록 

SELECT * FROM EMP WHERE SAL > NULL AND COMM IS NULL; -- 

SELECT * FROM EMP WHERE SAL > NULL OR COMM IS NULL; -- OR 연산자와 IS NULL 연산자 사용하기

--SELECT EMPNO, ENAME,SAL,DEPTNO FROM MEP WHERE DEPTNO = 10 UNION SELECT EMPNO, ENAME ,SAL FROM EMP WHERE DEPTNO = 20;

SELECT EMPNO, ENAME, SAL ,DEPTNO FROM EMP WHERE DEPTNO = 10 UNION SELECT SAL,JOB,DEPTNO,SAL FROM EMP WHERE DEPTNO = 20;

SELECT EMPNO , ENAME , SAL, DEPTNO FROM EMP WHERE DEPTNO = 10 UNION SELECT EMPNO,ENAME,SAL,DEPTNO FROM EMP WHERE DEPTNO = 10; -- 집합연산자 (UNION)를 사용하여 출력

SELECT EMPNO,ENAME,SAL,DEPTNO FROM EMP WHERE DEPTNO = 10 UNION ALL SELECT EMPNO,ENAME,SAL,DEPTNO FROM EMP WHERE DEPTNO = 10; -- UNION ALL 출력

SELECT EMPNO, ENAME,SAL,DEPTNO FROM EMP MINUS SELECT EMPNO,ENAME,SAL,DEPTNO FROM EMP WHERE DEPTNO = 10; -- MINUS 사용 출력

SELECT EMPNO,ENAME,SAL,DEPTNO FROM EMP INTERSECT SELECT EMPNO, ENAME,SAL,DEPTNO FROM EMP WHERE DEPTNO = 10; --INTERSECT 사용출력

 SELECT * FROM EMP WHERE ENAME   LIKE '_%S%' ;  -- 125P Q1 
 
 SELECT * FROM EMP WHERE DEPTNO=30 AND JOB =('SALESMAN'); --125P Q2
 
 SELECT * FROM  EMP  WHERE DEPTNO >= 20 AND SAL >=2000;
 
 SELECT * FROM EMP,DEPT ORDER BY EMPNO; -- 여러 테이블 선언 
 
 SELECT * FROM EMP,DEPT WHERE EMP.DEPTNO = DEPT.DEPTNO ORDER BY EMPNO; -- 열 이름 비교하는 조건식으로 조인하기 
 
 SELECT * FROM EMP E,DEPT D WHERE E.DEPTNO = D.DEPTNO ORDER BY EMPNO; -- 테이블 이름을 별칭으로 표현하기

SELECT EMPNO , ENAME , DEPTNO , DNAME , LOC FROM EMP E, DEPT D WHERE E.DEPTNO = D.DEPTNO ; -- 두 테이블 부서 번호가 같은 열로 이름이 포함되어 오류

SELECT E.EMPNO,E.ENAME,D.DEPTNO,D.LOC FROM EMP E, DEPT D WHERE E.DEPTNO = D.DEPTNO ORDER BY D.DEPTNO,E.EMPNO; -- 열이름에 각각 테이블 이름도 함께 명시할 때

SELECT E.EMPNO, E.ENAME, E.SAL,D.DEPTNO,D.DNAME,D.LOC FROM EMP E,DEPT D WHERE E.DEPTNO = D.DEPTNO AND SAL >= 3000;  -- WHERE 절에 조건식 넣어 출력
 
SELECT *FROM EMP E ,SALGRADE S WHERE E.SAL BETWEEN S.LOSAL AND  S.HISAL;

SELECT E1.EMPNO,E1.ENAME,E1.MGR ,E2.EMPNO AS MGR_EMPNO,E2.ENAME AS MGR_ENAME FROM EMP E1, EMP E2 WHERE E1.MGR=E2.EMPNO;-- 같은 테이블 두번 사용하여 자체 조인

SELECT E1.EMPNO,E1.ENAME,E1.MGR,E2.EMPNO AS MGR_EMPNO, E2.ENAME AS MGR_ENAME FROM EMP E1,EMP E2 WHERE E1.MGR=E2.EMPNO(+) ORDER BY E1.EMPNO; -- 왼쪽 외부 조인 사용

SELECT E1.EMPNO,E1.ENAME,E1.MGR,E2.EMPNO AS MGR_EMPNO, E2.ENAME AS MGR_ENAME FROM EMP E1,EMP E2 WHERE E1.MGR(+)=E2.EMPNO ORDER BY E1.EMPNO; -- 오른쪽 외부 조인 사용

 SELECT E.EMPNO,E.ENAME,E.JOB,E.MGR,E.HIREDATE,E.SAL,E.COMM DEPTNO,D.DNAME,D.LOC FROM EMP E NATURAL JOIN DEPT D ORDER BY DEPTNO, E.EMPNO; -- NATURAL JOIN 사용
 
 SELECT E.EMPNO,E.ENAME,E.JOB,E.MGR,E.HIREDATE,E.SAL,E.COMM DEPTNO,D.DNAME,D.LOC FROM EMP E JOIN DEPT D USING (DEPTNO) WHERE SAL >= 3000 ORDER BY DEPTNO,E.EMPNO; -- JOIN USING 사용
 
 SELECT E.EMPNO,E.ENAME,E.JOB,E.MGR,E.HIREDATE,E.SAL,E.COMM, E.DEPTNO ,D.DNAME,D.LOC FROM EMP E JOIN DEPT D ON (E.DEPTNO = D.DEPTNO) WHERE SAL <= 3000 ORDER BY E.DEPTNO, EMPNO; -- JOIN ON사용
 
 SELECT E1.EMPNO,E1.ENAME,E1.MGR,E2.EMPNO AS MGR_EMPNO, E2.ENAME AS MGR_ENAME FROM EMP E1 LEFT OUTER JOIN EMP E2 ON (E1.MGR=E2.EMPNO) ORDER BY E1.EMPNO; -- 왼쪽 외부 조인 SQL-99 로 작성 RIGHT,FULL OUTER 도 가능하다
 
 SELECT SAL FROM EMP WHERE ENAME = 'JONES'; --사원 이름의 급여를 출력
 
 SELECT * FROM EMP WHERE SAL > 2975;-- 급여 2975 보다 높은 사원 출력
 
 SELECT * FROM EMP WHERE SAL > (SELECT SAL FROM EMP WHERE ENAME = 'JONES'); -- 서브쿼리에 JONES의 급여보다 높은 사원 정보 출력
 
 SELECT * FROM EMP WHERE HIREDATE < (SELECT HIREDATE FROM EMP WHERE ENAME = 'SCOTT'); 
 
 SELECT E.EMPNO,E.ENAME,E.JOB,E.SAL,D.DEPTNO,D.DNAME,D.LOC FROM EMP E,DEPT D WHERE E.DEPTNO = D.DEPTNO AND E.DEPTNO = 20 AND E.SAL > (SELECT AVG(SAL)FROM EMP);




CREATE TABLE EMP_TEMP
    AS SELECT *
         FROM EMP
        WHERE 1 <> 1;
  SELECT * FROM EMP_TEMP;

INSERT INTO EMP_TEMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)VALUES (9999, '홍길동', 'PRESIDENT', NULL, '2001/01/01', 5000, 1000, 10);

SELECT * FROM EMP_TEMP;





CREATE TABLE EMP_DDL( EMPNO NUMBER(4), ENAME VARCHAR2(10),JOB VARCHAR2(9),MGR NUMBER(4), HIREDATE DATE, SAL NUMBER(7,2),COMM NUMBER(7,2),DEPTNO NUMBER(2) );
DESC EMP_DDL; --EMP DDL 테이블 구조보기 

CREATE TABLE DEPT_DDL AS SELECT*FROM DEPT;  

DESC DEPT_DDL; -- 다른테이블 복사하여 테이블 생성

SELECT * FROM DEPT_DDL; --DEPT DDL 테이블 전체 조회

CREATE TABLE EMP_DDL_30 AS SELECT * FROM EMP WHERE DEPTNO = 30; --다른 테이블 일부 복사하여 테이블 생성하기 
SELECT * FROM EMP_DDL_30;

CREATE TABLE EMPDEPT_DDL AS SELECT E.EMPNO, E.ENAME ,E.JOB,E.MGR,E.HIREDATE,E.SAL,E.COMM,D.DEPTNO,D.DNAME,D.LOC FROM EMP E ,DEPT D WHERE 1<>1; -- 다른 테이블 복사하여 테이블생성
SELECT*FROM EMPDEPT_DDL;

CREATE TABLE EMP_ALTER AS SELECT * FROM EMP; --EMP테이블을 복사하여 EMP ARTER 테이블 생성하기
SELECT * FROM EMP_ALTER;
--ALTER로 수정
ALTER TABLE EMP_ALTER ADD HP VARCHAR2(20);
SELECT*FROM EMP_ALTER;

ALTER TABLE EMP_ALTER RENAME COLUMN HP TO TEL; --RENAME COLUMN 사용해 HP를 TEL로 변경시키기 
SELECT * FROM EMP_ALTER; 

ALTER TABLE EMP_ALTER MODIFY EMPNO NUMBER(5); -- ALTER 명령어로 EMPNO 열 길이를 변경
DESC EMP_ALTER; 

ALTER TABLE EMP_ALTER DROP COLUMN TEL; --DROP COLUMN 사용해서 TEL 열 삭제 
SELECT * FROM EMP_ALTER;
--RENAME으로 테이블 이름 변경해보기
RENAME EMP_ALTER TO EMP_RENAME;
DESC EMP_ALTER; -- 바꾸기전 테이블 구성 보기
DESC EMP_RENAME; -- 바꾼 테이블 구성
SELECT *FROM EMP_RENAME; -- 변경한 테이블 이름으로 조회

TRUNCATE TABLE EMP_RENAME; --TRUNCATE TABLE 사용 테이블의 전체 데이터 삭제 
SELECT * FROM EMP_RENAME; -- 출력

DROP TABLE EMP_RENAME; -- EMP RENAME 테이블 삭제 

DESC EMP_RENAME; -- 테이블 구성 보기

SELECT*FROM DICT; -- SCOTT계정으로 사용 가능한 데이터 사전 살펴보기 (DICT사용)
SELECT*FROM DICTIONARY; -- SCOTT계정으로 사용 가능한 데이터 사전 살펴보기 (DICTIONARY사용) -- DICT와 실행 결과 같음

SELECT TABLE_NAME FROM USER_TABLES; -- SCOTT계정이 가지고 있는 객체 정보  USER 접두어 사용 

SELECT OWNER, TABLE_NAME FROM ALL_TABLES;

CREATE INDEX IND_EMP_SAL ON EMP(SAL); -- EMP테이블의 SAL 열에 인덱스 생성

SELECT * FROM USER_IND_COLUMNS; -- 생성된 인덱스 살펴보기

DROP INDEX IDX_EMP_SAL;

SELECT * FROM USER_IND_COLUMNS;

CREATE VIEW VW_EMP20 AS (SELECT EMPNO,ENAME,JOB,DEPTNO FROM EMP WHERE DEPTNO=20); -- 뷰 생성

SELECT * FROM USER_VIEWS;

SELECT VIEW_NAME,TEXT_LENGTH,TEXT FROM USER_VIEWS;

 CREATE TABLE TABLE_NOTNULL(LOGIN_ID VARCHAR2(20)NOT NULL,LOGIN_PW VARCHAR2(20)NOT NULL,TEL VARCHAR2(20)); -- 테이블 생성 NOT NULL
 DESC TABLE_NOTNULL;  
 
 INSERT INTO TABLE_NOTNULL (LOGIN_ID,LOGIN_PW,TEL) VALUES ('TEST_ID_01',NULL,'010-1234-5678'); 
 
 INSERT INTO TABLE_NOTNULL (LOGIN_ID,LOGIN_PW) VALUES ('TEST_ID_01','1234'); -- 제약조건 없는 TEL열에 NULL값 입력
 SELECT*FROM TABLE_NOTNULL; 
 
 UPDATE TABLE_NOTNULL SET LOGIN_PW = NULL WHERE LOGIN_ID='TEST_ID_01'; -- NOT NULL제약 조건이 지정된 열 데이트 NULL값으로 업데이트 하기 
 
 SELECT OWNER,CONSTRAINT_NAME,CONSTRAINT_TYPE,CONSTRAINT_NAME FROM USER_CONSTRAINTS; -- 제약조건 살펴보기 

CREATE TABLE TABLE_NOTNULL2(LOGIN_ID VARCHAR2(20) CONSTRAINT TBLNN2_LGNID_NN NOT NULL, LOGIN_PW VARCHAR2(20) CONSTRAINT TBLNN2_LGNPW_NN NOT NULL,TEL VARCHAR2(20) ); --테이블을 생성할 떄 제약조건에 이름 지정하기 
 SELECT OWNER,CONSTRAINT_NAME,CONSTRAINT_TYPE,TABLE_NAME FROM USER_CONSTRAINTS;
 
 ALTER TABLE TABLE_NOTNULL MODIFY (TEL NOT NULL); -- TEL 열에 NOT NULL 제약 조건 추가하기 
 
 UPDATE TABLE_NOTNULL SET TEL = '010-1234-5678' WHERE LOGIN_ID='TEST_ID_01'; -- TEL 열에 데이터 수정하기
 SELECT * FROM TABLE_NOTNULL; 
 
 ALTER TABLE TABLE_NOTNULL MODIFY(TEL NOT NULL); -- NOT NULL 제약 조건 추가하기 
 SELECT OWNER, CONSTRAINT_NAME,CONSTRAINT_TYPE,TABLE_NAME FROM USER_CONSTRAINTS;

ALTER TABLE TABLE_NOTNULL2 MODIFY(TEL CONSTRAINT TBLNN_TEL_NN NOT NULL);
SELECT OWNER,CONSTRAINT_NAME,CONSTRAINT_TYPE,TABLE_NAME FROM USER_CONSTRAINTS;
 
DESC TABLE_NOTNULL2;

ALTER TABLE TABLE_NOTNULL2 RENAME CONSTRAINT TBLNN_TEL_NN TO TBLNN2_TEL_NN;
SELECT OWNER,CONSTRAINT_NAME,CONSTRAINT_TYPE,TABLE_NAME FROM USER_CONSTRAINTS;

ALTER TABLE TABLE_NOTNULL2 DROP CONSTRAINT TBLNN2_TEL_NN;
DESC TABLE_NOTNULL2

--DROP TABLE TABLE_NOTNULL2 

CREATE TABLE TABLE_UNIQUE(LOGIN_ID VARCHAR2(20) UNIQUE, LOGIN_PW VARCHAR2(20) NOT NULL, TEL VARCHAR2(20)); -- UNIQUE 제약조건 생성
DESC TABLE_UNIQUE

SELECT OWNER,CONSTRAINT_NAME,CONSTRAINT_TYPE,TABLE_NAME FROM USER_CONSTRAINTS WHERE TABLE_NAME = 'TABLE_UNIQUE'; -- CONSTRAINT TYPE 열값이  U일 경우에 UNIQUE 제약조건을 의미함

INSERT INTO TABLE_UNIQUE(LOGIN_ID,LOGIN_PW,TEL) VALUES ('TEST_ID_01','PW01','010-1234-5678'); -- UNIQUE 테이블에 데이터 입력

SELECT*FROM TABLE_UNIQUE; 

-- LOGIN ID 열에 증복 데이터 넣으면 오류 INSERT INTO TABLE_UNIQUE(LOGIN_ID,LOGIN_PW,TEL) VALUES('TEST_ID_01''PW01','010-1234-5678');

CREATE USER ORCLSTUDY IDENTIFIED  BY ORACLE; -- SCOTT계정으로 사용자 생성 안됌

