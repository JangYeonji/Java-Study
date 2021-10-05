package T211005;

class People {
	String so_n="1";
}
class Student extends People {
	String st_n="2";
}

public class InstanceOf {
	public static void main(String[] args) {
		People p ;
		
		Student s = new Student();
		Student s2;
		
		//클래스(신분) 확인
		System.out.println(s instanceof People);
		System.out.println(s instanceof Student);		
		
		p = s;  //업캐스팅
	  	System.out.println("학생신분 주번 : " + s.so_n);
		System.out.println("학생신분 학번 : " + s.st_n);
		System.out.println("국민신분 전환 후 주번 : " + p.so_n);
		//System.out.println("국민신분 전환 후 학번 : "  + p.st_n);  // 의미도 없고 오류가 난다.

		s2 = ( Student )p; // 다운캐스팅<-업캐스팅 후만 가능		
		System.out.println("다시 학생 신분 전환 후 학번 : " + s2.st_n);
			// 	
		People p2 = new People();
		
		Student s3;  
		
		//s3 = (Student)p2;    // 업 없이 바로 다운캐스팅, 컴파일 OK?, 실행은?
		//System.out.println("업 없이 바로 다운 학생 신분 전환 후 학번 : " + s3.st_n);
		//클래스(신분) 확인
		System.out.println(p2 instanceof People);
		System.out.println(p2 instanceof Student);		
	}
}
