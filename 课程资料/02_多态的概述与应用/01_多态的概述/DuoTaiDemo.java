/*
	��̬��ͬһ������(����)���ڲ�ͬʱ�����ֳ����Ĳ�ͬ״̬��
	������
		è��è��èҲ�Ƕ��
		ˮ(Һ�壬���壬��̬)��
		
	��̬��ǰ�᣺
		A:Ҫ�м̳й�ϵ��
		B:Ҫ�з�����д��
			��ʵû��Ҳ�ǿ��Եģ�ֻ������û�������ˡ�
		C:Ҫ�и�������ָ���������
			�� f =  new ��();
			
	�ô�������һ�¶�̬��
	
	��̬�еĳ�Ա�����ص㣺
		A:��Ա����
			���뿴��ߣ����п���ߡ�
		B:���췽��	     
			������������ʱ�򣬷��ʸ���Ĺ��췽�����Ը�������ݽ��г�ʼ����
		C:��Ա����
			���뿴��ߣ����п��ұߡ�
			���ڳ�Ա�������ڷ�����д�����������п��ұߡ�
		D:��̬����(�෽��)
			���뿴��ߣ����п���ߡ�
			(��̬������أ��㲻����д�����ԣ����ʻ�����ߵ�)
			
	��̬�ı׶�
		����ʹ���������еķ�����
*/
class Fu {
	public String name = "����";
	public int age = 36;
	
	public Fu(){}
	public Fu(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println("����:"+name+",����:"+age);
	}
	
	public static void hello() {
		System.out.println("hello! �˴ﻥ��");
	}
}

class Zi extends Fu {
	public String name = "��С��";
	public int age = 3;
	public char sex = '��';
	
	//�������췽��...
	
	public void show() {
		System.out.println("����:"+name+",����:"+age+",�Ա�:"+sex);
	}
	public void show2() {
		System.out.println("���ӵ�����:"+name+",����:"+age+",�Ա�:"+sex);
	}
	
	public static void hello() {
		System.out.println("hello! �˴�");
	}
}

class DuoTaiDemo {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.show();
		z.show2();
		
		System.out.println("---------");
		
		//�� f =  new ��();
		Fu f = new Zi();//�����ʹ���˶�̬
		//System.out.println(f.name+"----"+f.age);//���뿴��ߣ����п���ߡ�
		//System.out.println(f.name+"----"+f.age+"----"+f.sex);//������̬�ĳ�Ա���� ���뿴��ߣ����п����
		//f.show();
		//f.show2();//������̬�ĳ�Ա���������뿴���,���п��ұߡ�����̬��Fu��û�г�Ա����show2()
		
		
		//��̬����(�෽��)��ʹ�ö�̬����
		//Fu.hello();
		//Zi.hello();
		
		//��̬����(�෽��)��ʹ�ö�̬����
		f.hello();
	}
}
