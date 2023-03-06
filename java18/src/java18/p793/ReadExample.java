package java18.p793;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class ReadExample {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/webStudyB/temp/3월 6일 학습내용.txt");
		Writer writer = new FileWriter("C:/webStudyB/temp/3월 6일 학습내용(copy).txt");
		while(true) {
			int data = reader.read();
			if(data==-1) {
				break;
			}
			System.out.print((char)data);
			writer.write(data);
		}
		
		reader.close();
		writer.flush();
		writer.close();
		System.out.println("-------------------------------------");
		
		Reader reader1 = new FileReader("C:/webStudyB/temp/3월 6일 학습내용.txt");
		Writer writer1 = new FileWriter("C:/webStudyB/temp/3월 6일 학습내용(copy2).txt");
		char[] data = new char[100];
		while(true) {
			int num = reader1.read(data);
			if(num==-1) {
				break;
			}
			for(int i =0;i<num;i++) {
				System.out.print(data[i]);
				writer1.write(data[i]);
			}
			
		}
		
		reader1.close();
		writer1.flush();
		writer1.close();
	}

}
