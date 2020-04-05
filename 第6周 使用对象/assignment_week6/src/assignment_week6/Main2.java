package assignment_week6;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s;
		int hh=0,mm=0,ss=0;
		WHILE_LOOP:
		while((s=in.nextLine())!=null)
		{
			int comma=0,checksum=0,checksum1;
			if(s.equals("END"))break;
			if(s.contains("$GPRMC")==false)continue;
			//if(s.charAt(18)!='A')continue;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)==',')comma++;
				if(comma==2)
				{
					if(s.charAt(i+1)=='A')
					{
						comma=0;
						break;
					}
					else
						continue WHILE_LOOP;
				}
			}
			for(int i=0;i<s.length();i++)				
			{
				if (s.charAt(i)==',')comma++;
				if(comma==12)
				{
					checksum=Integer.parseInt(s.substring(i+3,s.length()),16);
				//	System.out.println(checksum);
					break;
				}
			}
			checksum1=(int)s.charAt(1)^(int)s.charAt(2);
			for(int i = 3;s.charAt(i)!='*';i++)
			{
				if (s.charAt(i)!= ',')checksum1=checksum1^(int)s.charAt(i)%65536;
			}
			if(checksum==checksum1)
			{
				ss = (s.charAt(12) - '0') + (s.charAt(11) - '0') * 10;
				mm = (s.charAt(10) - '0') + (s.charAt(9) - '0') * 10;
				hh = (s.charAt(8) - '0') + (s.charAt(7) - '0') * 10 + 8;
				hh = hh % 24;

			}

		}
		System.out.printf("%02d:%02d:%02d",hh,mm,ss);
		in.close();
	}

}
