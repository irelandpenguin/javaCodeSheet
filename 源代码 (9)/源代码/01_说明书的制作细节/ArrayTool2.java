/**
* ������Ҫ��װ����ĳ��÷��������������á�
* @author ����ʦ
* @version V1.1
*/
public class ArrayTool2 {//ʹ��public���ε�����ܱ�javadoc�����������	
	/**
	* ���ܣ���������Ԫ�ء�
	* @param arr һά����������
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
}