/*
	�����Ա�ڲ����Ǿ�̬�ģ�ͬʱ�ڲ����л��о�̬��������ô���ʣ�
*/
class Outer {
	private int num = 100;
	private static int snum = 200;
	
	//��Ա�ڲ��࣬��Ϊ�ڳ�Աλ�ö����
	//���ʣ�����ǰ��������������η�ֻ���� Ĭ�ϣ�public��final��abstract��Ϊʲô���������static�أ�
	//�����Ϊ����ѵ�ǰ��Inner�������ⲿ��Outer��һ����Ա�����ˡ�
	static class Inner {//��̬��Ա�ڲ���(ע�⣺��̬��Ա�ڲ�����ʵ��ⲿ�����ݱ����þ�̬���Ρ�)
		public void show() {
			//System.out.println("num="+num);//����: �޷��Ӿ�̬�����������÷Ǿ�̬ ���� num
			System.out.println("snum="+snum);//��ȷ
			//hello();
			//hello2();//����: �޷��Ӿ�̬�����������÷Ǿ�̬
		}
		
		
		public static void show2() {
			//System.out.println("num="+num);//����: �޷��Ӿ�̬�����������÷Ǿ�̬ ���� num
			System.out.println("snum="+snum);//��ȷ
			//hello();
			//hello2();//����: �޷��Ӿ�̬�����������÷Ǿ�̬
		}
	}
	
	public void print() {
		Inner i = new Inner();
		//i.show();
		i.show2();
	}
	
	public static void hello() {
		System.out.println("hello world!");
	}
	
	public void hello2() {
		System.out.println("hello2 world!");
	}
}


class TestDemo2 {
	public static void main(String[] args) {
		//��ʽһ�����ʳ�Ա�ڲ����show()����
		Outer o = new Outer();
		o.print();
		
		
		System.out.println("----------");
		
		//��ʽ�������� �ⲿ����.�ڲ����� ������ = new �ⲿ��.�ڲ������;
		Outer.Inner oi = new Outer.Inner();
		oi.show();
		
		
		System.out.println("----------");
		
		//��ʽ����
		//���ʳ�Ա��̬�ڲ��࣬��򵥵ķ�ʽ���и�ǰ�᣺��̬��Ա�ڲ���ķ�����Ҳ��һ����̬������
		Outer.Inner.show2();
	}
}