/*
	����¼����ϰ��
		(3).����¼���������ݣ���ȡ�����������е����ֵ��
*/
import java.util.Scanner;
class ScannerDemo4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
		int a = sc.nextInt();//��ȡ�������������
		System.out.println("��������һ������");
		int b = sc.nextInt();//��ȡ�������������
		System.out.println("���������������");
		int c = sc.nextInt();//��ȡ�������������
		
		int max = ((a>b)    ?   ((a>c) ? a : c)   :   ((b>c) ? b : c));
		System.out.println("max="+max);
	}
}