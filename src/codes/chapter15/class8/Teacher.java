package codes.chapter15.class8;

import java.io.Serializable;
/**
 * �������õ����л���
 * 	1.���б��浽�����еĶ�����һ�����л����
 * 	2.��������ͼ���л�һ������ʱ�������ȼ��ö����Ƿ��Ѿ������л�����ֻ�е��ö���δ���ڱ���������У������л�����ϵͳ�Ż�
 *	���ö���ת�����ֽ����в����
 *	3.���ĳ���������Ѿ����л����ģ�����ֱ��ֻ���һ�����л���ţ��������ٴ����л��ö���
 * @author Administrator
 *
 */
public class Teacher implements Serializable {
	private String name;
	//����������������ͣ�Ҳ�������л���
	//���Person�ǲ������л��ģ�����Teacherʵ��Serializable,Externalizable�ӿڣ���Teacher��
	//�ǲ������л��ġ�
	private Person student;

	public Teacher(String name, Person student) {
		super();
		this.name = name;
		this.student = student;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person getStudent() {
		return student;
	}

	public void setStudent(Person student) {
		this.student = student;
	}

}
