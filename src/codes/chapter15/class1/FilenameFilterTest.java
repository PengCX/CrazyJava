package codes.chapter15.class1;

import java.io.File;
import java.io.FilenameFilter;

public class FilenameFilterTest {
	public static void main(String[] args) {
		File file = new File(".");
		String[] nameList = file.list(new MyFilenameFilter());
		for (String name : nameList) {
			System.out.println(name);
		}
	}
}

// ʵ���Լ���FilenameFilterʵ����
class MyFilenameFilter implements FilenameFilter {

	@Override
	public boolean accept(File dir, String name) {
		// ����ļ�����.java��β�������ļ���Ӧһ��·�����򷵻�true
		return name.endsWith(".java") || new File(name).isDirectory();
	}
 
}
