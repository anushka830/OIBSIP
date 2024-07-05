# OIBSIP
import java.util.Scanner;
class ATM{
    float Balance;
    int pin = 2244;
    int transaction=0;
    String transactionHistory="";
    Scanner sc = new Scanner(System.in);
    public void checkPin(){
    System.out.println("Enter your login pin:");
    int enteredpin = sc.nextInt();
    if(enteredpin == pin){
        System.out.println("You logged in successfully!");
        menu();
    }
    
        else{
            System.out.println("Enter a valid pin!");
            checkPin();
        }
    }
        public void menu(){
            System.out.println("Enter your choice");
            System.out.println("1.Transaction History");
            System.out.println("2.Withdraw money");
            System.out.println("3.Deposit money");
            System.out.println("4.Transfer money");
            System.out.println("5.Check balance");
            System.out.println("6.Quit");

            int Option = sc.nextInt();
            if(Option==1){
                transactionHistory();
            }
            else if(Option==2){
                withdrawMoney();
            }
            else if(Option==3){
                depositMoney();
            }
            else if(Option==4){
                transferMoney();
            }
            else if(Option==5){
                checkBalance();
            }
            else if(Option==6){
                Exit();
            }
            else{
                System.out.println("Enter a valid choice");
              main();
            }
        }
    public void transactionHistory(){
        if(transaction==0){
            System.out.println("No transaction is done!");
        }
        else{
            System.out.println("transaction"+transaction);
        }
        menu();
    }
    public void withdrawMoney(){
        System.out.println("Enter amount:");
        
        float amount = sc.nextFloat();
        if(amount>Balance){
            System.out.println("Unsufficient Balance");
        }
        else{
            Balance = Balance - amount;
            System.out.println("Money withdrawn successfully!");
        }
        menu();
    }
    public void depositMoney(){
        System.out.println("Enter amount:");
       
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Amount deposited successfully!");
        menu();
    }
    public void transferMoney(){
        Scanner sc =new Scanner(System.in);
            System.out.println("Enter Receipent name: ");
            String receipent = sc.nextLine();
            System.out.println("Enter the amount that you want to transfer: ");
            float amount = sc.nextFloat();
            try {
            if (Balance>= amount) { 
                if (amount <= Balance) {
            transaction++;
            Balance = Balance - amount;
            System.out.println("Amount Succesfully Transferred to "+ receipent);
            String str = amount + "Rs transferred to " + receipent+"\n";
            transactionHistory.concat(str);
        }
            else {
            System.out.println("Limit exceeded!");
            }
            }
            else{
                System.out.println("Insufficient Balance!");
            } 
        }
            catch (Exception e) {
            }
        menu();
    
    }
    public void checkBalance(){
        System.out.println("Balance"+Balance);
        menu();
    }
    public void Exit(){
        System.out.println("Exited Successfully!");
    }
}


public class ATMINTERFACE {
    public static void main(String[] args ){
        ATM obj = new ATM();
        obj.checkPin();
    }
}
