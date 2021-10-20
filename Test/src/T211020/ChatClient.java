package T211020;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChatClient {

	public static void main(String[] args) throws UnknownHostException, IOException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("서버 IP");
		String ip = sc.nextLine();
		System.out.println("보낼 메세지");
		String msg = sc.nextLine();
		Socket sk = new Socket(ip,5005);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(sk.getOutputStream()));
		bw.write(msg);
		bw.flush();
		bw.close();
		sk.close();
		System.out.println("보내기 성공");
	}

}
