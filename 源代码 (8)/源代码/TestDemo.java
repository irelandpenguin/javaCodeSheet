/*
	����ʲôʱ����Ϊ��Ա������
		����������������������������Ϣ�ģ���ô���ñ�����Ӧ�ö���Ϊ��Ա������
		
	�������׶������������?
		�����ķ�Χ��ԽСԽ�á���Ϊ�ܼ�ʱ�ı����ա�
*/
class Teacher {
	//��Ϊ��ʦ�����������䣬���Ǳ���ġ�����������ʦ�ĸ�����Ϣ�����ԣ�name��age����Ϊ��Ա��������ʡ�
	String name;
	int age;
	
	public Teacher() {
		
	}
	
	public Teacher(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println("����:"+name+",����:"+age);
	}
	
	public void eat(String foodName, String drinkName) {//��ʦ�����ɶ��
		String info = foodName+drinkName;//��ʦ��ɶ����ÿ�춼���ܲ�һ������������������ʦ��Ϣ�ġ����ԣ�����ı���info����Ϊ�ֲ�����������
		System.out.println("����ʦ����Է���Ϣ��"+info);
	}
	
	public int sum(int a, int b) {//ѧ������ʦһ�������Ŀ
		int s = a+b;//��Ϊ��Ŀ���ָ�������������������ʦ��Ϣ�����ԣ�����ı���s����Ϊ�ֲ�����������
		return s;
	}
}

class TestDemo {
	public static void main(String[] args) {
		Teacher tea = new Teacher("����ʦ", 45);
		tea.show();
		
		tea.eat("������","+һ������");
		int result = tea.sum(100, 50);
		System.out.println(result);
	}
}