/**
* ������Ҫ��װ����ĳ��÷��������������á�
* @author ����ʦ
* @version V1.2
*/
public class ArrayTool3 {//ʹ��public���ε�����ܱ�javadoc�����������
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