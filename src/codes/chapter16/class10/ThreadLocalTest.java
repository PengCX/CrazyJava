package codes.chapter16.class10;

class Account {
	//定义一个ThreadLocal类型的变量，该变量将是一个线程的局部变量
	//每个线程都会保留该变量的一个副本
	private ThreadLocal<String> name = new ThreadLocal<String>();
	
	//定义一个初始化name属性的构造器
	public Account(String str){
		this.name.set(str);
		//下面的代码看到输出“初始名”
		System.out.println("===" + this.name.get());
	}
	
	//定义了name的属性的setter和getter方法
	public String getName(){
		return name.get();
	}
	
	public void setName(String str){
		this.name.set(str);
	}
}

class MyTest extends Thread{
	//定义了一个Account属相
	private Account account;
	
	public MyTest(Account account,String name){
		super(name);
		this.account = account;
	}
	
	@Override
	public void run() {
		//循环10次
		for(int i = 0; i < 10; i++){
			//当i==6时输出将账户名替换成当前线程名
			if(i == 6){
				account.setName(getName());
			}
			//输出同一个账户的账户名和循环变量
			System.out.println(account.getName() + "账户的i值：" + i);
		}
	}
}

public class ThreadLocalTest{
	
	public static void main(String[] args) {
		//启动两条线程，两条线程共享一个Account
		Account at = new Account("初始名");
		
		//虽然两条线程共享一个Account，即只有一个账户名
		//但由于账户名是ThreadLocal类型的，所有两条线程将
		//导致有同一个Account，但两个账户名的副本，每条线程
		//都完全拥有各自账户名的副本，所以从i==6之后，将看到两条
		//线程访问同一个账户时看到不同的账户名
		new MyTest(at,"线程甲").start();
		new MyTest(at,"线程乙").start();
	}	
}
