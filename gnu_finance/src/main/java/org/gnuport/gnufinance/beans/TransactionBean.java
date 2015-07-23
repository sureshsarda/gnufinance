package org.gnuport.gnufinance.beans;

import java.util.Date;

public class TransactionBean {
	long id;
	String description;
	long amount;
	Date date;
	
	SplitBean[] splits;	//transactions can have multiple splits
	TagBean[] tags; 	//transactions can have multiple tags
	UserBean belongsToUser;		//every transaction belongs to a User
}
