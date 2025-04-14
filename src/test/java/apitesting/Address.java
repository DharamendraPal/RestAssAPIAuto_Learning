package apitesting;

import java.util.ArrayList;

public class Address {

	
	
	//For Printing Single Value of StreetNO,HouseNo,City,State
	private String Houseno;
	private String street_no;
	private String city;
	private String state;
	
	private String Country;
	
	public Address(String Country,String street_no,String Houseno,String city,String state)
	{
		this.street_no=street_no;
		this.Houseno=Houseno;
		this.city=city;
		this.state=state;
		this.Country=Country;
	}

	public String getHouseno() {
		return Houseno;
	}

	public void setHouseno(String houseno) {
		Houseno = houseno;
	}

	public String getStreet_no() {
		return street_no;
	}

	public void setStreet_no(String street_no) {
		this.street_no = street_no;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}
	
	
	
	
	
	/*
	//For Printing Multiple Value of StreetNO,HouseNo,City,State
	private ArrayList<Integer>street_no;
	private ArrayList<String>Houseno;
	private ArrayList<String>city;
	private ArrayList<String>state;
	private String Country;
	
	
	public Address(String Country,ArrayList<Object>street_no,ArrayList<Object>Houseno,ArrayList<Object>city,ArrayList<Object>state)
	{
		this.street_no=new ArrayList<Integer>();
		this.Houseno=new ArrayList<String>();
		this.city=new ArrayList<String>();
		this.state=new ArrayList<String>();
		this.Country=Country;
		
	}

	
	
	public ArrayList<Integer> getStreet_no() {
		return street_no;
	}



	public void setStreet_no(ArrayList<Integer> street_no) {
		this.street_no = street_no;
	}



	public ArrayList<String> getHouseno() {
		return Houseno;
	}



	public void setHouseno(ArrayList<String> houseno) {
		Houseno = houseno;
	}



	public ArrayList<String> getCity() {
		return city;
	}



	public void setCity(ArrayList<String> city) {
		this.city = city;
	}



	public ArrayList<String> getState() {
		return state;
	}



	public void setState(ArrayList<String> state) {
		this.state = state;
	}



	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		this.Country = country;
	}
	
	
	
	public void setstreet_nos(int ...streetnumbers)
	{
		for(int i=0;i<streetnumbers.length;i++)
		{
			this.street_no.add(streetnumbers[i]);
		}
			
	}
	
	public void setHouseno(String ...HouseNumbers)
	{
		for(int i=0;i<HouseNumbers.length;i++)
		{
			this.Houseno.add(HouseNumbers[i]);
		}
	}
	
	
	public void setCityList(String ...CityNumbers)
	{
		for(int i=0;i<CityNumbers.length;i++)
		{
			this.city.add(CityNumbers[i]);
		}
	}
	
	public void setStateList(String ...StateNumbers)
	{
		for(int i=0;i<StateNumbers.length;i++)
		{
			this.state.add(StateNumbers[i]);
		}
	}
	
	*/
	
	
	
}
