/*
	�̳��г�Ա�����Ĺ�ϵ:
		A:�����еķ����͸����еķ���������һ�������̫�򵥡�
		B:�����еķ����͸����еķ�������һ�����������ô����?
			ͨ�����������÷�����
				a:���������У��о�ʹ��
				b:�ٿ������У��о�ʹ��
				c:�����û�оͱ���
*/

/*
class Father {
	public String name;
	public int age;
	
	public Father(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println("����:"+name+",����:"+age);
	}
}

class Son extends Father {
	private char sex;
	
	public Son(String name, int age, char sex) {
		super(name, age);//��ʾ���ø���Ĵ��ι��췽��������ʼ���Լ���name��age
		this.sex = sex;
	}
	
	public void show() {
		System.out.println("����:"+name+",����:"+age+",�Ա�:"+sex);
	}
}
*/


class Father {
	public String name;
	public int age;
	
	public Father(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println("����:"+name+",����:"+age);
	}
}


class Son extends Father {
	private char sex;
	
	public Son(String name, int age, char sex) {
		super(name, age);//���ø���Ĺ��췽��������ʼ���Լ���name��age
		this.sex = sex;
	}
	
	//�����ע�͵�������ø����show()����������ӡ�Լ���name��age
	//��ע�ͣ���ֱ�ӵ����Լ���show()����������ӡ�Լ���name, age��sex
	public void show() {
		System.out.println("����:"+name+",����:"+age+",�Ա�:"+sex);
	}
}


class ExtendsDemo {
	public static void main(String[] args) {
		Son s = new Son("����", 25, 'M');
		s.show();
	}
}