/*
	������С��Ϸ(������1-100֮��)
	
	������
		A:�������һ���������(���µ�)
		B:����¼�����ݡ�(��µ�)
		C:����µĺͱ��µĽ��бȽ�
			a:����
			b:С��
			c:������
		D:������βµĻ��ᣬ���оͽ�����
			while()ѭ�������о�break
*/
import java.util.Scanner;
class GuessNumber {
	public static void main(String[] args) {
		int randomNum = (int)(Math.random()*100+1);//�������һ������
		//System.out.println("�����������Ϊ"+randomNum);
		
		while (true) {
			System.out.println("��������Ҫ�µ���(1-100֮��):");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			if (num > randomNum) {
				System.out.println("�´���");
			} else  if (num < randomNum) {
				System.out.println("��С��");
			} else {
				System.out.println("��ϲ�㣬�����ˣ�");
				break;//����һ��Ҫ�У�Ϊɶ��
			}
		}
	}
}