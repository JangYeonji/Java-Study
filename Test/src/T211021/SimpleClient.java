package T211021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleClient {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		if (args.length==0) {
			System.out.println("사용법 : java SimpleClient [server_name]");
			System.out.println("server_name을 입력하지 않으셔서 localhost로 접속을 시도합니다.");
			args = new String[] {"192.168.2.65"};  //내 IP 주소
		}
		try {
			Socket s1 = new Socket(args[0],7777);
			
			//System.out.println("서비스하기 위해 준비중입니다.");
			//ServerSocket s = new ServerSocket(5434);   
			//System.out.println("서버가 동작중입니다.");
			
			//Socket s1 = s.accept();
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			ObjectInputStream ois = new ObjectInputStream(s1.getInputStream());
			ObjectOutputStream oos = new ObjectOutputStream(s1.getOutputStream());
			
			System.out.println("접속완료");
			System.out.println((String)ois.readObject());
			System.out.println("서버에게 먼저 메시지를 보내십시오!!");
			
			while(true) {
				System.out.print("<Client> : ");
				String temp = in.readLine();
				if(temp.equals("exit")) {
					System.out.println("bye");
					break;
				}
				oos.writeObject("<Coient> : "+temp);
				System.out.println((String)ois.readObject());
			}
			ois.close();
			s1.close();
		}catch(ClassNotFoundException eof) {
			System.out.println("Server로부터 연결이 끊어졌습니다. 종료합니다.");
			System.exit(0);
		}catch(IOException io) {
			io.printStackTrace();
		}
	}

}
