package highchapter4;

public class Topic2 implements Runnable{
	/*
	 * 2、利用Runnable实现，要求多线程求解某范围素数每个线程负责1000范围：
	 * 线程1找1-1000；线程 2 找 1001-2000；线程 3 
	 * 找2001-3000。编程程序将每个线程找到的素数及时打印。
	 * 
	 * 概念：质数又称素数。一个大于1的自然数，除了1和它自身外，
	 * 不能被其他自然数整除的数叫做质数；否则称为合数。
	 */

	private int startNumber;
	private int endNumber;
	public void print() {
		boolean flag;
		for(int i = this.startNumber;i<=this.endNumber;i++) {
			flag = false;
			for(int j = 2;j < i;j++) {
				if(i % j == 0) {
					flag = true;
					break;
				}
			}
			if(flag == false) {
				System.out.println(i);
			}
		}
	}
	
	public int getStartNumber() {
		return startNumber;
	}

	public void setStartNumber(int startNumber) {
		this.startNumber = startNumber;
	}

	public int getEndNumber() {
		return endNumber;
	}

	public void setEndNumber(int endNumber) {
		this.endNumber = endNumber;
	}

	@Override
	public String toString() {
		return "Topic1 [startNumber=" + startNumber + ", endNumber=" + endNumber + "]";
	}

	public Topic2() {
		
	}
	public Topic2(int startNumber, int endNumber) {
		super();
		this.startNumber = startNumber;
		this.endNumber = endNumber;
	}
	@Override
	public void run() {
		this.print();
	}
	
	public static void main(String[] args) {
		Topic2 t1 = new Topic2(1,1000);
		Topic2 t2 = new Topic2(1001,2000);
		Topic2 t3 = new Topic2(2001,3000);
		
		Thread td1 = new Thread(t1);
		td1.start();
		Thread td2 = new Thread(t2);
		td2.start();
		Thread td3 = new Thread(t3);
		td3.start();
	}
}
