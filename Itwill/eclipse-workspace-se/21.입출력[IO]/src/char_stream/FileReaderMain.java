package char_stream;

import java.io.FileReader;

public class FileReaderMain {

	public static void main(String[] args) throws Exception{
		FileReader fr=new FileReader("fileWriter.txt");
		/*
		public int read() throws IOException;
			- Reads a single character. 
			- This method will block until a character is available, 
			  an I/O error occurs, or the end of the stream is reached.
		Returns:
			The character read, as an integer in the range 0 to 65535 (0x00-0xffff), 
			or -1 if the end of the stream has been reached
		 */
		int readChar = fr.read();
		System.out.println("1.readChar:"+(char)readChar);
		readChar = fr.read();
		System.out.println("2.readChar:"+(char)readChar);
		int lineCount=0;
		while(true) {
			readChar=fr.read();
			if(readChar==-1)break;
			System.out.print((char)readChar);
			if(readChar=='\n') {
				lineCount++;
			}
		}
		fr.close();
		System.out.println();
		System.out.println("------FileReader.read() " + lineCount+" 라인읽음-----------");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
