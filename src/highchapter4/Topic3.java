package highchapter4;

public class Topic3 extends Thread{

	/*
	 * 3、编写一个Java程序(包括一个主程序类，一个线程类。
	 * 在主程序类中创建2个线程，将其中一个线程的优先级设为10，
	 * 另一个线程的优先级设为6。
	 * 让优先级为10的线程打印200次“线程1正在运行”，
	 * 优先级为6的线程打印200次“线程2正在运行”。
	 * 
	 */
	
	private String name;
	public Topic3() {
		super();
	}
	public Topic3(String name) {
		super();
		this.name = name;
	}
	@Override
	public String toString() {
		return "Topic3 [name=" + name + "]";
	}
    @Override
	public void run() {
		super.run();
		for(int i = 0;i < 200;i++) {
			System.out.println(this.name + "正在运行");
		}
	}
	public static void main(String[] args) {
		Topic3 tp1 = new Topic3("线程1");
		
		Topic3 tp2 = new Topic3("线程2");
		
		Thread td1 = new Thread(tp1);
		td1.setPriority(10);
		td1.start();
		Thread td2 = new Thread(tp2);
		td2.setPriority(6);
		td2.start();
	}

}
