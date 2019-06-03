package highchapter2;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class Topic4 {
	/*
	4、编写一个程序，创建一个?HashMap对象，
	用于存储银行储户的信息(其中储户的主要信息有储户的ID，姓名和余额)。
	另外，计算并显示其中某个储户的当前余额。 [选做题]
	*/
	private Integer id;
	private String nameString;
	private double balance;
	
	public Topic4(Integer id,String namString,double balance) {
		this.id = id;
		this.nameString = namString;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Topic4 [id=" + id + ", nameString=" + nameString + ", balance=" + balance + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static void main(String[] args) {
		Map<Integer, Topic4> map = new HashMap<Integer, Topic4>();
		for (int i = 1; i < 11; i++) {
			map.put(i, new Topic4(i,"name" + i,new Double(new Random().nextInt(10000))));
		}
		System.out.println("3号储户的余额：" + map.get(3).getBalance());
	}

}
