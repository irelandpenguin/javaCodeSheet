/*
	static�����ܹ����γ�Ա�����������������γ�Ա������
	
	�ܽ᣺
		(1).�෽��ֻ�ܵ������Ա�������෽��;
		(2).��Ա�������Ե���һ�С�
*/
class Student {
	private String name;
	private int age;
	private static String country;//�����Ǿ�̬��
	
	public Student(){}
	
	public Student(String name, int age, String country) {
		this.name = name;
		this.age = age;
		Student.country = country;//�Ƽ�ʹ����������
	}
	
	public void show() {
		System.out.println("����:"+name+",����:"+age+",����:"+country);
	}
	
	public void update1(String name, int age, String country) {
		this.name = name;
		this.age = age;
		Student.country = country;//�Ƽ������á���Ϊ���Ա���������������࣬������ĳ������
		
		show();
		
		hello1();//������ʽ����,�Ƽ�����
		//this.hello1();//��������Ҳ�Եģ�������ʾ����
		
		//hello2();//ʵ��������̬���εĳ�Ա(��Ա��������Ա����)
		Student.hello2();//�Ƽ�����
	}
	
	public static void update2(String name, int age, String country) {
		/*
		this.name = name;//�������ھ�̬�����У�����ʹ��this����Ϊ�෽�����������࣬������ĳ������! ���Ҫ��ס!
		this.age = age;
		this.country = country;
		*/
		
		
		Student.country = country;//���ԣ����ھ�̬�����У����Է������Ա��������Ҫʹ����������
		
		//hello1();//�������ھ�̬�����У����ܷ��ʳ�Ա����
		//hello2();//���ԣ����ھ�̬�����У����Է��ʾ�̬����(����Ҳ�����෽��)
		//Student.hello2();//���ԣ�������෽��Ҳ�������������ã������Ա��������һ���ġ�
	}
	
	public void hello1() {
		System.out.println("hello1");
	}	
	
	public static void hello2() {
		System.out.println("hello2");
	}
}

class StudentDemo2 {
	public static void main(String[] args) {
		Student s1 = new Student("����", 26, "�й�");
		s1.show();
		
		Student s2 = new Student("����", 34, "�й�");
		s2.show();
		
		Student s3 = new Student("����", 21, "�й�");
		s3.show();
		
		
		System.out.println("----------");
		
		s1.update1("��С��", 33, "����");
		
		
		System.out.println("----------");
		
		s1.update2("�Ŵ���", 43, "����۹�");
	}
}
