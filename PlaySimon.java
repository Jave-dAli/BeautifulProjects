package simon;
import java.awt.*;
import java.util.Random;
import java.util.Scanner;

class Methods{
    int getRandom()
    {
        Random random=new Random();
        int i=random.nextInt(10);
        if(i==0)
            getRandom();
        return i;
    }
    void displayResult(int attempts, int totalScore)
    {
        System.out.println("Total Attempts: "+attempts);
        System.out.println("Total Score: "+totalScore);
        System.exit(1);
    }
    void play() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To My Game");
        System.out.print("Are You Ready??? (y/n) ");
        char c = sc.next().charAt(0);
        if (c != 'y') {
            System.out.println("Hahaha It is better not to give up DEAR\nBut You GaveUp");
            System.exit(1);
        }
        System.out.println();
    }
    void terminate(int attempt, int total){

        System.out.println("Sorry, You Used All Your Attempts");
        System.out.println("Game Over");
        displayResult(attempt, total);
    }
}
public class PlaySimon {

    public static void main(String[] args) {
        Toolkit tk= Toolkit.getDefaultToolkit();
        Methods method=new Methods();
        method.play();
        int totalscore=0, attempt=1;

        Random random=new Random();
        Scanner sc=new Scanner(System.in);

        int number=random.nextInt(10);
        String gamenum="";
        gamenum+=random.nextInt(10);
        while(true)
        {

            System.out.println("The number is "+gamenum);
            //==========================================================
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("ERROR in displayGameNum() method line 129");
            }
            //============================================================
            for(int i=0; i<30; i++)
                System.out.println();
            System.out.print("Enter Your Guess: ");
//            int guess=sc.nextInt();
            String guessnum=sc.next().toLowerCase();
            if(guessnum.equalsIgnoreCase(gamenum))       //Guess is Incorrect.
            {
                tk.beep();
                number=method.getRandom();
                gamenum+=number;
                totalscore++;
            }

            else{
                if (attempt==3)
                    method.terminate(attempt, totalscore);
                System.out.println("You Have "+(3-attempt)+" Attempt(s) Left");
                System.out.print("Do You Want To Play Again? (y)??? ");
                char c=sc.next().charAt(0);
                if(c!='y') {
                    method.displayResult(attempt, totalscore);
                    System.exit(1);
                }
                else if(c=='y') {
                    attempt++;
                    gamenum="";
//                    number=0;
                    gamenum+=random.nextInt(10);
                }

            }

        }

    }
}