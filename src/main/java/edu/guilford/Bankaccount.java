package edu.guilford;

import java.util.Random;

public class Bankaccount {

    Random rand = new Random();

    // atttributes of a bank account
    private String name;
    private double balance;
    private int accountNumber;
    private String bankName;

    // list off banks to choose from
    private static String[] bankNames = {"Capital One", "Bank of America", "Wells Fargo", "Chase"};

    // list of names to choose from
    private static String[] names = {"John", "Jane", "Jim", "Jill", "Jack", "Jen"};

    // constructor to set values for attributes
    public Bankaccount() {
        this.name = names[rand.nextInt(names.length)];
        this.balance = Math.round(rand.nextDouble() * 1000000.0) / 100.0;
        this.accountNumber = rand.nextInt(1000);
        this.bankName = bankNames[rand.nextInt(bankNames.length)];
    }

    // constructor to accept info from calling program
    public Bankaccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.accountNumber = rand.nextInt(1000);
        this.bankName = bankNames[rand.nextInt(bankNames.length)];
    }

    // getters
    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public String getBankName() {
        return bankName;
    }


    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    // toString method to print out account information
    public String toString() {
        return name + "'s" + " account at " + bankName + " has a balance of $" + balance + " and an account number of " + accountNumber;
    }


}