package CS102PROJECT;

public class Motherboard {
	private String name ;
	private Double price;
	private String socketType;
	private String busVersion;
	private String memoryType ;
	
	public Motherboard(String name, Double price ,String socketType ,String busVersion ,String memoryType ) {
		this.name=name;
		this.price=price;
		this.socketType=socketType;
		this.busVersion=busVersion;
		this.memoryType=memoryType;
	}

	public Motherboard() {
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

	public String getSocketType() {
		return socketType;
	}

	public void setSocketType(String socketType) {
		this.socketType = socketType;
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
