/**
* ������Ҫ��װ����ĳ��÷��������������á�
* @author Ǯ��ʦ
* @version V1.0
*/
public class ArrayTool {//ʹ��public���ε�����ܱ�javadoc�����������
	/**
	* ���ܣ�����һ��˽�еĹ��췽��������������Դ����������ʽ�����෽����
	* @param ����Ϊ��
	*/
	private ArrayTool() {}
	
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
	
	/**
	* ���ܣ���ȡ�����е����ֵ
	* @param arr һά����������
	* @return int �����������������Ԫ��
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
	* ���ܣ����ݸ�����valueֵ���ҳ����������е�һ�γ��ֵ�����λ�á�����Ҳ���������-1
	* @param arr �����ҵ�һά��������
	* @param value �����ҵ�Ԫ��
	* @return int ���ز���Ԫ���������е�����λ�ã��Ҳ���������-1
	*/
	public static int getIndex(int[] arr, int value) {
		int index = -1;//������ʼֵ
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				index = i;
				break;
			}
		}
		return index;
	}
}