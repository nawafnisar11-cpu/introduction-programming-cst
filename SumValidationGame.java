package personal;

import java.util.Scanner;

public class SumValidationGame {
	public static void main(String[]arg) {
		Scanner input = new Scanner(System.in);                 // user is able to enter three different inputs
		
		System.out.print("enter number1: ");
		int var1= input.nextInt();
		System.out.print("enter number2: ");
		int var2= input.nextInt(); 
		System.out.print("Enter their sum: ");
	    int answer = input.nextInt();

	    while (answer != (var1 + var2)) {                       //only putting the condition for looping(everything i want to loop goes inside the braces )
	    System.out.println("You are wrong! Try again.");

	    System.out.print("Enter their sum: ");
	    answer = input.nextInt();
	   }
        System.out.println("You were correct!");                // we do'nt explicitly need to make conditions for else/default statement its done by java automatically
	   }
	   }                                                        //Abstract=this logic was build by hit and trail

