package assignment_week5;

import java.util.Scanner; 

public class Main {
	public static void main(String[] args) {
		int [] a= new int[101];
		int time,e,maxe=-1,zerotime=0;
		Scanner in = new Scanner(System.in);
	    while(true)
	    {  
	    	e=in.nextInt();
	    	time=in.nextInt();
	    	a[e]=a[e]+time;
	    	if(e==0)zerotime++;
	    	if(zerotime==2)break;
	    }
	    int firstpos=1;int all0=1;
	    for(int i=100;i>=0;i--)
	    {
	    	if(a[i]!=0)
	    	{
	    		all0=0;
	    		if(i==0)
	    		{
	    			if(firstpos==1)
	    			{
	    				firstpos=0;
	    				System.out.print(a[i]);
	    			}
	    			else 
	    			{
	    				if(a[i]>0)System.out.print("+"+a[i]);
	    				else System.out.print(a[i]);
	    			}
	    		}
	    		else if(i==1)
	    		{
	    			if(firstpos==1)
	    			{
	    				firstpos=0;
	    				if(a[i]>1)System.out.print(a[i]+"x");
	    				else if(a[i]==1)System.out.print("x");
	    				else if(a[i]==-1)System.out.print("-x");
	    				else  System.out.print(a[i]+"x");
	    			}
	    			else 
	    			{
	    				if(a[i]>1)System.out.print("+"+a[i]+"x");
	    				else if(a[i]==1)System.out.print("+x");
	    				else if(a[i]==-1)System.out.print("-x");
	    				else System.out.print(a[i]+"x");
	    			}
	    		}
	    		else
	    		{
	    			if(firstpos==1)
	    			{
	    				firstpos=0;
	    				if(a[i]>1)System.out.print(a[i]+"x"+i);
	    				else if(a[i]==1)System.out.print("x"+i);
	    				else if(a[i]==-1)System.out.print("-x"+i);
	    				else System.out.print(a[i]+"x"+i);
	    			}
	    			else 
	    			{
	    				if(a[i]>1)	System.out.print("+"+a[i]+"x"+i);
	    				else if(a[i]==1)System.out.print("+x"+i);
	    				else if(a[i]==-1)System.out.print("-x"+i);
	    				else System.out.print(a[i]+"x"+i);
	    			}
	    		}
	    	}
	    }
	    if(all0==1) System.out.print(0);
	    System.out.println();
		in.close();
	}

}

