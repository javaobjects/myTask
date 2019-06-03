package highchapter4;

public class Topic1 extends Thread{

	private int startNumber;
	private int endNumber;
	
	public Topic1() {
		super();
	}

	public Topic1(int startNumber, int endNumber) {
		super();
		this.startNumber = startNumber;
		this.endNumber = endNumber;
	}

	@Override
	public String toString() {
		return "Topic1 [startNumber=" + startNumber + ", endNumber=" + endNumber + "]";
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
	
	public void isPrime() {
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
	@Override
	public void run(){
		this.isPrime();
	}

	public static void main(String[] args) {
		Topic1 tp1 = new Topic1(1,1000);
		Topic1 tp2 = new Topic1(1001,2000);
		Topic1 tp3 = new Topic1(2001,3000);
		
		Thread td1 = new Thread(tp1);
		td1.start();
		Thread td2 = new Thread(tp2);
		td2.start();
		Thread td3 = new Thread(tp3);
		td3.start();
	}

}
