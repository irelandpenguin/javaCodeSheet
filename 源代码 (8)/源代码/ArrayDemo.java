/*
	дһ�����������飬��װ���õĹ��ܡ������Ժ���á�
	
	ע�⣺��ͬһ�ļ����µ�����java�ļ������ɻ�����ʡ�
		
*/
class ArrayDemo {
	public static void main(String[] args) {
		int[] ary = {12, 45, 2, 67, 709, 6, 32, 54, 78, 18};
		
		//ArrayTool at = new ArrayTool();//����һ������
		//at.show(ary);//ʹ�ö�����÷�������������

		
		//һ�㲻�Ƽ�ʹ��������ʽ���е��á��෽��������ͳһ���������е��á���ֱ��,�������塣
		//���ǣ���Щ"��������"�����߻�����������ʽ���á����ԣ���Ҫ����취�������ǵ��á�
		
		ArrayTool.show(ary);//��������
		
		
		System.out.println("\n----------");
		
		int max = ArrayTool.getMax(ary);//���������е����ֵ
		System.out.println("�����е����ֵΪ"+max);
		
		System.out.println("----------");
		
		int idx = ArrayTool.getIndex(ary, 6);//����6�������е�����λ��
		System.out.println("6�������е�λ��Ϊ"+idx);
		idx = ArrayTool.getIndex(ary, 666);//����666�������е�����λ��
		System.out.println("666�������е�λ��Ϊ"+idx);
		
		
		/*
			�ܽ�һ�£�
				��ǰ��main��������static���εģ�˵��main����Ҳ��ArrayDemo���෽����
				�����Ͻ����ǽ����static֪ʶ���֪��main����ֻ�ܷ����෽�������Ա������
				���ԣ����ǲŻ��ArrayTool��ķ���ʹ��static���Ρ�
		*/
	}
}