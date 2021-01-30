/*
	匿名内部类在开发中的使用
		本质是一个继承了该类的子类对象或实现了该接口的类的实例对象。
*/
interface Person {//接口
	public abstract void study();
}

class Outer {
	public void show(Person i) {//接口名作为形式参数
		i.study();//多态的体现(编译看左边，运行看右边)
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
		
		
		o.show(new Person() {//这里的new Person()就是实现Person接口的类的实例对象
			public void study() {
				System.out.println("good good study, day day up!");
			}
		});
		
	}
}