/*
	����¼����ϰ��
		(1).����¼���������ݣ�����������������ͣ����������
*/
import java.util.Scanner;
class ScannerDemo2 {
	public static void main(String[] args) {
		//(1).����¼���������ݣ�����������������ͣ����������
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
		int a = sc.nextInt();
		System.out.println("��������һ������");
		int b = sc.nextInt();
		
		int sum = a + b;
		System.out.println("sum="+sum);
	}
}
