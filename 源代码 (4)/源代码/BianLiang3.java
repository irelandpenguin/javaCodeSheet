/*
	���͵�Ĭ��ת��
	
	+��һ�������,���ӷ�����ġ�
	
	һ����˵�������������ʱ��Ҫ�����������������ͱ���һ�¡�
	
	ע�⣺
		boolean���Ͳ���ת��Ϊ��������������

	Ĭ��ת��(��С�����ת��)
		A:byte,short,char ��> int ��> long ��> float ��> double
		B:byte,short,char�໥֮�䲻ת�������ǲ�����������ת��Ϊint����
*/
class BianLiang3 {
	public static void main(String[] args) {
		int a = 3, b = 4, c;
		c = a+b;//���û���� 
		System.out.println(c);
		
		byte m1 = 2;
		short m2 = 3;
		int m3 = m1+m2;//byte+short = int
		System.out.println("m3��ֵΪ"+m3);
		//m2 = m3+m1;//byte+int = short �����ˣ�����
		//System.out.println("m2��ֵΪ"+m2);
		
		
		byte d = 3;
		int e = 4;
		//byte f = d+e;//���������⣡byte + int = int ���ǲ�����Ĭ��ת���Ĺ���
		int f = d+e;//���û�������� byte + int = int ����Ĭ��ת���Ĺ���
		System.out.println(f);
		
		long g = d+e;//����Ҳû������ byte + int = long ����Ĭ��ת���Ĺ���
		System.out.println(g);
		
		float f1 = 3.4F, f2 = 2.2F;
		float f3 = f1 + f2;//����û���⣬float + float = float ����Ĭ��ת����
		System.out.println(f3);
		double f4 = f1+f2;
		System.out.println(f4);
		f1 = 3.0f;
		f2 = 2.0f;
		f3 = f1+f2;
		System.out.println(f3);
		f4 = f1+f2;
		System.out.println(f4);
		double ff1 = 3.4, ff2 = 2.2;
		double ff3 = ff1+ff2;
		System.out.println(ff3);
		
		
		double ff4 = 2.0;
		//f3 = f1 + f4;//���������⣡float + double = double ����Ĭ��ת���Ĺ���
		ff4 = f1 + f2;//����û���⣬float + float = double ����Ĭ��ת���Ĺ���
		System.out.println(ff4);

	}
}