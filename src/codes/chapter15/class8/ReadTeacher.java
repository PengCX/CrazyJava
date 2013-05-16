package codes.chapter15.class8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadTeacher {
	public static void main(String[] args) {
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream("teacher.txt"));
			//依次读取ObjectInputStream输入流中的四个对象
			Teacher t1 = (Teacher) ois.readObject();
			Teacher t2= (Teacher) ois.readObject();
			Person p = (Person) ois.readObject();
			Teacher t3 = (Teacher) ois.readObject();
			
			System.out.println("t1的student引用和p是否相同：" + (t1.getStudent() == p));
			System.out.println("t2的student引用和p是否相同：" + (t2.getStudent() == p));
			System.out.println("t1和t3是是否是同一个对象：" + (t1 == t3));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			try {
				if (ois != null) {
					ois.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
