/*
	�ӿڵ��ۺ���ϰ
		è���������衣
*/
interface Dance {
	public abstract void dance();
}

abstract class Animal {
	private String name;
	private int age;
	
	public Animal(){}
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
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
	
	public abstract void eat();
	public void sleep() {
		System.out.println("ſ��˯��");
	}
}

class Dog extends Animal implements Dance {
	public Dog() {}
	public Dog(String name, int age) {
		super(name, age);//���ø���Ĺ��췽������ʼ����������
	}
	
	public void eat() {
		System.out.println(getName()+"�Թ�ͷ");
	}
	
	public void dance() {
		System.out.println(getName()+"ѧ����");
	}
	
	
	public void show() {
		System.out.println(getName()+"---"+getAge());
		eat();
		dance();
		sleep();
	}
}

class Cat extends Animal implements Dance {
	public Cat() {}
	public Cat(String name, int age) {
		super(name, age);//���ø���Ĺ��췽������ʼ����������
	}
	
	public void eat() {
		System.out.println(getName()+"��С��");
	}
	
	public void dance() {
		System.out.println(getName()+"ѧ����");
	}
	
	public void show() {
		System.out.println(getName()+"---"+getAge());
		eat();
		dance();
		sleep();
	}
}


class InterfaceDemo {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("�ڱ�");
		dog.setAge(2);
		System.out.println(dog.getName()+"---"+dog.getAge());
		dog.eat();
		dog.sleep();
		dog.dance();
		
		
		System.out.println("----------");
		
		Dog dog2 = new Dog("�ڻ�", 4);
		dog2.show();
		
		System.out.println("----------");
		
		Cat cat = new Cat();
		cat.setName("����");
		cat.setAge(1);
		System.out.println(cat.getName()+"---"+cat.getAge());
		cat.eat();
		cat.dance();
		cat.sleep();
		
		System.out.println("----------");
		
		Cat cat2 = new Cat("����", 2);
		cat2.show();
		
	}
}