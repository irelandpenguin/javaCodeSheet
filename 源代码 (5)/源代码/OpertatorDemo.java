/*
	�߼��������
		&,|,^
		!,&&,||
		
	�ص㣺
		�߼������һ����������boolean���͵ı��ʽ����ֵ��
			(a+b) && (a==b)
			
		���ʽ��������������ѳ������߱������������ķ���java�﷨��ʽ�ӡ�
			�������ʽ��a + b
			�Ƚϱ��ʽ��a == b
			
			
	���ۣ�
		&�߼���:��false��false��
		|�߼���:��true��true��
		^�߼����:��ͬΪfalse����ͬΪtrue��
			���������¹�ϵ������,��Ů,Ů��,ŮŮ
		!�߼���:��false��true����true��false��
		&&�߼��룺��false��false���뵥��&���������&&�����Ϊ��ʱ���ұ߲��ڼ��㡣������&���Ҷ�Ҫ���㡣
		||�߼�����true��true���뵥��|���������||�����Ϊ��ʱ���ұ߲��ڼ��㡣������|���Ҷ�Ҫ���㡣
*/
class OpertatorDemo {
	public static void main(String[] args) {
		int a = 3, b = 4, c = 5;
		
		/*
		//&�߼���:��false��false��
		System.out.println((a>b) & (a>c));//false & false = false
		
		System.out.println((a>b) & (a<c));//false & true = false
		
		System.out.println((a<b) & (a>c));//true & false = false
		
		System.out.println((a<b) & (a<c));//true & true = true
		System.out.println("-----------------");
		*/
		
		/*
		//|�߼���:��true��true��
		System.out.println((a>b) | (a>c));//false | false = false
		System.out.println((a>b) | (a<c));//false | true = true
		System.out.println((a<b) | (a>c));//true | false = true
		System.out.println((a<b) | (a<c));//true | true = true
		System.out.println("-----------------");
		*/
		
		//^�߼����:��ͬΪfalse����ͬΪtrue��
		System.out.println((a>b) ^ (a>c));//false ^ false = false
		System.out.println((a>b) ^ (a<c));//false ^ true = true
		System.out.println((a<b) ^ (a>c));//true ^ false = true
		System.out.println((a<b) ^ (a<c));//true ^ true = false
		System.out.println("-----------------");
		
		
		/*
		//!�߼���:��false��true����true��false��
		System.out.println(!(a>b));//!false = true
		System.out.println(!(a<b));//!true = false
		System.out.println(!!(a<b));//!true = false -> !false = true
		//System.out.println("-----------------");
		*/
		
		//int a = 3, b = 4, c = 5;
		/*
		//&&�߼���:��false��false��
		System.out.println((a>b) && (a>c));//false && false = false
		System.out.println((a>b) && (a<c));//false && true = false
		System.out.println((a<b) && (a>c));//true && false = false
		System.out.println((a<b) && (a<c));//true && true = true
		System.out.println("-----------------");
		*/
		/*
		//||�߼���:��true��true��
		System.out.println((a>b) || (a>c));//false || false = false
		System.out.println((a>b) || (a<c));//false || true = true
		System.out.println((a<b) || (a>c));//true || false = true
		System.out.println((a<b) || (a<c));//true || true = true
		*/
	}
}