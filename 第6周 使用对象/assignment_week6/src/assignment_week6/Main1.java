package assignment_week6;

import java.util.Scanner; 

public class Main1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s;
		s=in.nextLine();
		String word[]=s.split(" ");
		for(int i=0;i<word.length;i++)
		{
			if(i<word.length-1)
			{
				if(word[i].length()>0) System.out.print(word[i].length()+" ");
			}
			else
			{
				if(word[i].length()>1)System.out.print(word[i].length()-1);
			}
		}
		
	}
}
