/*
	��̬�ĺô���
		A:����˴����ά����(�̳б�֤)
		B:����˴������չ��(�ɶ�̬��֤)
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
	
	/*
	//д��ͨ�÷���
	public static void eatAndSleep(Fu f) {//�����Ǹ�������
		f.eat();
		f.sleep();
	}
	*/
}

class SonOne extends Fu {
	//������Ա����...
	
	//�������췽��...
	
	public void eat() {
		System.out.println("�����");
	}
	public void sleep() {
		System.out.println("ſ��˯��");
	}
}

class SonTwo extends Fu {
	//������Ա����...
	
	//�������췽��...
	
	public void eat() {
		System.out.println("��ţ��");
	}
	public void sleep() {
		System.out.println("����˯��");
	}
}

class SonThree extends Fu {
	//������Ա����...
	
	//�������췽��...
	
	public void eat() {
		System.out.println("����");
	}
	public void sleep() {
		System.out.println("����˯��");
	}
}

class DuoTaiDemo {
	public static void main(String[] args) {
		SonOne so = new SonOne();
		//so.eat();
		//so.sleep();
		
		//System.out.println("----------");
		
		SonTwo st = new SonTwo();
		//st.eat();
		//st.sleep();
		
		//System.out.println("----------");
		
		SonThree se = new SonThree();
		//se.eat();
		//se.sleep();
		
		//System.out.println("----------");
		
		
		//������3������ÿ������Ҫ����eat()��sleep()��̫�鷳���ܲ��ܼ�һ���أ�
		//�Ľ������������ڸ����д���һ����̬��Ա����������Ϊ�������ã��������������ö�̬����ʵ�ֹ�����չ������̬����չ��
		//Fu.eatAndSleep(so);
		//Fu.eatAndSleep(st);
		//Fu.eatAndSleep(se);
		
	}
}