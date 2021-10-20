package T211020;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket ss = new ServerSocket(5005);
			System.out.println("서버 가동중");
			while(true) {
				Socket client = ss.accept();
				BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
				System.out.println(client.getInetAddress()+" > "+br.readLine());
				br.close();
				client.close();
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
