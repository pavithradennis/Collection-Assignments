package SavingsAccount;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
//main class
public class SavingAccountMain 
{

	public static void main(String[] args)
	{
		ArrayList arr  = new ArrayList();
		//creating objects of the savings account class
		SavingAccount sa1 = new SavingAccount(1000.0,102,"Pavithra",true);
		SavingAccount sa2 = new SavingAccount(10000.0,101,"Rima",true);
		SavingAccount sa3 = new SavingAccount(20000.0,103,"Catherine",true);
		SavingAccount sa4 = new SavingAccount(20000.0,104,"Dennis",true);
		System.out.println("\n");
		
		//passing objects as values to the arrayList
		arr.add(sa1);
		arr.add(sa2);
		arr.add(sa3);
		arr.add(sa4);
		Collections.sort(arr, new SortByID());
		//print values
		arr.stream().forEach((arr1) -> System.out.println(arr1));
		System.out.println("\n");
	
		//passing objects as values to the linked list
		Set<Object> set = new LinkedHashSet<>();
		set.add(sa1);
		set.add(sa2);
		set.add(sa3);
		set.add(sa4);
		//printing values
			
		set.stream().forEach((list1) -> System.out.println(list1));

	}

}