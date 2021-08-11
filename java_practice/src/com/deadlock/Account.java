package com.deadlock;

public class Account {

    private int balance = 10000;

    public void deposit(int bal){
        balance = balance+bal;
    }

    public void withdraw(int bal){
        balance = balance-bal;
    }

    public int getBalance(){
        return balance;
    }

    public static void transfer(Account act1,Account act2, int bal){
        act1.deposit(bal);
        act2.withdraw(bal);
    }
}
