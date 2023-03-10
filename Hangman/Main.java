package Hangman;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Toolkit tk=Toolkit.getDefaultToolkit();
        Random random=new Random();
        Scanner sc=new Scanner(System.in);
        String[] wordlist={"hello", "pakistan", "newzealand", "November", "January", "IBA", "sacrifice", "jitandar", "programming", "orientation", "success"};
        int guesscount=0;
        String word=wordlist[random.nextInt(10)];
//        String word=wordlist[0];
        System.out.print("The Word Is ");
        for(int i=0; i<word.length(); i++) {
            System.out.print("- ");
        }
        System.out.println();
        char[] array = new char[word.length()];
        for(int k=0; k<word.length(); k++)
            array[k]='-';
        int k=1;
        System.out.println("You Have "+(word.length()+3)+" attempts");
        int times=0;
        while (k<word.length()+3) {
                System.out.print("\nGuess The Letter: ");
                boolean available=true;
                char c = sc.next().charAt(0);
                for (int j = 0; j < word.length(); j++) {
                    if(c==word.charAt(j)) {
                        times++;
                        array[j]=c;
                    }
                    else
                        tk.beep();
                    System.out.print(array[j]);
                    if(times==word.length())
                        break;
                }

//            System.out.println("letter "+c+" found "+times+" times");
            k++;
            }
        boolean flag=true;
        for(int i=0; i<word.length(); i++)
        {
            if(array[i]!=word.charAt(i)){
                flag=false;
                break;}
        }
        System.out.println("Congratulations! You Won");

    }
}
