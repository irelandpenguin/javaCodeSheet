/*
	��̬��ϰ��è���Է�������Ϸ��
*/
class Animal {
	//������Ա����...
	
	//�������췽��...
	
	public void eat() {
		System.out.println("����Է�");
	}
}

class Cat extends Animal {
	//������Ա����...
	
	//�������췽��...
	
	public void eat() {
		System.out.println("è��С��");
	}
	
	public void playGame() {
		System.out.println("è��׽�Բ�");
	}
}

class Dog extends Animal {
	//������Ա����...
	
	//�������췽��...
	
	public void eat() {
		System.out.println("���Թ�ͷ");
	}
	
	public void playGame() {
		System.out.println("������");
	}
}

class DuoTaiTest1 {
	public static void main(String[] args) {
		//��̬ʹ��
		Animal an = new Cat();
		an.eat();
		//an.playGame();//������Ϊ��Ա�������뿴��ߣ����п��ұߡ�����̬��Animal�и���û���playGame()����
		
		System.out.println("----------");
		
		//ʹ������ת�ͣ����������
		Cat c = (Cat)an;
		c.eat();
		c.playGame();
		
		
		System.out.println("----------");
		
		//ʹ�øմ�����Animal����Dog����
		an = new Dog();
		an.eat();
		//an.playGame();//������Ϊ��Ա�������뿴��ߣ����п��ұߡ�����̬��Animal�и���û���playGame()����
		
		System.out.println("----------");
		
		Dog d = (Dog)an;
		d.eat();
		d.playGame();
		
		
		//�����������ת�У���ȷ��
		//Cat cc = (Cat)an;//���б��� java.lang.ClassCastException������ת���쳣����Ϊ��ʱ��an�Ѿ�ָ����Dog�ˡ�
	}
}
