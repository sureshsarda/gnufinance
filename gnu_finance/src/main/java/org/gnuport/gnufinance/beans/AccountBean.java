package org.gnuport.gnufinance.beans;

public class AccountBean {
	long id;
	long parentAccountId;
	long balance;
	String name;
	
	
	AccountBean[] children;	//has many child accounts
	
	//NOT IMPORTANT
	UserBean[] users;		//user has accounts
	SplitBean[] splits;		//has many splits
}
