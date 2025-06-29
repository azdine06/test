package org.example;

import org.example.test1.Account;
import org.example.test1.AccountService;
import org.example.test1.Clock;

public final class Main {

    public static void main(String[] args) {
        AccountService account =  new Account(Clock.SYSTEM, System.out); // horloge système, console


        account.deposit(1000); // 10-01-2012 dans l’énoncé : utilisez Clock factice en tests
        account.deposit(2000);
        account.withdraw(500);

        // Affichage
        account.printStatement();
    }


}