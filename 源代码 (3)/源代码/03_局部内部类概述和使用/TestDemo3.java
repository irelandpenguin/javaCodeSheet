/*
	局部内部类
		A:可以直接访问外部类的成员
		B:在局部位置，可以创建局部内部类对象，通过该对象调用它的方法，来使用局部内部类功能。
	
	面试题：
		局部内部类访问局部变量的注意事项?
			A:局部内部类访问本地局部变量必须用final修饰
			B:为什么呢?
				局部变量是随着方法的调用而调用，随着调用完毕而消失。
				而堆内存的内容并不会立即消失。所以，我们加final修饰。
				加入final修饰后，这个变量就成了常量。
				此时num3在内存中存储的就是数据30，所以能正常使用。(可通过反编译工具查看下)
					
			反编译工具：可以把.class字节码文件，反译成.java源代码。
*/
class Outer {
	private int num  = 10;
	
	public void hello() {
		int num2 = 20;
		final int num3 = 30;
		
		class Inner {
			public void show() {
				System.out.println(num);//正确
				//System.out.println(num2);//错误: 从内部类中访问本地变量num2; 需要被声明为最终类型
				System.out.println(num3);//局部内部类访问本地变量,变量必须用final修饰
			}
		}
		
		Inner i = new Inner();
		i.show();
	}
}

class TestDemo3 {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.hello();
	}
}