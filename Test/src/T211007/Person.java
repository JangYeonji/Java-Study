package T211007;

public class Person {
	String name = "";
	String sex = "";
	String job = "";
	int age = 0;
	
	public Person() {
		this("이릉없음", "여자","직업",10);
	}
	
	public Person(String name, String sex, String job, int age) {
		this.name = name;
		this.sex = sex;
		this.job = job;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
