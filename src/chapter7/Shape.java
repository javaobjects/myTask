package chapter7;

public abstract class Shape {
//	3、设计三个类，分别如下：（知识点：抽象类及抽象方法） [必做题]
//	3.1 设计Shape表示图形类，有面积属性area、周长属性per，
//	颜色属性color，有两个构造方法（一个是默认的、一个是为颜色赋值的），
//	还有3个抽象方法，分别是：getArea计算面积、getPer计算周长、
//	showAll输出所有信息，还有一个求颜色的方法getColor。
//	3.2 设计 2个子类：
//	3.2.1  Rectangle表示矩形类，增加两个属性，Width表示长度、
//	height表示宽度，重写getPer、getArea和showAll三个方法，
//	另外又增加一个构造方法（一个是默认的、一个是为高度、宽度、颜色赋值的）。
	
	double area;//面积
	double per;//周长
	String color;//颜色
	public Shape() {
		super();
	}
	public Shape(String color) {
		super();
		this.color = color;
	}
	
	public abstract double getArea();//计算面积  抽象方法必须是抽象类
	public abstract double getPer();//计算周长
	public abstract void showAll();//输出所有信息
	public String getColor() {
		return color;
	}
	
}
