package edu.guilford;


public class Main {

    public static void main(String[] args) {
        // create an arraylist of bank accounts with values for all attributes
        Bankaccount[] accounts = new Bankaccount[5];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Bankaccount();
        }


        // print out the values of the bank accounts using the toString method
        for (int i = 0; i < accounts.length; i++) {
            System.out.println(accounts[i].toString());
        }
    }
}