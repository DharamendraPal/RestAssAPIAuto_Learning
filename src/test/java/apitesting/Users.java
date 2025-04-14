package apitesting;

import java.util.ArrayList;

public class Users {

	
	
	private String email;
	private String name;
	private Integer age;
	private Boolean is_admin;
	private ArrayList<Integer>phone_number;
	private ArrayList<String>Cars;
	private Address address;
	
	
	//For Printing Single value  of HouseNo,StreetNo,State and Country from Address field
	public Users(String email,String name,Integer age,Boolean is_admin,String Country,String street_no,String Houseno,String city,String state)
	{
		this.email=email;
		this.name=name;
		this.age=age;
		this.is_admin=is_admin;
		this.phone_number=new ArrayList<Integer>();
		this.Cars=new ArrayList<String>();
		this.address= new Address(Country,street_no,Houseno,city,state);
	}
	
	
	/*
	//For Printing Array of HouseNo,StreetNo,State and Country from Adress field
	public Users(String email,String name,Integer age,Boolean is_admin,Address address)
	{
		this.email=email;
		this.name=name;
		this.age=age;
		this.is_admin=is_admin;
		this.phone_number=new ArrayList<Integer>();
		this.Cars=new ArrayList<String>();
		this.address= address;
	}
	*/
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Boolean getIs_admin() {
		return is_admin;
	}

	public void setIs_admin(Boolean is_admin) {
		this.is_admin = is_admin;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public ArrayList<String> getCars() {
		return Cars;
	}

	public void setCars(ArrayList<String> cars) {
		this.Cars = cars;
	}

	

	public ArrayList<Integer> getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(ArrayList<Integer> phone_number) {
		this.phone_number = phone_number;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	public void setPhoneNumbers(int ...Phonenumbers)
	{
		for(int i=0;i<Phonenumbers.length;i++)
		{
			this.phone_number.add(Phonenumbers[i]);
		}
			
	}
	
	
	public void setCars(String ...Cars)
	{
		for(int i=0;i<Cars.length;i++)
		{
			this.Cars.add(Cars[i]);
		}
			
		
	}
	

}
