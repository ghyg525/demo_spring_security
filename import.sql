insert into user(id, username, password) values (1, 'admin', 'admin');
insert into user(id, username, password) values (2, 'user', 'user');

insert into role(id, name) values (1, 'admin');
insert into role(id, name) values (2, 'user');

insert into user_roles(user_id, roles_id) values (1, 1);
insert into user_roles(user_id, roles_id) values (2, 2);
