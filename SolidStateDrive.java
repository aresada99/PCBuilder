package CS102PROJECT;

public class SolidStateDrive {
	private String name;
	private Double price;
	private int storageSize;
	private int bandwith;
	
	
	public SolidStateDrive(String name, Double price, int storageSize, int bandwith) {

		this.name = name;
		this.price = price;
		this.storageSize = storageSize;
		this.bandwith = bandwith;
	}


	public SolidStateDrive() {
		// TODO Auto-generated constructor stub
	}





	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public int getStorageSize() {
		return storageSize;
	}


	public void setStorageSize(int storageSize) {
		this.storageSize = storageSize;
	}


	public int getBandwith() {
		return bandwith;
	}


	public void setBandwith(int bandwith) {
		this.bandwith = bandwith;
	}
	
}
