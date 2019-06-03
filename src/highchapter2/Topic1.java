package highchapter2;

import java.util.LinkedList;

public class Topic1 {
	/*
	 * 1、请使用LinkedList来模拟一个队列(先进先出的特性): 
	 *  1.1 拥有放入对象的方法void put(Object o) 
	 *  1.2  取出对象的方法Object get() 
	 *  1.3 判断队列当中是否为空的方法boolean isEmpty()；
	 *  并且，编写测试代码，验证你的队列是否正确。
	 */
	private LinkedList<String> linkedList = new LinkedList<String>();
	//放的方法
	public void putpush(String str) {
		linkedList.addLast(str);
	}
	//取的方法
	public String getAndRemove() {
		return linkedList.pollFirst();
	}
	//判断是否为空
	public boolean isEmpty() {
		return linkedList.size() == 0;
	}
	@Override
	public String toString() {
		return "MyQueue [toString()=" + linkedList.toString() + "]";
	}
	//假定此为测试类
	public static void main(String[] args) {
		Topic1 myQueue = new Topic1();//创建一个队列
		myQueue.putpush("adf");
		myQueue.putpush("12");
		myQueue.putpush("45");
		myQueue.putpush("3424");
		myQueue.putpush("68768");
		myQueue.putpush("6564");
		System.out.println(myQueue.toString());
		while (!myQueue.isEmpty()) {
			System.out.println(myQueue.getAndRemove());
		}
		System.out.println(myQueue.isEmpty());
	}
}
