package T211005;

class Dog {
	int age;
	String name;
	String breed;
	
	void bark() {
		System.out.println(this.name + "가  짖습니다");
	}

	void bark(String sound) { //오버로딩
		System.out.println(name + "가  " + sound + " 짖습니다");
	}
}

public class DogExam {	
	public static void main(String[] args) {
		Dog myPuppy = new Dog(); // 객체 생성
		Dog yourDog; // 꼬리표만 만듦

		myPuppy.age = 5;
		myPuppy.name = "조이";
		
		yourDog = myPuppy; //레퍼런스 복사
		yourDog.name = "복실이";
		
		myPuppy.bark();

		myPuppy.bark("왈왈");
		System.out.println("강아지 이름은 " + myPuppy.name + "입니다");
	}
}
