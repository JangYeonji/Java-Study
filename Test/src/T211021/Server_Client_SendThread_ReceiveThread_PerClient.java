package T211021;

import java.net.ServerSocket;
import java.net.Socket;

public class Server_Client_SendThread_ReceiveThread_PerClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket ss = new ServerSocket(9002);
			while(true) {
				Socket client = ss.accept();
				PerClient pc = new PerClient(client);
				pc.start();
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
