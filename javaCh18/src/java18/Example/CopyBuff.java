package java18.Example;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyBuff {

	public static void main(String[] args) throws Exception {
		String path = "C:/webStudyB/temp/메모.txt";
		String copypath = "C:/webStudyB/temp/Buff메모.txt";
		
		FileInputStream fis = new FileInputStream(path);
		FileOutputStream fos = new FileOutputStream(copypath);
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		long start = System.nanoTime();
		while(true) {
			int data = bis.read();
			if(data==-1) break;
			bos.write(data);
		}
		bos.flush();
		long end = System.nanoTime();
		System.out.println((end - start)+"나노초 소요되었습니다.");
		bos.close();
		bis.close();
		
		
	}

}
