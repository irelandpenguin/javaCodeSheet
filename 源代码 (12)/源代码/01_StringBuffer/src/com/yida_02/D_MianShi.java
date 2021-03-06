/*
 * 面试题：
 * 1：String,StringBuffer,StringBuilder的区别?
 * 答：
 * 	String是内容不可变的，而StringBuffer,StringBuilder都是内容可变的。
 * 	StringBuffer是同步的，数据安全,效率低;StringBuilder是不同步的,数据不安全,效率高
 * 
 * 2：StringBuffer和数组的区别?
 * 答：
 * 	二者都可以看作是一个容器，装其他的数据。
 * 	但是呢,StringBuffer的数据最终是一个字符串数据。
 * 	而数组可以放置多种数据，但必须是同一种数据类型的。
 * 
 * 3:形式参数问题
 * String作为参数传递，是按基本类型传递还是引用类型传递？
 * StringBuffer作为参数传递 ，是按基本类型传递还是引用类型传递？
 * 答：
 * 	String作为参数传递，是按引用类型传递，但形式参数的改变不影响实际参数;
 * 	StringBuffer作为参数传递，也是按引用类型传递，但形式参数的改变直接影响实际参数。
 */
package com.yida_02;

public class D_MianShi {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		System.out.println(s1 + "---" + s2);// hello---world
		change(s1, s2);
		System.out.println(s1 + "---" + s2);// hello---world

		// String作为参数传递，画图理解一下。
		
		StringBuffer sb1 = new StringBuffer("hello");
		StringBuffer sb2 = new StringBuffer("world");
		System.out.println(sb1 + "---" + sb2);// hello---world
		change(sb1, sb2);
		System.out.println(sb1 + "---" + sb2);// hello---worldworld
		 
		// StringBuffer作为参数传递，画图理解一下。
	}

	public static void change(String str1, String str2) {
		str1 = str2;
		str2 = str1 + str2;
	}

	public static void change(StringBuffer sbr1, StringBuffer sbr2) {
		sbr1 = sbr2;
		sbr2.append(sbr1);
	}

}
