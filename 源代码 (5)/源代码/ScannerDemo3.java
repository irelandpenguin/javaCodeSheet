/*
	����¼����ϰ��
		(2).����¼���������ݣ���ȡ�����������е����ֵ��
*/
import java.util.Scanner;
class ScannerDemo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
		int a = sc.nextInt();//��ȡ�������������
		System.out.println("��������һ������");
		int b = sc.nextInt();//��ȡ�������������
		
		int max = ((a > b) ? a : b);
		System.out.println("max="+max);
	}
}