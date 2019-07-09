package chapter7;

public class TestCompany {
//	4.5  定义一个类Company，在该类中写一个方法，
//	调用该方法可以打印出某月某个员工的工资数额，
//	写一个测试类TestCompany,在main方法，
//	把若干各种类型的员工放在一个ColaEmployee 数组里，
//	并打印出数组中每个员工当月的工资。
	public static void main(String[] args) {
		ColaEmployee[] cel = {
				new SalariedEmployee("salariedEmployee", 6, 30000),
				new HourlyEmployee("hourlyEmployee", 5, 100, 300),
				new SalesEmployee("salesEmployee", 3, 7000000, 0.3)
				};
		for (int i = 0; i < cel.length; i++) {
			new Company().getSalary(cel[i],7);
		}
	}
}
