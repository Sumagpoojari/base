package org.sgp.training;

import java.util.Objects;

public class BankAccount implements Transactions{

    private String accNumber;
    private String accUserName;
    private double accBalance;

    public BankAccount (String userName, String accNum){
        this.accUserName = userName;
        this.accNumber = accNum;
        this.accBalance = 0;
    }
    public String getAccNumber(){
        return this.accNumber;
    }
    public String getAccUserName(){
        return this.accUserName;
    }

    @Override
    public double checkBalance(String accNum, String userName) {
        return accBalance;
    }

    @Override
    public double depositAmount(String accNum, String userName, double amount) {
        if(amount <= 0){
            throw new IllegalArgumentException("Please enter valid details");
        }
        accBalance += amount;
        return accBalance;
    }

    @Override
    public double withdrawAmount(String accNum, String userName, double amount) {
        if(amount <= 0){
            throw new IllegalArgumentException("Please enter valid details");
        }
        accBalance -= amount;
        return accBalance;
    }
}
