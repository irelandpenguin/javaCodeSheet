/*
	��Ա�����빹�췽��������
		���췽��
			��������������ͬ��û�з�������Ҳû�з���ֵ;
		
		��Ա����
			���ݷ���ֵ��
				void����
				��void����
			��ʽ������
				�ղη���
				�ǿղη���
*/

class Student {
	private String name;
	
	//�����ǹ��췽��
	public Student() {//�޲ι��췽��
		
	}
	
	public Student(String name) {//��1�������Ĺ��췽��
		this.name = name;
	}
	
	//�����ǳ�Ա����
	public String getName() {//�޲������з���ֵ�ķ���
		return name;
	}
	
	public void setName(String name) {//�в������޷���ֵ�ķ���
		this.name = name;
	}
	
	public void hello() {//�޲������޷���ֵ�ķ���
		System.out.println("hello");
	}
	
	public String getInformation(String name) {//�в������з���ֵ�ķ���
		this.name = name;
		return name;
	}
}

class StudentDemo {
	public static void main(String[] args) {
		Student s = new Student();//���������޲ι��췽��
		s.setName("����");//���������в������޷���ֵ�ķ���
		System.out.println(s.getName());//���������޲������з���ֵ�ķ���
		s.hello();//���������޲������޷���ֵ�ķ���
		String info = s.getInformation("����");//���������в������з���ֵ�ķ���
		System.out.println(info);
		
		
		Student s2 = new Student("��С��");//��������в����Ĺ��췽��
		System.out.println(s2.getName());//���������޲������з���ֵ�ķ���
	}
}