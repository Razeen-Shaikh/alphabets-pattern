import java.util.*;

public class Pattern_V {

	public static void main(String[] args) {
		int i, j;
		System.out.println("Enter the number of rows");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if ((i == j || i + j == n - 1) && i <= n / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

}