/*
	�������ͣ�Java��һ��ǿ���͵����ԣ����ÿһ�����ݶ���������ȷ���������͡�
	
	�������ͷ��ࣺ
		A:������������
		B:������������(��,�ӿ�,��ֵ)
		
	������������:4��8��
		A:����			ռ���ֽ���
			byte			1
			short			2
			int				4
			long			8
			
		B:������
			float 			4
			double 			8
			
		C:�ַ�
			char			2
		D:����
			boolean			1
		
		ע�⣺
			����Ĭ����int����
			������Ĭ����double���͡�
			
			�����ͺ�׺��L����l��ǡ�����ʹ��L��
			�����ȸ�������F����f��ǡ�����ʹ��F��
*/
class BiaoLiang {
	public static void main(String[] args){
		//��������ĸ�ʽ
		//�������� ������ = ��ʼ��ֵ;
		
		//byte
		byte b = 8;
		System.out.println(b);
		
		//short
		short s = 100;
		System.out.println(s);
		
		//int
		int i = 23;
		System.out.println(i);
		//int x = 1000000000000;
		//System.out.println(x);
		
		//long
		long x = 1000000000000L;
		System.out.println(x);
		//long y = 100L;
		//System.out.println(y);
		
		
		//float
		float f = 3.14F;
		System.out.println(f);
		
		//double
		double d = 34.12;
		System.out.println(d);
		
		//char
		char ch = 'a';
		System.out.println(ch);
		
		//boolean
		boolean flag = true;
		System.out.println(flag);
		
	}
}