package LC;

import java.util.Scanner;

public class lc9 {
	public static void main(String[] args)
	{
		for(int i=1;i<=10;i++)
		{
			for(int j=0;j<=10-i;j++)
			{
				System.out.print(" ");
			}
				for(int k=1;k<=i;k++)
				{
				System.out.print("*");
				}
			System.out.println("");
			}
		}

}
