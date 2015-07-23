#Drop all the refering tables first
DROP TABLE IF EXISTS gnufinance.transactions_tags;
DROP TABLE IF EXISTS gnufinance.users_accounts;

#Drop other tables
DROP TABLE IF EXISTS gnufinance.splits;
DROP TABLE IF EXISTS gnufinance.transactions;
DROP TABLE IF EXISTS gnufinance.users;
DROP TABLE IF EXISTS gnufinance.tags;
DROP TABLE IF EXISTS gnufinance.accounts;

CREATE TABLE gnufinance.users (
       rid INT NOT NULL UNIQUE,
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
       data_directory VARCHAR(256),
       PRIMARY KEY (rid)
);

CREATE TABLE gnufinance.accounts (
	rid INT NOT NULL,
	parent_id INT,
	balance INT,
	name VARCHAR(64) NOT NULL,
	PRIMARY KEY (rid),
	FOREIGN KEY (parent_id) REFERENCES gnufinance.accounts(rid)
);

CREATE TABLE gnufinance.tags (
	rid INT NOT NULL UNIQUE,
	name VARCHAR(64),
	PRIMARY KEY(rid)
);

CREATE TABLE gnufinance.transactions (
	rid INT NOT NULL UNIQUE,
	user_id INT NOT NULL,
	description VARCHAR(256),
	amount INT NOT NULL,
	date DATE NOT NULL,
	PRIMARY KEY (rid),
	FOREIGN KEY (user_id) REFERENCES gnufinance.users(rid) ON DELETE CASCADE
);
  
CREATE TABLE gnufinance.splits (
	rid INT NOT NULL UNIQUE,
	transaction_id INT NOT NULL,
	account_id INT NOT NULL,
	description VARCHAR(256),
	amount INT NOT NULL,
	PRIMARY KEY (rid),
	FOREIGN KEY (transaction_id) REFERENCES gnufinance.transactions(rid) ON DELETE CASCADE,
	FOREIGN KEY (account_id) REFERENCES gnufinance.accounts(rid)
);

CREATE TABLE gnufinance.transactions_tags (
	transaction_id INT NOT NULL,
	tag_id	INT NOT NULL,
	FOREIGN KEY (transaction_id) REFERENCES gnufinance.transactions(rid),
	FOREIGN KEY (tag_id) REFERENCES gnufinance.tags(rid)
);

CREATE TABLE gnufinance.users_accounts (
	user_id INT NOT NULL,
	account_id INT NOT NULL,
	FOREIGN KEY (user_id) REFERENCES gnufinance.users(rid),
	FOREIGN KEY (account_id) REFERENCES gnufinance.accounts(rid)
);