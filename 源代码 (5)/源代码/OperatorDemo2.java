/*
	++,--�������ʹ�ã�
		����ʹ�ã�
			���ڲ�������ǰ��ͺ���Ч��һ����(�����÷������ǱȽϳ�����)
		��������ʹ�ã�
			���ڲ�������ǰ�棬�����������Լ���Ȼ���ٲ������㡣
			���ڲ������ĺ��棬�Ȳ������㣬�����������Լ���
			
	���ã����ǶԱ�����������1�����Լ�1��
*/
class OperatorDemo2 {
		public static void main(String[] args) {
			//������������
			int x = 3;
			int y = 4;
			
			//�ַ�����ƴ��
			//System.out.println("x:"+x);
			//System.out.println("y:"+y);
			
			System.out.println("x:"+x+",y:"+y);//x:3,y:4
			
			//����ʹ��
			//x++;
			//y--;
			//++x;//x��ֵ��Ϊ4
			//--y;//y��ֵ��Ϊ3
			//System.out.println(x);
			//System.out.println("x:"+x+",y:"+y);//x:4,y:3
			
			
			
			//���������,�����ǲ�������������
			//System.out.println(10++);
			
			System.out.println("-------------------");
			//��������ʹ��
			int a = 3;
			int b = 4;
			
			//int c = ++a;//a�����Ѽ�1��Ȼ���ٰ��Լ���ֵ��ֵ������c
			//a=4,c=4
			//System.out.println("a="+a+",c="+c);
			//int d = --b;//b���Լ���1��Ȼ���ٰ��Լ���ֵ��ֵ������d
			//b=3,d=3
			//System.out.println("b="+b+",d="+d);
			
			
			int c = a++;//����a�Ȱ��Լ���ֵ��������c��Ȼ���Լ��ټ�1
			//c=3,a=4
			System.out.println("c="+c+",a="+a);
			int d = b--;//����b�Ȱ��Լ���ֵ��������d��Ȼ���Լ��ټ�1
			//d=4,b=3
			System.out.println("d="+d+",b="+b);
		}
}