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
			int kgv = 0;
			int ggT = 0;
			int i = 0;

			do {
				
				if (z1temp < z2temp) {
					z1temp = z1temp + z1;
					kgv = z1temp;
				} else {
					if (z2temp < z1temp) {
						z2temp = z2temp + z2;
						kgv = z1temp;
					}
				}
			}while (z1temp != z2temp);
			
			System.out.println("KGV: " + kgv);
			
			z1temp = z1;
			z2temp = z2;
			int smalnmr = Math.min(z1temp, z2temp);
			int bignmr = Math.max(z1temp, z2temp);
			int smalnmrtemp = smalnmr;
			
			do {
				smalnmrtemp = smalnmrtemp - 1;
				if (bignmr % smalnmrtemp == 0 && smalnmr % smalnmrtemp == 0) {
					ggT = smalnmrtemp;
					break;
				}
			} while (smalnmrtemp != 1 || (bignmr % smalnmrtemp != 0 && smalnmr % smalnmrtemp != 0)) ;
			
			System.out.println("ggT: " + ggT);
		}
	}
}