/*
	�����⣺
		short s=1;s=s+1; 
		short s=1;s+=1;
		��������������û�����⣬����У����������⡣
		
		short s=1;s=s+1;//����������ģ�short+int=int����s��short�����ԣ�����Ĭ��ת������
		
		short s=1;s+=1;//????
		
		
		Ϊʲô�ڶ���ľ��������?
			��չ�ĸ�ֵ�������ʵ������һ��ǿ������ת����
			
			s += 1;
			���ǵȼ��� s = s + 1;
			���ǵȼ��� s = (s����������)(s + 1);
*/
class YunSuanFuDemo2 {
	public static void main(String[] args) {
		//short s = 1;
		//s = s+1;//��������ʧ�ܣ�����ʧ���ȵĴ�����Ϊs+1�Ľ��Ĭ��Ϊint
		//System.out.println(s);
		
		short s = 1;
		s += 1; // s = (short)(s+1); //���ﲻ�����ʧ�ܣ�Ϊɶ����Ϊ+=�����Ĭ�ϻ����ǿ��ת��
		System.out.println(s);
	}
}
