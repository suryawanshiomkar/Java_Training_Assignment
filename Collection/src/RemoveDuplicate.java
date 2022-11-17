import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		
		al.add(34);
		al.add(99);
		al.add(34);
		al.add(98);
		al.add(9342);
		al.add(32);
		al.add(98);
		Set<Integer>s=new HashSet<>();
		s.addAll(al);
		al.clear();
		al.addAll(s);
		Collections.sort(al);
		System.out.println(s);
		
	}

}
