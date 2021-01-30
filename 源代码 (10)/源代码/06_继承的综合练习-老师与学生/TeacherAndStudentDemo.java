/*
	��װ���ۺ���ϰ
		��ʦ��ѧ������
		
	������
		��ʦ��ѧ�����������࣬��������Ӧ�ڼ̳������ࡣ���£�
			Person
				Teacher 
				Student
*/
//����һ������
class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
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
	
	public String show() {
		String s = "����:"+name+",����:"+age;
		return s;
	}
}

//����һ����ʦ��
class Teacher extends Person {
	private int teacherNum;//��ʦ���
	
	public Teacher(String name, int age, int teacherNum) {
		super(name, age);//���ø���Ĺ��췽��������ʼ���Լ���name��age
		this.teacherNum = teacherNum;
	}
	
	public void showTeacher() {
		String info = super.show();//���ø����show()����������ȡ�Լ���name��age
		System.out.println("��ʦ��Ϣ["+info+",��ʦ���:"+teacherNum+"]");
	}
}

//����һ��ѧ����
class Student extends Person {
	private int studentNum;//ѧ��
	
	public Student(String name, int age, int studentNum) {
		super(name, age);//���ø���Ĺ��췽��������ʼ���Լ���name��age
		this.studentNum = studentNum;
	}
	
	public void showStudent() {
		String info = super.show();//���ø����show()����������ȡ�Լ���name��age
		System.out.println("ѧ����Ϣ["+info+",ѧ��:"+studentNum+"]");
	}
}


class TeacherAndStudentDemo {
	public static void main(String[] args) {
		//����һ��ѧ������
		Student stu = new Student("����", 26, 9527);
		stu.showStudent();
		
		stu.setName("������");
		stu.setAge(27);
		System.out.println(stu.getName()+", "+stu.getAge());
		
		System.out.println("----------");
		
		//����һ����ʦ����
		Teacher tea = new Teacher("Jerry", 35, 20103305);
		tea.showTeacher();
		
		tea.setName("Mr. Jerry");
		tea.setAge(36);
		System.out.println(tea.getName()+", "+tea.getAge());
	}
}