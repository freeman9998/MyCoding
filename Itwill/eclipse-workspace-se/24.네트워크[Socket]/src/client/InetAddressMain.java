package client;

import java.net.InetAddress;

public class InetAddressMain {

	public static void main(String[] args) throws Exception{
		System.out.println("----local address---");
		InetAddress localAddress = InetAddress.getLocalHost();
		System.out.println("local host name:"+localAddress.getHostName());
		System.out.println("local host address:"+localAddress.getHostAddress());
		System.out.println("----remote address---");
		
		InetAddress remoteAddress = InetAddress.getByName("www.naver.com");
		System.out.println("remote host name:"+remoteAddress.getHostName());
		System.out.println("remote host address:"+remoteAddress.getHostAddress());
		
		InetAddress[] remoteAddresses = InetAddress.getAllByName("www.naver.com");
		for (InetAddress address : remoteAddresses) {
			System.out.println(address);
		}
		
		
	}

}
