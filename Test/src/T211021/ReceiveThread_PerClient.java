package T211021;

import java.io.*;
import java.net.Socket;

public class ReceiveThread_PerClient extends Thread{
	Socket socket;
	public ReceiveThread_PerClient(Socket socket) {
		this.socket = socket;
	}
	public void run() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(true) {
				String str = br.readLine();
				if(str==null)
					break;
				System.out.println(str);
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
