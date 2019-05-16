import java.util.*;
class Pattern_N 
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
				if (j == 0 || j == n-1 || i == j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
		System.out.println();
		}
	}
}