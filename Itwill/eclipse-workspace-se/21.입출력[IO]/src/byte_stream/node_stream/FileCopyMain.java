package byte_stream.node_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyMain {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("big_file.exe");
		FileOutputStream fos=new FileOutputStream("big_file_copy.exe");
		int count=0;
		while(true) {
			int readByte = fis.read();
			if(readByte==-1)break;
			//System.out.println(Integer.toBinaryString(readByte));
			fos.write(readByte);
			count++;
			if(count%(1024*1024)==0) {
				System.out.print("★");
			}
			
		}
		fis.close();
		fos.close();
		System.out.println(">>> FileCopy:"+count+" bytes copy");
		
	}

}
