/*
	��ά�������ϰ
		1. ��һ����ά���飬����������Ԫ�ص��ܺ͡�
		2. С����С�죬С��3�˲μ���ĩ����(���ģ���ѧ��Ӣ��)��С���ĳɼ�Ϊ{80, 92, 88}, С��ĳɼ�Ϊ{93, 68, 76},
		//С�ŵĳɼ�Ϊ{53, 81, 77}��������ƽ���ɼ�����ѧƽ���ɼ���Ӣ��ƽ���ɼ���
*/
import java.util.Scanner;
class ArrayDemo5 {
	public static void main(String[] args) {
		//1. ��һ����ά���飬����������Ԫ�ص��ܺ͡�
		int[][] arr = {{23, 12, 65},{2, 40},{100}};//��̬��ʼ��
		int sum = sum(arr);//�����з���ֵ����Ҫ����
		System.out.println("sum="+sum);
		
		System.out.println("---------");
		
		//2. С����С�죬С��3�˲μ���ĩ����(���ģ���ѧ��Ӣ��)��
		//С���ĳɼ�Ϊ{80, 92, 88}, С��ĳɼ�Ϊ{93, 68, 76},С�ŵĳɼ�Ϊ{53, 81, 77}��
		//������ƽ���ɼ�����ѧƽ���ɼ���Ӣ��ƽ���ɼ���
		double[][] grades = {{80.5, 92, 88.5},{93, 68.5, 76},{53.5, 81, 77}};//��̬��ʼ��
		double[] grade = new double[3];//����һ��һά���飬�������ſγ̵�ƽ���ɼ�
		getGrade(grades, grade);
		System.out.println("����ƽ���ɼ�Ϊ"+grade[0]+"\n"+"��ѧƽ���ɼ�Ϊ"+grade[1]+"\n"+"Ӣ��ƽ���ɼ�Ϊ"+grade[2]);
	}
	
	public static int sum(int[][] arr) {
		int s = 0;
		for(int i = 0; i < arr.length; i++) {//��������ά�����Ԫ��
			for(int j = 0; j < arr[i].length; j++) {//������һά�����Ԫ��
				s += arr[i][j];
			}
		}
		return s;
	}
	
	/*
		double[][] grades = {{80.5, 92, 88.5},{93, 68.5, 76},{53.5, 81, 77}};//��̬��ʼ��
		double[] grade = new double[3];
	*/
	public static void getGrade(double[][] grades, double[] grade) {
		for (int i = 0; i < grades.length; i++) {//��������ά�����Ԫ��
			double tmp = 0;//����һ����ʱ�����������ۼ�ÿ�Ƶĳɼ�
			for (int j = 0; j < grades[i].length; j++) {//������һά�����Ԫ��
				tmp = tmp + grades[j][i];//�ص㣡��
			}
			grade[i] = tmp/3;//��ȡƽ���ɼ�
		}
	}
}