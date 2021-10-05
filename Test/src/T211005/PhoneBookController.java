package T211005;

public class PhoneBookController {
	String name = "";   //main 안에 있으면 인식 못함
	String phone = "";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;   //PhoneBook.name과 같다.
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;   //PhoneBook.name과 같다.
	}
}
