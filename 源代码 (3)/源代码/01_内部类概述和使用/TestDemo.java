/*
	内部类的概述与使用

	内部类概述:
		把类定义在其他类的内部，这个类就被称为内部类。
		
	内部类划分：
		成员内部类
			在成员位置定义的类，被称为成员内部类。
		局部内部类
			在局部位置定义的类，被称为局部内部类。
	
	内部类的访问特点：
		内部类可以直接访问外部类的成员(成员变量和成员方法)，包括私有。
	
*/
class Outer {
	private int num = 100;
	
	//成员内部类，因为在成员位置定义的。所以，可以把当前类Inner看作是外部类Outer的一个成员变量。
	class Inner {//成员内部类
		//成员变量
		public int num2 = 90;
		private int num3 = 12;
		
		//构造方法
		
		public void show() {//成员方法
			System.out.println("成员内部类打印num="+num);
		}
		
		public int getNum3() {
			return num3;
		}
	}
	
	
	public void hello() {	
		//局部内部类,因为在方法里面。
		class Inner2 {//局部内部类
			//成员变量
			
			//构造方法
		
			public void show() {
				System.out.println("局部内部类打印num="+num);
			}
		}
		
		//访问局部内部类
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
		//访问成员内部类有以下方式
		//方式一：访问成员内部类的show()方法
		Outer o = new Outer();
		o.print();
		
		//方式二：采用 外部类名.内部类名 对象名 = 外部类对象.内部类对象;
		Outer.Inner oi = new Outer().new Inner();
		oi.show();
		System.out.println(oi.num2);
		System.out.println(oi.getNum3());
		
		
		System.out.println("---------");
		
		//访问局部内部类
		o.hello();
	}
}
