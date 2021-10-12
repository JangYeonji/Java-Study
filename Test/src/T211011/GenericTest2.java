package T211011;

import java.util.ArrayList;

public class GenericTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<MyStudent> list = new ArrayList<MyStudent>();
		list.add(new MyStudent("이순신"));
		MyStudent s = list.get(0);
		
		System.out.println("학생 이름: "+s.getName());
	}

}
class MyStudent{
	String name;
	public MyStudent(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}