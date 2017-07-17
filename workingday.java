package GuviLogic;

import java.util.Scanner;

public class workingday {
public static void main(String[] args){
String a;
Scanner s=new Scanner(System.in);
a=s.next();

if(a.equalsIgnoreCase("monday")||a.equalsIgnoreCase("tuesday")||a.equalsIgnoreCase("wednesday")||a.equalsIgnoreCase("thursday")||a.equalsIgnoreCase("friday")){
	System.out.println("true");
}
else{
	System.out.println("false");
}
}
}
