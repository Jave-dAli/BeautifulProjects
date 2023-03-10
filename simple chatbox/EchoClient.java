import java.net.Socket;
import java.io.*;
import java.util.Scanner;

public class EchoClient {
    public static void main(String[] args) {
        try {
            System.out.println("Client Started");

            Socket soc = new Socket("localhost", 9806);
            Scanner sc=new Scanner(System.in);
//            BufferedReader userInput=new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                System.out.printf("Enter a msg for server: ");
                String str = sc.nextLine();
//            String str=userInput.readLine();
                if(str.equalsIgnoreCase("bye"))
                    break;
                PrintWriter out = new PrintWriter(soc.getOutputStream(), true);//Sending to server.
                out.println(str);

                //read what server sent back
                BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
                System.out.println(in.readLine());
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
