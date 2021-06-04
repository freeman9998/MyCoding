package char_stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderWriterMain {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new FileReader("데미안.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("데미안_LINENO.txt"));
		/*
		 public String readLine() throws IOException;
		   - Reads a line of text. 
		     A line is considered to be terminated by any 
		      one of a line feed ('\n'), 
		      a carriage return ('\r'), 
		      or a carriage return followed immediately by a linefeed.
		Returns:
			 - A String containing the contents of the line, 
			   not including any line-termination characters, 
			   or null if the end of the stream has been reach
		 */
		int lineNo=0;
		while(true) {
			String readLine = br.readLine();
			if(readLine==null)break;
			lineNo++;
			bw.write(lineNo+":"+readLine);
			/*
			Writes a line separator. 
			The line separator string is defined by the system property line.separator,
			and is not necessarily a single newline ('\n') character.
			 */
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
		System.out.println("----------------------BufferedReaderWriter Copy-----------------");
	}

}
