package chapter7;

public class ColaEmployee {

//	4.1  ColaEmployee ：这是所有员工总的父类，
//	属性：员工的姓名,员工的生日月份。
//	方法：getSalary(int month) 根据参数月份来确定工资，
//	如果该月员工过生日，则公司会额外奖励100 元。
	
	String name;//员工姓名
	int month;//员工生日
	
	public ColaEmployee(String name, int month) {
		super();
		this.name = name;
		this.month = month;
	}

	public double getSalary(int month) {
		return 0;
	}
}
