package org.gnuport.gnufinance.beans;

public class AccountBean {
	long id;
	long parentAccountId;
	long balance;
	String name;
	
	AccountBean[] children;
}
