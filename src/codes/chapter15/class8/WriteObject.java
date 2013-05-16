package codes.chapter15.class8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
	public static void main(String[] args) {
		ObjectOutputStream oos = null;
		
		try {
			//1.����һ��ObjectOutputStream
			oos = new ObjectOutputStream(new FileOutputStream("object.txt"));
			Person per = new Person("�����", 500);
			//2.��per����д��������
			oos.writeObject(per);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(oos != null){
					oos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
