package GuviLogic;

import java.util.Scanner;

public class nopalindrome {
public static void main(String[] args){
	int a,temp=0,m=0;
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	int b=a;
	while(a!=0){
		temp=a%10;
		m=m*10+temp;
		a=a/10;
	}
	if(m==b){
		System.out.println("It is palindrome");
	}
	else{
		System.out.println("It is not palindrome");
	}
	
}
}
