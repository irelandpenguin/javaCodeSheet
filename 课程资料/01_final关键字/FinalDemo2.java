/*
	�����⣺final���ξֲ�����������
		�������ͣ��������͵�ֵ���ܷ����ı䡣
		�������ͣ��������͵ĵ�ֵַ���ܷ����ı䣬���ǣ��ö���ĳ�Ա������ֵ�ǿ��Ըı�ġ�
*/
class Son {
	public String name;
	public int age;
	
	public Son(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println("����:"+name+",����:"+age);
	}
}

class FinalDemo2 {
	public static void main(String[] args) {
		//final���λ�������ʱ���������͵�ֵ���ܷ����ı䡣
		int num = 10;
		final int num2 = 20;
		System.out.println("num="+num+",num2="+num2);
		num = 100;
		//num2 = 200;//������Ϊʹ��final���ε�ֵ���ܸı䡣
		System.out.println("num="+num+",num2="+num2);
		
		System.out.println("----------");
		
		//final������������ʱ���������͵ĵ�ֵַ���ܷ����ı䡣���ǣ��ö���Ķ��ڴ��ֵ�ǿ��Ըı�ġ�
		final Son s = new Son("��СС", 12);
		s.show();
		
		//���ǣ��ö���Ķ��ڴ��ֵ�ǿ��Ըı�ġ�
		s.name = "��С";
		s.age = 14;
		s.show();
		
		//System.out.println("----------");
		
		//s = new Son("��С��", 16);//������Ϊfinal���ε��������͵ĵ�ַ���ܷ����ı䡣
		
	}
}