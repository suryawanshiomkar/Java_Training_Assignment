import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AssendingCollection {
public static void main(String[] args) {
	List<Integer> al=new ArrayList<>();
	al.add(34);
	al.add(6);
	al.add(98);
	al.add(23);
	System.out.println(al);
	Collections.sort(al);
	System.out.println("After Asscending Collections");
	System.out.println(al);
}
}
