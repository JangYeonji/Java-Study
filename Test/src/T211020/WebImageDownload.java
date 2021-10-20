package T211020;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class WebImageDownload {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String website = "http://www.oracle.com/us/hp07-bg121314-openworld-2x-2280475.jpg";
		System.out.println("" + website + "사이트에서 이미지를 다운로드합니다.");
		URL url = new URL(website);
		byte[] buffer = new byte[2048];
		try(InputStream in = url.openStream();FileOutputStream out = new FileOutputStream("test.jpg");) {
			int length = 0;
			while((length=in.read(buffer))!= -1) {
				System.out.println(""+length +"바이트 크기만큼 읽었음!");
				out.write(buffer,0,length);
			}
			in.close();
			out.close();
		}catch(Exception e) {
			System.out.println("예외: "+e.getMessage());
		}
	}

}
