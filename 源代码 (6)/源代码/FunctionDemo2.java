/*
	��������Ϊ�յķ�������

	������ʽ��
		���η� ����ֵ���� ������(�������� ������1,�������� ������2...) {
			���������;
			return ����ֵ; 
		}

	��������Ϊ�ձ�ʾ������ֵ�����ý��յġ�
*/
class FunctionDemo2 {
	public static void main(String[] args) {
		
		//����1���ҳ�1��100���ܱ�3����������
		//getNum(1, 100);
		
		//����2����ӡ1��100�е�ż�����������͡�
		int a = 1, b = 100;
		getNum2(a, b);
		
		//����3����100~999�У�ʮλ������6������
		getNum3(100, 999);
		
		//����4����ӡhello world
		hello();
	}
	
	
	public static void getNum(int a, int b) {
		for(int i = a; i <= b; i++) {
			if(i%3 == 0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();//����
	}
	
	public static void getNum2(int a, int b) {
		int sum1 = 0, sum2 = 0;
		for(int i = a; i <= b; i++) {
			if(i%2 == 0) {
				sum1 += i;
			} else {
				sum2 += i;
			}
		}
		System.out.println("ż����Ϊ"+sum1+",������Ϊ"+sum2);
	}
	
	public static void getNum3(int x, int y) {
		for(int n = x; n <= y; n++) {
			int num = n/10%10;//��ȡʮλ����
			if(num == 6) {
				System.out.print(n+"\t");// \t ��ʾ�������ĸ�
			}
		}
	}
	
	public static void hello() {
		System.out.println("hello world");
	}
}