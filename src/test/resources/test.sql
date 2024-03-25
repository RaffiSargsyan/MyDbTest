insert into user (name,age,email)values('Edith Piaf',25,'edith@gmail.com');
insert into user (name,age,email)values('Steve ',54,'steve@gmail.com');

select * from user;
select name,age from user where name ='Amalia';
update user set name ='Immanuel',age =26,email = 'kant@gmail.com' where id = 2;
select * from user;
delete from user where id = 1;
SELECT DISTINCT name from user;
SELECT * FROM user
where name = 'Steve';

