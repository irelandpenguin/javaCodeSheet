/*
	�����ڲ��������⣺
		����Ҫ�󣬲������
			interface Inner { void show(); }
			class Outer { //������� }
			class OuterDemo {
				public static void main(String[] args) {
					  Outer.method().show();
				  }
			}
			Ҫ���ڿ���̨�����HelloWorld��
*/

interface Inner { void show(); }
class Outer { //������� 
	public static Inner method() {
		return new Inner() {//���� ʵ����Inner�ӿڵ������ڲ����ʵ������
			public void show() {//��д�Ĺ���
				System.out.println("HelloWorld");
			}
		};
	}
}
class OuterDemo {
	public static void main(String[] args) {
		Outer.method().show();
	}
}



/*
interface Inner { 
	void show();//�ӿ���ķ������η�Ĭ��Ϊpublic abstract������������Ȼûд��������Ҫ�����
}

//����Ϊ����Ĵ��� 
class Outer {
	public static Inner method() {
		return new Inner() {//�����new Inner()����ʵ��Inner�ӿڵ����ʵ������
			public void show() {//��дshow()�����������public��ȥ����? -- һ�����ܣ���
				System.out.println("HelloWorld");
			}
		};
	}
}
*/
/*
class OuterDemo {
	public static void main(String[] args) {
		Outer.method().show();
	*/	
		/*
			1:Outer.method()���Կ���method()Ӧ����Outer�е�һ����̬������
			2:Outer.method().show()���Կ���method()�����ķ���ֵ��һ������
				�����ڽӿ�Inner����һ��show()����,��������Ϊmethod()�����ķ���������һ���ӿڡ�
		*/
		/*
	}
}
*/
