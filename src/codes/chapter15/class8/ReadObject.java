package codes.chapter15.class8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
/**
 * 必须指出的是：反序列化读取的仅仅是Java对象的数据，而不是Java类，因此采用反序列化恢复Java对象时，必须提供该Java
 * 对象所属的类class文件，否则会引发ClassNotFoundException异常。
 * 
 * 还有一点：反序列化机制无须通过构造器来初始化Java对象
 *
 * 如果我们向文件中使用序列化机制写入多个Java对象，使用反序列化机制恢复对象时必须按实际写入的顺序。
 */
public class ReadObject {
	public static void main(String[] args) {
		ObjectInputStream ois = null;

		try {
			//1.创建一个ObjectInputStream输入流
			ois = new ObjectInputStream(new FileInputStream("object.txt"));
			//2.从输入流中读取一个Java对象，并将其强制类型转换为Person对象
			Person p = (Person) ois.readObject();
			System.out.println("名字为：" + p.getName() + "\n年龄为：" + p.getAge());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			try {
				if (ois == null) {
					ois.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
