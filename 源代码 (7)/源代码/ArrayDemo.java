/*
	����:���ڴ洢ͬһ���������͵Ķ��Ԫ�ص�������
	
	�����ʽ��
		A:��������[] ������; 
		B:�������� ������[];
		
	������
		A:int[] a; ����һ��int���͵�����a����(�Ƽ�����)
		B:int a[]; ����һ��int���͵�a�������
		
		String[] s;
		char[] c;
		double[] d;
		boolean[] bl;
		long[] l;
		short[] sh;
		
	ע�⣺Ч��������Ϊ��һ���ģ����Ƕ���һ��int���飬���������ЩС�����Ƽ�ʹ�õ�һ�֡�
	
	������г�ʼ��
		A:��ν��ʼ����? ����Ϊ���鿪���ڴ�ռ䣬��Ϊÿ������Ԫ�ظ�ֵ
		B:�м��ַ�ʽ��?
			a:��̬��ʼ�� ָֻ�����ȣ���ϵͳ������ʼ��ֵ
			b:��̬��ʼ�� ������ʼ��ֵ����ϵͳ��������
			
	��̬��ʼ���ĸ�ʽ��
		��������[] ������ = new ��������[���鳤��];            //��ס��= �ұߵ�[]��һ����ֵ
		
		������
		int[] arr = new int[3];	
		
	��̬��ʼ���ĸ�ʽ
		��������[] ������ = new ��������[] {����1,����2,...}   //��ס��= �ұߵ�[]�ﲻ����ֵ
		����д
		��������[] ������ = {����1,����2,...}
		
		������
		int[] arr3 = new int[]{12, 23, 2, 67, 45, 3};//��̬��ʼ��
		int[] arr3 = {12, 23, 2, 67, 45, 3};//��̬��ʼ��
		
	��ȡ�����е�Ԫ��
		������[����]
		ע�⣺�����������0��ʼ����������� (����ĳ���-1)��
		
	�����������������С���⣺	
		ArrayIndexOutOfBoundsException:��������Խ���쳣��ԭ��������˲����ڵ�������
		NullPointerException:��ָ���쳣��ԭ�������Ѿ�����ָ����ڴ��ˡ����㻹��������ȥ����Ԫ�ء�
*/
class ArrayDemo {
	public static void main(String[] args) {
		//int[] a;
		//System.out.println(a);//���б���������ʹ��ǰ�����ʼ��
		
		
		//int b[] = new int[2];//��ʽһ�������飬���Ƽ�  ��̬��ʼ��
		int[] arr = new int[3];//��ʽ���������飬�Ƽ�!   ��̬��ʼ��
		System.out.println(arr);//��ӡ������ڴ��ַ
		System.out.println(arr[0]);//��ӡ�����һ��Ԫ��ֵ
		double[] ary = new double[2];
		System.out.println(ary);
		System.out.println(ary[0]);
		
		System.out.println("---------");
		
		/*
			�����ס��
				int, long���͵�����Ĭ�ϳ�ʼ��ֵΪ0
				float, double���͵�����Ĭ�ϳ�ʼ��ֵΪ0.0
				�࣬�ӿڣ����� �������������ͣ����ǵ�Ĭ�ϳ�ʼ��ֵ��Ϊnull
		*/
		
		
		
		int[] arr3 = new int[]{12, 23, 2};//��̬��ʼ��		
		//int[] arr4 = {12, 23, 2};//��̬��ʼ��,��д��(�Ƽ���)
		for(int i = 0; i < arr3.length; i++) {//forѭ����ӡ����Ԫ��ֵ
			System.out.println(arr3[i]);
		}
		
		System.out.println("---------");
		
		
		
		arr[0] = 10;//�޸�����ָ������������Ԫ��ֵ
		arr[2] = 21;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");//��ӡ����Ԫ�أ��Ӹ��ո�
		}
		
		System.out.println("\n---------");// \n��ʾ����
		
		int[] arr2 = arr;//��һ�����鸳ֵ����һ����
		System.out.println(arr);
		System.out.println(arr2);
		arr2[0] = 21;
		arr2[1] = 32;
		arr2[2] = 3;
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k]+" ");//����arr��arr2��������Ϊɶ��
		}
		
		System.out.println("\n---------");// \n��ʾ����
		
		//������ӡ
		System.out.print("[");
		for (int i = 0; i < arr3.length; i++) {
			if (i == arr3.length-1) {
				System.out.println(arr3[i]+"]");
			} else {
				System.out.print(arr3[i]+",");
			}
		}
		
		
		
		//int[] arr3 = new int[]{12, 23, 2};//��̬��ʼ��		
		
		//��������ӡ�����ʲô�����
		//System.out.println(arr3[2]);//����ᱨ�쳣!! Ϊɶ��
		
		
		//arr3 = null;//arr3��ֵΪnull
		//System.out.println(arr3);//��ӡ������ڴ��ַ
		//System.out.println(arr3[0]);//����ᱨ�쳣!! Ϊɶ��
		
	}
}
