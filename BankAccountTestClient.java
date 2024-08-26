package com.DPM;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class BankAccountTestClient {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Map<Integer, BankAccount> accounts = new HashMap<>();

        String line = scan.nextLine();

        BankAccount account = new BankAccount();

        while (!line.equals("End")){
            String[] comand = line.split(" ");
            int id = Integer.parseInt(comand[1]);
            switch (comand[0]){
                case"Create":
                    if (accounts.containsKey(id)){
                        System.out.println("Account already exists");
                    }else {
                        BankAccount bacc = new BankAccount();
                        bacc.setId(id);
                        accounts.put(id, bacc);
                    }
                    break;
                case"Deposit":
                    double depositAmount = Double.parseDouble(comand[2]);
                    if (accounts.get(id) == null){
                        System.out.println("Account does not exist");
                        break;
                    }
                    accounts.get(id).deposit(depositAmount);
                    break;
                case"Withdraw":
                    double withdrawAmount = Double.parseDouble(comand[2]);
                    BankAccount bacc = accounts.get(id);
                    if (bacc != null){
                        if (bacc.getBalance() < withdrawAmount){
                            System.out.println("Insufficient balance");
                        }else {
                            bacc.withdraw(withdrawAmount);
                        }
                    }else {
                        System.out.println("Account does not exist");
                    }
                    break;
                case"Print":
                    if (accounts.get(id) == null){
                        System.out.println("Account does not exist");
                        break;
                    }
                    System.out.println(accounts.get(id));
                    break;
                }
                line = scan.nextLine();
        }
    }
}
class BankAccount {

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
        return String.format("Account ID%d, balance %.2f"
                ,this.getId(),this.getBalance());
    }
    public BankAccount() {
        this.id = id;
        this.balance = balance;
    }
}