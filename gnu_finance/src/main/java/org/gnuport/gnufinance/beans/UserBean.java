package org.gnuport.gnufinance.beans;

import java.util.Date;

/**
 * 
 * @author Suresh Sarda
 *
 */

public class UserBean {
    long rid;
    String firstName;
    String lastName;
    Date dob;

    String address;
    String locality;
    String streetName;
    String city;
    String state;
    String country;

    String dataDirectory;

    // has-many accounts and transactions
    AccountBean[] accounts;
    TransactionBean[] transactions;

    public long getRid() {
        return rid;
    }

    public void setRid(long rid) {
        this.rid = rid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDataDirectory() {
        return dataDirectory;
    }

    public void setDataDirectory(String dataDirectory) {
        this.dataDirectory = dataDirectory;
    }

    public AccountBean[] getAccounts() {
        return accounts;
    }

    public void setAccounts(AccountBean[] accounts) {
        this.accounts = accounts;
    }

    public TransactionBean[] getTransactions() {
        return transactions;
    }

    public void setTransactions(TransactionBean[] transactions) {
        this.transactions = transactions;
    }


}
