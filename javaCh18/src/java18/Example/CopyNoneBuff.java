package java18.Example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CopyNoneBuff {

	public static void main(String[] args) throws Exception {
		String path = "C:/webStudyB/temp/메모.txt";
		String copypath = "C:/webStudyB/temp/NoneBuff메모.txt";
		
		InputStream is = new FileInputStream(path);
		OutputStream os = new FileOutputStream(copypath);
		Reader reader = new InputStreamReader(is,"utf-8");
		Writer writer = new OutputStreamWriter(os,"utf-8");
		
		char[] data = new char[1024];
		int num = reader.read(data);
		reader.close();
		String str = new String(data,0,num);
		writer.write(str);
		writer.flush();
		writer.close();
		
		
	}

}
