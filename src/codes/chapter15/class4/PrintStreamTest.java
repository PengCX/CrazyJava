package codes.chapter15.class4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamTest {
	public static void main(String[] args) {
		PrintStream ps = null;
		
		try {
			//创建一个节点输出流：FileOutputStream
			FileOutputStream fos = new FileOutputStream("test.txt");
			//以PrintStream来包装FileOutputStream输出流
			ps = new PrintStream(fos);
			//使用PrintStream执行输出
			ps.println("普通字符串");
			//直接输出PrintStream输出对象
			ps.println(new PrintStreamTest());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			//当我们使用处理流来包装底层节点流之后，关闭输入/输出流资源的时候，只要关闭最上层的处理流即可。
			ps.close();
		}
		
	}
}
