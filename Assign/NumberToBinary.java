package com.ranjit;

import java.util.Scanner;

public class NumberToBinary {
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		int binary[]=new int[100];
		while(n!=0)
		{
			binary[i++]=n%2;
			n=n/2;
			
			
		}
		System.out.println();
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(binary[j]);
		}

	}

}
