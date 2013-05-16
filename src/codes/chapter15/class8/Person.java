package codes.chapter15.class8;

import java.io.Serializable;
/**
 * 对象序列化：
 * 	1.目标：将对象保存到磁盘上，或允许网络中直接传输对象
 * 	2.概念：是指将一个Java对象写入IO流中，与此对应的是，对象的反序列化，则指从IO流中恢复该Java对象
 * 	3.为了让某个对象可以支持序列化机制，必须实现如下两个接口之一：
 * 		Serializable：标记接口，无须实现任何方法。只表明该类的实例可序列化
 * 		Externalizable
 * 	4.通常建议：程序创建的每个JavaBean类都实现Serializable
 * 
 * 
 *
 */
public class Person implements Serializable {
	private String name;
	private int age;

	//注意此处没有提供无参数的构造方法
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
