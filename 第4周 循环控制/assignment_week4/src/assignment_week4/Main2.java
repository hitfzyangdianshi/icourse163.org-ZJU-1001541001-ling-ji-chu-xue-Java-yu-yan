package assignment_week4;

import java.util.Scanner; 

public class Main2 {
	public static void main(String[] args) {
		int num,zerosign=0;
		Scanner in = new Scanner(System.in);
	    num=in.nextInt();
	    if(num<0)	{
	    	System.out.print("fu ");
	    	num=-num;
	    }
	    if(num==0) System.out.print("ling");
	    else    for(int i=100000; i>=1;i=i/10)
	    {
	    	int s=(num/i)%10;
	    	if(zerosign==0) if(s==0) continue;
	    	if(s!=0)zerosign=1;
	    	switch (s)
	    	{
	    		case 0: System.out.print("ling");break;
	    		case 1: System.out.print("yi");break;
	    		case 2: System.out.print("er");break;
	    		case 3: System.out.print("san");break;
	    		case 4: System.out.print("si");break;
	    		case 5: System.out.print("wu");break;
	    		case 6: System.out.print("liu");break;
	    		case 7: System.out.print("qi");break;
	    		case 8: System.out.print("ba");break;
	    		case 9: System.out.print("jiu");break;
	    		default:break;
	    	}
	    	if(i!=1)System.out.print(" ");
	    }
	    System.out.println();
	}
}