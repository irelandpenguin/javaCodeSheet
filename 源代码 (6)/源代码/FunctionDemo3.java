/*
	������ʵս��ϰ
	
	������ʽ��
		���η� ����ֵ���� ������(�������� ������1,�������� ������2...) {
			���������;
			return ����ֵ; 
		}
*/
import java.util.Scanner;
class FunctionDemo3 {
	
	
	public static void main(String[] args) {
		
		/*
		//����1����������һ����λ����������ʮλ����
		System.out.println("����һ������(100~999֮��):");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int result = shiwei(x);
		if (result != 0) {
			System.out.println(x+"��ʮλΪ"+result);
		}
		*/
		
		/*
		//����2����������2�����������ֵ��
		System.out.println("�����һ������");
		Scanner sc1 = new Scanner(System.in);
		int a = sc1.nextInt();
		System.out.println("����ڶ�������");
		int b = sc1.nextInt();
		int max = maxNum(a, b);
		System.out.println(a+", "+b+"���ֵΪ"+max);
		*/
		
		
		//����3����ӡ����ͼ����
		// *
		// **
		// ***
		// ****
		//tuan();
		
		
		//����4����ӡ�žų˷���
		//chengfabiao(1,3);
		//chengfabiao(1,6);
		//chengfabiao(1,9);
		
		
		
		//����5����������3�����������ֵ����Сֵ��
		System.out.println("�����һ������");
		Scanner sc1 = new Scanner(System.in);
		int a = sc1.nextInt();
		System.out.println("����ڶ�������");
		int b = sc1.nextInt();
		System.out.println("�������������");
		int c = sc1.nextInt();
		maxAndMinNum(a, b, c);
	
	}
	
	public static int shiwei(int num) {
		if (num >= 100 && num <= 999) {
			int m = num/10%10;//�õ�ʮλ��
			return m;
		} else {
			System.out.println("����������ֲ�����Ҫ��");
			return 0;
		}
	}
	
	public static int maxNum(int x, int y) {
		int max = x;
		if(max < y) {
			max = y;
		}
		return max;
	}
	
	public static void tuan() {
		for(int x= 0; x < 4; x++) {
			for(int y = 0; y <= x; y++) {
				System.out.print("*");//�����еĴ�ӡ
			}
			System.out.println();//����
		}
	}
	
	public static void chengfabiao(int a, int b) {
		for(int x= a; x <= b; x++) {
			for(int y = 1; y <= x; y++) {
				System.out.print(y+"*"+x+"="+y*x+"\t");//�����еĴ�ӡ
			}
			System.out.println();//����
		}
	}
	
	public static void maxAndMinNum(int x, int y, int z) {
		int max = x, min = x;
		//�������ֵ
		if (max < y) {
			max = y;
		}
		if (max < z) {
			max = z;
		}
		System.out.println(x+","+y+","+z+"�����ֵΪ"+max);
		
		//����Сֵ
		if (min > y) {
			min = y;
		}
		if (min > z) {
			min = z;
		}
		System.out.println(x+","+y+","+z+"����СֵΪ"+min);
	}
}
