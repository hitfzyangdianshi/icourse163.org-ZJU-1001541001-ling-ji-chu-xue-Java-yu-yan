package assignment_week3;

import java.util.Scanner; 

public class Main2 {
	public static void main(String[] args) {
		int num,tag=1,result=0;
		Scanner in = new Scanner(System.in);
	    num=in.nextInt();
		while(num!=0) {
			if((num%10)%2 == tag %2) {
				result=result+ (1<<(tag-1));
			}
	//		System.out.println(tag+","+result);	
			num=num/10;
			tag++;
	   }
	   System.out.println(result);		
    }
}
