package GuviLogic;

import java.util.Scanner;

public class noofwords {
	public static void main(String[] args){
		String a;
		Scanner s=new Scanner(System.in);
		a=s.next();
		a+=s.nextLine();
		String [] s3 =a.split(" ");
	    System.out.println("The number of words in the sentence is "+s3.length);
	}
}
