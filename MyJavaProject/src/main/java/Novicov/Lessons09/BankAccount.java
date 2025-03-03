package Novicov.Lessons09;

public class BankAccount {

    private String accountNo;
    private int balance;
    private int maxOverdraft;
    private boolean blocked = false;


    public static BankAccount withDefaultOverdraft(String accountNo, int balance) {
        return new BankAccount(accountNo, balance, 1000);
    }

    public static BankAccount withDefaultBalance(String accountNo, int maxOverdraft) {
        return new BankAccount(accountNo, 0, maxOverdraft);
    }


    public BankAccount(String accountNo) {
        this(accountNo,0,0);
    }

//    public BankAccount(String accountNo,int balance) {
//        this(accountNo, balance,0);
//    }
//
//    public BankAccount(String accountNo,int balance,int maxOverdraft) {
//        this(accountNo,0,0)
//    }

    public BankAccount(String accountNo, int balance, int maxOverdraft) {
        if (accountNo.length() < 5) {
            System.out.println("Invalid account number");
        }
        if (balance < 0) {
            System.out.println("Invalid initial balance");
        }
        if (maxOverdraft < 0) {
            System.out.println("Invalid maximum overdraft limit");
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
                "Account No: " + accountNo + ", Balance: $" + balance +
                "\nmax overdraft: " + maxOverdraft;
    }
}
