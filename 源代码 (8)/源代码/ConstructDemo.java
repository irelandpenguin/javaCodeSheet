/*
	���췽����
		����������ݽ��г�ʼ��

	��ʽ��
		A:��������������ͬ
		B:û�з���ֵ���ͣ���void��û��
		C:û�о���ķ���ֵ
		
	���췽����ע������:
		A:�������û�и������췽����ϵͳ���Զ��ṩһ���޲ι��췽����
		B:������Ǹ����˹��췽����ϵͳ�������ṩĬ�ϵ��޲ι��췽����
			ע�⣺���ʱ��������ǻ���ʹ���޲ι��췽�����ͱ����Լ�������������Զ�Լ������޲ι��췽��!
		
	����Ա������ֵ�����ַ�ʽ��
		A:setXxx()
		B:���췽��
		C:�������������ͨ����
*/
class Student {
	private String name;
	private int age;
	private char sex;
	
	//���췽��(�޲�)
	public Student() {
		System.out.println("�����޲ι��췽��");
	}
	
	
	//���췽��(��3������)
	public Student(String name, int age, char sex) {
		System.out.println("���Ǵ�3�������Ĺ��췽��");
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	//��������
	public void setName(String name) {
		this.name = name;
	}
	
	//��ȡ����
	public String getName() {
		return name;
	}
	
	//��������
	public void setAge(int age) {
		this.age = age;
	}
	
	//��ȡ����
	public int getAge() {
		return age;
	}
	
	//�����Ա�
	public void setSex(char sex) {
		this.sex = sex;
	}
	
	//��ȡ�Ա�
	public char getSex() {
		return sex;
	}
	
	//����ѧ����Ϣ
	public void setInformation(String name, int age, char sex) {
		System.out.println("������ͨ������ֻ��������3������");
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	//��ʾѧ����Ϣ
	public void show() {
		System.out.println("����:"+name+",����:"+age+",�Ա�:"+sex);
	}
}

class ConstructDemo {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setName("����");
		stu.setAge(30);
		stu.setSex('��');
		System.out.println("����:"+stu.getName()+",����:"+stu.getAge()+",�Ա�:"+stu.getSex());
		
		Student stu2 = new Student("����",32,'Ů');
		System.out.println("����:"+stu2.getName()+",����:"+stu2.getAge()+",�Ա�:"+stu2.getSex());
		
		Student stu3 = new Student();
		stu3.setInformation("����",34,'��');
		stu3.show();
		
	}
}