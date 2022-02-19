create table unternehmen
(
    id int auto_increment,
    name text,
    vertreter text,
    constraint unternehmen_pk
        primary key (id)
);


create table project
(
    id int auto_increment,
    title text ,
    typ text ,
    color text,
    description text ,
    days int ,
    price decimal ,
    launchDate text ,
    constraint project_pk
        primary key (id)
);
