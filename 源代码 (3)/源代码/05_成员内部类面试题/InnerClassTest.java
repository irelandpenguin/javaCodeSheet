/*
	��Ա�ڲ��������⣺
		����Ҫ�������
			class Outer {
				public int num = 10;
				class Inner {
					public int num = 20;
					public void show() {
						int num = 30;
						//System.out.println(?);
						//System.out.println(?);
						//System.out.println(?);
					}
				}
			}
			class InnerClassTest {
				public static void main(String[] args) {
					
				}	
			}
		Ҫ������շֱ����30��20��10��
*/


class Outer {
		public int num = 10;
		class Inner {
			public int num = 20;
			public void show() {
				int num = 30;
				System.out.println(num);//�ͽ�ԭ��
				System.out.println(this.num);//�����this�����ֵ�����
				//System.out.println(new Outer().num);//�����ⲿ�������num
				System.out.println(Outer.this.num);//ͨ���ⲿ�����޶�this����,�Ƽ�!
		}
	}
}


class InnerClassTest {
	public static void main(String[] args) {
		//�ڶ��ַ�ʽ�����ʳ�Ա�ڲ�����ķ���
		Outer.Inner oi = new Outer().new Inner();
		oi.show();
	}	
}



/*
class Outer {
				public int num = 10;
				class Inner {
					public int num = 20;
					public void show() {
						int num = 30;
						System.out.println(num);//�ͽ�ԭ��
						System.out.println(this.num);//�����this�����ֵ�����
						System.out.println(new Outer().num);//�����ⲿ�������num
					}
				}
			}
			class InnerClassTest {
				public static void main(String[] args) {
					//�ڶ��ַ�ʽ�����ʳ�Ա�ڲ�����ķ���
					Outer.Inner oi = new Outer().new Inner();
					oi.show();
				}	
			}
*/