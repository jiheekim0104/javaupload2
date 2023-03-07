package java18.q7;

import java.io.BufferedReader;
import java.io.FileReader;

public class Example {

	public static void main(String[] args) throws Exception {
		String filePath = "C:/webStudyB/study/java_study2/javaCh18/src/java18/p818/FilesEx.java";
		
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		int rowNumber = 1;
		while(true) {
			String rowData = br.readLine();
			if(rowData==null) break;
			System.out.println(rowNumber+"\t"+rowData);
			rowNumber++;
		}
		
		br.close();
		fr.close();

	}

}
