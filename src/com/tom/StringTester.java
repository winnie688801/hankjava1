package com.tom;

public class StringTester {

	public static void main(String[] args) {
		String s1 = "abc";
		String s4 = new String ("abc");
		System.out.println(s1 == s4);
		String s3 = "abc";
		System.out.println(s1 == s3);
		String s = "pineapple";
		//          012345678
		System.out.println(s.substring(0,9));
		//�L�X0~(9-1)index�ȤW�����e
		System.out.println(s.indexOf('e'));
		
		//��s2�r�ꪺTom�令boss
		String s2 = "Jack Tom Eric";
		//			 0123456789012
		String name = "Tom";
		//1.replace
//		System.out.println(s2);
//		name = name.replace("Tom","boss");
//		System.out.print(s2.substring(0,5));
//		System.out.print(name);
//		System.out.println(s2.substring(8));
		
		//2.�Ѯv����k
		int index = s2.indexOf(name);
		System.out.println(s2.substring(0,index) + "boss" + s2.substring(index+name.length()));
		//                 �qindex��0��4���r��                                                                          �q(name��index:5+name������3=8)��index�ȶ}�l�L
		
		
		
		//�N�r��ϹL�ӦL
		//1.think java
		String r = "";
		for (int i=s.length()-1; i>=0; i-- ) {
			r = r + s.charAt(i);
		}
		System.out.println(r);
		
		//2.�Ѯv��
		for (int i=s.length()-1; i>=0; i-- ) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		
		int n = Integer.parseInt("98");
		n++;
		float f = Float.parseFloat("99.8");
		System.out.println(n + "," + f);
	}
}
