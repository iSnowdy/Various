package Bank.Build;

import Bank.Domain.BankManager;
import Bank.Domain.CheckingAccount;

public class Main {
    public static void main (String[] args) {
        CheckingAccount c1, c2, c3;
        BankManager bM1 = new BankManager("Pepito Gonzáles", "681236472", 10000.0);
        BankManager bM2 = new BankManager("Francisco López", "680457983"); // gets the default: 1000.0
        BankManager bM3 = null;

        c1 = new CheckingAccount("985254S", "Pereira", bM2);
        c2 = new CheckingAccount("563145875K", "Alejandro", bM3);

        c1.showInfo();
        System.out.println("---------------");
        c2.showInfo();
    }
}
