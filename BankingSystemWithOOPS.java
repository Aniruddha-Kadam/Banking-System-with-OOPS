import java.util.Scanner;

abstract class BankAccount {
    int accountNumber;
    Long amt, mobile;
    String name;
    static double balance = 0;

    public BankAccount() {
        if (balance >= 1000) {
        }
    }

    public void InputData() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Name ");
        name = sc.nextLine();

        System.out.println("Enter your Account no: ");
        accountNumber = sc.nextInt();

        System.out.println("Enter your Mobile no: ");
        mobile = sc.nextLong();

    }

    void Display() {
        System.out.println("Account Holder" + name + "\n Account No. " + accountNumber + "\n Mobile No " + mobile);
        System.out.println("Current Balance " + balance);
    }
}

class CurrentAccount extends BankAccount {
    void InquireBalance() {
        System.out.println(balance);
    }

    void Deposite() {
        Scanner sc = new Scanner(System.in);
        balance = sc.nextLong();
        balance = balance + amt;
        System.out.println("Your Current Balance" + balance);
    }

    void Withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Amount ");
        Long amt = sc.nextLong();
        if (amt > balance && balance - amt >= 1000) {
            System.out.println("Insufficient Balance");
        } else if (amt < balance) {
            balance = balance - amt;
        }
    }
}

class SavingAccount extends BankAccount {
    void InquireBalance() {
        System.out.println(balance);
    }

    void Deposite() {
        Scanner sc = new Scanner(System.in);
        balance = sc.nextLong();
        balance = balance + amt;
        System.out.println("Your Current Balance" + balance);
    }

    void Withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Amount ");
        Long amt = sc.nextLong();
        if (amt > balance && balance - amt >= 1000) {
            System.out.println("Insufficient Balance");
        } else if (amt < balance) {
            balance = balance - amt;
        }

    }
}

public class BankingSysteminABSub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingAccount sa = new SavingAccount();
        CurrentAccount ca = new CurrentAccount();
        while (true) {
            System.out.println("1. Input Data");
            System.out.println("2. Display");
            System.out.println("3. Deposite from Saving Account");
            System.out.println("4. Deposite from Current Account");
            System.out.println("5. Withdraw from Saving Account");
            System.out.println("6  Withdraw from Current Account");
            System.out.println("7. Inquire Balance Saving Account");
            System.out.println("8. Inquire Balance Current Account");
            System.out.println("9. Exit:");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Syncronizing...");
                    sa.InputData();
                    break;
                case 2:
                    System.out.println("Fetching Data...");
                    sa.Display();
                    break;
                case 3:
                    System.out.println("Please Enter the Cash ");
                    sa.Deposite();
                    break;
                case 4:
                    System.out.println("Please Enter the Cash ");
                    ca.Deposite();
                    break;
                case 5:
                    System.out.println("Syncronizing...");
                    sa.Withdraw();
                    break;
                case 6:
                    System.out.println("Syncronizing...");
                    ca.Withdraw();
                    break;
                case 7:
                    System.out.println("Syncronizing...");
                    sa.InquireBalance();
                    break;
                case 8:
                    System.out.println("Syncronizing...");
                    ca.InquireBalance();
                    break;
                case 9:
                    System.exit(0);
                    break;
            }
        }
    }
}
