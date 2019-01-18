package alphabets;

import java.util.*;
class L 
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
				if (j == 0 || i == n-1)
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