/*
	匿名内部类
		就是内部类的简化写法。

	前提：存在一个类或者接口
			这里的类可以是具体类也可以是抽象类。
	
	格式：
		new 类名或者接口名() {
			重写方法;
		}
		
	匿名内部类的本质是什么呢?
		本质是一个继承了该类的子类对象或实现了该接口的类的实例对象。
*/
/*
abstract class Person {//抽象类
	 public abstract void show();
	 public abstract void show2();
}
*/


//也可以把上面的抽象类改成接口，如下：
interface Person {//接口
	 public abstract void show();
	 public abstract void show2();
}


class Outer {
	private int num1 = 10;
	private int num2 = 20;
	
	public void hello() {
		//如果Person是抽象类，此时这里的new Person()就表示继承Person的匿名子类对象
		//如果Person是接口，此时new Person()就表示实现该接口的匿类实例对象
		Person i = new Person() {//利用多态，子类对象赋值给父类引用
			public void show() {
				System.out.println("num1="+num1);
			}
			
			public void show2() {
				System.out.println("num2="+num2);
			}
		};
		
		//调用
		i.show();//编译看左边，运行看右边
		i.show2();//编译看左边，运行看右边
	}
}

class TestDemo {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.hello();
	}
}