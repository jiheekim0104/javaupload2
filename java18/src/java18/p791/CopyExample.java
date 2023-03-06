package java18.p791;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {
	public static void main(String[] args) throws Exception  {
		InputStream is = new FileInputStream("C:/webStudyB/temp/photo.png");
		OutputStream os = new FileOutputStream("C:/webStudyB/temp/photo2.png");
		
		byte[] data = new byte[1024];
		while(true) {
			int num = is.read(data);
			if(num == -1) {
				break;
			}
			os.write(data,0,num);

		}
		//is.transferTo(os);
		os.flush();
		os.close();
		is.close();
		System.out.println("사진 복사 끝!");
		
		String textPath = "C:/webStudyB/temp/data4.txt";
		String newtextPath = "C:/webStudyB/temp/copydata4.txt";
		
		is = new FileInputStream(textPath);
		os = new FileOutputStream(newtextPath);
		
		while(true) {
			int num = is.read(data);
			if(num == -1) {
				break;
			}
			os.write(data,0,num);

		}
		os.flush();
		os.close();
		is.close();
		System.out.println("txt 복사 끝!");
		
		String Path = "C:/Program Files/Java/jdk1.8.0_351/javafx-src.zip";
		String newPath = "C:/webStudyB/temp/javafx-src.zip";
		
		is = new FileInputStream(Path);
		os = new FileOutputStream(newPath);
		
		is.transferTo(os);
		os.flush();
		os.close();
		is.close();
		System.out.println("zip 복사+이동 끝!");
		
	}
	
	
}
