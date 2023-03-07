package java18.p813;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FilesExample {

	public static void main(String[] args) throws Exception {
		File dir = new File("C:/webStudyB/temp");
		File file1 = new File("C:/webStudyB/temp/data1.txt");
		File file2 = new File("C:/webStudyB/temp/data2.txt");
		File file3 = new File("C:/webStudyB/temp/data3.txt");
		
		if(!dir.exists()) {
			dir.mkdir();
		}
		if(!file1.exists()){
			file1.createNewFile();
		}
		if(!file2.exists()){
			file2.createNewFile();
		}
		if(!file3.exists()){
			file3.createNewFile();
		}
		
		File temp = new File("C:/webStudyB/temp");
		File[] contents = temp.listFiles();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for(File file : contents) {
			System.out.printf("%-25s",sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()) {
				System.out.printf("%-10s%-20s","<DIR>",file.getName());
			} else {
				System.out.printf("%-10s%-20s",file.length(),file.getName());
			}
			System.out.println();
		}
		

	}

}
