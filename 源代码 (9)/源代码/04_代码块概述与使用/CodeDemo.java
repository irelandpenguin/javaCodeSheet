/*
	����飺��Java�У�ʹ��{}�������Ĵ��뱻��Ϊ����顣
	
	������λ�ú������Ĳ�ͬ�����Է�Ϊ
		�ֲ������:�ֲ�λ��(��������),�����޶��������������ڡ�
		
		��������:�����еĳ�Աλ��,��{}�������Ĵ��롣ÿ�ε��ù��췽��ǰ��������ִ�й������顣
			���ã����԰Ѷ�����췽���еĹ�ͬ����ŵ����������У��ﵽ�򻯹��췽����Ŀ�ġ�
			
		��̬�����:�����еĳ�Աλ��,��{}�������Ĵ���,ֻ��������static�����ˡ�
			���ã�һ���Ƕ�����г�ʼ����
			�ص㣺1��ֻ��һ��; 2�������ڹ�������ִ�С�
			
	������?
		��̬�����,��������,���췽����ִ��˳��?
		ִ��˳��: ��̬����� -- �������� -- ���췽��
		��̬����飺ִֻ��һ��
		�������飺ÿ�ε��ù��췽����ִ��
*/
class Code {
	private int num;
	private int num2;
	
	private int num3;
	private int num4;
	
	private static String country;
	
	//��������(���ã���ͨ�õĴ��뼯�з���һ�𣬼򻯹��췽����)
	{
		System.out.println("���ǹ�������");
		
		num3 = 100;
		num4 = 200;
	}
	
	
	//��̬����飨���ã����ڳ�ʼ����ģ�
	static {
		System.out.println("���Ǿ�̬����飬ֻ��һ��Ӵ");
		country = "�й�";
		hello();
	}
	
	
	public Code() {
		System.out.println("���ǹ��췽��Code()");		
		
		//num3 = 100;
		//num4 = 200;
	}
	
	public Code(int a, int b) {
		System.out.println("���ǹ��췽��Code(int a, int b)");
		num = a;
		num2 = b;
		
		//num3 = 100;
		//num4 = 200;
	}
	
	public static void hello() {
		System.out.println("����ã��й���");
	}
}

class CodeDemo {
	public static void main(String[] args) {
		//�ֲ������(���ã������޶������������ڵĻ���˵�������)
		{
			int num = 100;
			System.out.println("num="+num);
		}
		//System.out.println("num="+num);//���б�����Ϊnum�����������ھֲ������������ֲ�����飬num�ڴ��ַ��ϵͳ�����ˡ�
		
		System.out.println("---------");//���������ָ���
		
		//����2������
		Code cd1 = new Code();
		Code cd2 = new Code(100, 200);
	}
}