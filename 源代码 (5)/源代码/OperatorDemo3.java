/*
	��Ŀ�������
		��ʽ���Ƚϱ��ʽ?���ʽ1:���ʽ2;
		
		�Ƚϱ��ʽ:�����һ��boolean���͡�
		
		ִ�����̣�
			���ݱȽϱ��ʽ�ļ��㷵��һ��true����false��
			�����true���Ͱѱ��ʽ1��Ϊ�����
			�����false���Ͱѱ��ʽ2��Ϊ�����
*/
class OperatorDemo {
	public static void main(String[] args) {
		int x = 100;
		int y = 200;
		
		//int z = x > y ? x : y;
		int z = ((x > y) ? x : y);//���õ�д��
		System.out.println("z="+z);
		
		
		//z = ((x*2 > y-10) ? (x-y) : (x+y));
		//System.out.println("z="+z);//z=-100
		
		//z = ((x=y) ? x : y);//�����ˡ�Ϊɶ����Ϊ �� ǰҪ����һ��boolean����
		//System.out.println("z="+z);
		
		
		//��������ϰ�⣬��һ��
		//��ϰ1�����������е����ֵ��
		int a = 12, b = 6;
		int max = ((a > b) ? a : b);
		System.out.println("max="+max);//max=12
		
		
		//��ϰ2�����������е����ֵ��
		int m = 2, n = 23, p = 1;
		int tmp = ((m>n) ? m : n);//tmp=23
		max = ((tmp > p) ? tmp : p); //�����max�����������ģ���Ϊ�ڱ������������ڣ�ͬһ�������ɶ��ʹ��
		System.out.println("max="+max);//max=23
		
		
		//Ҳ����һ���㶨,����������ôд����
		//max = ((m > n)     ?    ((m > p) ? m : p)     :     ((n > p) ? n : p));//����Ƕ��ʹ�õ���Ŀ�����
		//System.out.println("max="+max);//max=23
		
		
		//����������д��̫���������!
		//max = m > n ? m > p ? m : p : n > p ? n : p;
		//System.out.println("max="+max);
		
		
		//��ϰ3���ж�2�����Ƿ���ȡ�
		boolean c1 = ((a == b) ? true : false);
		System.out.println("c1="+c1);//c1=false
		
		//��Ϊ��boolean���͵ı��������ԣ�Ҳ��������д
		boolean c2 = (a == b);
		System.out.println("c2="+c2);//c2=false
		
	}
}