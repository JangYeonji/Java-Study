package T210930;

public class gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num=2;
			for(int j=1;num<=9;j++) {
				if(j>9) {
					j = 0;
					num++;
					continue;
				}
				System.out.println(num+"x"+j+"="+num*j);
			}		
	}

}
