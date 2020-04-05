package final_exam;

import java.util.Scanner;

public class Main1 {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    int n;
	    n=in.nextInt();
	    int i=0;
	    if(n<0)i=32;
	    else	    for(i=0;n!=0;i++)
	    {
	    	n=n>>1;
	    }
	    System.out.print(32-i);
	    in.close();		
	
	}

}
