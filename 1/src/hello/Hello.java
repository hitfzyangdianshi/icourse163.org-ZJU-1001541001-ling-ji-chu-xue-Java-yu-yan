package hello;

import java.util.Scanner; 

public class Hello { //ªª≥… Main  £¨ M ¥Û–¥
	public static void class1() {
		System.out.println(111);
		Scanner in=new Scanner(System.in);
//		System.out.println("echo: "+in.nextLine());
//		System.out.println("2+3=="+5);
//		System.out.println("2+3=="+2+3);
//		System.out.println("2+3=="+(2+3));
//		System.out.println(2+3+"==2+3=="+(2+3));
		int price;
		final int amount =100;
		System.out.print("«Î ‰»Îprice£∫ ");
		price=in.nextInt();
		System.out.println(amount+"-"+price+"="+(amount-price));
	}
	
	public static void main(String[] args) {
		System.out.println(1.2-1.1);
		int foot;
		double inch;
		Scanner in=new Scanner(System.in);
		foot=in.nextInt();
		inch=in.nextDouble();
		System.out.println("foot= "+foot+"; inch= "+inch);
		System.out.println((int)((foot+inch/12)*0.3048*100)+"cm");
		
	}
}
