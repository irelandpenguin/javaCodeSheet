/*
	�ӿڵĳ�Ա�ص㣺
		��Ա������������public static final ���εģ����븳ֵ;
		���췽�����޹��췽��
		��Ա������������public abstract ���εĳ��󷽷���
		
	�ӿڶ���Ĵ�����
		ͨ��ʵ�ֽӿڵľ�������ʵ�����ġ�

	�����ࣺ
		�̳й�ϵ,ֻ�ܵ��̳�,���Զ��̳С�
	����ӿڣ�
		ʵ�ֹ�ϵ,���Ե�ʵ��,Ҳ���Զ�ʵ�֡�
		���һ������ڼ̳�һ�����ͬʱʵ�ֶ���ӿڡ�
	�ӿ���ӿڣ�
		�̳й�ϵ,���Ե��̳�,Ҳ���Զ�̳С�
*/
interface Footballer {
	//��Ա����(Ĭ�����η�public static final)
	
	//�޹��췽��
	
	//��Ա����(Ĭ�����η�public abstract)
	public abstract void playFootball();
}

interface Singer {
	//��Ա����(Ĭ�����η�public static final)
	
	//�޹��췽��
	
	//��Ա����(Ĭ�����η�public abstract)
	public abstract void canSinger();
}

/*
class DengChao implements Footballer,Singer {//��Ȼû��дextends ���࣬���ǣ�����֪������Ĭ�ϼ̳�Object
	public void playFootball() {
		System.out.println("�˳�������");
	}
	
	public void canSinger() {
		System.out.println("�˳�����");
	}
}
*/

/*
abstract class Person {
	//��Ա����
	private String name;
	private int age;
	
	//���췽��
	public Person(){}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//��Ա����
	public abstract void eat();
	public void show() {
		System.out.println(name+"---"+age);
	}
}

class Actor extends Person implements Footballer, Singer {//��Ա��̳����࣬ͬʱʵ������Ա�ӿں͸��ֽӿ�
	//��Ա����...
	
	//���췽��
	public Actor(){}
	public Actor(String name, int age) {
		super(name, age);//���ø��๹�췽��������ʼ�����������
	}
	
	//��Ա����
	public void playFootball() {
		System.out.println("������");
	}
	
	public void canSinger() {
		System.out.println("����");
	}
	
	public void eat() {
		System.out.println("��ţ�ⷹ");
	}
}
*/


interface MeiXi extends Footballer, Singer {//÷ϣ �ӿ� �̳�����Ա�ӿں͸��ֽӿ�
	public abstract void playBasketBall();//������
}

class Actor2 implements MeiXi {
	//��Ա����
	private String name;
	private int age;
	
	//���췽��
	public Actor2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//��Ա����
	public void playFootball() {
		System.out.println("������");
	}
	
	public void canSinger() {
		System.out.println("����");
	}
	
	public void playBasketBall() {
		System.out.println("������");
	}
	
	public void show() {
		System.out.println(name+"---"+age);
	}
}


//==================================

class ClassAndInterfaceDemo {
	public static void main(String[] args) {
		/*
		DengChao dc = new DengChao();//��̬������
		dc.playFootball();
		dc.canSinger();
		*/
		
		
		/*
		Footballer fb = new Actor();
		fb.playFootball();//���⣺ֻ�ܵ��˷����������������ܵ��ã�Ϊɶ? 
		//��Ϊ����Ŷ�̬������ó�Ա�����Ĺ�ϵ��֪�����뿴��ߣ������أ�Footballer����ӿڸ�����û��������������
		//fb.canSinger();//����
		//fb.eat();//����
		
		System.out.println("----------");
		
		Singer sr = new Actor();
		sr.canSinger();//���⣺ֻ�ܵ��˷����������������ܵ��ã�Ϊɶ?
		//��Ϊ����Ŷ�̬������ó�Ա�����Ĺ�ϵ��֪�����뿴��ߣ������أ�Footballer����ӿڸ�����û��������������
		
		System.out.println("----------");
		
		Person p = new Actor("�˳�",35);
		p.show();
		p.eat();//���⣺ֻ�ܵ����������������������������ܵ��ã�Ϊɶ?
		//��Ϊ���ݶ�̬������ó�Ա�����Ĺ�ϵ��֪�����뿴��ߣ������أ�Person��û������������������
	
		System.out.println("----------");
		
		Actor ar = new Actor("��С��", 30);
		ar.show();
		ar.eat();
		ar.playFootball();
		ar.canSinger();//���⣺���Ե���ȫ���ķ�����Ϊɶ��
		//��ΪActor���Ѿ�ȫ��ʵ���˳���������г��󷽷������һ�ʵ�����нӿڵĽӿڷ�����
		*/
		
		
		System.out.println("----------");
		
		Actor2 ac = new Actor2("���ǳ�", 42);
		ac.show();
		ac.playFootball();
		ac.canSinger();
		ac.playBasketBall();
	}
}