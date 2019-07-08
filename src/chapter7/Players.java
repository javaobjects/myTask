package chapter7;

public class Players {
//	1、创建一个球员类，并且该类最多只允许创建十一个对象。
//	提示利用 static 和 封装性来完成。
	
	private static int sum;
	/**
	 * 无参构造方法
	 */
	private Players()
	{
		
	}
	
	public static Players create()
	{
		sum = 1;
		Players players = null;
		while(sum <= 11)
		{
			players = new Players();
			System.out.println("创建咯"+sum+"个对象");
			sum++;
		}
		System.out.println("对不起，已经创建咯11个对象，不能再创建对象了");
		return players;
	}
	
	public static void main(String[] args) {
		Players.create();
	}
}
