/**
* 此类主要封装数组的常用方法，方便外界调用。
* @author 钱老师
* @version V1.0
*/
public class ArrayTool {//使用public修饰的类才能被javadoc工具命令解析
	/**
	* 功能：声明一个私有的构造方法，不允许外界以创建对象的形式调用类方法。
	* @param 参数为空
	*/
	private ArrayTool() {}
	
	/**
	* 功能：遍历数组元素。
	* @param arr 一维的整型数组
	*/
	public static void show(int[] arr) {
	System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length-1) {
				System.out.print(arr[i]+"]");
			} else {
				System.out.print(arr[i]+", ");
			}
		}
	}
	
	/**
	* 功能：获取数组中的最大值
	* @param arr 一维的整型数组
	* @return int 方法返回数组中最大元素
	*/
	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	/**
	* 功能：根据给定的value值，找出它在数组中第一次出现的索引位置。如果找不到，返回-1
	* @param arr 被查找的一维整型数组
	* @param value 被查找的元素
	* @return int 返回查找元素在数组中的索引位置，找不到，返回-1
	*/
	public static int getIndex(int[] arr, int value) {
		int index = -1;//给个初始值
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				index = i;
				break;
			}
		}
		return index;
	}
}