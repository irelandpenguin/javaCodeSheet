/*
	�̳е�ע�����
		A:����ֻ�ܼ̳и������з�˽�еĳ�Ա(��Ա�����ͳ�Ա����)
		B:���಻�ܼ̳и���Ĺ��췽�������ǿ���ͨ��super�ؼ���ȥ���ʸ��๹�췽����(���潲)
		
	��ô������ʲôʱ����ʹ�ü̳���?
		�̳���һ�ֹ�ϵ��"is a"�����磺
			Person
				Student
				Teacher
			ˮ��(Fruits)
				ƻ��(Apple)
				�㽶
				����
		���ü��跨��ֻҪ�������ǵ����ʶ���Ϳ���ʹ�ü̳С�
		
			���������ʶ�ģ�����ʹ�ü̳С����磺
			����(Computer)
				Student�������ϣ�
				Mac Air(����)
			��(Dog)
				Person(������)
				�ǹ�(����)
*/

class Father {
	private String name;//˽�еĳ�Ա�����ܼ̳�
	public int age;//���еĳ�Ա�����Լ̳�
	
	private void show1() {//˽�еģ����ܼ̳�
		System.out.println("����:"+name+",����:"+age);
	}
	
	public void show2() {//���еģ����Լ̳�
		System.out.println("����:"+name+",����:"+age);
	}
}

class Son extends Father {
	private char sex;
	
	public void setInfo(String name, int age, char sex) {
		//this.name = name;//��Ϊname��˽�еģ�����û�м̳У����ԣ������Ҳ���name�����±���!
		this.age = age;//��Ϊage�ǹ��еģ�����̳��ˡ����Կ�������ʹ��
		this.sex = sex;
	}
	
	
	public void showSon() {
		//this.show1();//��Ϊshow1()��˽�еģ�����û�м̳У����ԣ������Ҳ���show1()���������±���
		this.show2();//show2()�����ǹ��еģ�����������ֱ�ӵ��ã�Ҳ����ȷ��
		System.out.println("�Ա�:"+sex);
	}
	
}

class ExendsDemo {
	public static void main(String[] args) {
		Son so = new Son();
		so.setInfo("����", 30, '��');
		so.showSon();
	}
}