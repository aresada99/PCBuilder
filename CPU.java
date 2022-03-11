package CS102PROJECT;

public class CPU {
	private String name;
	private Double price;
	private int coreCount;
	private int clockSpeed; 
	private String socketType;
	
	
	
	public CPU(String name, Double price, int coreCount, int clockSpeed, String socketType) {
		this.name = name;
		this.price = price;
		this.coreCount = coreCount;
		this.clockSpeed = clockSpeed;
		this.socketType = socketType;
	}



	public CPU() {
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



	public int getCoreCount() {
		return coreCount;
	}



	public void setCoreCount(int coreCount) {
		this.coreCount = coreCount;
	}



	public int getClockSpeed() {
		return clockSpeed;
	}



	public void setClockSpeed(int clockSpeed) {
		this.clockSpeed = clockSpeed;
	}



	public String getSocketType() {
		return socketType;
	}



	public void setSocketType(String socketType) {
		this.socketType = socketType;
	} 
	
	

	
}	
