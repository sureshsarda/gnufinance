DROP TABLE IF EXISTS gnufinance.users;

CREATE TABLE gnufinance.users (
       rid INT PRIMARY KEY,
       first_name VARCHAR(25),
       last_name VARCHAR(25),
       date_of_birth DATE,
       email VARCHAR(50) UNIQUE NOT NULL,
       address VARCHAR(100),
       locality VARCHAR(25),
       street_name VARCHAR(25),
       city VARCHAR(25),
       region VARCHAR(25),
       country VARCHAR(25),
       data_directory VARCHAR(256)
   );

INSERT INTO gnufinance.users VALUES (1, "Suresh", "Sarda", "1992-10-03", "sureshssarda@outlook.com", "20/J-2, Aditya Nakoda Enclave", "Sarita Nagri", "Sinhgad Road", "Pune", "Maharashtra", "India", "");
INSERT INTO gnufinance.users VALUES (2, "Paresh", "Sarda", "1988-01-24", "pareshssarda@gmail.com", "20/J-2, Aditya Nakoda Enclave", "Sarita Nagri", "Sinhgad Road", "Pune", "Maharashtra", "India", "");
INSERT INTO gnufinance.users VALUES (3, "Neha", "Ellath", "1992-09-27", "nehabellath@gmail.com", "20/J-2, Aditya Nakoda Enclave", "Dhayri Fata", "Sinhgad Road", "Pune", "Maharashtra", "India", "");
INSERT INTO gnufinance.users VALUES (4, "Sarita", "Jakhete", "1986-02-26", "saritaj@gmail.com", "20/J-2, Aditya Nakoda Enclave", "Sarita Nagri", "Sinhgad Road", "Aurangabad", "Maharashtra", "India", "");
INSERT INTO gnufinance.users VALUES (5, "Bhakti", "Sarda", "1989-02-19", "sonubj@gmail.com", "20/J-2, Aditya Nakoda Enclave", "Sarita Nagri", "Sinhgad Road", "Pune", "Maharashtra", "India", "");
INSERT INTO gnufinance.users VALUES (6, "Shekhar", "Dahore", "1993-01-04", "sdahore@gmail.com", "20/J-2, Aditya Nakoda Enclave", "Sarita Nagri", "Sinhgad Road", "Banglore", "Karnataka", "India", "");
