package String_Assignments;

public class AscendingDescending1 {
	
	 public static void main(String[] args)
	    {
	           String nameOfTheCompany = "AttackOnTitan";
	           
	            char a[] = nameOfTheCompany.toCharArray();
	            
	           System.out.println("The String characters in ascending orders are :");



	          for (int i = 0; i < a.length; i++)
	           {
	               for (int j = i + 1; j < a.length; j++)
	               {
	                    if (a[i] > a[j]) {
	                        char temp = a[i];
	                        a[i] = a[j];
	                        a[j] = temp;
	                    }
	                }
	               System.out.print(a[i] + " ");
	           }
	       
	           System.out.println("The String characters in descending orders are :");
	           for (int i = 0; i < a.length; i++)
	           {
	                for (int j = i + 1; j < a.length; j++)
	                {
	                   if (a[i] < a[j]) {
	                        char temp = a[i];
	                        a[i] = a[j];
	                        a[j] = temp;
	                    }
	                }
	                System.out.print(a[i] + " ");
	            }
	       }

}
