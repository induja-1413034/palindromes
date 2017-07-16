package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayHandson2 {
	public static void main(String[] args){
		int[] array=new int[10];
		int i;
		Scanner s=new Scanner(System.in);
		for(i=0;i<array.length;i++){
		array[i]=s.nextInt();
		}
		for(i=0;i<array.length;i++){
		Arrays.sort(array);
		}
		int min=array[0];
		int max=array[9];
		System.out.println("The minimum element in the array is"+min);
		System.out.println("The maximum element in the array"+max);
		}
}
