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
		//印出0~(9-1)index值上的內容
		System.out.println(s.indexOf('e'));
		
		//把s2字串的Tom改成boss
		String s2 = "Jack Tom Eric";
		//			 0123456789012
		String name = "Tom";
		//1.replace
//		System.out.println(s2);
//		name = name.replace("Tom","boss");
//		System.out.print(s2.substring(0,5));
//		System.out.print(name);
//		System.out.println(s2.substring(8));
		
		//2.老師的方法
		int index = s2.indexOf(name);
		System.out.println(s2.substring(0,index) + "boss" + s2.substring(index+name.length()));
		//                 從index值0到4的字串                                                                          從(name的index:5+name的長度3=8)的index值開始印
		
		
		
		//將字串反過來印
		//1.think java
		String r = "";
		for (int i=s.length()-1; i>=0; i-- ) {
			r = r + s.charAt(i);
		}
		System.out.println(r);
		
		//2.老師教
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
