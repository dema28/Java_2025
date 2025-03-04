package Novicov.Lessons09;

public class Main {
    public static void main(String[] args) {
        BankAccount checking = new BankAccount("1234567");
        System.out.println(checking.makeSummary());

        BankAccount anotherAccount = BankAccount.withDefaultOverdraft("87965329",1000);
        System.out.println(anotherAccount.makeSummary());

        BankAccount withOverDraft = BankAccount.withDefaultBalance("6464136",200);
        System.out.println(withOverDraft.makeSummary());

        BankAccount[] myAccounts = {
                new BankAccount("1234567"),
                new BankAccount("475850540", 0,200),
                new BankAccount("687058548")
        };

//        checking.credit(100);
//
//        checking.getAccountNo();
//        System.out.println(checking.makeSummary());
//
//        checking.credit(100);
//        System.out.println(checking.makeSummary());
//
//        checking.debit(150);
//        System.out.println(checking.makeSummary());
//
//        checking.debit(150);
//        System.out.println(checking.makeSummary());
//
//       checking.balance = -1900; // это не видно из другого класса
//        System.out.println(checking.getBalance());
//
//        checking.setBlocked(true);
//        checking.credit(100);
//        System.out.println(checking.isBlocked());
//        System.out.println(checking.makeSummary());



    }
}
