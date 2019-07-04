package chapter6;

public class Rectangle {

//	2、定义一个矩形类Rectangle：（知识点：对象的创建和使用）[必做题]
//	2.1  定义三个方法：getArea()求面积、getPer()求周长，showAll()分别在控制台输出长、宽、面积、周长。
//	2.2  有2个属性：长length、宽width
//	2.3  通过构造方法Rectangle(int width, int length)，分别给两个属性赋值
//	2.4  创建一个Rectangle对象，并输出相关信息 toString 

	private int length;//长
	private int width;//宽
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
//	2.1  定义三个方法：getArea()求面积、getPer()求周长，showAll()分别在控制台输出长、宽、面积、周长。
	public long getArea() {//求面积
		return length * width;
	}

	public long getPer() {//求周长
		return 2 * (length + width);
	}
	
	public void showAll() {
		System.out.println("长：" + length + "  宽：" + width + " 面积：" + getArea() + " 周长：" + getPer());
	}
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle(10, 20);
		r.showAll();
	}
}
