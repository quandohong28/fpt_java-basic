package computers_manager;

public class Brand {
	private String brandName;
	
	private Country country;

	public Brand(String brandName, Country country) {
		this.brandName = brandName;
		this.country = country;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Brand [brandName=" + brandName + ", country=" + country + "]";
	}
	
}
