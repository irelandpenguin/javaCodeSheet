/*
	private:
		��һ��Ȩ�����η�,��ʾ˽�еġ�
		�������γ�Ա�����ͳ�Ա����;
		�������εĳ�Ա�����ͳ�Ա����ֻ���ڱ����б����ʡ�
	�ô�����֤�����ݵ���˽�ԣ���ȫ�ԡ�
*/
class Student {
	private String name = "�˴ﻥ��";//private���ε���˽�еģ�ֻ�ܵ�ǰ��ʹ��
	private int age = 20;
	private char sex = 'Ů';//����Ĭ��ֵ��Ҳ���Բ���
	
	//��ȡ����
	public String getName() {
		return name;
	}
	
	//��������
	public void setName(String ne) {
		name = ne;
	}
	
	//��ȡ����
	public int getAge() {
		return age;
	}
	
	//��������
	public void setAge(int ae) {
		age =ae;
	}
	
	//��ȡ�Ա�
	public char getSex() {
		return sex;
	}
	
	//�����Ա�
	public void setSex(char sx) {
		sex = sx;
	}
	
	
	//����ѧ����Ϣ
	public void setInfomation(String ne, int ae, char sx) {
		name = ne;
		age = ae;
		sex = sx;
	}
	
	//��ӡѧ����Ϣ
	private void showInformation() {//�����˽�з�����ֻ�ܵ�ǰ�����
		System.out.println("�˴ﻥ�����ѣ�\n"+"����:"+name+",����:"+age+",�Ա�:"+sex);
	}
	
	
	public void show() {
		//showInformation();
		System.out.println("����:"+name+",����:"+age+",�Ա�:"+sex);
	}
}

class StudentDemo {
	public static void main(String[] args) {
		Student stu = new Student();
		
		
		//���¸�ֵ�Ǵ���ģ���Ϊ3����Ա��������private���Σ��� ��˽�еģ�
		//ֻ����Student���з��ʣ��������ܷ���
		//stu.name = "����";
		//stu.age = 25;
		//stu.sex = '��';
		
		//stu.show();
		//System.out.println("����:"+stu.getName()+",����:"+stu.getAge()+",�Ա�:"+stu.getSex());
		
		//���¸�ֵ������ȷ�ģ���Ϊʹ����public�޸ĵķ������з���
		stu.setName("����");
		stu.setAge(25);
		stu.setSex('��');
		System.out.println("����:"+stu.getName()+",����:"+stu.getAge()+",�Ա�:"+stu.getSex());//���� 25 ��
		
		
		//�ٴ���һ��ѧ������
		Student stu2 = new Student();
		stu2.setInfomation("��С��", 22, 'Ů');
		//��ʾѧ����Ϣ��������showInformation����Ϊ���������private���εģ��Ը���粻����
		//stu2.showInformation();
		
		//����ķ����Ϳ��ԣ���Ϊ��public���εģ�������ǹ�����
		stu2.show();
		
	}
}