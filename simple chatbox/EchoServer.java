import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
import java.util.Scanner;

public class EchoServer {
    public static void main(String[] args) {
        while(true) {
            try {
                System.out.println("Waiting for clients...");
                ServerSocket ss = new ServerSocket(9806);

                Socket soc = ss.accept();   //will accept the socket as soon as client initiates.
                System.out.println("Connection Established");//if socket accepted, print this msg.

                //For receiving message.
                BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
                while(true){
                String str = in.readLine();
                System.out.println(str);
                if(str.equalsIgnoreCase("bye"))
                    break;

                Scanner sc = new Scanner(System.in);
                System.out.printf("Enter the message: ");
                String msg = sc.nextLine();
                //send the message now.

                PrintWriter sendmsg = new PrintWriter(soc.getOutputStream(), true);//Sending to client.
//            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
                sendmsg.println(msg);
        }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
