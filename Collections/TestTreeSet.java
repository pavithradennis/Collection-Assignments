package Collections;
import java.util.Set;
import java.util.TreeSet;
public class TestTreeSet
{

	public static void main(String[] args)
	{
		
		Set <Object> tree = new TreeSet<>();
		//adding objects to the TreeSet
		
		tree.add("One");
		tree.add("Five");
		tree.add("Light");
		tree.add("three");
		tree.add("Dark");
		
		tree.stream().forEach((tree1)->System.out.println(tree1));
	}

}
