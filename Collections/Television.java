package Collections;

public class Television 
{
  @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + (enabled ? 1231 : 1237);
		result = prime * result + price;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Television other = (Television) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (enabled != other.enabled)
			return false;
		if (price != other.price)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

private String company;
  private String type;
  private boolean enabled;
  private int price;
  
  
public Television(String company, String type, boolean enabled, int price) {
	super();
	this.company = company;
	this.type = type;
	this.enabled = enabled;
	this.price = price;
}


public String getCompany() {
	return company;
}


public void setCompany(String company) {
	this.company = company;
}


public String getType() {
	return type;
}


public void setType(String type) {
	this.type = type;
}


public boolean isEnabled() {
	return enabled;
}


public void setEnabled(boolean enabled) {
	this.enabled = enabled;
}


public int getPrice() {
	return price;
}


public void setPrice(int price) {
	this.price = price;
}

@Override
public String toString()
{
	return "Television [company="+getCompany()+",Type="+getType()+"3DEnabled="+isEnabled()+",price="+getPrice()+"]";
}
 
}

