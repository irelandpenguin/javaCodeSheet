/*
	�̳и�����
		�Ѷ��������ͬ�����ݸ���ȡ�������嵽һ�����С�
		
	�̳е��ص㣺
		java����ֻ֧�ֵ��̳У���֧�ֶ�̳С�
		��java����֧�ֶ��̳У����磺���Ӽ̳и��ף����׼̳�үү��
		class grandfather {public int num;}
		class father extends grandfather {}
		class son extends father {}
		
		
	���ʵ�ּ̳���?	
		Java�ṩ�˹ؼ��֣�extends
		
	��ʽ��
		class ������ extends ������ {}
		
	�ô���
		A:����˴���ĸ�����
		B:����˴����ά����
		C:��������֮������˹�ϵ
	
	����������˹�ϵ����ʵҲ�Ǽ̳е�һ���׶ˣ�
		����������ǿ�ˡ�
		
		������ԭ�򣺵���ϣ����ھۡ�
		��ϣ�������Ĺ�ϵ
		�ھۣ������Լ����ĳ�����������
*/

//�̳�ǰ
/*
//ѧ����
class Student {
	public String name;
	public int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println("����:"+name+",����:"+age);
	}
}

//��ʦ��
class Teacher {
	public String name;
	public int age;
	
	public Teacher(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println("����:"+name+",����:"+age);
	}
}
*/

//�̳к�
class Person {
	public String name;//���ﲻ����private����Ϊjava�﷨�涨˽�еĲ��ܼ̳�
	public int age;
	
	public void show() {
		System.out.println("����:"+name+",����:"+age);
	}
}

class Student extends Person {
	public Student(String name, int age) {//java�﷨�涨�����췽�����ܼ̳�
		this.name = name;
		this.age = age;
	}
}

class Teacher extends Person {
	public Teacher(String name, int age) {//java�﷨�涨�����췽�����ܼ̳�
		this.name = name;
		this.age = age;
	}
}

//������
class ExtendsDemo {
	public static void main(String[] args) {
		Student stu = new Student("����", 27);
		stu.show();
		
		Teacher tea = new Teacher("Jerry", 33);
		tea.show();
	}
}



