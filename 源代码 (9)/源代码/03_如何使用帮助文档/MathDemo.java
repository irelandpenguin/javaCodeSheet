/*
	ѧϰʹ��ϵͳ���ĵ�˵���飬����java�����ĵ���


	Math:���������ִ�л�����ѧ����ķ���
	
	����Math����java.lang���£����Բ���Ҫ������
	
	�ص㣺
		û�й��췽������Ϊ���ĳ�Աȫ���Ǿ�̬�ġ�
		
	������������������
		��ȡ���ֵ
		public static int max(int a, int b)
		
		��ȡ��Сֵ
		public static int min(int a, int b)
		
		��ȡ����������ش����ŵ� double ֵ����ֵ���ڵ��� 0.0 ��С�� 1.0��
		public static double random()
*/
class MathDemo {
	public static void main(String[] args) {
		int a = 100, b = 89;
		int maxValue = Math.max(a, b);
		int minValue = Math.min(a, b);
		System.out.println("���ֵΪ"+maxValue+",��СֵΪ"+minValue);

		
		System.out.println("----------");
		
		double randNum = Math.random();//0.0��1.0֮�䣬������1.0
		System.out.println("���ɵ������Ϊ"+randNum);
		
		randNum = Math.random()*100+1;//1��100֮�䣬����100
		System.out.println("���ɵ������(1-100֮��)Ϊ"+randNum);
		
		int num = (int)(Math.random()*100+1);
		System.out.println("���ɵ����������(1-100֮��)Ϊ"+num);
		
		System.out.println("----------");
		
		for (int i = 1; i <= 50; i++) {
			int aNum = (int)(Math.random()*100+1);
			System.out.println("���ɵ����������(1-100֮��)Ϊ"+aNum);
		}
		
	}
	
}
