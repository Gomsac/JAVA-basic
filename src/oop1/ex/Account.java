package oop1.ex;

public class Account {
    int balnace;

    void diposit(int amount) {
        balnace += amount;
    }

    void withdraw(int amount) {
        if (balnace >= amount) {
            balnace -= amount;
        }else {
            System.out.println("잔액 부족");
        }
    }
}
