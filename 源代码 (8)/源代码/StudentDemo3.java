/*
	��Ա�����;ֲ�����������?
		A:�����е�λ�ò�ͬ
			��Ա�����������з�����
			�ֲ��������ڷ��������л��߷���������(���������ϣ�ʵ���Ͼ��ǲ���)
		B:���ڴ��е�λ�ò�ͬ
			��Ա�������ڶ��ڴ�(��������ջ����ϰ��һֱ������)
			�ֲ���������ջ�ڴ�(��������ջ��Ŀ��ˣ�ͷ������������)
		C:�������ڲ�ͬ
			��Ա���������Ŷ���Ĵ��������ڣ����Ŷ������ʧ����ʧ
			�ֲ����������ŷ����ĵ��ö����ڣ����ŷ����ĵ�����϶���ʧ
		D:��ʼ��ֵ��ͬ
			��Ա��������Ĭ�ϳ�ʼ��ֵ
			�ֲ�������û��Ĭ�ϳ�ʼ��ֵ�����붨�岢��ֵ��Ȼ�����ʹ�á�
			
		ע�����
			����ֲ��������ƿ��Ժͳ�Ա��������ͬ���ڷ�����ʹ��ʱ������"�ͽ�ԭ��"��
			
			
	��������
		���壺����û�����ֵĶ���
	
		Ӧ�ó�����
			A:���÷���������ֻ����һ�ε�ʱ��
				ע�⣺���ö�ε�ʱ�򣬲��ʺϡ�
			B:�������������Ϊʵ�ʲ�������(�Ժ󽲽�)
		�ô���
			�������������Ͼ��������������������������������գ���Լ�ڴ档
*/
class Variable {
	int it;//Ĭ��ֵΪ0
	long lg;//Ĭ��ֵΪ0
	boolean bl;//Ĭ��ֵΪfalse
	char cr;//Ĭ��ֵΪ'\u0000'
	double de;//Ĭ��ֵΪ0.0
	float ft;//Ĭ��ֵΪ0.0
	String sg;//Ĭ��ֵΪnull
	int[] ary;//Ĭ��ֵΪnull
	String[] strAry;//Ĭ��ֵΪnull
	
	int num = 20;//�����Ա��������ʼ������������Ҳ���Գ�ʼ��
	
	public void show() {//��ӡ��Ա��Ĭ��ֵ
		System.out.println("intĬ��ֵΪ"+it);
		System.out.println("longĬ��ֵΪ"+lg);
		System.out.println("booleanĬ��ֵΪ"+bl);
		System.out.println("charĬ��ֵΪ"+cr);
		System.out.println("doubleĬ��ֵΪ"+de);
		System.out.println("floatĬ��ֵΪ"+ft);
		System.out.println("StringĬ��ֵΪ"+sg);
		System.out.println("int[]Ĭ��ֵΪ"+ary);
		System.out.println("String[]Ĭ��ֵΪ"+strAry);
	}
	
	
	public void hello() {
		//int num;//�ֲ�����������ʼʼ�ᱨ�����б���
		//������int���λ���long,boolean,char,double,float,String,int[],String[]����Ч����
		//��ᷢ�ֶ���������δ��ʼ���Ĵ�����һ�Կ���
		//System.out.println(num);
		
		
		int num = 900;
		System.out.println(num);
	}
	
}

class StudentDemo3 {
	public static void main(String[] args) {
		Variable ve = new Variable();
		ve.show();//��ӡ��Ա��Ĭ��ֵ
		
		
		ve.hello();//���ö���ķ���������ӡ�ֲ�������Ĭ��ֵ
		
		
		//���������ʹ��
		new Variable().show();//new Variable()��������������Ϊ��û�и�ֵ����ı���
	}
}