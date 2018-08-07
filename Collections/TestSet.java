package Collections;
import java.util.HashSet;
import java.util.Set;
public class TestSet 
{

	public static void main(String[] args) 
	{
		Laptop laptop[] = new Laptop[3];
		Car car[] = new Car[3];
		Television television[] = new Television[3];
		School school[] = new School[3];
		Cellphone cellphone[] = new Cellphone[3];
		
		//create instances of class Car
		car[0]=new Car("Benz",4000000,1999,"Mercedes");
		car[1]= new Car("Swift",900000,2001,"Maruti");
		car[2]=new Car("Aventador",3000000,2011,"Lamborghini");
		
		//create instances of class Cellphone
		cellphone[0]=new Cellphone("iphone","iphone7s","improved features", "ios",75000);
		cellphone[1]=new Cellphone("Samsung","note 8","improved features", "android",60000);
		cellphone[2]=new Cellphone("motorola","motog6","improved features", "android",20000);
		
		//create instances of class Laptop
		laptop[0]=new Laptop("Dell","Inspiron","Windows","i5");
		laptop[1]=new Laptop("Asus","Inspire","Windows","i7");
		laptop[2]=new Laptop("Apple","MacBook Pro","ioS","i6");
		
		//create instances of class School
		school[0]=new School("Cluny","Bangalore","Bangalore",5);
		school[1]=new School("VNS","Bangalore","Bangalore",3);
		school[2]=new School("BMSIT","Bangalore","Karnataka",7);
		
		//create instances of class Television
		television[0]=new Television("Sony","LED",false,8000);
		television[1]=new Television("Samsung","PLasma",true,16000);
		television[2]=new Television("Sony","LED",false,8000);
		
		Set<Object> set = new HashSet<>();
		
		//adding objects to the HashSet
		
		set.add(car[0]);
		set.add(car[1]);
		set.add(car[2]);
		
		set.add(cellphone[0]);
		set.add(cellphone[1]);
		set.add(cellphone[2]);
		
		set.add(laptop[0]);
		set.add(laptop[1]);
		set.add(laptop[2]);
		
		set.add(school[0]);
		set.add(school[1]);
		set.add(school[2]);
		
		set.add(television[0]);
		set.add(television[1]);
		set.add(television[2]);
		
		set.stream().forEach((set1)-> System.out.println(set1));
		
		
	}

}
