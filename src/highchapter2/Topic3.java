package highchapter2;

import java.util.Collections;
import java.util.LinkedList;

public class Topic3 {
	
//	3、在一个列表中存储以下元素：apple,grape,banana,pear
//	3.1 返回集合中的最大的和最小的元素
//	3.2 将集合进行排序，并将排序后的结果打印在控制台上
	
	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
		list.add("apple");
		list.add("grape");
		list.add("banana");
		list.add("pear");
		
		System.out.println("最大元素为：" + Collections.max(list));
		System.out.println("最小元素为：" + Collections.min(list));
	}
}
