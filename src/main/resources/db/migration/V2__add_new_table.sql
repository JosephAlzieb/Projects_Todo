create table project_unternehmen
(
    projectID int null,
    unternehmenID int null,
    constraint project_unternehmen_pk
        primary key (projectID, unternehmenID)
);

