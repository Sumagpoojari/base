package org.sgp.training;

public interface Transactions {
    double checkBalance(String accNum, String userName);
    double depositAmount(String accNum, String UserName, double amount);
    double withdrawAmount(String accNum, String userName, double amount);

}
