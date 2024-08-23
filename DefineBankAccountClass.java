package com.DPM;
public class DefineBankAccountClass {
    public static void main(String[] args) {

        BankAccounts acc = new BankAccounts();

 		acc.setId(1);

        acc.setBalance(15);

        acc.withdraw(5);

 		System.out.printf("Account ID%d, balance %.2f"
                ,acc.getId()
                ,acc.getBalance());
	}
}
class BankAccounts {

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double amaunt){
        this.balance+=amaunt;
    }
    public void withdraw(double amaunt){
        this.balance-=amaunt;
    }
    private double amaunt;
    private int id;
    private double balance;

    @Override
    public String toString(){
        return "ID" + this.id;
    }
    public BankAccounts() {
        this.id = id;
        this.balance = balance;
    }
}