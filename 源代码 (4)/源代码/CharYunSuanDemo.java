/*
	�ַ���������
		�����ϵ�ÿһ���ַ�����Ӧһ��Ψһ�����֣����ǳ�֮ΪASCII�롣
		ASCII������Ψһ��ʶһ���ַ�����
		
	ASCII���
		ͨ���������ű��Ժ�����Ҫ��ס����ֵ��
			'a'		97
			'A'		65
			'0'		48
			
	�ַ�Ҳ�ܲ�������
*/
class CharYunSuanDemo {
	public static void main(String[] args) {
		System.out.println('a'); //��ӡa
		System.out.println('a'+1);//��ӡ98
		
		int m = 'A'+2;
		System.out.println(m);//67
		
		int n = '0'+1;
		System.out.println(n);//49
		
		int n2 = 0+1;
		System.out.println(n2);//1
	}
}