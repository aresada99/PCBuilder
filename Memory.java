package CS102PROJECT;

public class Memory {
	private String name;
	private Double price;
	private Double size;
	private int speed ;
	private String type;
	
	
	public Memory(String name, Double price, Double size, int speed, String type) {

		this.name = name;
		this.price = price;
		this.size = size;
		this.speed = speed;
		this.type = type;
	}


	public Memory() {
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


	public Double getSize() {
		return size;
	}


	public void setSize(Double size) {
		this.size = size;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	} 

}
