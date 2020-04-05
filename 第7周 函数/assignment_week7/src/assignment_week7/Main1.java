package assignment_week7;

import java.util.Scanner;

public class Main1 {
	public static boolean isPrime(int n)
	{
		boolean isPrime=true;
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}
	
	public static void yinshifenjie(int n,boolean first_pos)
	{
		if(isPrime(n)==true) 
		{
			if(first_pos==false)System.out.print("x");
			System.out.print(n);
		}
		else
		{
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					if(first_pos==false)System.out.print("x");
					System.out.print(i);
					first_pos=false;
					yinshifenjie(n/i,first_pos);
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		System.out.printf("%d=",n);
		yinshifenjie(n,true);
		in.close();
	}

}
