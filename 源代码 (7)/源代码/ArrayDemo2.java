/*
	���������Ϊ�����Ĳ�����
	
	���磺
		public static void test(int[] arr) {
			
		}
*/
class ArrayDemo2 {
	public static void main(String[] args) {
		//����1: ��һ�����飬����������Ԫ�صĺ͡�
		int[] arr = {12, 32, 1, 100};//��̬��ʼ��
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum="+sum);
		
		//�����÷�����ʵ��
		int sum2 = sum(arr);
		System.out.println("sum2="+sum2);
		 
		
		//����2����һ�����飬����������Ԫ�ء�
		int[] arr2 = {123, 32, 456, 65, 12, 43};
		int maxValue = getMax(arr2);
		System.out.println("����������Ԫ��ֵΪ"+maxValue);
		
		
		//����3����һ�����飬�ҳ�������ָ��Ԫ�ض�Ӧ���������Ҳ�����ӡ -1 ��
		int[] arr3 = {23, 2, 56, 78, 21, 55, 90};
		int idx = searchNum(arr3, 21);
		System.out.println("21�������е�����Ϊ"+idx);
		idx = searchNum(arr3, 100);
		if (idx == -1) {
			System.out.println(idx+",������û�и�Ԫ��");
		}
		
	
		//����4����һ�����飬���������Ԫ��ǰ�󻥻�λ�á�
		//������һ�������һ�������ڶ����뵹���ڶ��������������뵹�����������ȡ�
		int[] arr4 = {12, 4, 36, 78, 6, 30};
		exchangeNum(arr4);//����ķ���û�з���ֵ�����ý��շ���ֵ
		for (int i = 0; i < arr4.length; i++) {
			System.out.print(arr4[i]+" ");
		}
		System.out.println();//����
		
	}
	
	public static int sum(int[] a) {
		int s = 0;
		for (int i = 0; i < a.length; i++) {
			s += a[i];
		}
		return s;
	}
	
	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int searchNum(int[] arr, int value) {
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public static void exchangeNum(int[] arr) {
		//int[] arr4 = {12, 4, 36, 78, 6, 30};
		//arr[0]  arr[5]
		//arr[1]  arr[4]
		//arr[2]  arr[3]
		//arr[i]  arr[5-i]  //�����5����д����arr.length-1
		//�Ľ���arr[i]   arr[arr.length-1-i]
		int len = arr.length;
		for (int i = 0; i < len/2; i++) {
			int tmp = arr[i];
			arr[i] = arr[len-1-i];
			arr[len-1-i] = tmp;
		}
	}
}