package codes.chapter15.class8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriterTeacher {
	public static void main(String[] args) {
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("teacher.txt"));
			Person per = new Person("�����",500);
			Teacher t1 = new Teacher("��ɮ", per);
			Teacher t2 = new Teacher("������ʦ", per);
			
			//���ν��ĸ�����д�������
			oos.writeObject(t1);
			oos.writeObject(t2);
			oos.writeObject(per);
			oos.writeObject(t2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if (oos != null) {
					oos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

