package HomeWork;

import java.util.Scanner;

public class DecimalToBinary {

	static void decToBinary(int n)
    {
       
        int[] BinaryNum = new int[32];
 
        
        
        
        int i = 0;
        while (n > 0) {
            
            BinaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
 
        
        for (int j = i - 1; j >= 0; j--)
            System.out.print(BinaryNum[j]);
    }
 
   
    public static void main(String[] args)
    {
    	Scanner sc =new Scanner(System.in);
    	System.out.println("Enter the Decimal Number");
        int c= sc.nextInt();
        decToBinary(c);
    }

}
