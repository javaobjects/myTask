package chapter1;

public class Topic1 {
	/*
	 * 1、题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，
	 *  其各位数字立方和等于该数本身。例如：153是一个"水仙花数"，
	 * 因为153=1的三次方＋5的三次方＋3的三次方。
	 */
	public static void daffodilNumber() {
		for(int i = 100;i < 999;i++) {
			/**
			 * 1、求得int i 的各个位数的数值
			 * 2、将其各个位数的值自相乘
			 * 3、将其自相乘的值相加
			 * 4、将其相加的值与其本身值相比较
			  *  若相等则打印输出 若不相等则不打印
			 * @param args
			 */
			int i_b = i/100,//i的百位数值
				i_s = i % 100 / 10,//i的十位数据
				i_g = i % 100 % 10;//i的个位数值
			if(i == i_b * i_b * i_b + i_s * i_s * i_s + i_g * i_g * i_g) {
				System.out.println(i);
			}
		}
	}
			
//	2、使用循环语句输出下面的图形。
//	#
//	# # #
//	# # # # #
//	# # # # # # #
//	# # # # # # # # #

	public static void drawChar() {
		for(int i = 1;i < 6;i++) {
			for(int j = 0;j < i;j++) {
				System.out.print("# ");//内层循环控制# 打印
			}
			System.out.println();//外层循环控制换行
		}
	}
	  /*
	 * 3、编程求 1~10000 之间的所有“完全数”，完全数是该数的所有因子之和等于该数的数。
	 * 例如，6 的因子有 1、2、3，且 6=1+2+3，所以 6是完全数。
	 * 
	 */
	static void perfectNumber() {
		for(int i = 1;i <= 10000;i++) {//外层循环控制1-10000之间的所有数
			int sum = 0;//定义因子和的初始值  用来将因子相加
			String num = "";
			for(int j = 1;j < i;j++) {//内存循环控制比自己小的所有大于等于1的数值
				if(i % j == 0) {//将内存循环的数值求模 若模值为0则为因子
					sum += j;//将因子相加
					num += j + " + ";
				}
			}
			if(i == sum) {//若因子之和与其本身相等 则为 完全数
				System.out.println(num +"  " + i+"   是完全数");
			}
		}
	}
	
	/*
	 * 4、古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
	 * 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少？
	 * 假定月数定为12个月以内
	 * 1 2 3 4 5 6 7 8 9 10 11 12
	 * 1 1 2 3 4 7 9 
	 *     1 
	 */

	void rabbitNum() {
		
	}
	
//	5、写出代码运行结果_______________ 
//	class Parent { 
//		void printMe(){
//			System.out.println("parent"); 
//		}
//	 } 
//	class Child extends Parent { 
//		void printMe() {
//			System.out.println("child");
//		}
//		void printAll(){
//			super.printMe(); 
//			this.printMe(); 
//			printMe();
//		} 
//	}
//	 public class T { 
//		 public static void main(String args[]) {
//			 Child myC = new Child(); myC.printAll(); 
//			 }
//	 }
	
//	6、关于类的叙述正确的是（）。
//	 
//	A、在类中定义的变量称为类的成员变量，在别的类中可以直接使用
//	 
//	B、局部变量的作用范围仅仅在定义它的方法内，或者是在定义它的控制流块中
//	 
//	C、使用别的类的方法仅仅需要引用方法的名字即可
//	 
//	D、只要没有定义不带参数的构造函数，JVM都会为类生成一个默认构造函数
	
	
	
//	7、在try的括号里面有return一个值，那在哪里执行finally里的代码？
//	 
//	A、不执行finally代码
//	 
//	B、return前执行
//	 
//	C、return后执行
	
//	8、设三个整型变量 x = 1 , y = 2 , z = 3，则表达式 y＋＝z－－/＋＋x 的值是(      )。
//			 
//	A、3 B、3.5 C、4 D、5
	
//	9、一个以“.java”为后缀的源文件
//	 
//	A、只能包含一个public类，类名必须与文件名相同
//	 
//	B、只能包含与文件名相同的public类以及其中的内部类
//	 
//	C、只能有一个与文件名相同的public类，可以包含其他非public类（不考虑内部类）
//	 
//	D、可以包含任意public类
	
//	10、下面哪个选项正确创建socket连接？B
//	 
//	A、Socket s = new Socket(8080);
//	 
//	B、Socket s = new Socket(“192.168.1.1”,8080)
//	 
//	C、SocketServer s = new Socket(8080);
//	 
//	D、Socket s = new SocketServer(“192.168.1.1”,8080)
	
//	11、下列哪种异常是检查型异常，需要在编写程序时声明？C
//	 
//	A、NullPointerException
//	 
//	B、ClassCastException
//	 
//	C、FileNotFoundException
//	 
//	D、IndexOutOfBoundsException
	
//	12、下面代码的执行结果是 ________
	
//	class Chinese{
//		    private static Chinese objref =new Chinese();
//		    private Chinese(){}
//		    public static Chinese getInstance() { return objref; }
//		}
//
//		public class TestChinese {
//		    public static void main(String [] args) {
//		    Chinese obj1 = Chinese.getInstance();
//		    Chinese obj2 = Chinese.getInstance();
//		    System.out.println(obj1 == obj2);
//		}
//		}
	
//	13、下面选项中,哪些是interface中合法方法定义?(AC) public abstract(接口中默认的方法声明)
//	                                             public static final(接口中常量默认声明)
//			 
//	A、public void main(String [] args);
//			 
//	B、private int getSum();
//			 
//	C、boolean setFlag(Boolean [] test);
//			 
//	D、public float get(int x);



//	14、java中 String str = "hello world"下列语句错误的是？（多选）ABC String.valueOf(123)
//	 
//	A、str+='      a'
//	 
//	B、int strlen = str.length
//	 
//	C、str=100
//	 
//	D、str=str+100		
			
			
	public static void main(String[] args) {
//		daffodilNumber();//1
//		drawChar();//2
//		perfectNumber();//3
	    
	}

}
