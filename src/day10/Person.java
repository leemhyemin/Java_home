package day10;

import java.awt.image.ImageObserver;

public class Person {

    String name; // 이름
    int money; //가진돈
    Account account; //본인계좌

    Person(String pName, int pMoney) {
        name = pName;
        money = pMoney;
    }

    //계좌 개설기능
    // this 나 (뒤에서 배울 것)
    void makeAccount(Bank bank) {
        account = new Account(this);
        account.bankName = bank.bankName;
        bank.registryAccount(account);
        System.out.printf("%s 은행에 %s님의 계좌가 신성 되었습니다.\n", bank.bankName, name);
    }

    //입금 기능
    void deposit(int depositmoney) {
        if (money >= depositmoney) {
            account.balance += money;
            money -= depositmoney;
            System.out.printf("계좌에 %d 원이 입금 되었습니다.\n", depositmoney);
        } else {
            System.out.printf("입금 하려면 소지금이 %d원이 더 필요합니다.\n", depositmoney - money);

        }
    }

    //예금 잔액 확인 기능
    void checkAccountBalance() {
        System.out.printf("현재 예금 잔액은 %d 원입니다.\n", account.balance);

    }

    //계좌 이체기능
    void sendMoney(Person target, int money) {
        //상대방 예금액 늘어남
        target.account.balance += money;
        // 내 예금액이 줄어듬
        account.balance -= money;

        System.out.printf("%s 님이 %s 님에게 %d원을 송금했습니다\n", name ,target.name , money);
    }
}
