package model;

public class Car {
	private int year;
	private String make;
	private String model;
	private int miles;
	private String engineType;
	private String transmissionType;
	private int price;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	private Car(int year, int miles) {
		// TODO Auto-generated method stub
		this.year = year;
		this.miles = miles;
		setPrice(year, miles);
		
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


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getMiles() {
		return miles;
	}


	public void setMiles(int miles) {
		this.miles = miles;
	}


	public String getEngineType() {
		return engineType;
	}


	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}


	public String getTransmissionType() {
		return transmissionType;
	}


	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}


	public int getPrice() {
		return price;
	}

	
	public void setPrice(int year, int miles) {
		this.year = year;
		this.miles = miles;
		priceSetter(year, miles);
		
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void priceSetter(int year, int miles) {
		this.year = year;
		this.miles = miles;
		
		int rule = 123;
		int rule2 = 3000;
		int rule3 = 1500;
		int goodMiles = 100000;
		int price = year * rule;
		
		if(miles < goodMiles) {
			setPrice(price + rule2);
		}else if(miles > goodMiles) {
			setPrice(price + rule3);
		}
	}



	@Override
	public String toString() {
		return "Car [year=" + year + ", make=" + make + ", model=" + model + ", miles=" + miles + ", engineType="
				+ engineType + ", transmissionType=" + transmissionType + ", price=" + price + "]";
	}
	
	
	
	

}
