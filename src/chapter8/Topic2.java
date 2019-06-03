package chapter8;

public class Topic2 extends Exception{


	/*
	 * 2、编写一个检查给定的数字的数据类型是否为byte的程序，
	 * 如果此数字超出byte数据类型表示的数的范围，
	 * 则引发用户自定义的异常ByteSizeException,
	 * 并显示相应的错误信息（知识点：自定义异常） [选作题]
	 * 步骤1：创建用户自定义异常类ByteSizeException 
	 * 步骤2：在main方法中编写逻辑代码 
	 * 步骤3：运行并测试 效果如图：
	 * 此处最好取名为 ByteSizeException（Topic2）
	 */
	public Topic2() {
		super("此数字超出byte数据类型表示范围");
	}
	public static void foo(int num) {//异常两种处理方式  积极处理  消极处理
		if(num < - 128  && num > 127)
		{
			try {
				throw new Topic2();
			} catch (Topic2 e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		foo(129);

	}

}
