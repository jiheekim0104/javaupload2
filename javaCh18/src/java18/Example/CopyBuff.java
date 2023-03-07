package java18.Example;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyBuff {

	public static void main(String[] args) throws Exception {
		String path = "C:/webStudyB/temp/�޸�.txt";
		String copypath = "C:/webStudyB/temp/Buff�޸�.txt";
		
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
		System.out.println((end - start)+"������ �ҿ�Ǿ����ϴ�.");
		bos.close();
		bis.close();
		
		
	}

}
