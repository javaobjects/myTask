package chapter4;

public class Task {
	/*
	 * 1. 编写一个简单程序，要求数组长度为5
	 * ，分别赋值10，20，30，40，50，在控制台输出该数组的值。
	 * （知识点：数组定义和创建、一维数组初始化）
	 * 
	 */
	public static void crearArray() {
		int[] myList = new int[5];
		for(int i = 0;i < 5;i++) {
			myList[i] = (i + 1) * 10;
		}
		System.out.println(java.util.Arrays.toString(myList));
	}
	
	/*
	 * 2. 将一个字符数组的值（neusofteducation）
	 * 拷贝到另一个字符数组中。（知识点：数组复制）
	 */
	public static void copyArray()
	{
		int[] neusofteducation = new int[]{6,9,2,0,1};
		int[] copyedneusofteducation = new int[5];
		System.arraycopy(neusofteducation,0,copyedneusofteducation,0,5);
		System.out.println("neusofteducation: " + java.util.Arrays.toString(neusofteducation));
		System.out.println("copyedneusofteducation: " + java.util.Arrays.toString(copyedneusofteducation));
	}
	
	/*
	 * 3. 给定一个有9个整数（1,6,2,3,9,4,5,7,8）的数组，先排序，
	 * 然后输出排序后的数组的值。（知识点：Arrays.sort排序、冒泡排序）
	 */
	public static void sortArray()
	{
		int[] myList = new int[] {1,6,2,3,9,4,5,7,8};
		java.util.Arrays.sort(myList);
		System.out.println(java.util.Arrays.toString(myList));
	}
	public static void bubbleSortArray()
	{
		int[] myList = new int[] {1,6,2,3,9,4,5,7,8};
		for(int i = 0;i < myList.length -1; i++) {
			for(int j = 0;j < myList.length - 1 -i;j++) {
				if(myList[j] > myList[j + 1]) {
					int temp = myList[j];
					myList[j] = myList[j +1];
					myList[j + 1] = temp;
				}
			}
		}
		System.out.println(java.util.Arrays.toString(myList));
	}
	
	/*
	 * 4. 有2个多维数组分别是 2 3 4 和 
	 * 1 5 2 8 4 6 8 5 9 10 -3 2 7 -5 -18
	 * 按照如下方式进行运算。生成一个2行4列的数组。
	 * 此数组的第1行1列是2*1+3*5+4*2第1行2列是2*5+3*9+4*7
	 * 第2行1列是4*1+6*5+8*2 依次类推。
	 * （知识点：多维数组定义和创建、数组遍历、数组元素访问）
	 */
	
	/*
	 * 5. 输出一个double型二维数组（长度分别为5、4，值自己设定）的值。
	 * （知识点：数组定义和创建、多维数组初始化、数组遍历）
	 */
	public static void creatTwoDimensionalArray()
	{
		double myList[][] = new double[5][4];
		//为这个二维数组赋值
		for(int i = 0 ;i < 5;i++) {
			for(int j = 0;j < 4;j++)
			{
				myList[i][j] = Integer.parseInt(i + "" +j);
				System.out.print(myList[i][j] +" ");
			}
			System.out.println();
		}
		//二维或多维数组是不能像一维数组一样通过toString给打印输出的。。
		System.out.println(java.util.Arrays.toString(myList));
	}
	
	/*
	 * 6. 在一个有8个整数（18，25，7，36，13，2，89，63）
	 * 的数组中找出其中最大的数及其下标。
	 * （知识点：数组遍历、数组元素访问）
	 */
	public static void maxNumAndIndex() {
		int[] myList = new int[] {18,25,7,36,13,2,89,63};
		int maxNum = 0,
			maxNumIndex = 0;
		for(int i = 0;i < myList.length;i++) {
			if(maxNum < myList[i]) {
				maxNum = myList[i];
				maxNumIndex = i;
			}
		}
		System.out.println("数组中最大数是："+maxNum + " 其在数组中的下标是：" + maxNumIndex);
	}
	/*
	 * 7. 将一个数组中的元素逆序存放（知识点：数组遍历、数组元素访问）
	 */
	public static void outPutEleByDesc() {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int myList[] = new int[20];
		System.out.println("请输入多个正整数并以空格隔开(输入-1表示结束)");
		int index = 0;
		do {
			myList[index] = scanner.nextInt();
			index++;
		}while(myList[index - 1] != -1);
		System.out.println("你输入的数组为：");
		for(int i = 0;i < index -1;i++) {
			System.out.print(myList[i] +" ");
		}
		System.out.println();
		System.out.println("你输入的数组逆序输出为：");
		for(int i = index - 2;i >= 0;i--) {
			System.out.print(myList[i] + " ");
		}
		
		
	}
	/*
	 * 8. 将一个数组中的重复元素保留一个其他的清零。
	 * （知识点：数组遍历、数组元素访问）
	 * 此题的限定条件是该数组中不能有元素为0的元素。。这是前提条件
	 */
	public static void toRpeatEle() {
		int[] myList = new int[] {18,25,7,18,36,13,2,89,63};
		for(int i = 0;i < myList.length -1; i++) {
			for(int j = i + 1;j < myList.length;j++) {
				System.out.println(myList[i] + "   " + myList[j]);
				if(myList[i] == myList[j]) {
					myList[i] = 0;
				}
			}
		}
		System.out.println(java.util.Arrays.toString(myList));
	}
	
	public static void main(String[] args) {
//		crearArray();//1
//		copyArray();//2
//		sortArray();//3
//		bubbleSortArray();//3
//		creatTwoDimensionalArray();//5
//		maxNumAndIndex();//6
//		outPutEleByDesc();//7
//		toRpeatEle();//8
	}
}
