package org.gnuport.gnufinance;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GnuFinance {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		new GnuFinance();
	}

	public GnuFinance() {
		logger.debug("Log");

	}
}
