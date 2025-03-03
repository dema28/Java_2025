package Novicov.Lessons09;

public class BankAccount {

    private String accountNo;
    private int balance = 0;
    private int maxOverdraft = 0;
    private boolean blocked = false;


    public BankAccount(String account) {
        this(accountNo, 0, 1000);
    }

    public BankAccount(String accountNo) {
        this(accountNo,0 );
    }

    public BankAccount(String accountNo, int balance, int maxOverdraft) {
        if (accountNo.length() < 5) {
            System.out.println("Invalid account number");
        }
        this.accountNo = accountNo;
        this.balance = balance;
        this.maxOverdraft = maxOverdraft;
    }



    public int getBalance() {
        return balance;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void credit(int amount) {
        if (blocked) {
            System.out.println("Account is blocked!");
            return;
        }
        balance += amount;
    }

    public void debit(int amount) {
        if (blocked) {
            System.out.println("Account is blocked!");
            return;
        }
        if (balance < amount) {
            System.out.println("Cannot withdraw more than you have Не может снять больше, чем вы");
        } else {
            balance -= amount;
        }
    }

    public String makeSummary() {
        return (isBlocked() ? "Blocked " : "") +
                "Account No: " + accountNo + ", Balance: $" + balance;
    }
}
