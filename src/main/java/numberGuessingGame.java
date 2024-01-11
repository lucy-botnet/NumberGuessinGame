import java.util.Scanner;

public class numberGuessingGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int random  = (int)(10*Math.random()+5-10*Math.random());
        System.out.println(random);
        int k=1;
        System.out.println("How many tries you want to guess the number: ");
        k = sc.nextInt();
        for (int i=0;i<k;i++){
            System.out.println("Enter your "+ (i+1) +  " guessed number: ");
            int guess = sc.nextInt();

            if(random == guess){
                System.out.println("Excellent! You have WON.");
                break;
            }else{
                System.out.println("Sorry, you guessed wrong. Please try again!!!");
            }
        }

    }
}
