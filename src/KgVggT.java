import java.util.Scanner;

public class KgVggT {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {

			System.out.print("Bitte 1. Zahl eingeben: ");
			int z1 = scanner.nextInt();
			System.out.print("Bitte 2. Zahl eingeben: ");
			int z2 = scanner.nextInt();

			int z1temp = z1;
			int z2temp = z2;
			int ggT = 0;
			
			System.out.println("KGV: " + z1temp);
			System.out.println("ggT: " + ggT);
		}

	}
}
