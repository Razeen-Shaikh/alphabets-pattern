import java.util.*;

class Pattern_Q {
	public static void main(String[] args) {
		int i, j;
		System.out.println("Enter the number of rows");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if ((i == 0 || i == 3 * (n / 4)) && (j > 0 && j < 3 * (n / 4))
						|| (j == 0 || j == 3 * (n / 4)) && (i > 0 && i < 3 * (n / 4))
						|| i == j && (i >= n / 2 && i <= n - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}