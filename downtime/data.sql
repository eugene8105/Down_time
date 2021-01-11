DROP TABLE IF EXISTS USER_DB;

CREATE TABLE Resource (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  resource_name VARCHAR(35) NOT NULL
);

DROP TABLE IF EXISTS Problem;

CREATE TABLE Problem (
  id int AUTO_INCREMENT  primary key,
  date varchar(25) not null,
  resource_name VARCHAR(35) NOT NULL,
  which_cell varchar(15) not null,
  reason varchar(250) not null,
  time_spend int not null,
  program_name varchar(25) not null,
  line_number varchar(25) not null,
  initials varchar(15) not null
);

insert into Resource(resource_name)
values ('panasonic_1'), ('panasonic_2'), ('fanuc_1'), ('fanuc_2');


--  Mock data
INSERT INTO Problem (date, resource_name, which_cell, reason, time_spend,
                     program_name, line_number, initials) VALUES
  ('10/25/2020', 'panasonic_1', 'main', 'IO problem', 15,
   'Mock555', 'P28 - P289', 'TS');