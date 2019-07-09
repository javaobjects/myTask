package chapter7;

public class Company {
//	4.5  定义一个类Company，在该类中写一个方法，
//	调用该方法可以打印出某月某个员工的工资数额，
//	写一个测试类TestCompany,在main方法，
//	把若干各种类型的员工放在一个ColaEmployee 数组里，
//	并打印出数组中每个员工当月的工资。
	public void getSalary(ColaEmployee c,int month) {
		System.out.println(c.name + "  在  " + month + "  的月薪为  " + c.getSalary(month));
	}
}
