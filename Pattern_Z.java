import java.util.*;

public class Pattern_Z {

	public static void main(String[] args) {
		int i, j;
		System.out.println("Enter the number of rows");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (i == n - 1 || i == 0 || j + i == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

}