package Strings;

import java.util.Scanner;

public class stringconversion {
public static void main(String[] args){
	String a;
	Scanner s=new Scanner(System.in);
	a=s.nextLine();
	char[] b=a.toCharArray();
	for(int i=0;i<b.length;i++){
	for(int j=i+1;j<b.length;j++){
		if(a.charAt(i)==a.charAt(j)){
			b[i]='\0';
			b[j]='\0';
		}
	}
	}
	for(int i=0;i<b.length;i++){
			if(b[i]!='\0'){
			System.out.print(b[i]);
		}
	}
}
}