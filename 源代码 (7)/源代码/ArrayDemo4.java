/*
	��ά����
		��ʽ2��
			��������[][] ������ = new ��������[m][];
			
			m�������ά�����ж��ٸ�һά���ݡ�
			����û��������ʾ���Զ�̬�ĸ��������һ���仯��һά���顣
			
			������int[][] arr = new int[3][];
			
		��ά�����ʼ����
			A����̬��ʼ��;
			B����̬��ʼ��;
*/
class ArrayDemo4 {
	public static void main(String[] args) {
		int[][] arr = new int[3][];//��̬������ά����
		System.out.println(arr);//��ӡ��ά����ĵ�ַ
		System.out.println(arr[0]);//��ӡ��ά�������һ��һά����ĵ�ַ  null
		System.out.println(arr[1]);//��ӡ��ά������ڶ���һά����ĵ�ַ  null
		System.out.println(arr[2]);//��ӡ��ά�����������һά����ĵ�ַ  null
		//System.out.println(arr[0][0]);//��ӡ��ά�������һ��һά����ĵ�һ��Ԫ��   ���ﱨ.NullPointerException�쳣��Ϊɶ��
		
		System.out.println("---------");
		
		//��̬���ٶ�ά������һά������ڴ�
		arr[0] = new int[2];
		arr[1] = new int[3];
		arr[2] = new int[1];
		
		System.out.println(arr);//��ӡ��ά����ĵ�ַ
		System.out.println(arr[0]);//��ӡ��ά�������һ��һά����ĵ�ַ 
		System.out.println(arr[1]);//��ӡ��ά�������һ��һά����ĵ�ַ  
		System.out.println(arr[2]);//��ӡ��ά�������һ��һά����ĵ�ַ  
		System.out.println(arr[0][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[2][0]);
		//System.out.println(arr[2][1]);// ���ﱨArrayIndexOutOfBoundsException�쳣��Ϊɶ��
		
		System.out.println("---------");
		
		//�ֹ���ֵ
		arr[0][0] = 100;
		arr[0][1] = 23;
		arr[1][0] = 90;
		arr[2][0] = 78;
		
		//��ӡ��ά�����������Ԫ��
		for (int i = 0; i < arr.length; i++) {//��������ά�����Ԫ��
			for (int j = 0; j < arr[i].length; j++) {//������һά�����Ԫ��
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("---------");
		
		//����ѭ���������������ֵ 
		int num = 1;
		for (int i = 0; i < arr.length; i++) {//��������ά�����Ԫ��
			for (int j = 0; j < arr[i].length; j++) {//������һά�����Ԫ��
				arr[i][j] = num++;
			}
		}
		
		
		printArray(arr);//��ӡ����Ԫ��
		System.out.println("---------");
		
		//���´���һ����ά���飬��̬��ʼ������Ԫ��
		//int[][] arr2 = new int[][]{{10,20},{1,3,5},{60}};//���Ƽ�
		//Ҳ���Լ򻯣����£�
		int[][] arr2 = {{10,20},{1,3,5},{60}};//�Ƽ�

		printArray(arr2);//��ӡ����Ԫ��
	}
	
	public static void printArray(int[][] a) {//��ӡ����Ԫ��
		for (int i = 0; i < a.length; i++) {//��������ά�����Ԫ��
			for (int k = 0; k < a[i].length; k++) {//������һά�����Ԫ��
				System.out.print(a[i][k]+"\t");//������, "\t"��ʾ�������ĸ�
			}
			System.out.println();//����
		}
	}
}
