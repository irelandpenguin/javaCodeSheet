/*
	�������أ�
		��ͬһ�����У���������ͬ�������б�ͬ��
		
		�����б�ͬ��
			A:����������ͬ
			B:�������Ͳ�ͬ
			
		ע�⣺���������뷵��ֵ�����޹ء�
		
		
	������֮ǰ������ͬһ�����У������������ظ�������������ʧ�ܣ�
		���ǣ�����һ��ǰ�᣺�������������Ĳ����������ķ�������ȫ��һ��ʱ���Żᷢ���ظ�������Żᱨ��
*/
class FunctionDemo4 {
	public static void main(String[] args) {
		int s = 0;
		s = sum(10, 5);
		System.out.println(s);//15
		s = sum(10, 5, 5);
		System.out.println(s);//20
		

		
		float m = sum(12.3F, 1.2F);
		System.out.println(m);
		
		
		long x = sum(100L, 200L);
		System.out.println(x);
		
	}
	
	public static int sum(int a, int b) {
		System.out.println("����������int�Ͳ�����sum����");
		return (a+b);
	}
	
	public static int sum(int a, int b, int c) {
		System.out.println("����������int�Ͳ�����sum����");
		return (a+b+c);
	}
	

	public static float sum(float a, float b) {
		System.out.println("����������float�Ͳ�����sum����");
		return (a+b);
	}
	
	public static long sum(long a, long b) {
		System.out.println("����������long�Ͳ�����sum����");
		return (a+b);
	}
}