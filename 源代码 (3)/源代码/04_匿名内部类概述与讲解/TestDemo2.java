/*
	�����ڲ����ڿ����е�ʹ��
		������һ���̳��˸������������ʵ���˸ýӿڵ����ʵ������
*/
interface Person {//�ӿ�
	public abstract void study();
}

class Outer {
	public void show(Person i) {//�ӿ�����Ϊ��ʽ����
		i.study();//��̬������(���뿴��ߣ����п��ұ�)
	}
}

/*
class Student implements Person {
	public void study() {
		System.out.println("2 good good study, day day up!");
	}
}
*/

class TestDemo2 {
	public static void main(String[] args) {
		Outer o = new Outer();
		
		//Student s = new Student();
		//o.show(s);
		
		
		o.show(new Person() {//�����new Person()����ʵ��Person�ӿڵ����ʵ������
			public void study() {
				System.out.println("good good study, day day up!");
			}
		});
		
	}
}