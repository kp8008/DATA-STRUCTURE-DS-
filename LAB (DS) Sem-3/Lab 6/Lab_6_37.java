
//Create a class BankAccount with attributes like account number, balance,  account holder 
//and name. Create an array of BankAccount objects to store bank accounts. Implement 
//methods to deposit money, withdraw money and check balance.

import java.util.*;

class BankAccount{
    Scanner sc = new Scanner(System.in);
    int account_No;
    double balance;
    String account_hold;
    String name;

    public void toDeposit(){
        System.out.println("How many money you want to deposit:");
        int depo = sc.nextInt();

        double fin = depo+balance;
        System.out.println("Your bank balance now :"+fin);
    }

    public void toWithdraw(){
        System.out.println("How many money you want to withdraw:");
        int with = sc.nextInt();
        double fin = balance-with;
        if(fin>5000){
            System.out.println("Your bank balance now :"+fin);
        }
        else{
            System.out.println("You did not withdraw your money becuse of minimum citeria");
        }
    }
    public void toCheckBalance(){
        System.out.println("Your bank account balance is : "+balance);
    }
}

class Lab_6_37{
    public static void main(String[] args){
        BankAccount work = new BankAccount();
        Scanner sc = new Scanner(System.in);
        System.out.println("'w'-for withdraw,,'d'-for deposit,,'c'-for check balance");
        char ch = sc.next().charAt(0);
        if(ch=='c' || ch=='C'){
            work.toCheckBalance();
        }
        else if(ch=='w' || ch=='W'){
            work.toWithdraw();
        }
        else if(ch=='d' || ch=='D'){
            work.toDeposit();
        }
        else{
            System.out.println("Not currect word");
        }
    }
}