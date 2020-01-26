-- auto-generated definition
create table services
(
    id          integer,
    node_id     integer,
    name        text,
    state       text,
    admin_state varchar
);

comment on table services is 'Сервисы';

alter table services
    owner to postgres;

