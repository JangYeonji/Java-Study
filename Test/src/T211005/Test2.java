package T211005;

class Parent4{
	   private int one =1;
	   int open(){
	         return one+1;
	   }
	}
	class Child4 extends Parent4{
	      int two=2;
	      
	   
	   }

	public class Test2{
	   public static void main(String[]args){
	      Child4 obj = new Child4();
	      //obj.two;
	      
	      //System.out.println("내가 상속받은 값은 "+obj.one+"이다.");
	      System.out.println("내가 상속받은 값은 "+obj.open()+"이다.");
	   }
	}
