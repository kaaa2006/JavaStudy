create user boardtest identified boardtest 
grant resource,connect to boardtest

alter user boardtest default tablespace users ;
alter user boardtest temporary tablespace temp ; 