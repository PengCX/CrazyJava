package codes.chapter15.class8;

import java.io.Serializable;
/**
 * 对象引用的序列化：
 * 	1.所有保存到磁盘中的对象都有一个序列化编号
 * 	2.当程序企图序列化一个对象时，程序先检查该对象是否已经被序列化过，只有当该对象未（在本次虚拟机中）被序列化过，系统才会
 *	将该对象转换成字节序列并输出
 *	3.如果某个对象是已经序列化过的，程序将直接只输出一个序列化编号，而不是再次序列化该对象。
 * @author Administrator
 *
 */
public class Teacher implements Serializable {
	private String name;
	//类的属性是引用类型，也必须序列化。
	//如果Person是不可序列化的，无论Teacher实现Serializable,Externalizable接口，则Teacher都
	//是不可序列化的。
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
