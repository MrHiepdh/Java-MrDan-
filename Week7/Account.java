package Week7;

import java.util.*;

class Customer {
    public String name;
    public int age;
    public String ID;
    public Account account;
    Scanner sc = new Scanner(System.in);

    public Customer(String name, int age, String ID, Account account) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.account = account;
    }

    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("ID : " + ID);
    }

    public void recharge() {
        System.out.println("Enter the amount to deposit :");
        double temp = sc.nextDouble();
        account.deposit(temp);
    }

    public void withDrawal() {
        System.out.println("Enter the amount to deposit :");
        double temp = sc.nextDouble();
        account.withDrawal(temp);
    }

    public void show() {
        account.showInformation();
    }
}

public class Account {
    public String name;
    public int age;
    public String ID;
    public int accountNumber;
    public double balance = 0;// balance : số dư

    public Account(String name, int age, String ID, int accountNumber, double balance) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void showBalance() {
        System.out.println("Balance : " + balance);
    }

    public void withDrawal(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Balance : " + balance);
        } else {
            System.out.println("Amount withdraw exceeds the current balance ");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Current Balance : " + balance);
    }

    public void deleteAccount() {
        name = " ";
        age = 0;
    }

    public void showInformation() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("ID : " + ID);
        System.out.println("Account Number : " + accountNumber);
        showBalance();
    }
}

class run7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String ID = sc.nextLine();
        int age = sc.nextInt();
        Random generator = new Random();// trình tạo số ngẫu nhiên
        int value = generator.nextInt(10000);// trả về ngẫu nhiên các số từ 0 đến <10000
        Account acc1 = new Account(name, age, ID, value, 1000000);
        Customer cus1 = new Customer(name, age, ID, acc1);
        int work;
        do {
            System.out.println("1.Recharge.");
            System.out.println("2.WithDrawal.");
            System.out.println("3.Show the information.");
            System.out.println("4.Exit.");
            work = sc.nextInt();
            switch (work) {
                case 1: {
                    cus1.recharge();
                    break;
                }
                case 2: {
                    cus1.withDrawal();
                    break;
                }
                case 3: {
                    cus1.show();
                }
                case 4: {
                    break;
                }
            }
        } while (work != 4);
        sc.close();
    }
}
