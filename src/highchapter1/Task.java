package highchapter1;

import java.util.Scanner;

public class Task {
	
	/*
	 * 1、编写一个程序，实现从命令行参数输入两个字符串类型的数值，并计算输出两个数值的和
	 * 
	 * 暂未考虑输入的不是数值型的字符串异常
	 * 
	 */
	public static void sumNumString() {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("请输入第一个数字");
		String numString1 = scanner.next();
		System.out.println("请输入第二个数字");
		String numString2 = scanner.next();
		System.out.println("两个数字和为：" +
		(Integer.parseInt(numString1) + Integer.parseInt(numString2)));
	}
	/*
	 * 2、编写一个程序，实现从命令行参数输入一字符串，
	 * 统计该字符串中字符“e”出现的次数。（识点：String中常用的方法）
	 */
	public static void countWorde() {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("请输入一串字符串");
		String string = scanner.next();
		int count = 0,
			index = 0;
		while(index < string.length()) {
			if(string.indexOf("e",index) == index) {
				count++;
			}
			index++;
		}
		System.out.println("字符串中字符“e”出现的次数是：" + count);
	}
	/*
	 * 3、生成十个0~100之间的随机数，放到数组中，然后排序输出。
	 * 
	 */
	public static void RandomNumAndSortOutput() {
		int[] myList = new int[10];
		java.util.Random random = new java.util.Random();
		for(int i = 0;i < myList.length;i++) {
			myList[i] = random.nextInt(100);
		}
		java.util.Arrays.sort(myList);//Java自带排序更改原数组没有返回值
//		for(int i = 0;i < myList.length - 1;i++) {
//			for(int j = 0;j < myList.length - 1 -i;j++) {
//				if(myList[j] > myList[j + 1]) {
//					int temp = myList[j];
//					myList[j] = myList[j +1];
//					myList[j + 1] = temp;
//				}
//			}
//		}//冒泡排序
		System.out.println(java.util.Arrays.toString(myList));
	}
	/*
	 * 4、巴黎时间比北京时间晚7个小时，
	 * 纽约时间比北京时间晚12个小时，
	 * 试编写一程序，根据输入的北京时间输出相应的巴黎和纽约时间。
	 */
	public static void getLocTime() {
		java.util.Date date = new java.util.Date();
		System.out.println("北京时间为： " + date);
		//把时间相加 操作的是毫秒值
		java.util.Date parisDate = new java.util.Date(date.getTime() - 7*60*60*1000);
		System.out.println("Paris时间为：" +parisDate);
		java.util.Date newYorkDate = new java.util.Date(date.getTime() - 12*60*60*1000);
		System.out.println("New York时间为：" +newYorkDate);
	}
	/*
	 * 5、解析一个邮箱地址是否合法，
	 * 如果合法则打印出用户名部分和该邮箱所属的网站域名，
	 * 如果邮箱地址不合法则显示不合法的原因 [选做题] 
	 * 5.1提示：邮箱地址不合法的因素： 
	 * 5.1.1邮箱地址中不包含@或. 
	 * 5.1.2邮箱地址中含有多了@或. 
	 * 5.1.3邮箱地址中.出现在@的前面
	 * 5.1.4用户名里有其他字符 
	 * 5.2实现步骤：
	 * 5.2.1创建一个类，类名：mailtest
	 */
	
	public static void mailtest() {
		//假定此 处就是mailtest类
		System.out.println("请输入你的邮箱名字");
		Scanner scanner = new Scanner(System.in);
		String email = scanner.next();
		// 5.1.1邮箱地址中不包含@或. 
		if(email.indexOf("@") == -1 || email.indexOf(".") == -1) {
			System.out.println("邮箱中不包含'@'或'.',不合法");
			return;
		}
		//5.1.2邮箱地址中含有多了@或. 
		if(email.indexOf("@") != email.lastIndexOf("@") || email.indexOf(".") != email.lastIndexOf(".")) {
			System.out.println("邮箱中包含多个'@'和'.',不合法");
			return;
		}
		//5.1.3邮箱地址中.出现在@的前面
		if(email.indexOf(".") < email.indexOf("@")) {
			System.out.println("邮箱中'.'在'@'前面,不合法");
			return;
		}
		//5.1.4用户名里有其他字符 
		/**
		 * 只能包含 0 ~ 9 a ~ z A ~ Z
		 * 0 对应的ASCII码十进制值为 ：48
		 * A对应的ASCII码十进制值为：65
		 * a对应的ASCII码十进制值为：97
		 */
		for (int i = 0; i < email.indexOf("@"); i++) {
			if(email.charAt(i) > '0' && email.charAt(i) < '9' || 
					email.charAt(i) > 'A' && email.charAt(i) < 'Z' ||
					email.charAt(i) > 'a' && email.charAt(i) < 'z') {
//				System.out.println("邮箱合法");
			}else {
				System.out.println("邮箱不合法，用户名里有其他字符 ");
			}
		}
	}
	
	
	
	/*
	 * 6、分别在控制台输入字符串和子字符串，并计算字符串中子字符串出现的次数
	 * 
	 */
	public static void countWord() {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("请输一个长度大于1的字符串");
		String string1 = scanner.next();
		System.out.println("请输入一个长度为1的字符串");
		String string2 = scanner.next();
		int index = 0,
			count = 0;
		while (index < string1.length()) {
			if(string1.indexOf(string2,index) == index) {
				count++;
			}
			index++;
		}
		System.out.println(string2+"   在   "+string1+"中出现的次数为：" + count +" 次");
	}
	/*
	 * 7、有一个字符串，
	 * 其中包含中文字符、
	 * 英文字符和数字字符，
	 * 请统计和打印出各个字符的个数。
	 * 
	 */
	public static void countZhEnNum() {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("请输入一个包含中文、字母和数字的字符串");
		String scString = scanner.next();
		StringBuilder zhStringBuilder = new StringBuilder();
		StringBuilder enStringBuilder = new StringBuilder();
		StringBuilder numStringBuilder = new StringBuilder();
		for (int i = 0; i < scString.length(); i++) {
			// 使用Character.getType()方法获取字符的类型
			switch (Character.getType(scString.charAt(i))) {
			case 1: // 大写字母
				enStringBuilder.append(scString.charAt(i));
				break;
			case 2: // 小写字母
				enStringBuilder.append(scString.charAt(i));
				break;
			case 5: // 中文字符
				zhStringBuilder.append(scString.charAt(i));
				break;
			case 9: // 数字
				numStringBuilder.append(scString.charAt(i));
				break;
			default:
				break;
			}
		}
		System.out.println(scString + "    中包含的中文字符为：" + zhStringBuilder.length() + " 个\t包含的英文字符为："
				+ enStringBuilder.length() + " 个\t包含的数字字符为" + numStringBuilder.length() + "个");
	}
	/*
	 * 8、有一种数叫回文数，正读和反读都一样， 
	  * 如12321便是一个回文数。 编写一个程序，
	  * 从命令行得到一个整数，判断该数是不是回文数。
	 * 
	 */
	public static void isPalindromeNumber() {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("请输入一个长度大于1的数字");
		String numString = scanner.next();
		StringBuilder stringBuilder = new StringBuilder(numString);
		stringBuilder.reverse();
		// stringBuilder.toString()将StringBuilder类型转换成String类型
		if (Integer.parseInt(numString) == Integer.parseInt(stringBuilder.toString())) {
			System.out.println(numString + "是回文数");
		} else {
			System.out.println(numString + "不是回文数");
		}
		/**
		 * 第二种方法
		 * 利用equals()方法判断两个对象是否相等
		 */
//		if (numString.equals(new StringBuilder(numString).reverse().toString())) {
//			System.out.println("是回文数");
//		} else {
//			System.out.println("不是");
//		}
	}
	public static void main(String[] args) {
//		sumNumString();//1
//		countWorde();//2
//		RandomNumAndSortOutput();//3
//		getLocTime();//4
//		mailtest();//5
//		countWord();//6
//		countZhEnNum();//7
//		isPalindromeNumber();//8
	}
}
