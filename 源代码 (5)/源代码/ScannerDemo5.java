/*
	����¼����ϰ��
		(4).����¼���������ݣ��Ƚ������������Ƿ���ȡ�
*/
import java.util.Scanner;
class ScannerDemo5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
		int a = sc.nextInt();//��ȡ�������������
		System.out.println("��������һ������");
		int b = sc.nextInt();//��ȡ�������������
		
		boolean m = ((a == b) ? true: false);
		System.out.println("m="+m);
	}
}