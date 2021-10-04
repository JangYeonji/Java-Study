package T211004;

public class Rectangle {
	int width;
	int height;
	
	public int getArea() {
		return width * height;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec = new Rectangle();
		rec.width = 10;
		rec.height = 5;
		double area = rec.getArea();
		System.out.println("사각형의 면적은 "+area);
	}

}
