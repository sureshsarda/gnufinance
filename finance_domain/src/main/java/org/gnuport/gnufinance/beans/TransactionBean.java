package beans;

import java.util.Date;

public class TransactionBean {
	long id;
	String description;
	long amount;
	Date date;
	
	SplitBean[] splits;
	TagBean[] tags;
}
