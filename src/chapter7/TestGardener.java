package chapter7;

import java.util.Scanner;

public class TestGardener {

	public static void main(String[] args) {
		System.out.println("请输入水果的英文名称");
		Scanner scanner = new Scanner(System.in);
		String fruitName = scanner.nextLine();
		new Gardener().create(fruitName);
	}
}
