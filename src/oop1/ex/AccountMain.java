package oop1.ex;

public class AccountMain {

    public static void main(String[] args) {
        Account account = new Account();
        account.diposit(10000);
        account.withdraw(5000);
        account.withdraw(20000); // 오류 메세지 출력
        System.out.println("잔고 = " + account.balnace);
    }
}
