/*
	��ʦ����
*/
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
	
	public void teach(String name) {
		System.out.println("��Ŀ:"+name);
	}
	
	//���󷽷�
	public abstract void teachTime();
}

class YuWenTeacher extends Person {
	//���췽��
	public YuWenTeacher() {}
	public YuWenTeacher(String name, int age) {
		super(name, age);//���ø��๹�췽������ʼ�����������
	}
	
	//��Ա����
	public void teachTime() {
		System.out.println("ʱ��:��һ~���� ����10��30������3:00");
	}
}

class ShuXueTeacher extends Person {
	//���췽��
	public ShuXueTeacher() {}
	public ShuXueTeacher(String name, int age) {
		super(name, age);//���ø��๹�췽������ʼ�����������
	}
	
	//��Ա����
	public void teachTime() {
		System.out.println("�ܶ�~��ĩ ����9��30������6:00");
	}
}

class AbstractDemo2 {
	public static void main(String[] args) {
		Person p = new YuWenTeacher();//��̬������
		p.setName("����ʦ");
		p.setAge(34);
		System.out.println(p.getName()+"--"+p.getAge());
		p.teach("����");
		p.teachTime();
		
		System.out.println("---------");
		
		p = new YuWenTeacher("Mr Jerry", 31);
		System.out.println(p.getName()+"--"+p.getAge());
		p.teach("ɢ��ʫ��");
		p.teachTime();
		
		System.out.println("---------");
		
		p = new ShuXueTeacher();
		p.setName("����ʦ");
		p.setAge(30);
		System.out.println(p.getName()+"--"+p.getAge());
		p.teach("�ߵ���ѧ");
		p.teachTime();
		
		System.out.println("---------");
		
		p = new ShuXueTeacher("����ʦ", 32);
		System.out.println(p.getName()+"--"+p.getAge());
		p.teach("����");
		p.teachTime();
		
	}
}
