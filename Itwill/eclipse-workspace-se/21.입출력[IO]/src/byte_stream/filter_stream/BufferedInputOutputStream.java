package byte_stream.filter_stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputOutputStream {

	public static void main(String[] args) throws Exception{
		BufferedInputStream bis=
				new BufferedInputStream(
						new FileInputStream("big_file.exe"));
		
		BufferedOutputStream bos=
				new BufferedOutputStream(
						new FileOutputStream("big_file_copy2.exe"));
		int count=0;
		long startTime=System.currentTimeMillis();
		while(true) {
			int readByte = bis.read();
			if(readByte==-1)break;
			bos.write(readByte);
			count++;
			if(count%(1024*1024)==0) {
				System.out.print("★");
			}
		}
		long endTime=System.currentTimeMillis();
		long duration=endTime-startTime;
		bis.close();
		bos.flush();
		bos.close();
		System.out.println();
		System.out.println(">>>FilterStream FileCopy:"+count+" bytes copies[took "+duration+" ms]");
	}

}












