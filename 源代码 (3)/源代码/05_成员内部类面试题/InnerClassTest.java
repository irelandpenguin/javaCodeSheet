/*
	成员内部类面试题：
		按照要求补齐代码
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
		要求请填空分别输出30，20，10。
*/


class Outer {
		public int num = 10;
		class Inner {
			public int num = 20;
			public void show() {
				int num = 30;
				System.out.println(num);//就近原则
				System.out.println(this.num);//这里的this起到区分的作用
				//System.out.println(new Outer().num);//创建外部对象访问num
				System.out.println(Outer.this.num);//通过外部类名限定this对象,推荐!
		}
	}
}


class InnerClassTest {
	public static void main(String[] args) {
		//第二种方式：访问成员内部类里的方法
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
						System.out.println(num);//就近原则
						System.out.println(this.num);//这里的this起到区分的作用
						System.out.println(new Outer().num);//创建外部对象访问num
					}
				}
			}
			class InnerClassTest {
				public static void main(String[] args) {
					//第二种方式：访问成员内部类里的方法
					Outer.Inner oi = new Outer().new Inner();
					oi.show();
				}	
			}
*/