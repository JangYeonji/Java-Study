package T211007;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Person p = new Person();
		Person[] pArr = new Person[5];
		int pArrLen = pArr.length;
		
		for(int i=0; i<pArrLen;i++) {
			pArr[i] = new Person();
			System.out.print("이름 : " );
			pArr[i].setName(sc.nextLine());
			System.out.print("나이 : " );
			pArr[i].setAge(sc.nextInt());   
			sc.nextLine();
			System.out.print("성별 : " );
			pArr[i].setSex(sc.nextLine());   //nextInt에서 잔류된 Enter값이 들어감
		}
		for(int i=0;i<pArrLen;i++) {
			pArr[i] = new Person();
			System.out.println(pArr[i].getName());
			System.out.println(pArr[i].getAge());
			System.out.println(pArr[i].getSex());
		}
	}

}
