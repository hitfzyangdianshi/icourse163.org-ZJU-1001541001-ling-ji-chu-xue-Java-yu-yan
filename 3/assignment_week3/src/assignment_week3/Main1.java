package assignment_week3;

import java.util.Scanner; 

public class Main1 {
	public static void main(String[] args) {
		int ji,ou,num=0;
		ji=0;
		ou=0;
		Scanner in = new Scanner(System.in);
		while(true) {
			num=in.nextInt();
			if(num==-1)break;
		    if(num%2==0) {
		    	ou++;
		    }
		    else {
		    	ji++;
		    }
	   }
	   System.out.println(ji+" "+ou);		
    }
}
