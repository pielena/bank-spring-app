CREATE DATABASE bank;

create table user
(
    id           bigint auto_increment
        primary key,
    first_name   varchar(20)  not null,
    last_name    varchar(20)  not null,
    address      varchar(100) null,
    phone_number varchar(15)  null,
    email        varchar(50)  null,
    birthday     date         null
);

create table account
(
    id           BIGINT auto_increment,
    account_type VARCHAR(15)             not null,
    balance      DECIMAL(10, 2)          null,
    create_date  TIMESTAMP default now() not null,
    status       VARCHAR(15)             not null,
    user_id      BIGINT                  not null,
    constraint account_pk
        primary key (id),
    constraint account_user_fk
        foreign key (user_id) references user (id)
            on delete cascade
);