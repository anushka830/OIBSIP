import java.util.*;
public class Number_Guessing {
    public static void main(String[] args){
        System.out.println("Welcome to our Number Guessing Game!!");
        Scanner sc = new Scanner(System.in);
        int round=0;
        boolean playagain = true;
        while(playagain){
        int num = 1+new Random().nextInt(100);
        int attempts = 5;
         boolean guessedCorrectly = false;

        System.out.println("Choose the no. between 1 to 100!!");
        for(int i=0;i<attempts;i++){
            System.out.println("Enter the number that You have guessed!");
            int guess_num=sc.nextInt();
            if(num==guess_num){
                System.out.println("Great! you have guessed the number"+(i+1));
                guessedCorrectly = true;
                break;
            }
            else if(num>guess_num){
                System.out.println("Too low! Try again!!");
            }
            else{
                System.out.println("Too High! Try again!!");
            }
        }
            if(!guessedCorrectly){
                System.out.println("No attempts are left!! total :" +attempts);
                System.out.println("The number was:"+num);
            }
            round++;  
        System.out.println("Do you want to play again??");
        int a=sc.nextInt();
        if(a!=1){
            playagain = false;
            
        }
        }
        System.out.println("Thank you for playing the Game!!");
        System.out.println("Rounds u have played:"+round);
    }
}
