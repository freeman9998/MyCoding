package byte_stream.filter_stream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamMain {

	public static void main(String[] args) throws Exception{
		/*
		 * PrintStream
		 *   자바의 모든데이타를 문자로 출력하는기능(필터)을 하는 스트림
		 */
		PrintStream ps=
				new PrintStream(
						new FileOutputStream("print.txt"));
		ps.write(65);
		ps.print(65);
		/*
		ps.write('6');
		ps.write('5');
		*/
		
		ps.print(true);
		/*
		ps.write('t');
		ps.write('r');
		ps.write('u');
		ps.write('e');
		*/
		ps.print(123456789);
		ps.print("123456789");
		ps.print(3.141592);
		ps.print("3.141592");
		/*
		ps.write('3');
		ps.write('.');
		ps.write('1');
		ps.write('4');
		ps.write('1');
		ps.write('5');
		ps.write('9');
		ps.write('2');
		*/
		ps.flush();//버퍼를 비운다.
		ps.close();
		System.out.println("------------print----------");
	}
}
