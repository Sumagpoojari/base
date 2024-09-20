package org.sgp.training;


public class BankAccountMain {
    public static void main(String [] args){
        BankAccount suma = new org.sgp.training.BankAccount("sumagpoojari","5432");
        System.out.println("Balance of Account number "+suma.getAccNumber()+" is "+ suma.checkBalance(suma.getAccNumber(), suma.getAccUserName()));

        suma.depositAmount("5432","sumagpoojari",1500.75);
        suma.depositAmount("5432","sumagpoojari",1700.25);
        suma.withdrawAmount("5432","sumagpoojari",575.50);
        System.out.println("Balance of Account number "+suma.getAccNumber()+" is "+ suma.checkBalance(suma.getAccNumber(), suma.getAccUserName()));

    }
}
