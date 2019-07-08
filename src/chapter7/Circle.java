package chapter7;

public class Circle extends Shape {
//	3.2.2  Circle表示圆类，增加1个属性，radius表示半径，
//	重写getPer、getArea和showAll三个方法，另外又增加
//	两个构造方法（为半径、颜色赋值的）。
//	3.3  在main方法中，声明创建每个子类的对象，
//	并调用2个子类的showAll方法。
	double radius;//半径
	
	public Circle() {
		super();
	}
	
	public Circle(double radius,String color) {
		super(color);
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
//		return Math.PI * radius * radius;
	}

	@Override
	public double getPer() {
		return 2 * Math.PI * radius;
	}

	@Override
	public void showAll() {
		System.out.println("该圆类的半径为：" + radius +
				"面积为：" + getArea() + "周长为：" +
				getPer() + "颜色为：" + super.getColor());
	}

}
