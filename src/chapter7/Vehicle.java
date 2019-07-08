package chapter7;

public class Vehicle {

//	2、设计2个类，要求如下：（知识点：类的继承 方法的覆盖） [必做题]
//	2.1  定义一个汽车类Vehicle，
//	2.1.1 属性包括：汽车品牌brand（String类型）、颜色color（String类型）和速度speed（double类型）。
//	2.1.2 至少提供一个有参的构造方法（要求品牌和颜色可以初始化为任意值，但速度的初始值必须为0）。
//	2.1.3 为属性提供访问器方法。注意：汽车品牌一旦初始化之后不能修改。
//	2.1.4 定义一个一般方法run()，用打印语句描述汽车奔跑的功能
//	2.1.5 在main方法中创建一个品牌为“benz”、颜色为“black”的汽车。
	
	private String brand;//汽车品牌
	private String color;//颜色
	private double speed;//速度
	
	public Vehicle() {
		super();
	}

	public Vehicle(String brand, String color) {
		super();
		this.brand = brand;
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", color=" + color + ", speed=" + speed + "]";
	}
	
	public void run() {
		System.out.println(brand+"牌子"+color+",跑车"+",初始速度"+speed+"km/h");
	}
	
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle("benz", "black");
		System.out.println(vehicle.toString());//不写toString也行，因为会默认调用toString方法
		vehicle.run();
	}
	
	
}
