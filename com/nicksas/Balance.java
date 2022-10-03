package com.nicksas;

public class Balance {
    private Double balance = 0.0;

    public Double getBalance() {
        return balance;
    }

    public void addSum(int sum) {
        balance += sum;
        System.out.println("---------------------");
        System.out.println("Ваш баланс пополнен.");
        System.out.println("---------------------");
        printBalance();
    }

    public void removeSum(int sum) {
        if (balance < sum){
            System.out.println("---------------------");
            System.out.println("У вас недостаточно средств.");
            System.out.println("---------------------");
            printBalance();
            return;
        }
        balance -= sum;
        printBalance();
    }

    public void printBalance(){
        System.out.println("---------------------");
        System.out.println("Текущая сумма на балансе: " + balance + " руб.");
        System.out.println("---------------------");
    }
}
