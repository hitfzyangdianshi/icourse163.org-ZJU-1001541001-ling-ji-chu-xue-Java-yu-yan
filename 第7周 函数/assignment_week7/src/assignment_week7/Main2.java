package assignment_week7;

import java.util.Scanner;

public class Main2 {
	public static boolean wanshu(int n)
	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)sum=sum+i;
			if(sum>n)return false;
		}
		if(sum==n)return true;
		else return false;
	}
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int m,n;
		n=in.nextInt();
		m=in.nextInt();
		int firsttime=1,output=0;;
		for(int i=n;i<=m;i++)
			if(wanshu(i)==true) 
			{
				if(firsttime==0)System.out.print(" ");
				System.out.print(i);
				firsttime=0;
				output=1;
			}
		if(output==0)System.out.println();
		in.close();
	}

}
