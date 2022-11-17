package com.ranjit;

import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1st Number");
	int n1=sc.nextInt();
	System.out.println("Enter 2st Number");
	int n2=sc.nextInt();
	while(true) {
	System.out.println("Enter Your choice");
	System.out.println("1:-Addition\n"+"2:-Substraction\n"+"3:-Multiplication\n"+"4:-Division");
	int choice=sc.nextInt();
	
	switch(choice)
	{
	case 1:
		System.out.println("Addition of two Number="+(n1+n2));
		break;
	case 2:
		System.out.println("Substraction of two Number="+(n1-n2));
		break;
	case 3:
		System.out.println("Multiplication of two Number="+(n1*n2));
		break;
	case 4:
		System.out.println("Division of two Number="+(n1/n2));
		break;
	default:
		System.out.println("Enter Right choice");
		
		
		
	}
	}
	
}
}
