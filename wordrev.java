package GuviLogic;

import java.util.Scanner;

public class wordrev {
	public static void main(String[] args){
		String a,rev="";
		Scanner s=new Scanner(System.in);
		a=s.nextLine();
		String [] s3 =a.split(" ");
		System.out.println("The sentence reverse is");//words reverse
	    for(int j=s3.length-1;j>=0;j--){
	    	System.out.print(s3[j]);
	    	System.out.print(" ");
	    }
	    
}
}