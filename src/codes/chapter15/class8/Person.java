package codes.chapter15.class8;

import java.io.Serializable;
/**
 * �������л���
 * 	1.Ŀ�꣺�����󱣴浽�����ϣ�������������ֱ�Ӵ������
 * 	2.�����ָ��һ��Java����д��IO���У���˶�Ӧ���ǣ�����ķ����л�����ָ��IO���лָ���Java����
 * 	3.Ϊ����ĳ���������֧�����л����ƣ�����ʵ�����������ӿ�֮һ��
 * 		Serializable����ǽӿڣ�����ʵ���κη�����ֻ���������ʵ�������л�
 * 		Externalizable
 * 	4.ͨ�����飺���򴴽���ÿ��JavaBean�඼ʵ��Serializable
 * 
 * 
 *
 */
public class Person implements Serializable {
	private String name;
	private int age;

	//ע��˴�û���ṩ�޲����Ĺ��췽��
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
