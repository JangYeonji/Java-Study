package T211005;

public class PhoneBook {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneBookController pb = new PhoneBookController();
		//pb.name = "이름";
		pb.setName("엔코아");
		pb.setPhone("010-0000-1234");
		System.out.println(pb.getName());
		System.out.println(pb.getPhone());
		
		
	}
	
}
