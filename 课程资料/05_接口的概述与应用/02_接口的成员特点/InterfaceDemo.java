/*
	�ӿڵ��ص㣺
		A���ӿڶ���ʹ��interface
			interface �ӿ��� {}
		B���ӿڵ�ʵ�֣�ʹ��implements
			class �� implements �ӿ��� {}
		C���ӿڲ���ʵ����
			�����Ҫʵ��������Ҫʹ��ʵ�ֽӿڵľ�������ʵ������
		D���ӿڵ�ʵ����
			1���ӿڵĳ���ʵ����(������)
			2���ӿڵľ���ʵ���ࣨ�Ƽ�������

	�ӿڳ�Ա�ص�
		��Ա������ֻ���ǳ����������Ǿ�̬�ġ�
				Ĭ�����η���public static final
				���飺�Լ��ֶ�������
		���췽�����ӿ�û�й��췽����
		��Ա������ֻ���ǳ��󷽷���
				Ĭ�����η���public abstract
				���飺�Լ��ֶ�������
		
	���е��඼Ĭ�ϼ̳���һ���ࣺObject��
	�� Object �����νṹ�ĸ��ࡣÿ���඼ʹ�� Object ��Ϊ���ࡣ
*/
interface Person {
	//��Ա������Ĭ�����η�Ϊpublic static final
	int number = 9527;//Ĭ�ϵ�,����intǰ����� public static final
	public static final String name = "C��";
	public static final int age = 35;
	
	//û�й��췽��
	
	//��Ա��������Ĭ�����η�Ϊpublic abstract
	public abstract void playFootball();//������
}


//class Footballer extends Object implements Person
class Footballer implements Person {//����FootballerĬ�ϼ̳�Object,��API˵���ĵ����¿�
	//��Ա����...
	
	//���췽��
	public Footballer() {
		//super();//��ʾ���ø���ķ������ɸ��������أ�����һ��
	}
	
	public void playFootball() {
		System.out.println("������");
	}
	public void singer() {
		System.out.println("����");
	}
}

class InterfaceDemo {
	public static void main(String[] args) {
		Person p = new Footballer();
		//p.name = "С��";//������Ϊname�����ձ����������޸�
		//p.number = 9000;
		//Person.number = 9800;
		
		
		//System.out.println(p.name+"---"+p.age);//�ӿڳ�Ա���������뿴��ߣ����п����
		//System.out.println(Person.name+"---"+Person.age);
		//p.playFootball();//�ӿڳ��󷽷������뿴��ߣ����п��ұ�
		
		System.out.println("----------");
		
		
		//Person pp = new Footballer();
		//pp.singer();//���б���ԭ�򣺱��뿴��ߣ���Person�ӿ���û��������󷽷�
		//pp.playFootball();//��̬������
		
		/*
		Footballer ff = (Footballer)pp;//ǿ�ƻ���
		ff.singer();
		ff.playFootball();
		*/
	}
}