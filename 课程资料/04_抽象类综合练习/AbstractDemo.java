/*
	è������
*/
abstract class Animal {
	//��Ա����
	private String name;
	private int age;
	
	//���췽��
	public Animal() {}
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//��Ա����
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public static void show(Animal an) {
		System.out.println(an.getName()+"--"+an.getAge()+"--"+an.eat()+"--"+an.playGame());
	}
	
	//���󷽷�
	public abstract String eat();
	public abstract String playGame();
}

class Dog extends Animal {
	public Dog() {}
	public Dog(String name, int age) {
		super(name, age);//���ø���Ĺ��췽������ʼ����������
	}
	
	public String eat() {
		return "�Թ�ͷ";
	}
	
	public String playGame() {
		return "����";
	}
}

class Cat extends Animal {
	public Cat() {}
	public Cat(String name, int age) {
		super(name, age);//���ø���Ĺ��췽������ʼ����������
	}
	
	public String eat() {
		return "��С��";
	}
	
	public String playGame() {
		return "��׽�Բ�";
	}
}

class AbstractDemo {
	public static void main(String[] args) {
		Animal an = new Dog();//��̬������
		an.setName("�ڻ�");
		an.setAge(3);
		System.out.println(an.getName()+"--"+an.getAge()+"--"+an.eat()+"--"+an.playGame());
		
		System.out.println("----------");
		
		an = new Dog("����", 5);
		Animal.show(an);
		
		System.out.println("----------");
		
		an = new Cat();
		an.setName("����");
		an.setAge(1);
		System.out.println(an.getName()+"--"+an.getAge()+"--"+an.eat()+"--"+an.playGame());
		
		System.out.println("----------");
		
		an = new Cat("����", 2);
		Animal.show(an);
	}
}