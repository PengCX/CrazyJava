package codes.chapter14;

public class MyTest {
	@Testable
	public static void m1(){
		
	}
	
	public static void m2(){
		
	}
	
	//ʹ��@Testable���ע���ƶ��÷����ǿɲ��Ե�
	@Testable
	public static void m3(){
		throw new RuntimeException("Boom");
	}
	
	public static void m4(){
		
	}
	
	//ʹ��@Testable���ע���ƶ��÷����ǿɲ��Ե�
	@Testable
	public static void m5(){
		
	}
	
	public static void m6(){
		
	}

	//ʹ��@Testable���ע���ƶ��÷����ǿɲ��Ե�
	@Testable
	public static void m7(){
		throw new RuntimeException("Crash");
	}
	
	public static void m8(){
		
	}
}
