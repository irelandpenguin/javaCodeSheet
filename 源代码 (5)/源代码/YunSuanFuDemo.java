/*
	��ֵ�������
		�����ĸ�ֵ�������=
			��=�ұߵ����ݸ�ֵ����ߡ�
			
		��չ�ĸ�ֵ�������+=,-=,*=,/=,%=
			+= ����ߺ��ұ����ӷ���Ȼ��ֵ����ߡ�
*/
class YunSuanFuDemo {
	public static void main(String[] args) {
		int m = 3; //�����=��ʾ��ֵ�����
		System.out.println("m="+m);//m=3
		
		int n = 2, p;
		p = n;//��n��ֵ��ֵ������p
		System.out.println("p="+p);
		
		m = n = p = 12;//��12��ֵ��p���ٰѱ���p��ֵ��ֵ��n���ٰѱ���n��ֵ��ֵ��m�����ԣ�3��������ֵһ��
		System.out.println("m="+m+",n="+n+",p="+p);
		
		m = 2;
		
		m += 2;//��Ч�� m = m+2; ����m��ֵΪ4
		System.out.println("m += 2��ֵΪ"+m);
		
		m -= 2;//��Ч�� m = m-2; ����m��ֵΪ2
		System.out.println("m -= 2��ֵΪ"+m);
		
		
		m *= 2;//��Ч�� m = m*2; ����m��ֵΪ4
		System.out.println("m *= 2��ֵΪ"+m);
		
		m /= 2;//��Ч�� m = m/2; ����m��ֵΪ2
		System.out.println("m /= 2��ֵΪ"+m);
		
		m %= 2;//��Ч�� m = m%2; ����m��ֵΪ0
		System.out.println("m %= 2��ֵΪ"+m);
	
	}
}