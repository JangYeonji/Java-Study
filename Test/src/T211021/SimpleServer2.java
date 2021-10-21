package T211021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("서비스하기 위해 준비중입니다.");
			ServerSocket s = new ServerSocket(5434);   
			System.out.println("서버가 동작중입니다.");
			
			Socket s1 = s.accept();
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			ObjectInputStream ois = new ObjectInputStream(s1.getInputStream());
			ObjectOutputStream oos = new ObjectOutputStream(s1.getOutputStream());
					
			oos.writeObject("Simple server에 접속하신 걸 환영합니다.");
			while(true) {
				System.out.println((String)ois.readObject());
				System.out.print("<Server> : ");
				String temp = in.readLine();
				if(temp.equals("exit")) {
					System.out.println("bye");
					break;
				}
				oos.writeObject("<Server> : "+temp);
			}
			oos.close();
			s1.close();
		}catch(ClassNotFoundException eof) {
			//System.out.println("Client로부터 연결이 끊어졌습니다. 종료합니다.");
			System.out.println("Server로부터 연결이 끊어졌습니다. 종료합니다.");
			System.exit(0);
		}catch(IOException io) {
			io.printStackTrace();
		}
	}

}
