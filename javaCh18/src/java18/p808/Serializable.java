package java18.p808;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializable {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/webStudyB/temp/memberObject.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Member member = new Member("fall", "¥‹«≥¿Ã");
		oos.writeObject(member);
		
		FileInputStream fis = new FileInputStream("C:/webStudyB/temp/memberObject.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		//Member member2 = (Member)ois.readObject();
		Object object = ois.readObject();
		
		ois.close();
		fis.close();
		
		//System.out.println(member2);
		System.out.println(object);
	}
}
