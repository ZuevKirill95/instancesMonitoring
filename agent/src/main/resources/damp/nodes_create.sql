-- auto-generated definition
create table nodes
(
    id            integer,
    host          varchar(255),
    ip            varchar(255),
    state         varchar(255),
    load_cpu      numeric(1000),
    free_ram      numeric(1000),
    total_ram     numeric(1000),
    free_hdd      numeric(1000),
    total_hdd     numeric(1000),
    free_jvm      numeric(1000),
    total_jvm     numeric(1000),
    session_count numeric(1000)
);

comment on table nodes is 'Узлы';

alter table nodes
    owner to postgres;

