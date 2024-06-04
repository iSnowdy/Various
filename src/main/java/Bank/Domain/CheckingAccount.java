package Bank.Domain;

public class CheckingAccount {
    private String DNI;
    private String name;
    private double balance;
    private BankManager bankManager;

    public CheckingAccount(String DNI, String name, BankManager bankManager) {
        this.DNI = DNI;
        this.name = name;
        this.balance = 5000.00;

        this.bankManager = bankManager;
    }

    public void changeManager(BankManager bankManager) {
        this.bankManager = bankManager;
    }

    public void showInfo() {
        if (bankManager == null) {
            System.out.println("Account without manager");
        } else {
            System.out.println("Manager Information:\n");
            bankManager.showInfo();
            System.out.println("Account Information:\n");
            System.out.println("Account Name: " + name);
            System.out.println("DNI: " + DNI);
            System.out.println("Balance: " + balance);
        }
    }
}
