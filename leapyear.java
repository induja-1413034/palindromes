package GuviLogic;

import java.util.Scanner;

public class leapyear {
	public static void main(String[] args){
		int a,d=0;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		for(int i=a;i<=a+100;i++){
			if(i%4==0){
				d++;
					System.out.println(i);
			}
			if(d>19){
				break;
			}
			}
	}

}
