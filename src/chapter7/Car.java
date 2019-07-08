package chapter7;

public class Car extends Vehicle {
//	2.2 定义一个Vehicle类的子类轿车类Car，要求如下：
//	2.2.1 轿车有自己的属性载人数loader（int 类型）。
//	2.2.2 提供该类初始化属性的构造方法。
//	2.2.3 重新定义run()，用打印语句描述轿车奔跑的功能。
//	2.2.4 在main方法中创建一个品牌为“Honda”、颜色为“red”，载人数为2人的轿车。
	
	private int loader;//载人数

	public Car() {
		super();
	}

	public Car(String brand,String color,int loader) {
		super(brand,color);
		this.loader = loader;
	}

	public int getLoader() {
		return loader;
	}

	public void setLoader(int loader) {
		this.loader = loader;
	}

	@Override
	public String toString() {
		return "Vehicle [brand=" + super.getBrand() + ", color=" + super.getColor() + ", "
				+ "speed=" + super.getSpeed() + ",loader="+ loader + "]";
	}
	
	public void run() {
		System.out.println(super.getBrand()+"牌子"+super.getColor()+
				",跑车可能载人："+loader+"人,"+"初始速度"+super.getSpeed()+"km/h");
	}
	
	public static void main(String[] args) {
		Vehicle vehicle = new Car("Honda", "red", 2);
		System.out.println(vehicle.toString());
		vehicle.run();
	}
}
