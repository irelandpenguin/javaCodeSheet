/*
	������д���
	
	��̬�ĳ�Ա�����ص㣺
		���������뿴��ߣ����п��ұߡ�
		
	�̳е�ʱ��
		�������к͸�����һ���ķ���������д(�򸲸�)��
		������û�и����г��ֹ��ķ����������ͱ��̳й����ˡ�
*/
class A {
	public void show() {
		show2();
	}
	public void show2() {
		System.out.println("��");
	}
}
class B extends A {
	public void show2() {
		System.out.println("��");
	}
}
class C extends B {
	public void show() {
		super.show();
	}
	public void show2() {
		System.out.println("JAVA");
	}
}
public class DuoTaiTest2 {
	public static void main(String[] args) {
		A a = new B();//��ʱ��a��һ����̬����
		a.show();//��
		
		
		B b = new C();//��ʱ��bҲ��һ����̬����
		b.show();//JAVA
		
	}
}