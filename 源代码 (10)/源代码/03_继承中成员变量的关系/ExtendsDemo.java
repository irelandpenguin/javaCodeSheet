/*
	�����ɣ�
		��Ա������
		���췽����
		��Ա������
		
	�����������ֽ����˼̳У����ԣ����Ǿ�Ӧ��������һ�£������ɲ��ֵĸ��Թ�ϵ��
	
	�̳��г�Ա�����Ĺ�ϵ:
		A:�����еĳ�Ա�����͸����еĳ�Ա�������Ʋ�һ����ֱ�ӷ��ʾͿ����ˡ�
		B:�����еĳ�Ա�����͸����еĳ�Ա��������һ���������ô����?
			�����෽���з���һ�������Ĳ���˳��
				a:�����෽���ľֲ���Χ�ң��о�ʹ��
				b:������ĳ�Ա��Χ�ң��о�ʹ��
				c:�ڸ���ĳ�Ա��Χ�ң��о�ʹ��
				d:������Ҳ������ͱ���
				
	�������Ҫ�Ѿֲ��ģ���Ա�ģ�����ĳ�Ա����һ���Զ������ˡ���ô����أ�
		������Ҫʹ�ùؼ��� this  super
		
	this��super������?
			this�����������ã����Բ�������ĳ�Ա
			super����������,���Բ�������ĳ�Ա

	��ô����?
		A:���ó�Ա����
			this.��Ա���� ���ñ���ĳ�Ա����	
			super.��Ա���� ���ø���ĳ�Ա����
		B:���ù��췽��
			this(...)	���ñ���Ĺ��췽��
			super(...)	���ø���Ĺ��췽��		
		C:���ó�Ա����
			this.��Ա���� ���ñ���ĳ�Ա����
			super.��Ա���� ���ø���ĳ�Ա����
*/

/*
class Father {
	public String name = "����";
	public int age = 45;
	
	public void showFather() {
		System.out.println("����:"+name+",����:"+age);
	}
}

class Son extends Father {
	public String name2 = "��С��";
	public int age2 = 18;
	
	public void showSon() {
		System.out.println("����:"+name2+",����:"+age2);
	}
}
*/


class Father {
	public String name = "����";
	public int age = 45;
	
	public void showFather() {
		System.out.println("����:"+name+",����:"+age);
	}
}

class Son extends Father {
	public String name = "��С��";
	public int age = 18;
	
	public void showSon() {
		//String name = "��СС��";
		//int age = 8;
		System.out.println("����:"+name+",����:"+age);
	}
	
	public void show() {
		String name = "��СС��";
		int age = 8;
		System.out.println("����:"+name+",����:"+age);//��ӡ�ֲ�������
		System.out.println("����:"+this.name+",����:"+this.age);//��ӡ��Ա������
		System.out.println("����:"+super.name+",����:"+super.age);//��ӡ�����Ա������
	}
}


class ExtendsDemo {
	public static void main(String[] args) {
		//Father fa = new Father();
		//fa.showFather();
		
		//System.out.println("---------");
		
		Son so = new Son();
		//so.showSon();
		
		//System.out.println("---------");
		
		so.show();
	}
}