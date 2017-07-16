package GuviLogic;

import java.util.Arrays;
import java.util.Scanner;

public class sumofmaxmin {
	public static void main(String[] args){
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		n=s.nextInt();
		int[] array=new int[n];
		int i;
		for(i=0;i<array.length;i++){
		array[i]=s.nextInt();
		}
		for(i=0;i<array.length;i++){
		Arrays.sort(array);
		}
		int min=array[0];
		int max=array[n-1];
		int sum=max+min;
		System.out.println("The maximum element in the array"+min);
		System.out.println("The maximum element in the array"+max);
		System.out.println("sum of max and min element in the array"+sum);
		}
}
