/*
	�̳��й��췽���Ĺ�ϵ
		A:���������еĹ��췽��Ĭ�϶�����ʸ������޲εĹ��췽����������
		B:Ϊʲô��?
			��Ϊ�����̳и����е����ݣ����ܻ���ʹ�ø�������ݡ�
			���ԣ������ʼ��֮ǰ��һ��Ҫ����ɸ������ݵĳ�ʼ����
			
			ע�⣺����ÿһ�����췽���ĵ�һ�����Ĭ�϶��ǣ�super(); ֻ�������������ˡ�
*/
class Father {
	public String name;
	public int age;
	
	public Father() {
		System.out.println("Father���޲ι��췽��");
	}
	
	public Father(String name, int age) {
		System.out.println("Father�Ĵ��ι��췽��");
		this.name = name;
		this.age = age;
	}
}

class Son extends Father {
	public Son() {
		//super();//�������ʾ�ĵ����˸�����޲ι��죬��ʱ��ϵͳ�Ͳ�������ʽ���ø�����޲ι�����
		System.out.println("Son���޲ι��췽��");
	}
	
	public Son(String name, int age) {
		//super();//�������ʾ�ĵ����˸�����޲ι��죬��ʱ��ϵͳ�Ͳ�������ʽ���ø�����޲ι�����
		//super(name,age);//�������ʾ�����˸���Ĵ��ι��죬��ʱ��ϵͳ�Ͳ�������ʽ���ø�����޲ι�����
		System.out.println("Son�Ĵ��ι��췽��");
		this.name = name;
		this.age = age;
	}
}

class ExtendsDemo1 {
	public static void main(String[] args) {
		Son s = new Son();
		
		//System.out.println("---------");
		
		Son s2 = new Son("����", 27);
	}
}