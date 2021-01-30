/*
	如果成员内部类是静态的，同时内部类中还有静态方法该怎么访问？
*/
class Outer {
	private int num = 100;
	private static int snum = 200;
	
	//成员内部类，因为在成员位置定义的
	//疑问：根据前面所讲，类的修饰符只能是 默认，public，final，abstract。为什么这里可以用static呢？
	//解答：因为这里把当前类Inner看作是外部类Outer的一个成员变量了。
	static class Inner {//静态成员内部类(注意：静态成员内部类访问的外部类数据必须用静态修饰。)
		public void show() {
			//System.out.println("num="+num);//错误: 无法从静态上下文中引用非静态 变量 num
			System.out.println("snum="+snum);//正确
			//hello();
			//hello2();//错误: 无法从静态上下文中引用非静态
		}
		
		
		public static void show2() {
			//System.out.println("num="+num);//错误: 无法从静态上下文中引用非静态 变量 num
			System.out.println("snum="+snum);//正确
			//hello();
			//hello2();//错误: 无法从静态上下文中引用非静态
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
		//方式一：访问成员内部类的show()方法
		Outer o = new Outer();
		o.print();
		
		
		System.out.println("----------");
		
		//方式二：采用 外部类名.内部类名 对象名 = new 外部类.内部类对象;
		Outer.Inner oi = new Outer.Inner();
		oi.show();
		
		
		System.out.println("----------");
		
		//方式三：
		//访问成员静态内部类，最简单的方式。有个前提：静态成员内部类的方法，也是一个静态方法！
		Outer.Inner.show2();
	}
}