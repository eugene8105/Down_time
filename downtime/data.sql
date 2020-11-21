DROP TABLE IF EXISTS USER_DB;

CREATE TABLE Resource (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  resource_name VARCHAR(35) NOT NULL
);

DROP TABLE IF EXISTS Problem;

CREATE TABLE Problem (
  id int AUTO_INCREMENT  primary key,
  resource_name VARCHAR(35) NOT NULL,
  date varchar(25) not null,
  time_spend int not null,
  reason varchar(250) not null,
  program_name varchar(25) not null,
  line_number varchar(25) not null,
  initials varchar(15) not null,
  which_cell varchar(15) not null
);

insert into Resource(resource_name)
values ('panasonic_1'), ('panasonic_2'), ('fanuc_1'), ('fanuc_2');


--  Mock data
INSERT INTO Problem (resource_name, date, time_spend, reason,
                      program_name, line_number, which_cell, initials) VALUES
  ('panasonic_1', '10/25/2020', 15, 'IO problem',
   'Mock555', 'P28 - P289','P1', 'TS');