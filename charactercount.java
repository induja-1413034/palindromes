package GuviLogic;

import java.util.Scanner;

public class charactercount {
	public static void main(String[] args){
		String a;
		int count=0,b=0;
		Scanner s=new Scanner(System.in);
		a=s.next();
		for(int i=0;i<a.length();i++){
			 b=a.charAt(i);
					count++;
			}
		System.out.println(count);
	}
	}
