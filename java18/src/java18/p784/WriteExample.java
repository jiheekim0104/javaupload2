package java18.p784;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


public class WriteExample {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("C:/webStudyB/temp/data2.txt");
			
			byte[] array = {10,20,30};
			
			os.write(array);
			os.flush();
			os.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			OutputStream os = new FileOutputStream("C:/webStudyB/temp/data3.txt");
			
			byte[] array = {10,20,30,40,50};
			
			os.write(array,1,3);
			os.flush();
			os.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try {
			OutputStream os = new FileOutputStream("C:/webStudyB/temp/data4.txt");
			
			byte[] array = {'a','b','c','d','e'};
			
			os.write(array);
			os.flush();
			os.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		

	}

}
