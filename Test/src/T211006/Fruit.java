package T211006;

public class Fruit {
	private String name = "";
	private String color = "";
	private String taste = "";
	private int price = 0;
	
	public Fruit() {
		
	}
	
	public Fruit(String[] arr, int price){
		this.name = arr[0];
		this.color = arr[1];
		this.taste = arr[2];
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
