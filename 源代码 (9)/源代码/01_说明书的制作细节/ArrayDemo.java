/*
	��������������ԣ�
		��װ
		�̳�
		��̬
		
	���ȣ�ѧϰ��װ��ѧϰǰ��������ѧϰ�������˵����
	
	�������һ��˵������?
		A:дһ��������
		B:�����������ĵ�ע��
		C:�ù��߽����ĵ�ע��
			javadoc -d Ŀ¼ -author -version java�ļ�����
			
			Ŀ¼������һ���ļ��е�·�������ֻд�ļ���������ʾ�ڵ�ǰĿ¼������˵���顣
			�ļ����ƣ����Ǽ�������˵�����java�ļ������磺ArrayTool.java
			
			���磺(doc��ʾ�ļ�����)
			javadoc -d doc -author -version ArrayTool.java
			javadoc -d C:\Java�γ�\doc -author -version ArrayTool.java
			
			ע�⣺�����Ϊ���๤��������˵���飬ֱ��������油java�ļ������ɡ����£�
			javadoc -d doc -author -version ArrayTool.java ArrayTool2.java ArrayTool3.java
			
	���������ĵ�����
		�Ҳ��������ĵ����Ĺ������ܱ������ࣺ�����������Ȩ�޲���
		��Ҫ�����Ȩ�޸ĳ�public
*/
class ArrayDemo {
	public static void main(String[] args) {
		
	}
	
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
}