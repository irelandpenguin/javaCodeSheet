/*
	java�з����Ĳ�������δ��ݵģ�
		��������(byte,short,int,long,float,double,char,boolean)����ֵ����;
		��������(���飬�࣬�ӿ�)����ַ���ݡ�
*/
class MethodDemo {
	public static void main(String[] args) {
		//����1��
		int a = 10, b = 20;
		int s = sum(a, b);//�������ͣ���������ֵ
		System.out.println("a="+a+",b="+b+",s="+s);//a=10,b=20,s=60
		
		
		System.out.println("---------");
		
		//����2��
		int[] arr = {1,2,3,4,5,6};
		System.out.println("-----"+arr);
		test(arr);//�������ͣ������ǵ�ַ
		
		//��ӡ����arr������Ԫ��
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]+" ");
		}
		
		System.out.println("\n---------");
		
		//����3. С����С�죬С��3�˲μ���ĩ����(���ģ���ѧ��Ӣ��)��С���ĳɼ�Ϊ{80.5, 92, 88.5}, С��ĳɼ�Ϊ{93, 68.5, 76},С�ŵĳɼ�Ϊ{53.5, 81, 77}�������ſγ̵�ƽ���ɼ���
		double[][] grades = {{80.5, 92, 88.5},{93, 68.5, 76},{53.5, 81, 77}};
		double[] grade = new double[3];//����һ��һά���飬�������ſγ̵�ƽ���ɼ�
		getGrade(grades, grade);//�������ͣ������ǵ�ַ
		System.out.println("����ƽ���ɼ�Ϊ"+grade[0]+"\n"+"��ѧƽ���ɼ�Ϊ"+grade[1]+"\n"+"Ӣ��ƽ���ɼ�Ϊ"+grade[2]);
		
	}
	
	public static int sum(int a, int b) {
		a = a*2;
		b = b*2;
		System.out.println("a="+a+",b="+b);//a=20,b=40
		int c = a+b;
		return c;
	}
	
	public static void test(int[] a) {
		System.out.println("====="+a);
		for (int i = 0; i < a.length; i++) {
			if (i%2 == 0) {
				a[i] = a[i]*2;
			}
		}
	}
	
	public static void getGrade(double[][] grades, double[] grade) {
		for (int i = 0; i < grades.length; i++) {
			double tmp = 0;
			for (int j = 0; j < grades[i].length; j++) {
				tmp += grades[j][i];
			}
			grade[i] = tmp/3;//��ȡƽ���ɼ�
		}
	}
}