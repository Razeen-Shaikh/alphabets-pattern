import java.util.*;
class Pattern_M 
{
	public static void main(String[] args) 
	{
		int i,j;
		System.out.println("Enter the number of rows");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (i=0; i < n; i++)
		{
			for (j=0; j < n; j++)
			{
				if (j == n-1 || j == 0 || (i == j || j + i == n-1) && i <= n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
		System.out.println("");
		}
	}
}