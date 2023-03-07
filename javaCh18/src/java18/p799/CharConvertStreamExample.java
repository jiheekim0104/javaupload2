package java18.p799;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharConvertStreamExample {

	public static void main(String[] args) throws Exception {
		write("���� ��ȯ ��Ʈ���� ����մϴ�.");
		StringBuilder data = read();
		System.out.println(data);
	}

	public static void write(String str) throws Exception {
		OutputStream os = new FileOutputStream("C:/webStudyB/temp/test10.txt");
		Writer writer = new OutputStreamWriter(os);

		writer.write(str);
		writer.flush();
		writer.close();
		os.close();
	}

	public static StringBuilder read() throws Exception {
		InputStream is = new FileInputStream("C:/webStudyB/temp/3�� 6�� �н�����.txt");
		Reader reader = new InputStreamReader(is,"utf-8");
		char[] data = new char[1024];
		StringBuilder stringBuilder = new StringBuilder();
		while (true) {
			int num = reader.read(data);
			if (num == -1)
				break;
			String str = new String(data, 0, num);
			stringBuilder.append(str);

		}

		reader.close();
		is.close();

		return stringBuilder;

	}

}
