package Collections;
//class Car to declare its instances 
public class Car implements Comparable<Car> //to compare makes of the cars 
{
 private String model;
 private double price;
 private int year;
 private String make;
 
 //parameterized constructor
public Car(String model, double price, int year, String make) {
	super();
	this.model = model;
	this.price = price;
	this.year = year;
	this.make = make;
}

//getters and setters
public String getModel() {
	return model;
}


public void setModel(String model) {
	this.model = model;
}


public double getPrice() {
	return price;
}


public void setPrice(double price) {
	this.price = price;
}


public int getYear() {
	return year;
}


public void setYear(int year) {
	this.year = year;
}


public String getMake() {
	return make;
}


public void setMake(String make) {
	this.make = make;
}
 
//to string function
@Override
public String toString()
{
	return "Car [model="+getModel()+",price="+getPrice()+",year="+getYear()+",make="+getMake()+"]";
}

//hashcode
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((make == null) ? 0 : make.hashCode());
	result = prime * result + ((model == null) ? 0 : model.hashCode());
	long temp;
	temp = Double.doubleToLongBits(price);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + year;
	return result;
}

//equals function
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Car other = (Car) obj;
	if (make == null) {
		if (other.make != null)
			return false;
	} else if (!make.equals(other.make))
		return false;
	if (model == null) {
		if (other.model != null)
			return false;
	} else if (!model.equals(other.model))
		return false;
	if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
		return false;
	if (year != other.year)
		return false;
	return true;
}

//compare function to compare car makes
@Override
public int compareTo(Car car)
{
	return this.getMake().compareTo(car.getMake());
}

}
