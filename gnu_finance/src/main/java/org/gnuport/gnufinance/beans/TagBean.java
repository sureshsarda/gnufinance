package org.gnuport.gnufinance.beans;

public class TagBean {
	long id;
	String name;
	
	//every tag has many transactions
	TransactionBean[] transactions;
	
}
