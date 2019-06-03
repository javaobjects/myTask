package chapter2;

import java.util.Random;

public class Task {

	public Task() {
		
	}
	/*
	 * 1、已知a,b均是整型变量，写出将a,b两个变量中的值互换的程序。
	 * （知识点：变量和运算符综合应用)
	 */	
	public static void variableInterchange(int a,int b) {
		int temp;
		//进行数据交换
		temp = a;
		a = b;
		b = temp;
		System.out.println("交换后的a值为：" + a + " 交换后的b值为： " + b);
	}
	//第二种方法
	public static void variableInterchange2(int a,int b) {
		a = a + b;//用a获得总和
		b = a - b;//将旧的a的值赋值给b
		a = a - b;//将旧的b的值赋值给a
		System.out.println("交换后a的值为：" + a + " 交换后的b值为：" + b);
	}
	/*
	 * 2、给定一个0～1000的整数，求各位数的和，例如345的结果是3+4+5＝12注：
	 * 分解数字既可以先除后模也可以先模后除（知识点：变量和运算符综合应用）
	 * 
	 */
	public static void sumNumevery() {
		Random random = new Random();
		int num = random.nextInt(1001),
				num_k = num / 1000,
				num_b = (num % 1000)/100,
				num_s = (num % 100)/10,
				num_g = num % 10;
		System.out.println(num +"  各个位数的和是 ：" 
				+(num_k + num_b + num_s + num_g));
	}
	/*
	 * 3、华氏温度和摄氏温度互相转换，从华氏度变成摄氏度你只要减去32，
	 * 乘以5再除以9就行了，将摄氏度转成华氏度，直接乘以9，除以5，再加上32即行。
	 * 
	 */
	public static void temperatureInterchange(float num)
	{
		float cTemp = (num -32) * 5 / 9,
			fTemp = num * 9 / 5 + 32;
		System.out.println(num +"如果是华氏度那么转成摄氏度是: " + cTemp);
		System.out.println(num +"如果是摄氏度那么转成华氏度是: " + fTemp);
	}
	/*
	 * 4、给定一个任意的大写字母A~Z，
	 *  转换为小写字母。 （知识点：变量和运算符）
	 */
	public static void toLowerCase(char word)
	{
		System.out.println(word + " 小写为：" + (char)(word + 32));
	}
	public static void main(String[] args) {
//		variableInterchange(5,7);
		variableInterchange2(8, 3);
//		sumNumevery();
//		temperatureInterchange(50);
//		toLowerCase('B');

	}

}
