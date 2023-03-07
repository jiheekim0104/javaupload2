package java18.p800;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferExample {

	public static void main(String[] args) throws Exception {
		//String path = BufferExample.class.getResource("7.png").getPath();
		String path = "C:/webStudyB/study/java_study2/javaCh18/src/java18/p800/7.png";
		String newPath = "C:/webStudyB/temp/copy7.png";
		
		FileInputStream fis = new FileInputStream(path);
		FileOutputStream fos = new FileOutputStream(newPath);
		
		
		//String path2 = BufferExample.class.getResource("2.png").getPath();
//		String path2 = "C:/webStudyB/study/java_study2/javaCh18/src/java18/p800/2.png";
//		String newPath2 = "C:/webStudyB/temp/copy2.png";
//		
//		FileInputStream fis2 = new FileInputStream(path2);
//		FileOutputStream fos2 = new FileOutputStream(newPath2);
//		BufferedInputStream bis = new BufferedInputStream(fis2);
//		BufferedOutputStream bos = new BufferedOutputStream(fos2);
//		
//		long nonBufferTime = copy(fis,fos);
//		System.out.println("미사용:"+nonBufferTime);
//		
//		long BufferTime = copy(bis,bos);
//		System.out.println("사용:"+BufferTime);
//		
//		bos.close();
//		bis.close();
		fos.close();
		fis.close();
		
		
		
	}

	private static long copy(InputStream is, OutputStream os) throws Exception {
		long start = System.nanoTime();
		while(true) {
			int data = is.read();
			if(data==-1) {
				break;
			}
			os.write(data);
		}
		os.flush();
		long end = System.nanoTime();
		
		return end - start;
	}

}