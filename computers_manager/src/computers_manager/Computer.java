package computers_manager;

public class Computer {
	private Date date;
	private Brand brand;
	
	public Computer(Date date, Brand brand) {
		this.date = date;
		this.brand = brand;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Brand getBrand() {
		return brand;
	}
	
	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Computer [date=" + date + ", brand=" + brand + "]";
	}
	
	
	
	
}
