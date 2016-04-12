/*
@author Nevil Dsouza
PROJECT UpdateProfileAppServer
DB		MySQL
*/


/*
create table query v1
*/
/*
CREATE TABLE profile (
id VARCHAR(30) PRIMARY KEY,
name VARCHAR(30)
);
*/


/*
insert table query v1
*/
/*
INSERT INTO profile (id,name)
VALUES ('100','Nevil');
*/

/*

*/


/*
create table query userdetails
*/
CREATE TABLE userdetails(

username VARCHAR(30),

password  VARCHAR(30),

account_active  BOOLEAN,

current_state   BOOLEAN,

last_login  TIMESTAMP,

role_id  INT,

created_date    DATE,

created_by VARCHAR(30),

modified_date   DATE,

modified_by VARCHAR(30),

  PRIMARY KEY( username)

);



/*
insert table query userdetails
*/

INSERT INTO userdetails (username,password,account_active,current_state,last_login,role_id,created_date,created_by,
modified_date,modified_by)
VALUES ('7059','dude',TRUE,TRUE,NULL,1,NULL,"Nevzz",NULL,NULL);




/*
create table query personal_profile
*/

CREATE TABLE personal_profile(

username VARCHAR(30) references UserDetails(username),

surname VARCHAR(30),

first_name VARCHAR(30),

middle_name VARCHAR(30),

father_name VARCHAR(30),

mother_name VARCHAR(30),

gender VARCHAR(30),

dob DATE,

correspondence_address VARCHAR(60),

permanent_address VARCHAR(60),

telephone_no BIGINT,

mobile_no BIGINT,

email_id VARCHAR(30),

category VARCHAR(30),

aadhar_no BIGINT,

created_date    DATE,

created_by VARCHAR(30),

modified_date   DATE,

modified_by VARCHAR(30),

PRIMARY KEY(username)

);



/*
insert table query personal_profile
*/

INSERT INTO personal_profile (username,surname,first_name,middle_name,father_name,mother_name,gender,dob,correspondence_address,
permanent_address,telephone_no,mobile_no,email_id,category,aadhar_no,created_date,created_by,modified_date,modified_by)
VALUES ('7059','Dsouza','Nevil','Augustine','Augustine','Nathalia','Male',NULL,'Mumbai','Bangkok',9167956674,9167956674,
'dsouza.nevil45@gmail.com','Open',9167956674,NULL,"Nevzz",NULL,NULL);




/*
create table query professional_profile
*/

CREATE TABLE professional_profile

(

username VARCHAR(30) references UserDetails(username),

branch VARCHAR(30),

year INT,

status  VARCHAR(30),

job_category  VARCHAR(30),

field_of_interest VARCHAR(30),

qualification_id INT,

achievements VARCHAR(100),

projects VARCHAR(100),

internships VARCHAR(100),

co_curricular_activities VARCHAR(100),

extra_curricular_activities VARCHAR(100),

job_id INT,

created_date    DATE,

created_by VARCHAR(30),

modified_date   DATE,

modified_by VARCHAR(30),

PRIMARY KEY(username)

);



/*
insert table query professional_profile
*/

INSERT INTO professional_profile (username,branch,year,status,job_category,field_of_interest,qualification_id,achievements
,projects,
internships,co_curricular_activities,extra_curricular_activities,job_id,created_date,created_by,modified_date,modified_by)
VALUES ('7059','TE COMPS',2017,'Fresher','Unemployed','Web Tech',7059,'None','None','None','None','None',0,NULL,"Nevzz",NULL,NULL);


/*
create table query qualification
*/
CREATE TABLE qualification

(

qualification_id INT, 

username VARCHAR(30) references UserDetails(username),

percentage DOUBLE, 

gpa DOUBLE,

total_marks INT,

marks_obtained INT,

created_date DATE,

created_by VARCHAR(30),

modified_date DATE,

modified_by VARCHAR(30),

PRIMARY KEY(qualification_id,username)

);


/*
insert table query qualification
*/


INSERT INTO qualification
(qualification_id,username,percentage,gpa,total_marks,marks_obtained,created_date,created_by,modified_date,modified_by)
VALUES ('7059','7059',NULL,NULL,NULL,NULL,NULL,"Nevzz",NULL,NULL);


/*
CREATE TABLE UserDetails(

username TEXT,

password  TEXT,

account_active  BOOLEAN,

current_state   BOOLEAN,

last_login  TIMESTAMP,

role_id  INTEGE

R,

created_date    DATE,

created_by TEXT,

modified_date   DATE

modified_by TEXT

  PRIMARY KEY( username)

);

CREATE TABLE PersonalProfile(

username TEXT references UserDetails(username),

surname TEXT,

first_name TEXT,

middle_name TEXT,

father_name TEXT,

mother_name TEXT,

gender TEXT,

dob DATE,

correspondence_address TEXT,

telephone_no BIGINT,

mobile_no BIGINT,

email_id TEXT,

category TEXT,

aadhar_no BIGINT,

created_date    DATE,

created_by TEXT,

modified_date   DATE,

modified_by TEXT,

PRIMARY KEY(username)

);

CREATE TABLE ProfessionalProfile

(

username TEXT references UserDetails(username),

branch TEXT,

year INT,

status  TEXT,

job_category  TEXT,

field_of_interest TEXT,

qualification_id INT,

achievements TEXT,

projects TEXT,

internships TEXT,

co_curricular_activities TEXT,

extra_curricular_activities TEXT,

job_id (multivalued­ for alumni) INT,

created_date    DATE,

created_by TEXT,

modified_date   DATE,

modified_by TEXT,

PRIMARY KEY(username)

);

CREATE TABLE Qualification

(

qualification_id SERIAL 

username TEXT references UserDetails(username)

percentage REAL

gpa REAL

total_ marks INT

marks_obtained INT

created_date DATE

created_by TEXT

modified_date DATE

modified_by TEXT

PRIMARY KEY(qualification_id,username)

);
*/