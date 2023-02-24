import java.util.Scanner;

public class CarGame {
    public static void main(String[] args) {
        String prompt="1 -> Start The Car\n2 -> Stop The Car\n3 -> Help\n4 -> Quit Game";
        boolean started=false;
        System.out.println(prompt);
        while(true)
        {
            System.out.print("Enter A Prompt: ");
            Scanner sc=new Scanner(System.in);
            int option=sc.nextInt();
            switch (option)
            {
                case 1 ->{
                    if(!started){
                        System.out.println("The Car has started\n");
                        started=true;
                    }
                    else
                        System.out.println("The Car is Already On The Track You Fool\n");
                }
                case 2->{
                    if(started)
                    {
                        System.out.println("The Car Has Stopped");
                        started=false;
                    }
                    else {
                        System.out.println("The Car Has Already Stopped Bloody Bastard!");
                    }
                }
                case 3->{
                    System.out.println(prompt);
                }
                case 4->{
                    System.out.println("Are You Sure You Want To Quit The Game!(Y/N");
                    char o=sc.next().charAt(0);
                    if((o=='Y')||(o=='y'))
                        break;
                    else if((o=='N')||(o=='n'))
                        System.exit(1);
                    else System.out.println("You Are Bloody Fool...");
                }
            }
        }
    }
}
