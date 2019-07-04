package chapter6;

public class Person6 {
//	6、定义两个类，描述如下： [必做题]
//	6.1定义一个人类Person：
//	6.1.1定义一个方法sayHello()，可以向对方发出问候语“hello,my name is XXX”
//	6.1.2有三个属性：名字、身高、体重
//	6.1.3通过构造方法，分别给三个属性赋值
//	6.2定义一个Constructor类：
//	6.2.1创建两个对象，分别是zhangsan，33岁，1.73；
	//lishi，44，1.74
//	6.2.2分别调用对象的sayHello()方法。
	
	private String name;//名字
	private Double height;//身高
	private Double weight;//体重
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public Person6(String name, Double height, Double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	public Person6() {
		super();
	}
	@Override
	public String toString() {
		return "Person6 [name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}
	public void sayHello() {
		System.out.println("hello,my name is " +name);
	}
	

}
