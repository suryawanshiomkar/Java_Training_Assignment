package com.ranjit;

import java.util.Scanner;

public class SquareRoot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
//		double sqrt = Math.sqrt(num);
//		System.out.println(sqrt);
//		System.out.println(Math.pow(2, 0));
    
        
        double temp=0;
        double sqr = num/2;
        
        do {
            temp = sqr;
            sqr = (temp+(num/temp))/2;
        }while((temp-sqr)!=0);
        
        System.out.println(sqr);
	}

}
