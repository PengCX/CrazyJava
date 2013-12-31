package codes.chapter6.class9;

public class GcTest {
	public static void main(String[] args){
		for(int i = 0;i < 4;i ++){
			new GcTest();
			//下面两行代码的作用完全相同，强制系统进行垃圾回收
			System.gc();
		}
	}
	
	public void finalize(){
		System.out.println("系统正在清理GcTest对象的资源...");
	}
}
