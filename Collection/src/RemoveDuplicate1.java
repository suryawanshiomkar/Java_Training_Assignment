import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicate1 {
	
	public List<String> removeDuplicate(List<String> l)
	{   
		List<String> al=new ArrayList<>();
		
			for (String st : l) {
				if(!al.contains(st))
				{
					al.add(st);
				}
			}
			return al;
			
		
		
		
		
	}
	public static void main(String[] args) {
		List<String> al=new ArrayList<>();
		al.add("Ranjit");
		al.add("Swapnil");
		al.add("Randhir");
		al.add("Randhir");
		al.add("Ranjit");
		al.add("Raju");
//		System.out.println(al);
//		Collections.sort(al);
		List<String> rd = new RemoveDuplicate1().removeDuplicate(al);
		Collections.sort(rd);
		Collections.reverse(rd);
		System.out.println(rd);
		
	}

}
