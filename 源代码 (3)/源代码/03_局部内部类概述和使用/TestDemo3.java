/*
	�ֲ��ڲ���
		A:����ֱ�ӷ����ⲿ��ĳ�Ա
		B:�ھֲ�λ�ã����Դ����ֲ��ڲ������ͨ���ö���������ķ�������ʹ�þֲ��ڲ��๦�ܡ�
	
	�����⣺
		�ֲ��ڲ�����ʾֲ�������ע������?
			A:�ֲ��ڲ�����ʱ��ؾֲ�����������final����
			B:Ϊʲô��?
				�ֲ����������ŷ����ĵ��ö����ã����ŵ�����϶���ʧ��
				�����ڴ�����ݲ�����������ʧ�����ԣ����Ǽ�final���Ρ�
				����final���κ���������ͳ��˳�����
				��ʱnum3���ڴ��д洢�ľ�������30������������ʹ�á�(��ͨ�������빤�߲鿴��)
					
			�����빤�ߣ����԰�.class�ֽ����ļ��������.javaԴ���롣
*/
class Outer {
	private int num  = 10;
	
	public void hello() {
		int num2 = 20;
		final int num3 = 30;
		
		class Inner {
			public void show() {
				System.out.println(num);//��ȷ
				//System.out.println(num2);//����: ���ڲ����з��ʱ��ر���num2; ��Ҫ������Ϊ��������
				System.out.println(num3);//�ֲ��ڲ�����ʱ��ر���,����������final����
			}
		}
		
		Inner i = new Inner();
		i.show();
	}
}

class TestDemo3 {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.hello();
	}
}