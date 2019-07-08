package chapter7;

public class Rectangle extends Shape {

//	3.2 设计 2个子类：
//	3.2.1  Rectangle表示矩形类，增加两个属性，Width表示长度、
//	height表示宽度，重写getPer、getArea和showAll三个方法，
//	另外又增加一个构造方法（一个是默认的、一个是为高度、宽度、颜色赋值的）。
//	3.2.2  Circle表示圆类，增加1个属性，radius表示半径，
//	重写getPer、getArea和showAll三个方法，另外又增加两个构造方法（为半径、颜色赋值的）。
//	3.3  在main方法中，声明创建每个子类的对象，并调用2个子类的showAll方法。
	
	double width;//长度
	double height;//宽度

	public Rectangle() {
		super();
	}

	public Rectangle(double width, double height,String color) {
		super(color);
		this.width = width;
		this.height = height;
	}
	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getPer() {
		return 2 * (width + height);
	}

	@Override
	public void showAll() {
		System.out.println("该矩形的长为：" +width+"宽为 ：" +height +
				"面积为：" + getArea() + "周长为：" + getPer()+"颜色为："+super.getColor());
	}

}
