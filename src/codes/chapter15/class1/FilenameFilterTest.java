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

// 实现自己的FilenameFilter实现类
class MyFilenameFilter implements FilenameFilter {

	@Override
	public boolean accept(File dir, String name) {
		// 如果文件名以.java结尾，或者文件对应一个路径，则返回true
		return name.endsWith(".java") || new File(name).isDirectory();
	}
 
}
