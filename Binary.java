import javax.swing.*;
import java.util.Scanner;
public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number= JOptionPane.showInputDialog("Enter a binary number: ");
        int save = 0;
        int[] arr = new int[number.length()];
        if (number.length() == 8) {
            for (int i = 0; i < number.length(); i++) {
                arr[i] = (int) (number.charAt(i));
                if (arr[i] == 49) {
                    switch (i) {
                        case 0:
                            save += Math.pow(2, 7);
                            break;
                        case 1:
                            save += Math.pow(2, 6);
                            break;
                        case 2:
                            save += Math.pow(2, 5);
                            break;
                        case 3:
                            save += Math.pow(2, 4);
                            break;
                        case 4:
                            save += Math.pow(2, 3);
                            break;
                        case 5:
                            save += Math.pow(2, 2);
                            break;
                        case 6:
                            save += Math.pow(2, 1);
                            break;
                        case 7:
                            save += Math.pow(2, 0);
                            break;
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "The binary number is :" + number+"\nThe Deecimal value is : "+save+"\nThe Character is : "+(char)save);

        }
    }
}
