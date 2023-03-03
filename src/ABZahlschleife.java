import java.util.Scanner;

public class ABZahlschleife {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] zahlen = new int[101];

		for (int i = 1; i < zahlen.length; i++) {
			zahlen[i] = i;
			if (zahlen[i] % 10 == 0) {
				System.out.print(zahlen[i] + "\t\n");
			} else {
				System.out.print(zahlen[i] + "\t");
			}
		}
		System.out.print("Bitte geben sie eine zahl zwischen 2 und 9 ein : ");
		int teiler = scan.nextInt();

		for (int i = 1; i < zahlen.length; i++) {
			zahlen[i] = i;
			// ausnahme teilbar durch teiler
			if (zahlen[i] % 10 == 0 && zahlen[i] % teiler == 0) {
				System.out.print("*\t\n");
			} else if (zahlen[i] % teiler == 0) {
				System.out.print("*\t");
			} else
			// ausnahme zahl mit teiler drin
			if (zahlen[i] % 10 == 0 && zahlen[i] % 10 / 1 == teiler) {
				System.out.print("*\t\n");
			} else if (zahlen[i] % 10 / 1 == teiler) {
				System.out.print("*\t");
			} else if (zahlen[i] % 10 == 0 && zahlen[i] / 10 == teiler) {
				System.out.print("*\t\n");
			} else if (zahlen[i] / 10 == teiler) {
				System.out.print("*\t");
			} else
			// augabe alle anderen zahlen
			if (zahlen[i] % 10 == 0 && !(zahlen[i] % teiler == 0)) {
				System.out.print(zahlen[i] + "\t\n");
			} else if (!(zahlen[i] % teiler == 0)) {
				System.out.print(zahlen[i] + "\t");
			}

		}
	}
}