package org.gnuport.gnufinance.beans;

import java.util.Date;

public class TransactionBean {
    long id;
    String description;
    long amount;
    Date date;

    SplitBean[] splits; // transactions can have multiple splits
    TagBean[] tags; // transactions can have multiple tags
    UserBean belongsToUser; // every transaction belongs to a User
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public long getAmount() {
        return amount;
    }
    public void setAmount(long amount) {
        this.amount = amount;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public SplitBean[] getSplits() {
        return splits;
    }
    public void setSplits(SplitBean[] splits) {
        this.splits = splits;
    }
    public TagBean[] getTags() {
        return tags;
    }
    public void setTags(TagBean[] tags) {
        this.tags = tags;
    }
    public UserBean getBelongsToUser() {
        return belongsToUser;
    }
    public void setBelongsToUser(UserBean belongsToUser) {
        this.belongsToUser = belongsToUser;
    }
}
