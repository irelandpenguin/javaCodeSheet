/*
	������ĳ�Ա�ص㣺
		��Ա�������ȿ����Ǳ�����Ҳ�����ǳ�����
		���췽�������������ʼ����������ݡ�
		��Ա�������ȿ����ǳ���ģ�Ҳ�����Ƿǳ���ġ�
		
	������ĳ�Ա�������ԣ�
		A:���󷽷�������Ҫ������ʵ�֡�
		B:�ǳ��󷽷�������̳У���ߴ��븴���ԡ�
*/
abstract class Fu {
	//��Ա����
	public String name;
	public int age;
	
	//��Ա����
	public final char sex = '��';
	
	//���췽��
	public Fu() {}
	
	public Fu(String name, int age) {//��Ϊsex��final�����ˣ��ǲ��ܸ��ĵġ����ԣ������ﲻ����sex
		this.name = name;
		this.age = age;
	}
	
	//��Ա����
	public abstract void eat();
	
	public void sleep() {
		System.out.println("����ˣ�˯��");
	}
}

class Zi extends Fu {
	//��Ա����...
	
	//���췽��
	public Zi() {}//�������ʽ�ĵ��ø����޲ι���
	
	public Zi(String name, int age) {
		super(name, age);//��ʾ�ĵ��ø���Ĵ��ι��죬��ʼ�����������
	}
	
	//��Ա����
	public void eat() {
		System.out.println("��ţ�����׷�");
	}
}

class AbstractDemo {
	public static void main(String[] args) {
		Fu f = new Zi();//��̬������
		f.name = "����";
		f.age = 30;
		System.out.println(f.name+"---"+f.age+"---"+f.sex);
		f.eat();
		f.sleep();
		
		System.out.println("----------");
		
		
		f = new Zi("����", 26);
		System.out.println(f.name+"---"+f.age+"---"+f.sex);
		f.eat();
		f.sleep();
		
	}
}
