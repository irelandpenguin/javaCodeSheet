/*
	匿名内部类面试题：
		按照要求，补齐代码
			interface Inner { void show(); }
			class Outer { //补齐代码 }
			class OuterDemo {
				public static void main(String[] args) {
					  Outer.method().show();
				  }
			}
			要求在控制台输出”HelloWorld”
*/

interface Inner { void show(); }
class Outer { //补齐代码 
	public static Inner method() {
		return new Inner() {//返回 实现了Inner接口的匿名内部类的实例对象
			public void show() {//重写的规则
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
	void show();//接口里的方法修饰符默认为public abstract。面试题里虽然没写，但我们要清楚！
}

//以下为补齐的代码 
class Outer {
	public static Inner method() {
		return new Inner() {//这里的new Inner()就是实现Inner接口的类的实例对象
			public void show() {//重写show()方法，这里的public能去掉吗? -- 一定不能！！
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
			1:Outer.method()可以看出method()应该是Outer中的一个静态方法。
			2:Outer.method().show()可以看出method()方法的返回值是一个对象。
				又由于接口Inner中有一个show()方法,所以我认为method()方法的返回类型是一个接口。
		*/
		/*
	}
}
*/
