/*
	�ڲ���ĸ�����ʹ��

	�ڲ������:
		���ඨ������������ڲ��������ͱ���Ϊ�ڲ��ࡣ
		
	�ڲ��໮�֣�
		��Ա�ڲ���
			�ڳ�Աλ�ö�����࣬����Ϊ��Ա�ڲ��ࡣ
		�ֲ��ڲ���
			�ھֲ�λ�ö�����࣬����Ϊ�ֲ��ڲ��ࡣ
	
	�ڲ���ķ����ص㣺
		�ڲ������ֱ�ӷ����ⲿ��ĳ�Ա(��Ա�����ͳ�Ա����)������˽�С�
	
*/
class Outer {
	private int num = 100;
	
	//��Ա�ڲ��࣬��Ϊ�ڳ�Աλ�ö���ġ����ԣ����԰ѵ�ǰ��Inner�������ⲿ��Outer��һ����Ա������
	class Inner {//��Ա�ڲ���
		//��Ա����
		public int num2 = 90;
		private int num3 = 12;
		
		//���췽��
		
		public void show() {//��Ա����
			System.out.println("��Ա�ڲ����ӡnum="+num);
		}
		
		public int getNum3() {
			return num3;
		}
	}
	
	
	public void hello() {	
		//�ֲ��ڲ���,��Ϊ�ڷ������档
		class Inner2 {//�ֲ��ڲ���
			//��Ա����
			
			//���췽��
		
			public void show() {
				System.out.println("�ֲ��ڲ����ӡnum="+num);
			}
		}
		
		//���ʾֲ��ڲ���
		Inner2 i2 = new Inner2();
		i2.show();
	}
	
	public void print() {
		Inner i = new Inner();
		i.show();
		System.out.println(i.num2);
		System.out.println(i.getNum3());
	}
}


class TestDemo {
	public static void main(String[] args) {
		//���ʳ�Ա�ڲ��������·�ʽ
		//��ʽһ�����ʳ�Ա�ڲ����show()����
		Outer o = new Outer();
		o.print();
		
		//��ʽ�������� �ⲿ����.�ڲ����� ������ = �ⲿ�����.�ڲ������;
		Outer.Inner oi = new Outer().new Inner();
		oi.show();
		System.out.println(oi.num2);
		System.out.println(oi.getNum3());
		
		
		System.out.println("---------");
		
		//���ʾֲ��ڲ���
		o.hello();
	}
}
