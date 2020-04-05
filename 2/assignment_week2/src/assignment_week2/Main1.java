package assignment_week2;

import java.util.Scanner; 

public class Main1 {
	public static void main(String[] args) {
		int t;
		Scanner in = new Scanner(System.in);
		t=in.nextInt();
		t=t-800;
		if(t<0) t=t+2400;
		System.out.println(t);
	}
}
