class ArrayTool {
	//������Զ����Ա����
	//...
	
	//���ǿ��ԼӸ�private���εĹ��췽���������ϵͳ�ġ�����������Ȩ�����⣬���Ͳ����ٴ�������Ķ����ˡ�
	private ArrayTool() {}
	
	//���������Ա������Ҳ���෽������Ϊʹ����static����
	
	public static void show(int[] arr) {//��������Ԫ��
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length-1) {
				System.out.print(arr[i]+"]");
			} else {
				System.out.print(arr[i]+", ");
			}
		}
	}
	
	public static int getMax(int[] arr) {//��ȡ�����е����ֵ
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int getIndex(int[] arr, int value) {//���ݸ�����valueֵ���ҳ����������е�һ�γ��ֵ�����λ�á�����Ҳ���������-1
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