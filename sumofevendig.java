package Strings;

import java.util.Scanner;

public class sumofevendig {
public static void main(String[] args){
	int a,temp=0,sum=0;
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	while(a>0){
		temp=a%10;
		if(temp%2==0)
			sum=sum+temp;
		a=a/10;
	}
	System.out.println(sum);
}
}
