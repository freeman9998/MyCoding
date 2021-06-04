package client;

import java.net.InetAddress;
import java.net.Socket;

public class ClientSocketMain {

	public static void main(String[] args) throws Exception{
		/*
		본인서버IP
		 -->192.168.15.23
		 */
		//Socket socket=new Socket("223.130.195.95",80);
		Socket socket=new Socket("192.168.15.23",3333);
	    System.out.println(socket);
	    InetAddress remoteAddress=socket.getInetAddress();
	    InetAddress localAddress=socket.getLocalAddress();
	    System.out.println("remote ip:"+remoteAddress.getHostAddress());
	    System.out.println("remote port:"+socket.getPort());
	    System.out.println("local ip:"+localAddress.getHostAddress());
	    System.out.println("local port:"+socket.getLocalPort());
	}

}
