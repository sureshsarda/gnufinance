INSERT INTO gnufinance.users VALUES (1, "Suresh", "Sarda", "1992-10-03", "sureshssarda@outlook.com", "20/J-2, Aditya Nakoda Enclave", "Sarita Nagri", "Sinhgad Road", "Pune", "Maharashtra", "India", "");
INSERT INTO gnufinance.users VALUES (2, "Paresh", "Sarda", "1988-01-24", "pareshssarda@gmail.com", "20/J-2, Aditya Nakoda Enclave", "Sarita Nagri", "Sinhgad Road", "Pune", "Maharashtra", "India", "");
INSERT INTO gnufinance.users VALUES (3, "Neha", "Ellath", "1992-09-27", "nehabellath@gmail.com", "20/J-2, Aditya Nakoda Enclave", "Dhayri Fata", "Sinhgad Road", "Pune", "Maharashtra", "India", "");
INSERT INTO gnufinance.users VALUES (4, "Sarita", "Jakhete", "1986-02-26", "saritaj@gmail.com", "20/J-2, Aditya Nakoda Enclave", "Sarita Nagri", "Sinhgad Road", "Aurangabad", "Maharashtra", "India", "");
INSERT INTO gnufinance.users VALUES (5, "Bhakti", "Sarda", "1989-02-19", "sonubj@gmail.com", "20/J-2, Aditya Nakoda Enclave", "Sarita Nagri", "Sinhgad Road", "Pune", "Maharashtra", "India", "");
INSERT INTO gnufinance.users VALUES (6, "Shekhar", "Dahore", "1993-01-04", "sdahore@gmail.com", "20/J-2, Aditya Nakoda Enclave", "Sarita Nagri", "Sinhgad Road", "Banglore", "Karnataka", "India", "");

INSERT INTO gnufinance.accounts VALUES (1, 0, "ROOT", 0);
INSERT INTO gnufinance.accounts VALUES (2, 1, "Assets", 0);
INSERT INTO gnufinance.accounts VALUES (3, 1, "Liabilities", 0);
INSERT INTO gnufinance.accounts VALUES (4, 1, "Income", 0);
INSERT INTO gnufinance.accounts VALUES (5, 1, "Expense", 0);

INSERT INTO gnufinance.accounts VALUES (6, 4, "Salary", 0);
INSERT INTO gnufinance.accounts VALUES (7, 4, "Gifts", 0);

INSERT INTO gnufinance.transactions VALUES (1, 1, "School Fees", "1000", "2015-01-03");
INSERT INTO gnufinance.transactions VALUES (2, 1, "Internet Bill", "500", "2015-01-11");
INSERT INTO gnufinance.transactions VALUES (3, 1, "Clothes", "799", "2015-01-07");
INSERT INTO gnufinance.transactions VALUES (4, 2, "Gift", "200", "2015-01-07");
INSERT INTO gnufinance.transactions VALUES (5, 2, "Groceries", "125", "2015-01-06");