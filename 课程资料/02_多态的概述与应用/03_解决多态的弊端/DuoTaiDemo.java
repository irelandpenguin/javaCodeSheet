/*
	��̬�ı׶ˣ�
		����ʹ����������й��ܡ�
		
	�Ҿ���ʹ����������й���?�в���?
		�С�
		
	��ô����?
		A:�������������÷������ɡ�(���ԣ����Ǻܶ�ʱ�򲻺������ң�̫ռ�ڴ���)
		B:�Ѹ��������ǿ��ת��Ϊ��������á�(����ת��)
		
	������ת�����⣺
		����ת�ͣ�
			Fu f = new Zi();
		����ת�ͣ�
			Zi z = (Zi)f; //Ҫ���f�������ܹ�ת��ΪZi�ġ�
*/
class Fu {
	//������Ա����...
	
	//�������췽��...
	
	public void eat() {
		System.out.println("�Է�");
	}
	
	public void sleep() {
		System.out.println("˯��");
	}
}

class Zi extends Fu {
	//������Ա����...
	
	//�������췽��...
	
	public void eat() {
		System.out.println("��ţ�������");
	}
	
	public void sleep() {
		System.out.println("ſ��˯��");
	}
	
	public void play() {
		System.out.println("����Ϸ");
	}
}

class DuoTaiDemo {
	public static void main(String[] args) {
		//���������
		Zi z = new Zi();
		z.eat();
		z.sleep();
		z.play();
		
		System.out.println("----------");
		
		//��̬ʹ��
		Fu f = new Zi();
		f.eat();
		f.sleep();
		//f.play();//������Ϊ��̬�г�Ա�������뿴��ߣ����п��ұߡ�����̬��Fu��û��play()������
		
		System.out.println("----------");
		
		//ʹ������ת�У��������׶�
		Zi zz = (Zi)f;
		zz.eat();
		zz.sleep();
		zz.play();
	}
}