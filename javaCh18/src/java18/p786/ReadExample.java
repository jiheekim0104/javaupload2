package java18.p786;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:/webStudyB/temp/data4.txt");
			
			while(true) {
				int data = is.read();
				if(data==-1) {
					break;
				}
				System.out.println(data);
			}
			is.close();
		} catch (IOException e) {
			// TODO: handle exception
		}
		
		try {
			InputStream is = new FileInputStream("C:/webStudyB/temp/data4.txt");
			byte[] b = new byte[50];
			
			while(true) {
				int data = is.read(b);
				if(data==-1) {
					break;
				}
				for(int i=0;i<data;i++) {
					System.out.println(b[i]);
				}
				
			}
			is.close();
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
}
