package GuviLogic;

import java.util.Scanner;

public class alphabetelimination {
	public static void main(String[] args){
		String a;
		int b=0;
		Scanner s=new Scanner(System.in);
		a=s.next();
		for(int i=0;i<a.length();i++){
			 b=a.charAt(i);
			 if(!(b>=65&&b<=90||b>=97&&b<=122)){
				 System.out.print((char) b);
				}
			}
	}

}
