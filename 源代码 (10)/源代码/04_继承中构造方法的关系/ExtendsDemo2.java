/*
	����Ѹ���Ĺ��췽����ע�͵������ʸ��໹�й��췽����
		һ���У���Ϊ�������Դ���һ�����ص��޲ι��췽����

	�������û���޲ι��췽������ô����Ĺ��췽�������ʲô������?
		����!!
	
	��ν����?	
		A:�ڸ����м�һ���޲ι��췽��
		B:ͨ��ʹ��super�ؼ���ȥ��ʾ�ĵ��ø���Ĵ��ι��췽��
			
	ע�����
		this(...)����super(...)��������ڵ�һ�������!!!
		������Ƿ��ڵ�һ������ϣ��Ϳ��ܶԸ�������ݽ����˶�γ�ʼ�������Ա�����ڵ�һ������ϡ�
			public Son() {
				//��������Եĵ���һ��super();
				System.out.println("Son���޲ι��췽��");
				super();//����������������һ��!
			}
			
	�����ٸ�ϰ�� �̳е�ע�����
		A:����ֻ�ܼ̳и������з�˽�еĳ�Ա(��Ա�����ͳ�Ա����)
		B:���಻�ܼ̳и���Ĺ��췽�������ǿ���ͨ��super�ؼ���ȥ���ʸ��๹�췽����
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
		//super();//��ʾ���ø����޲ι��췽��
		//super("",0);//��ʾ���ø�����ι��췽��
		System.out.println("Son���޲ι��췽��");
	}
	
	public Son(String name, int age) {
		//super(name, age);//��ʾ���ø�����ι��췽��
		System.out.println("Son�Ĵ��ι��췽��");
		this.name = name;
		this.age = age;
	}
}

class ExtendsDemo2 {
	public static void main(String[] args) {
		Son s = new Son();
		
		System.out.println("---------");
		
		Son s2 = new Son("����", 27);
	}
}