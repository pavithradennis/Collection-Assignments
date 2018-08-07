package Collections;
import java.util.LinkedList;
import java.util.*;

public class CollectionsMain 
{

	public static void main(String[] args)
	{
		
		List<Object> list = new LinkedList<>();
		list.add(new Car("Benz",4000000,1999,"Mercedes"));
		list.add(new Car("Swift",900000,2001,"Maruti"));
		list.add(new Car("Aventador",3000000,2011,"Lamborghini"));
		
		list.add(new Cellphone("iphone","iphone7s","improved features", "ios",75000));
		list.add(new Cellphone("Samsung","note 8","improved features", "android",60000));
		list.add(new Cellphone("motorola","motog6","improved features", "android",20000));
		
		list.add(new Laptop("Dell","Inspiron","Windows","i5"));
		list.add(new Laptop("Asus","Inspire","Windows","i7"));
		list.add(new Laptop("Apple","MacBook Pro","ioS","i6"));
		
		list.add(new School("Cluny","Bangalore","Bangalore",5));
		list.add(new School("VNS","Bangalore","Bangalore",3));
		list.add(new School("BMSIT","Bangalore","Karnataka",7));
		
		list.add(new Television("Sony","LED",false,8000));
		list.add(new Television("Samsung","PLasma",true,16000));
		list.add(new Television("LG","LED",false,9000));
		
		list.stream().forEach((list1)->System.out.println(list1));
		
				

	}

}
