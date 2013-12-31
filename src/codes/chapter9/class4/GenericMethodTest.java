package codes.chapter9.class4;

import java.util.ArrayList;
import java.util.Collection;

import com.sun.org.apache.xpath.internal.operations.Number;
import com.sun.tools.javac.code.Type.ForAll;

/**
 * 9.4.1���ͷ���
 * @author pengcx
 *
 */
public class GenericMethodTest {
	//����һ�����ͷ������÷��ͷ����д�һ��T���Ͳ���
	static<T> void fromArrayToCollection(T[]a,Collection<T> c){
		for(T o : a){
			c.add(o);
		}
	}
	
	public static void main(String[] args){
		Object[] oa = new Object[100];
		Collection<Object> co = new ArrayList<Object>();
		//���������T����Object����
		fromArrayToCollection(oa, co);
		
		String[] sa = new String[100];
		Collection<String> cs = new ArrayList<String>();
		//���������T����String����
		fromArrayToCollection(sa, cs);
		//���������T����Object����
		fromArrayToCollection(sa, co);
		
		Integer[] ia = new Integer[100];
		Float[] fa = new Float[100];
		Number[] na = new Number[100];
		Collection<Number> cn = new ArrayList<Number>();
		//���������T����45����
//		fromArrayToCollection(ia, cn);
		//���������T����
	}
}
