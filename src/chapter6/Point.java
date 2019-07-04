package chapter6;

public class Point {
	
//	1、定义一个点类Point，
//	包含2个成员变量x、y分别表示x和y坐标，
//	2个构造器Point()和Point(int x0,y0),以及一个movePoint（int dx,int dy）
//	方法实现点的位置移动，创建两个Point对象p1、p2，
//	分别调用movePoint方法后，打印p1和p2的坐标。
	
	private int x;//x坐标
	private int y;//y坐标
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public Point() {//空的构造方法
		
	}
	
	public Point(int x0,int y0) {//有参构造方法
		this.x = x0;
		this.y = y0;
	}
	
	
	public void movePoint(int dx,int dy) {//移动点的方法
		this.x = dx;
		this.y = dy;
	}
	
	
	public static void main(String[] args) {//测试类
		Point p1 = new Point();
		p1.movePoint(10, 20);
		System.out.println(p1.toString());
		
		Point p2 = new Point();
		p2.movePoint(20, 30);
		System.out.println(p2.toString());
	}
}
