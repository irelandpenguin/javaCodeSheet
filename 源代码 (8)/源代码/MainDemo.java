/*
	public static void main(String[] args) ����
*/

class MainDemo {
	public static void main(String[] args) {
		//public:��ʾ�����ģ������������á�
		//static:��ʾ��̬�ģ������ʱ���أ����������á�������publicһ��ʹ�ã���ʾ�������෽����������jvm���á�
		//void:�������ؿ�
		//main:�������ƣ����ǳ���ִ�е���ڣ�Ĭ����Ϊjvm����ʱ����ڷ�����
		//String[] args:�������ַ����������ͣ�������Ϊargs
		
		System.out.println(args);//��ӡ�ַ���������ڴ��ַ
		System.out.println(args.length);//��ӡ�ַ���������ܸ���
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		
		//�������д�����ִ������������������
		//java MainDemo
		
		//�������д�����ִ������������������
		//java MainDemo hello java �˴ﻥ��
		
		
		//�ɴˣ������Ƴ�������args�����ڽ��ܼ���¼����Ϣ�ġ�ʵ������Щ�������ڵ�һЩ���������ڶ������ˡ�
		//ԭ������������Scanner����¼�������������ڵ������÷���Scanner��java5.0����汾����ġ�
	}
}