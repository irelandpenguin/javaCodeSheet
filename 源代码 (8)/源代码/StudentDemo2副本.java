/*
	this : �ǵ�ǰ��Ķ������á��򵥵ļǣ����ʹ���ǰ���һ������
		ע�⣺�����ĸ�����this�ʹ����Ǹ�����
		
	this��ʹ�ó�����
		���ڽ���ֲ��������س�Ա������
*/
class Student {
	private String name;
	private int age;
	private char sex;
	
	//��������
	public void setName(String name) {
		this.name = name;//�����this�ʹ���ǰ������
	}
	
	//��ȡ����
	public String getName() {
		return name;//��ʽ�ĵ��ó�Ա������this�ؼ���������
		//return this.name;//��ʾ�ĵ��ó�Ա����
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
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	//��ʾѧ����Ϣ
	public void show() {
		System.out.println("����:"+name+",����:"+age+",�Ա�:"+sex);
		//System.out.println("����:"+this.name+",����:"+this.age+",�Ա�:"+this.sex);
	}
	
}

class StudentDemo2 {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setName("����");
		stu.setAge(28);
		stu.setSex('M');
		System.out.println("����:"+stu.getName()+",����:"+stu.getAge()+",�Ա�:"+stu.getSex());
		
		
		Student stu2 = new Student();
		stu2.setInformation("�˴ﻥ��", 5, '��');
		stu2.show();
		
	}
}
