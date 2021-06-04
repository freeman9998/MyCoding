package file;

import java.io.File;

public class FileMain {

	public static void main(String[] args) throws Exception{
		/*
		 현재경로[기준경로]
		   eclipse --> C:\JAVA_BACKEND\eclipse-workspace-se\21.입출력[IO]
		 상대경로
		    기준경로를 기준으로 경로를기술 
		 절대경로
		    C:,D: 드라이브 기준으로 경로기술
		 */
		File file1=new File("1.Inputstream.gif");
		File file2=new File("sample/A.JDK_DOWNLOAD_URL.txt");
		File file3=new File("sample","C.JAVA_COMPILE_RUN.txt");
		File file4=new File("C:\\JAVA_BACKEND\\eclipse-workspace-se\\21.입출력[IO]\\sample\\E.JAVA_HOME환경변수.txt");
		System.out.println("----------------1.file path----------------");
		System.out.println(file1.getPath());
		System.out.println(file2.getPath());
		System.out.println(file3.getPath());
		System.out.println(file4.getPath());
		System.out.println("----------------2.file absolute path----------------");
		System.out.println(file1.getAbsolutePath());
		System.out.println(file2.getAbsolutePath());
		System.out.println(file3.getAbsolutePath());
		System.out.println(file4.getAbsolutePath());
		System.out.println("----------------3.file name----------------");
		System.out.println(file1.getName());
		System.out.println(file2.getName());
		System.out.println(file3.getName());
		System.out.println(file4.getName());
		System.out.println("----------------4.file parent----------------");
		System.out.println(file1.getParent());
		System.out.println(file2.getParent());
		System.out.println(file3.getParent());
		System.out.println(file4.getParent());
		
		File dir1=new File("sample");
		File dir2=new File("sample/subSample1");
		File dir3=new File("sample","subSample1");
		System.out.println("-------------5. isDirectory----------------");
		System.out.println(dir1.isDirectory());
		System.out.println(dir2.isFile());
		System.out.println(dir3.isDirectory());
		System.out.println("-------------6. 디렉토리안에 파일(디렉토리)의 목록(String[] )----------------");
		String[] fileNameList = dir1.list();
		for (String fileName : fileNameList) {
			System.out.println("\t"+fileName);
		}
		System.out.println("-------------7. 디렉토리안에 파일(디렉토리)의 목록(File[] )----------------");
		File[] fileList=dir1.listFiles();
		for (File file : fileList) {
			if(file.isFile()) {
				System.out.println("\t F:"+file.getName());
			}else if(file.isDirectory()) {
				System.out.println("\t D:"+file.getName());
				File[] subFileList = file.listFiles();
				for (File subFile : subFileList) {
					System.out.println("\t\t"+subFile.getName());
				}
				
			}
		}
		System.out.println("-------------8. root dierctory 목록----------");
		File[] rootDirs=File.listRoots();
		for (File file : rootDirs) {
			System.out.println(file.getPath());
		}
		System.out.println("------------9.directory생성----------------");
		File newDir1=new File("newDir1");
		File newDir2=new File("newDir2");
		File newDir3=new File("sample","subSample3");
		System.out.println("newDir1의 존재여부:"+newDir1.exists());
		System.out.println("newDir1의 생성:"+newDir1.mkdir());
		System.out.println("newDir2의 생성:"+newDir2.mkdir());
		System.out.println("newDir3의 생성:"+newDir3.mkdir());
		System.out.println("------------10.directory이름변경----------------");
		newDir2.renameTo(new File("renameDir2"));
		System.out.println("------------11.directory삭제---------------");
		System.out.println(newDir3.delete());
		
		System.out.println("------------13.File생성---------------");
		File newFile=new File("newDir1","newFile.txt");
		newFile.createNewFile();
		
	}

}











