/*
	�Ƚ��������
		==,!=,>,>=,<,<=
		
	�ص㣺
		������Ĳ����Ǽ򵥻��Ǹ��ӣ������boolean���͡�
		
	ע�����
		"=="����д��"="��
*/
class OperatorDemo {
	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		int z = 3;
	
		System.out.println(x == y);//false
		System.out.println(x == z);//true
		System.out.println((x+y) == (x+z));//false
		System.out.println("------------");
		
		System.out.println(x != y);//true
		System.out.println(x > y);//false
		System.out.println(x >= y);//false
		System.out.println(x < y);//true
		System.out.println(x <= y);//true
		System.out.println("------------");
		
		int a = 10;
		int b = 20;
		
		//boolean flag = (a == b);//flag = false;
		//System.out.println(flag);
		
		//boolean flag = (a = b); //�����������ģ������ݵ�����
		//System.out.println(flag);
		
		int c = (a = b); //��b��ֵ��a��Ȼ���a������
		System.out.println(c);
		
	}
}