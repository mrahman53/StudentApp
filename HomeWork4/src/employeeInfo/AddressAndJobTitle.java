package employeeInfo;

public abstract class AddressAndJobTitle implements JobTitle{ // Abstract class
	
	
	
	
	
	
	public abstract void jobTitle();
	public abstract void department();
	public abstract void commission();
	
	public void countryNname(){
		System.out.println("Country name is :Bangladesh");
	}
	
	
	public void cityName(){
	System.out.println("City is : Dhaka");
	
	}
	
	
	public void address(){
		System.out.println("Address is : Mohammadpur Main Road");
	}

}
