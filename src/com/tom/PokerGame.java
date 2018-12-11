package com.tom;

import java.util.Random;

public class PokerGame {

	public static void main(String[] args) {
		Poker poker = new Poker();
		poker.shuffle();
		poker.print();
		poker.add();
		
		int[] n = new int[50];
		Card[] c = new Card[60];
		System.out.println(n[49]);
		c[0] = new Card(42);
		//在陣列的位子放數字
		System.out.println(c[0].get());
		
//		int[] flowers = {0x2660 , 0x2665 , 0x2666 , 0x2663};
//		int[] pokers = { 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 11 , 12 , 13};
//		for (int i=0; i<pokers.length; i++){
//			System.out.print(pokers);
//		}
//		int[] nums = new int[5];
//		nums[0] = 5;
//		nums[3] = 9;
//		System.out.println(nums[3]);
//		System.out.println(nums.length);
//		for(int i=0; i<nums.length; i++){
//			System.out.println(nums[i]);
		}
//		int poker;
//		int count = 1;
//		for(count=1; count<=4; count++){
//			Random random = new Random();
//			poker = random.nextInt(13)+1;
//			int flower = random.nextInt(4);
//			System.out.print(poker);
//			
//			char c = 0;
//			switch(flower){
//			case 0:
//				c = 'c';
//				break;
//			case 1:
//				c = 'D';
//				break;
//			case 2:
//				c = 'H';
//				break;
//			case 3:
//				c = 'S';
//				break;
//			}
//			System.out.println(c);
//		}

}