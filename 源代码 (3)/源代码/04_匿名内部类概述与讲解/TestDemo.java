/*
	�����ڲ���
		�����ڲ���ļ�д����

	ǰ�᣺����һ������߽ӿ�
			�����������Ǿ�����Ҳ�����ǳ����ࡣ
	
	��ʽ��
		new �������߽ӿ���() {
			��д����;
		}
		
	�����ڲ���ı�����ʲô��?
		������һ���̳��˸������������ʵ���˸ýӿڵ����ʵ������
*/
/*
abstract class Person {//������
	 public abstract void show();
	 public abstract void show2();
}
*/


//Ҳ���԰�����ĳ�����ĳɽӿڣ����£�
interface Person {//�ӿ�
	 public abstract void show();
	 public abstract void show2();
}


class Outer {
	private int num1 = 10;
	private int num2 = 20;
	
	public void hello() {
		//���Person�ǳ����࣬��ʱ�����new Person()�ͱ�ʾ�̳�Person�������������
		//���Person�ǽӿڣ���ʱnew Person()�ͱ�ʾʵ�ָýӿڵ�����ʵ������
		Person i = new Person() {//���ö�̬���������ֵ����������
			public void show() {
				System.out.println("num1="+num1);
			}
			
			public void show2() {
				System.out.println("num2="+num2);
			}
		};
		
		//����
		i.show();//���뿴��ߣ����п��ұ�
		i.show2();//���뿴��ߣ����п��ұ�
	}
}

class TestDemo {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.hello();
	}
}