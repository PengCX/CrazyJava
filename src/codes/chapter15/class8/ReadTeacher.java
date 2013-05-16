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
			//���ζ�ȡObjectInputStream�������е��ĸ�����
			Teacher t1 = (Teacher) ois.readObject();
			Teacher t2= (Teacher) ois.readObject();
			Person p = (Person) ois.readObject();
			Teacher t3 = (Teacher) ois.readObject();
			
			System.out.println("t1��student���ú�p�Ƿ���ͬ��" + (t1.getStudent() == p));
			System.out.println("t2��student���ú�p�Ƿ���ͬ��" + (t2.getStudent() == p));
			System.out.println("t1��t3���Ƿ���ͬһ������" + (t1 == t3));
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
