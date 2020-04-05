package assignment_week4;

import java.util.Scanner; 

public class Main1 {
	public static void main(String[] args) {
		int num1,num2,sum=0,countprime=0;
		Scanner in = new Scanner(System.in);
	    num1=in.nextInt();
	    num2=in.nextInt();
		for(int i=2;;i++)
		{
			int isprime=1;
			for(int j=2;j<=Math.sqrt(i);j++)
			{
				if(i%j==0)
				{
					isprime=0;
					break;
				}
			}
			if(isprime==1)
			{
				countprime++;
				if(countprime>=num1 && countprime<=num2)
				{
					sum=sum+i;
				}
				if(countprime==num2)break;
			}
		}
	    System.out.println(sum);		
	}
}
