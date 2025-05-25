import java.util.Scanner;
import java.util.Date;

class ATM {
    double balance=75000;
    int PIN=1234;
    int inputpin;
    int choice;

    double withdrawmoney;
    double depositmoney;

    public void checkpin()
    {
        System.out.println("||||||||||||||||||||||||||||||||||");
        System.out.println("||||||||||||||||||||||||||||||||||");
        System.out.println("|           BHARAT BANK          |");
        System.out.println("|           ATM SERVICE          |");
        System.out.println("|                                |");
        System.out.println("|     CARD HAS BEEN INSERTED     |");
        System.out.println("|            Enter PIN           |");
        System.out.println("|                                |");
        System.out.println("||||||||||||||||||||||||||||||||||");
        System.out.println("||||||||||||||||||||||||||||||||||");
        Scanner sc=new Scanner(System.in);
        inputpin=sc.nextInt();
        while (inputpin!=PIN)
        {
            System.out.println("\nINCORRECT PIN. TRY AGAIN.");
            System.out.print("ENTER YOUR PIN: ");
            inputpin=sc.nextInt();
        }
    }

        public void  mainmenu()
        {
            System.out.println("||||||||||||||||||||||||||||||||||");
            System.out.println("||||||||||||||||||||||||||||||||||");
        System.out.println("|           BHARAT BANK          |");
        System.out.println("|           ATM SERVICE          |");
        System.out.println("|                                |");
        System.out.println("|       1 Check A/C Balance      |");
        System.out.println("|       2 Money Withdrawal       |");
        System.out.println("|       3 Money Deposit          |");
        System.out.println("|       4 Exit                   |");
            System.out.println("||||||||||||||||||||||||||||||||||");
            System.out.println("||||||||||||||||||||||||||||||||||");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        switch(choice)
            {
                case 1:
                    System.out.print("Your Account balance is: "+ balance);
                    System.out.println("");
                    try {
                        Thread.sleep(1000);
                    }
                    catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    mainmenu();
                case 2:
                    System.out.print("Enter amount to Withdraw: ");
                    double withdrawmoney=sc.nextDouble();
                    if(withdrawmoney>balance) {
                        System.out.println("Insufficient Balance");
                    }
                    else {
                        balance=balance-withdrawmoney;
                        System.out.print("Your successfully withdrawn: INR" + withdrawmoney);
                        System.out.println("");
                    }
                    try {
                        Thread.sleep(2000);
                    }
                    catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    System.out.println("|                     BHARAT BANK                        |");
                    System.out.println("|                     ATM SERVICE                        |");
                    System.out.println("|                                                        |");
                    System.out.println("|CARD NUMBER-------------------------1234XXXXXXXXXXXX5678|");
                    System.out.println("|DATE:-XX/XX/XXXX                             TIME:-XX:XX|");
                    System.out.println("|FROM A/C--------------------------------9876XXXXXXXX4321|");
                    System.out.println("|WITHDRAWL AMOUNT-------------------------------INR"+ withdrawmoney);
                    System.out.println("|AVAILABLE A/C BALANCE--------------------------INR"+ balance);
                    System.out.println("|-----------------TRANSACTION SUCCESSFUL-----------------|");
                    System.out.println("|                                                        |");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

                    mainmenu();
                case 3:
                    System.out.println("Enter Amount to Deposit: ");
                    double depositmoney=sc.nextDouble();
                    balance=balance+depositmoney;
                    System.out.print("Your money has been deposited successfully");
                    try {
                        Thread.sleep(2000);
                    }
                    catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    System.out.println("|                     BHARAT BANK                        |");
                    System.out.println("|                     ATM SERVICE                        |");
                    System.out.println("|                                                        |");
                    System.out.println("|CARD NUMBER-------------------------1234XXXXXXXXXXXX5678|");
                    System.out.println("|DATE:-XX/XX/XXXX                             TIME:-XX:XX|");
                    System.out.println("|FROM A/C--------------------------------9876XXXXXXXX4321|");
                    System.out.println("|DEPOSIT AMOUNT---------------------------------INR"+ depositmoney);
                    System.out.println("|AVAILABLE A/C BALANCE--------------------------INR"+ balance);
                    System.out.println("|-------------------DEPOSIT SUCCESSFUL-------------------|");
                    System.out.println("|                                                        |");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    mainmenu();
                case 4:
                    System.exit(0);
                    break;
            }
        }

}
public class Main {
    public static void main(String[] args) {
        ATM obj= new ATM();
        obj.checkpin();
        obj.mainmenu();
    }
}