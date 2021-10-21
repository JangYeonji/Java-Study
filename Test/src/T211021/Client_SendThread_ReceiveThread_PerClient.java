package T211021;

import java.net.Socket;
import java.util.Scanner;

public class Client_SendThread_ReceiveThread_PerClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("연결한 IP ? ");
		String ip = sc.nextLine();
		System.out.println("사용한 별명은 ? ");
		String name = sc.nextLine();
		try {
			Socket socket = new Socket(ip,9002);
			ReceiveThread_PerClient rt = new ReceiveThread_PerClient(socket);
			SendThread_ReceiveThread_PerClient st = new SendThread_ReceiveThread_PerClient(socket, name);
			rt.start();
			st.start();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
