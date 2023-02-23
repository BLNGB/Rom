import java.util.Scanner;

public class Rom {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            char eingabe = 'b';
            while (eingabe != 'e') {
                System.out.println("Bitte geben sie eine Römische zahl ein (I,V,X,L,C,D,M)");
                eingabe = scan.next().charAt(0);

                int[] a = { 1, 5, 10, 50, 100, 500, 1000 };
                char[] b = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };

                for (int i = 0; i < b.length; i++) {
                    if (eingabe == b[i]) {
                        System.out.println("Ihre eingabe bedeutet: " + a[i]);
                    }
                }
            }
        }
    }
}
