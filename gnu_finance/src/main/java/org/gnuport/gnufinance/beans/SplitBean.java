package org.gnuport.gnufinance.beans;

public class SplitBean {
	long id;
	String descritpion;
	long amount;
	
	//split belongs-to a transaction and to an account
	TransactionBean belongsToTransaction;
	AccountBean belongsToAccount;
}
