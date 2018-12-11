package com.tom;

import java.util.ArrayList;
import java.util.Random;

public class Poker {
//	int[] cards = new int[52];
//	Card[] cards = new Card[52];
	ArrayList box = new ArrayList();
	public Poker() {
		for(int i=0; i<52; i++) {
//			cards[i] = i;
			Card c = new Card(i);
			box.add(c);
		}
		System.out.println(box.size());
	}
	
	public void shuffle() {
		for(int i=0; i<52; i++) {
			int r = new Random().nextInt(52);
			//a = cards[i]
			//b = cards[r]
			Card c = (Card)box.get(i);
			Card d = (Card)box.get(r);
			Card temp = c;
			c = d;
			d = temp;
			//¥´¶Ã¶¶§Ç
		}
	}
	
	public void print() {
		for(int i=0; i<52; i++) {
			Card c = (Card)box.get(i);
			System.out.print(c.get() + " ");
			
			if(i%13 == 12){
				System.out.println();
			}
		}
	}
	
	public void add() {
		for(int p=0; p<1; p++) {
			for(int i=0; i<52; i++) {
				Card c = (Card)box.get(i);
				System.out.print(c.get() + " ");
			
				if(i%13 == 12) {
					System.out.println();
				}
			}
		}
	}
}
