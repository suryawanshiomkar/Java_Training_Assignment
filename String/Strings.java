package String_Assignments;

import java.util.Scanner;

public class Strings {
	
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String1:");
		String s1=sc.next();
		System.out.println("Enter String2:");
		String s2=sc.next();
		
		System.out.println("Enter index:");
		int n=sc.nextInt();
		
		char []ch1=s1.toCharArray();
		char []ch2=s2.toCharArray();
		char [] chArr1={' '};
		char chArr2[]={' '};
	    
		for(int i=0;i<n;i++)
		{
			chArr1[i]=ch1[i];//a
		}
		String ss1=new String(chArr1);
		String ss2=ss1+s2;
		//System.out.println(ss2);
		char charArray[]=ss2.toCharArray();
		System.out.print(ss2);
		for(int j=n;j<ch1.length
				;j++)
		{
			System.out.print(ch1[j]);
		}
		
		String newString=ss1+s2+ss2;
	
		
		
	}

}
