package com.nicksas;

import java.util.Scanner;

public class Chooser {

    static String[] menu = {"Показать баланс", "Внести деньги", "Снять Деньги", "Конвертация денег", "Выход"};
    Balance balance = new Balance();
    static Scanner scanner = new Scanner(System.in);
    Currency currency = new Currency();

    public void menu() {
        System.out.println("Выберите действие:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + " - " + menu[i]);
        }
        this.action(scanner.nextInt());
    }

    private void action(int num) {
        if (menu.length - 1 < num) {
            System.out.println("Выбрано неверное действие. Попробуйте снова!");
            return;
        }

        switch (num) {
            case 0:
                balance.printBalance();
                break;
            case 1:
                System.out.println("Введите сумму которую хотите пополнить:");
                balance.addSum(scanner.nextInt());
                break;
            case 2:
                System.out.println("Введите сумму которую хотите снять:");
                balance.removeSum(scanner.nextInt());
                break;
            case 3:
                System.out.println("Выберите валюту для конвертации:");
                currency.show();
                int currencyIndex = scanner.nextInt();
                if (currency.getCurrencyRate(currencyIndex) == -1.0){
                    System.out.println("Выбрана неверная валюта. Попробуйте снова!");
                    break;
                }
                double convertedSum = Converter.getSum(balance.getBalance(), currency.getCurrencyRate(currencyIndex));
                System.out.println("---------------------");
                System.out.println("На вашем счету " + convertedSum + " " + currency.getCurrency(currencyIndex));
                System.out.println("---------------------");
                break;
            default:
                System.exit(0);
        }
    }

}
