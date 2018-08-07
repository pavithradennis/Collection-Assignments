package Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
public class TestLinkedHashSet 
{
 public static void main(String[] args)
 {
	 School school[] = new School[5];
	 
	 //create instances of the class School
	 
	 school[0] = new School("Cluny","Malleshwaram","Bangalore",3);
	 school[1] = new School("Cluny Jalahalli","Jalahalli","Bangalore",9);
	 school[2] = new School("VNS","Sampige road","Bangalore East",7);
	 school[3] = new School("Cottons","Race course","Bangalore",10);
	 school[4] = new School("Josephs","M G Road","Bangalore",5);
	 
	 Set<Object> set = new LinkedHashSet<>();
	 //adding objects to the linked hash set
	 
	 set.add(school[1]);
	 set.add(school[0]);
	 set.add(school[3]);
	 set.add(school[4]);
	 set.add(school[2]);
	 
	 set.stream().forEach((set1)->System.out.println(set1));
	 
	 
 }
}
