package chapter8;

public class Topic1 {

	/*
	 * 1、编写应用程序，从命令行传入两个整型数作为除数和被除数。
	 *  要求程序中捕获NumberFormatException
	 * 异常和ArithmeticException 异常，
	 * 而且无论在哪种情况下，“总是被执行”这句话都会在控制台输出。
	 */
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("please enter the first number");
		String string1 = scanner.next();
		System.out.println("please enter the second number");
		String string2 = scanner.next();
		int num1,num2;
		try {
			num1 = Integer.getInteger(string1);
			num2 = Integer.getInteger(string2);
			System.out.println(num1 / num2);
		} catch (NumberFormatException | ArithmeticException e) {
			e.printStackTrace();
		}finally {
			System.out.println("总是被执行");
		}
	}
}
