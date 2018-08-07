package EmployeeSavings;
import java.util.HashMap;
//class to test the hash map technique
public class EmployeeTest
{
 public static void main(String[] args)
 {
	 HashMap<Employee,MMASavingsAccount> hashMap = new HashMap<Employee, MMASavingsAccount>();
	 //assigning values to the instances of the MMASavingsAccount class
	 MMASavingsAccount savingsaccount1 = new MMASavingsAccount(101, "Pavithra", 10000, true);
	 MMASavingsAccount savingsaccount2 = new MMASavingsAccount(102, "Rima", 20000, true);
	 
	 //assigning values to the instances of the Employee class
	 Employee employee1 = new Employee(4554, "Pavithra", "A4", 30000.0, "9620191701");
	 Employee employee2 = new Employee(4555, "Rima", "A1", 50000.0, "9916300705");
	 
	 //create the relation of the objects between the class Employee and Savings
	 hashMap.put(employee1, savingsaccount1);
	 hashMap.put(employee2, savingsaccount2);
	 
	 //printing the relations
	System.out.println("Employee 1 bank details:" +hashMap.get(employee1));
	System.out.println("Employee 2 bank details:" +hashMap.get(employee2));
	
 }
}
