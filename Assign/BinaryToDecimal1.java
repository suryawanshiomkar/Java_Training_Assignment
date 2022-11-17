package com.ranjit;

public class BinaryToDecimal1 {
public static void main(String[] args) {
	 int decimalNumber = 0, i = 0;
	    long remainder;
	    int num=1010;
	    
	    while (num != 0) {
	      remainder = num % 10;
	      num /= 10;
	      decimalNumber += remainder * Math.pow(2, i);
	      ++i;
	    }
	    System.out.println(decimalNumber);
	    
}
}
