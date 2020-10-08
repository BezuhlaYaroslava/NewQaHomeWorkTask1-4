package lesson1.TaskFourAndFiveBancAccount;

import java.util.Random;

public class BancAccount {
    private int accountNumber;
    private int balance;

    public BancAccount() {
    }

    public BancAccount(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        return;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public static int setBalance(int c, int d){
        int b = c + d;
        System.out.println("Баланс: " + b);
        return b;
    }

    public static int credit() {
        Random random = new Random();
        int c = random.nextInt(99);
        System.out.println("На счет начислено: " + c);
        return c;
    }


    public static int debit(){
        Random random = new Random();
        int d = random.nextInt();
        //int d = random.nextInt(200); //для правильного срабатывания теста
        System.out.println("Сума снятия: " + d);
        return d;
    }

}
