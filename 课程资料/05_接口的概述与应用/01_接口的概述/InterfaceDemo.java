/*
	�ӿڵ��ص㣺
		A:�ӿ��ùؼ���interface��ʾ	
			interface �ӿ��� {}
		B:��ʵ�ֽӿ���implements��ʾ
			class ���� implements �ӿ��� {}
		C:�ӿڲ���ʵ����
			��ô���ӿ����ʵ������?
				ʹ�ýӿڵľ���ʵ������ʵ������
		D:�ӿڵ�ʵ����
			a:�����ǳ����ࡣ�������岻��
			b:�����Ǿ����ࡣҪ��д�ӿ��е����г��󷽷���(�Ƽ�����)
	
	�ɴ˿ɼ���
		A:�������̬(����û��)
		B:�������̬(����)
		C:�ӿڶ�̬(���)
*/
interface Person {
	public abstract void playFootBall();
}

//abstract class Footballer implements Person {}
class Footballer implements Person {
	public void playFootBall() {
		System.out.println("������");
	}
}

class Basketballer implements Person {
	public void playFootBall() {
		System.out.println("������");
	}
}

class InterfaceDemo {
	public static void main(String[] args) {
		//Person p = new Person();//�����ӿڲ���ʵ��������
		Person p = new Footballer();
		p.playFootBall();//������������  ��̬������ó�Ա���� ȥ��⡣�������뿴��ߣ����п��ұ�
		
		p = new Basketballer();
		p.playFootBall();
	}
}