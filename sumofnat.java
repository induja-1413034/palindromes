package GuviLogic;

import java.util.Scanner;

public class sumofnat {

	public static void main(String[] args) {
		int a,sum=0;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		for(int i=1;i<=a;i++){
			sum=sum+i;
		}
		System.out.println(sum);
	}

}
