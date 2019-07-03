package chapter5;

public class Task {
	/*
	 * 1. 编写一个方法，求整数n的阶乘，例如5的阶乘是1*2*3*4*5。
	 * 
	 */
	public static void factorial(int n) {
		if(n > 1) {
			int num = 1;
			for(int i = 1;i < n + 1;i++) {
				num *= i;
			}
			System.out.println("数字  " + n +"的阶乘是： "+num);
		}else {
			System.out.println("请输入一个大于1的数字");
		}
	}
	
	/*
	 * 2. 编写一个方法，判断该年份是平年还是闰年。
	 * 
	 */
	public static void isLeapYear(int year) {
	    if((((year % 100) != 0) && (year % 4 == 0)) ||
                ((year % 100 == 0) && (year % 400 == 0))) {
            System.out.println(year + "年是闰年");
        }else {
            System.out.println(year + "年不是闰年");
        }
	}
	
	/*
	 * 3. 编写一个方法，输出大于200的最小的质数。
      *https://blog.csdn.net/afei__/article/details/80638460
      *  概念：
      *      质数又称素数。一个大于1的自然数，除了1和它自身外，
      *      不能被其他自然数整除的数叫做质数；否则称为合数。
     *   0和1既不是质数也不是合数，最小的质数是2
	 */
	public static void primeNumber() {//大于200的最小的质数是： 211
	    for (int i = 200;; i++) {
            boolean temp = true;//定义一个初始变量
            for (int j = 2; j < i; j++) {
                if(i%j == 0) {//能够被整除是合数，则跳过此数
                    System.out.println(i + " 是合数能够被数值  "+j + "  整除");
                    temp = false;
                    continue;
                }
            }
            if(temp) {
                System.out.println("大于200的最小的质数是： "+i);
                break;
            }
        }
	}
	
	/*
	 * 4. 写一个方法，功能：定义一个一维的int 数组，长度任意,
	 * 然后将它们按从小到大的顺序输出（使用冒泡排序）
	 * （知识点：方法的定义和访问）。
	 * 
	 */
	public static void bubbleSort(int[] arr) {
		for(int i = 0;i < arr.length -1;i++) {
			for(int j = 0;j < arr.length - 1 -i;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j +1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(java.util.Arrays.toString(arr));
	}
	public static void main(String[] args) {
//		factorial(6);//1
//		isLeapYear(0);//2
//		primeNumber();//3
//		int[] arr = {5,7,9,2};//4
//		bubbleSort(arr);//4
	}
}
