package T211021;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class FileClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutputStream os;
		BufferedReader br_out;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		try {
			String data = null;
			Socket s1 = new Socket("127.0.0.1",5435);
			os = s1.getOutputStream();
			br_out = new BufferedReader(new FileReader("input.txt"));
			bw = new BufferedWriter(new OutputStreamWriter(os));
			pw = new PrintWriter(bw, true);
			while((data = br_out.readLine())!=null) {
				pw.println(data);
			}
			System.out.println("파일을 전송했습니다.");
			pw.close();
			s1.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
