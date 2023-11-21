package org.example.core.lesson5;

public class BankAccount {
    int id;
    String name;
    String lastName;
    int balance;

    /**
     * Пополнение счета
     * @param summa сумма которую кладем на счет
     * @return
     */
    int replenishment(int summa){
        balance +=summa;
        return balance;
    }

    /**
     * Изъятие денег со счета
     * @param summa сумма которую мы снимаем со счета
     * @return
     */
    int withdrawal(int summa){
        balance-=summa;
        return balance;
    }
}
