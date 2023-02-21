package javaCh12.Ex03;

import java.util.Collection;
import java.util.Iterator;
import java.util.Properties;

public class BasePage518 {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		String javaHome = System.getProperty("java.home");
		String userDir = System.getProperty("user.dir");
		String jsversion = System.getProperty("java.specification.version");
		
		System.out.println(osName + userName + userHome + javaHome + userDir + jsversion);
		
		Properties properties = System.getProperties();
		boolean isOsname = properties.containsKey("os.name");
		System.out.println(isOsname);
		
		System.out.println(properties.size());
		
		Collection<Object> propertiesValue = properties.values();
		Iterator<Object> iterator = propertiesValue.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
