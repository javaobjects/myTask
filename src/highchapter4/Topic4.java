package highchapter4;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Topic4 implements Callable<Integer>{
	/*
	 * 4、编写一个计时器，每隔一秒钟，
	 * 在控制台打印出最新时间。
	 */
	@Override
	public Integer call() throws Exception {
		while(true) {
			Thread.sleep(1000);
			System.out.println(new Date());
		}
	}
	public static void main(String[] args) {
		Topic4 t4 = new Topic4();
		FutureTask<Integer> ft1 = new FutureTask<>(t4);  
		
		new Thread(ft1).start();
		
		try {
			System.out.print(ft1.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}
