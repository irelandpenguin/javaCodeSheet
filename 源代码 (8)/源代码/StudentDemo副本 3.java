/*	
		static�ؼ���
		�ص㣺
			A:���������γ�Ա���������������γ�Ա����
			B:������ļ��ض�����,�������ǵ�main������
			C:��������ж�����
			D:����ͨ����������
				Ҳ����ͨ�����������á�
				�Ƽ�ʹ����������!
			
		��̬���εĳ�Ա��һ���Ϊ�����Ա�����磺���Ա���������Ա������
		
		ʲôʱ��ʹ�þ�̬?	
	        ���ĳ����Ա�������Ա�����Ǳ����ж�����ģ���ô����Ӧ�ö���Ϊ��̬�ġ�
*/
class Student {
	private String name;
	private int age;
	//���Ա����
	public static String country;//������static���Σ���ʾһ����̬��Ա����
	
	public Student() {}
	
	public Student(String name, int age, String country) {
		this.name = name;
		this.age = age;
		this.country = country;
		//Student.country = country;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void show() {
		System.out.println("����:"+name+",����:"+age+",����:"+country);
	}
	
	//���Ա����
	public static void hello() {
		System.out.println("��ã�");
	}
}

class StudentDemo {
	public static void main(String[] args) {
		Student s1 = new Student("����", 26, "�й�");
		s1.show();
		
		Student s2 = new Student("����", 34, "�й�");
		s2.show();
		
		Student s3 = new Student("����", 21, "�й�");
		s3.show();
		
		
		System.out.println("----------");
		
		//���������޸��� �����ĸ�����Ϣ
		s1.setAge(28);
		//s1.country = "����";
		Student.country = "����";//�Ƽ�����д�����ã�
		
		//��ӡ���˵���Ϣ
		s1.show();//���� 28 ����
		s2.show();//���� 34 �й�
		s3.show();//���� 21 �й�

		Student.hello();
	}
}