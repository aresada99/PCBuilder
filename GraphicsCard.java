package CS102PROJECT;

public class GraphicsCard {
	private String name;
	private double price; 
	private int coreCount;
	private int clockSpeed;
	private int memorySize ;
	private int memorySpeed;
	private String memoryType;
	private String busVersion;
	
	
	public GraphicsCard(String name, double price, int coreCount, int clockSpeed, int memorySize, int memorySpeed,String memoryType,String busVersion) {

		this.name = name;
		this.price = price;
		this.coreCount = coreCount;
		this.clockSpeed = clockSpeed;
		this.memorySize = memorySize;
		this.memorySpeed = memorySpeed;
		this.memoryType=memoryType;
		this.busVersion = busVersion;
	}


	public GraphicsCard() {
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
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


	public int getMemorySize() {
		return memorySize;
	}


	public void setMemorySize(int memorySize) {
		this.memorySize = memorySize;
	}


	public int getMemorySpeed() {
		return memorySpeed;
	}


	public void setMemorySpeed(int memorySpeed) {
		this.memorySpeed = memorySpeed;
	}


	public String getBusVersion() {
		return busVersion;
	}


	public void setBusVersion(String busVersion) {
		this.busVersion = busVersion;
	}


	public String getMemoryType() {
		return memoryType;
	}


	public void setMemoryType(String memoryType) {
		this.memoryType = memoryType;
	}
	
	
	
	
}
