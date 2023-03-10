package soundinjava;
import java.awt.*;

//public static synchronized void playSound(final String url) {
//        new Thread(new Runnable() {
//// The wrapper thread is unnecessary, unless it blocks on the
//// Clip finishing; see comments.
//public void run() {
//        try {
//        Clip clip = AudioSystem.getClip();
//        AudioInputStream inputStream = AudioSystem.getAudioInputStream(
//        Main.class.getResourceAsStream("/path/to/sounds/" + url));
//        clip.open(inputStream);
//        clip.start();
//        } catch (Exception e) {
//        System.err.println(e.getMessage());
//        }
//        }
//        }).start();
//        }
public class Main{
    public static void main(String[] args) {
        Toolkit tk8=Toolkit.getDefaultToolkit();
        for (int i=0; i<5; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("ERROR in displayGameNum() method line 129");
            }
            tk8.beep();
        }
    }
}