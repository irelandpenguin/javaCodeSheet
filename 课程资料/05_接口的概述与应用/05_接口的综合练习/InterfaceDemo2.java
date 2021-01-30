/*
	�ӿ���ϰ2
		�ְֵĶ�,Ů���ᳪ���ֻ����衣
		
		�ְ�
			����
			Ů��
		�ӿ� 
			����
			����
*/
interface SongAndDance {
	public abstract void song();
	public abstract void dance();
}

abstract class Father {
	private String name;
	private int age;
	
	public Father(){}
	public Father(String name, int age) {
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
	public abstract void sleep();
}

//ʵ�ֽӿڵ��������淶������+Impl 
class SonImpl extends Father implements SongAndDance {
	public SonImpl(){}
	public SonImpl(String name, int age) {
		super(name, age);//���ø���Ĺ��췽������ʼ������ĳ�Ա��������Ϊname��age��private���εģ����಻�ܼ̳�
	}
	
	public void eat() {
		System.out.println(getName()+"ϲ����ţ��");
	}
	
	public void sleep() {
		System.out.println(getName()+"ϲ������˯��");
	}
	
	public void song() {
		System.out.println(getName()+"ϲ����ҡ����");
	}
	
	public void dance() {
		System.out.println(getName()+"ϲ����������");
	}
	
	public void show() {
		System.out.println(getName()+"---"+getAge());
		eat();
		sleep();
		song();
		dance();
	}
}


//ʵ�ֽӿڵ��������淶������+Impl 
class DaughterImpl extends Father implements SongAndDance {
	public DaughterImpl(){}
	public DaughterImpl(String name, int age) {
		super(name, age);//���ø���Ĺ��췽������ʼ������ĳ�Ա��������Ϊname��age��private���εģ����಻�ܼ̳�
	}
	
	public void eat() {
		System.out.println(getName()+"ϲ�������");
	}
	
	public void sleep() {
		System.out.println(getName()+"ϲ������˯��");
	}
	
	public void song() {
		System.out.println(getName()+"ϲ���������");
	}
	
	public void dance() {
		System.out.println(getName()+"ϲ�����㳡��");
	}
	
	public void show() {
		System.out.println(getName()+"---"+getAge());
		eat();
		sleep();
		song();
		dance();
	}
}

class InterfaceDemo2 {
	public static void main(String[] args) {
		SonImpl sl = new SonImpl();
		sl.setName("��һ��");
		sl.setAge(21);
		System.out.println(sl.getName()+"---"+sl.getAge());
		sl.eat();
		sl.sleep();
		sl.song();
		sl.dance();
		
		
		System.out.println("---------");
		
		SonImpl sm = new SonImpl("��С��", 24);
		sm.show();
		
		System.out.println("---------");
		
		
		DaughterImpl dl = new DaughterImpl();
		dl.setName("��С��");
		dl.setAge(16);
		System.out.println(dl.getName()+"---"+dl.getAge());
		dl.eat();
		dl.sleep();
		dl.song();
		dl.dance();
		
		System.out.println("---------");
		
		DaughterImpl dm = new DaughterImpl("��С��", 18);
		dm.show();
	}
}