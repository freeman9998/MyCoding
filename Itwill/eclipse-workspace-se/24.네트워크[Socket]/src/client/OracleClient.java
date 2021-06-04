package client;

import java.net.Socket;

public class OracleClient {

	public static void main(String[] args) throws Exception{
		Socket socket=new Socket("182.237.126.19",1521);
		System.out.println("oracle db server socket:"+socket);
		Socket socket2=new Socket("www.google.com",80);
		System.out.println("google web server socket:"+socket2);
		Socket socket3=new Socket("www.naver.com",80);
		System.out.println("naver web server socket:"+socket3);
	}

}
