/*
	������ĸ�����
		����֪������Ŀǰ�ǲ�ȷ���ģ����Զ����еĳԣ�˯��Ҳ��Ӧ���Ǿ���ġ�
		���ǰ�һ�����Ǿ���Ĺ��ܳ�Ϊ����Ĺ��ܣ���һ����������г���Ĺ��ܣ���������ǳ����ࡣ
		
	��������ص㣺
		A:������ͳ��󷽷�������abstract�ؼ�������
		B:�������в�һ���г��󷽷�,�����г��󷽷�������붨��Ϊ������
		C:�����಻��ʵ����(����ʵ��������˵���ܴ�������)
			��Ϊ�����Ǿ���ġ�
			�������й��췽�������ǲ���ʵ������
				�ǹ��췽����������ʲô��?
					���������ʼ�����������
		D:�����������
			a:��д���еĳ��󷽷������ʱ��������һ��������ࡣ
			b:���������д���󷽷�����������붨��Ϊһ�������ࡣ
			
		�������ʵ������ʵ�ǿ����������ʵ�ֵġ��Ƕ�̬�����֡�
			Animal a = new Cat();
*/
abstract class Animal {
	//������Ա����...
	
	//�������췽��...
	
	public abstract void eat();
	public abstract void playGame();
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

abstract class Dog extends Animal {}

/*
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
*/

class AbstractDemo {
	public static void main(String[] args) {
		//Animal a = new Animal();//���� Animal�ǳ����; �޷�ʵ����
		
		
		Animal an = new Cat();
		an.eat();//��̬������ʳ�Ա���������뿴��ߣ����п��ұ�
		an.playGame();
		
		System.out.println("----------");
		
		/*
		an = new Dog();
		an.eat();
		an.playGame();
		*/
	}
}