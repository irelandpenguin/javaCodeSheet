/*
	Ϊ���ó�������ݸ����Ͽ��������Ǿͼ����˼���¼�롣
	�ó�������һ�¡�
	
	��ô���������ʵ�ּ������ݵ�¼����?
		A:����
			��ʽ��
				import java.util.Scanner; 
			λ�ã�
				��class���档
		B:��������¼�����
			��ʽ��
				Scanner sc = new Scanner(System.in);
		C:ͨ�������ȡ����	
			��ʽ��
				int x = sc.nextInt();
*/
import java.util.Scanner;
class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//��������¼�����
		System.out.println("������һ������");
		int x = sc.nextInt();//��ȡ����¼�����������
		System.out.println("���������Ϊ��"+x);
	}
}