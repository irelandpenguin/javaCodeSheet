/*
	���get������set����
*/
class MidStudent {
	String name;//������Ĭ��ֵΪnull
	int age;//���䣬Ĭ��ֵΪ0
	char sex;//�Ա�Ĭ��ֵΪ'\u0000'
	String address;//��ַ��Ĭ��ֵΪnull
	
	public void show() {//�÷����Ĺ��ܣ���ӡѧ����Ϣ
		System.out.println("����:"+name+", ����:"+age+", �Ա�:"+sex+", ��ַ:"+address);
	}
	
	//���·������ǻ�ȡѧ��������Ϣ��
	public String getName() {//�÷����Ĺ��ܣ���ȡѧ������
		return name;
	}
	
	public int getAge() {//�÷����Ĺ��ܣ���ȡѧ������
		return age;
	}
	
	public char getSex() {//�÷����Ĺ��ܣ���ȡѧ���Ա�
		return sex;
	}
	
	public String getAddress() {//�÷����Ĺ��ܣ���ȡѧ����ַ
		return address;
	}
	
	
	//���·�����������ѧ��������Ϣ��
	public void setName(String ne) {
		name = ne;
	}
	
	public void setAge(int ae) {
		age = ae;
	}
	
	public void setSex(char sx) {
		sex = sx;
	}
	
	public void setAddress(String as) {
		address = as;
	}
	
	
	//�÷����Ĺ��ܣ�����ѧ����Ϣ
	public void setInformation(String ne, int ae, char sx, String as) {
		name = ne;
		age = ae;
		sex = sx;
		address = as;
	}
	
}

class StudentDemo2 {
	public static void main(String[] args) {
		MidStudent stu = new MidStudent();
		
		//����ѧ����Ϣ
		stu.name = "�˴ﻥ��";
		stu.age = 5;
		stu.sex = 'M';
		stu.address = "���ﳵ�����ʹڿƼ�԰2��3¥";
		
		//��ʾѧ����Ϣ
		String name = stu.getName();
		int age = stu.getAge();
		char sex = stu.getSex();
		String addr = stu.getAddress();
		System.out.println("����:"+name+", ����:"+age+", �Ա�:"+sex+", ��ַ:"+addr);
		
		System.out.println("-----------");
		
		
		//����ѧ����Ϣ
		stu.setName("��С��");
		stu.setAge(26);
		stu.setSex('F');
		stu.setAddress("������ɽ��ʯ��");
		stu.show();//��ʾѧ����Ϣ
		
		System.out.println("-----------");
		
		//����ѧ����Ϣ
		stu.setInformation("����",35,'M',"�����������ĳ�");
		stu.show();//��ʾѧ����Ϣ
		
	}
}