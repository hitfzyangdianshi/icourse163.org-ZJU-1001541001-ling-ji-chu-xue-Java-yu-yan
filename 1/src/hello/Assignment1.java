package hello;

import java.util.Scanner; 

public class Assignment1 {
	public static void main(String[] args) {//    °„F = (9/5)*°„C + 32
		int F,C;
		Scanner in=new Scanner(System.in);
		F=in.nextInt();
		F=F-32;
		C=(int)(F/(9.0/5.0));
		System.out.println(C);
		
	}

}
