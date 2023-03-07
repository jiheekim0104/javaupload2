package java18.q10;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Copy {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� ���� ���:");
		String path = scanner.nextLine();
		System.out.print("���� ���� ���:");
		String copyPath = scanner.nextLine();
		
		File copyFile = new File(copyPath);
		File dir = copyFile.getParentFile();
		if(!dir.exists()) dir.mkdir();
		
		File file = new File(path);
		if(!file.exists()) {
			System.out.println("���������� �������� �ʽ��ϴ�.");
			System.exit(0);
		}
		

		InputStream is = new FileInputStream(path);
		OutputStream os = new FileOutputStream(copyPath);
		BufferedInputStream bis = new BufferedInputStream(is);
		BufferedOutputStream bos = new BufferedOutputStream(os);
		
		bis.transferTo(bos);
		
		System.out.println("���簡 �����Ǿ����ϴ�.");
		
		bos.flush();
		bos.close();
		bis.close();
		os.flush();
		os.close();
		is.close();
		scanner.close();
		

	}

}
