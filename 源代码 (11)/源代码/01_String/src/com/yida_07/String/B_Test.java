package com.yida_07.String;

public class B_Test {

	public static void main(String[] args) {
		String s = "hello", s2 = "hel";
		int result = s.compareTo(s2);
		System.out.println(s+"��"+s2+"�ıȽϽ��Ϊ"+result);//����Ϊʲô�᷵��2�أ�
		if (result > 0) {
			System.out.println(s + "����" + s2);
		} else if (result < 0) {
			System.out.println(s + "С��" + s2);
		} else {
			System.out.println(s + "����" + s2);
		}
	}
	
	/*
	public int compareTo(String anotherString) {
		//�ȼ���this.value.length��value��һ��һά�ַ����飬���ڴ���ַ��������ÿһ���ַ�
        int len1 = value.length;//len1=5
        int len2 = anotherString.value.length;//len2=3
        int lim = Math.min(len1, len2);//lim=3
        char v1[] = value;//v1[]�������Ԫ�ؾ���{'h','e','l','l','o'}
        char v2[] = anotherString.value;//v2[]�������Ԫ�ؾ���{'h','e','l'}

        int k = 0;
        while (k < lim) {//�����limֵΪ3
            char c1 = v1[k];
            char c2 = v2[k];
            if (c1 != c2) {
                return c1 - c2;
            }
            k++;
        }
        return len1 - len2;//�������շ��ص���5-3=2
    }
    */
}
