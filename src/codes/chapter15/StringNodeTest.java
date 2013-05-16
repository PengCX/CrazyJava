package codes.chapter15;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringNodeTest {
	public static void main(String[] args) throws IOException{
		String src = "从明天起，做一个幸福的人\n" + "喂马，劈柴，周游世界\n" + "从明天起，关心粮食和蔬菜\n"
				+ "我有一所房子，面朝大海，春暖花开\n" + "从明天起，和每一个亲人通信\n" + "告诉他们我们的幸福\n";
		
		StringReader sr = new StringReader(src);
		char[] buffer = new char[32];
		int hasRead = 0;
		try {
			//采用循环的方式读取字符串
			while ((hasRead = sr.read(buffer)) > 0) {
				System.out.print(new String(buffer, 0, hasRead));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			sr.close();
		}
		
		//创建StringWriter是，实际上以一个StringBuffer作为输出节点
		//下面是制定20就是StringBuffer的初始长度
		StringWriter sw = new StringWriter(20);
		//调用StringWriter的方法执行输出
		sw.write("我远离了大海,\n");
		sw.write("看不到春暖花开,\n");
		sw.write("我只有一只小龟,\n");
		sw.write("一样可以闻到新月花香,\n");
		System.out.println("------下面是sw的字符串接节点里的内容------");
		//使用toString方法返回StringWriter的字符串节点内容
		System.out.println(sw.toString());
		sw.close();
	}
}
