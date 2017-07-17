package GuviLogic;

import java.util.Scanner;

public class pyramid {
public static void main(String[] args){
	int a;
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	for(int i=1;i<=a;i++){
		for(int j=i;j<=a;j++){
			System.out.print("*");
		}
		System.out.print(" ");
		for(int j=i;j<=a;j++){
			System.out.print("*");
		}
		System.out.println("");
	}
}
}
