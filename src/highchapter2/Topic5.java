package highchapter2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Topic5 {
	
//	5、从控制台输入若干个单词（输入回车结束）放入集合中
//	，将这些单词排序后（忽略大小写）打印出来。
	
	public static void main(String[] args) {

		System.out.println("请输入若干个单词，以空格分开，以回车结束");
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		//第一种：
		List<String> list = new ArrayList<>();
		for (int i = 0; i < str.length; i++) {
			list.add(str[i]);
		}
		Collections.sort(list);
		System.out.println("ArrayList: " + list.toString());
		//第二种：
		Set<String> s = new TreeSet<String>();
		for (int i = 0; i < str.length; i++) {
			s.add(str[i]);
		}
		System.out.println("TreeSet: " + s.toString());
	}
}
