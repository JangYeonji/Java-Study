package T211020;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Host2ip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hostname = "www.naver.com";
		try {
			InetAddress address = InetAddress.getByName(hostname);
			System.out.println("IP주소 : " + address.getHostAddress());
		}catch(UnknownHostException e) {
			System.out.println(hostname + "의 IP 주소를 찾을 수 없습니다.");
		}
	}

}
