package byte_stream.filter_stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamMain {

	public static void main(String[] args) throws Exception{
		/*
		 * 자바의 기본데이타를 출력 스트림에 쉽게쓸수있도록하는 필터클래스
		 */
		FileOutputStream fos=new FileOutputStream("dataOut.dat");
		DataOutputStream dos=new DataOutputStream(fos);
		int intData=2147483647;
		/*
		fos.write(intData>>24);
		fos.write(intData>>16);
		fos.write(intData>>8);
		fos.write(intData);
		*/
		dos.writeInt(intData);
		dos.writeByte(127);
		dos.writeDouble(3.141592);
		dos.writeBoolean(true);
		dos.writeChar('가');
		dos.writeUTF("오늘은 자바입출력을 공부합니다.");
		dos.writeUTF("어렵네요!!!");
		dos.close();
		System.out.println("DataOutputStream.writeXXX()");
		
		System.out.println("--------------------------------------------------");
		System.out.println("DataInputStream.readXXX()");
		DataInputStream dis=
				new DataInputStream(
						new FileInputStream("dataOut.dat"));
		
		int readInt = dis.readInt();
		System.out.println("int:"+readInt);
		System.out.println("byte:"+dis.readByte());
		System.out.println("double:"+dis.readDouble());
		System.out.println("boolean:"+dis.readBoolean());
		System.out.println("char:"+dis.readChar());
		System.out.println("readUTF:"+dis.readUTF());
		System.out.println("readUTF:"+dis.readUTF());
		dis.close();
		
	}

}













