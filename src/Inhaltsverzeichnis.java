import java.util.*;

public class Inhaltsverzeichnis {
	public static void main(String[] args) {

        String wort1 = null;
        String wort2 = null;
        int i =0;
        int j = 0;
        while (wort1 != "9") {
        	i = 0;
        	j = 0;
            Scanner scan = new Scanner(System.in);
                System.out.print("Bitte geben sie das erste Wort ein: ");
                wort1 = scan.nextLine();
                System.out.print("Bitte geben sie das zweite Wort ein: ");
                wort2 = scan.nextLine();
            
            i = 30 - wort1.length() - wort2.length();

            j = 0;
            System.out.print(wort1);
            while (j < i) {
                System.out.print(".");
                j++;
            }
            System.out.print(wort2 + "\n");
            }
        }

}
