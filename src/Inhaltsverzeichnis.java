import java.util.*;

public class Inhaltsverzeichnis {
    public static void main(String[] args) {

        String wort1 = null;
        String wort2 = null;
        while (wort1 != "9") {
            try (Scanner scan = new Scanner(System.in)) {
                System.out.print("Bitte geben sie das erste Wort ein: ");
                wort1 = scan.next();
                System.out.print("Bitte geben sie das zweite Wort ein: ");
                wort2 = scan.next();
            }
            int i = 30 - wort1.length() - wort2.length();

            int j = 0;
            System.out.print(wort1);
            while (j < i) {
                System.out.print(".");
                j++;
            }
            System.out.print(wort2 + "\n");

        }
    }
}
