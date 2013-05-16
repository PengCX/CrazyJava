package codes.chapter15.class8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
/**
 * ����ָ�����ǣ������л���ȡ�Ľ�����Java��������ݣ�������Java�࣬��˲��÷����л��ָ�Java����ʱ�������ṩ��Java
 * ������������class�ļ������������ClassNotFoundException�쳣��
 * 
 * ����һ�㣺�����л���������ͨ������������ʼ��Java����
 *
 * ����������ļ���ʹ�����л�����д����Java����ʹ�÷����л����ƻָ�����ʱ���밴ʵ��д���˳��
 */
public class ReadObject {
	public static void main(String[] args) {
		ObjectInputStream ois = null;

		try {
			//1.����һ��ObjectInputStream������
			ois = new ObjectInputStream(new FileInputStream("object.txt"));
			//2.���������ж�ȡһ��Java���󣬲�����ǿ������ת��ΪPerson����
			Person p = (Person) ois.readObject();
			System.out.println("����Ϊ��" + p.getName() + "\n����Ϊ��" + p.getAge());
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
