/*
һ�������û�г��󷽷����ɲ����Զ���Ϊ������?������ԣ���ʲô����?
	A:���ԡ�
	B:�����ǲ��ô���������Ϊ�����಻��ʵ��������

abstract���ܺ���Щ�ؼ��ֹ���?
	private	��ͻ
	final	��ͻ	
	static	�Ƿ����
*/
abstract class Fu {
	//private abstract void show2();//�Ƿ������η����: abstract��private
	//abstract final void show3();//�Ƿ������η����: abstract��final
	//public abstract static void show4();// �Ƿ������η����: abstract��static 
	//����:��Ϊstatic���εķ������ھ�̬��������Ҫ�з�����ʵ�֣���abstract������������д�����塣���ԷǷ���
	
	public abstract void show();
	
	public static void hello() {
		System.out.println("hello");
	}
}

class Zi extends Fu {
	public void show() {
		System.out.println("���");
	}
}

class AbstractDemo {
	public static void main(String[] args) {
		//Fu f = new Fu();//������Ϊ�������ǲ��ܴ��������
		Fu f = new Zi();
		f.show();//�Ϸ���
		Fu.hello();//�Ϸ���
	}
}