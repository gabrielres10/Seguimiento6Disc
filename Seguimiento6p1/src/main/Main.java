package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		do{
			ArrayList<Integer> deck = new ArrayList<>();
			for(int i = 1; i<=n; i++) {
				deck.add(i);
			}
			String output = "Discarded cards: ";
			do {
				deck.add(deck.get(1));
				int disc = deck.get(0);
				deck.remove(0);
				deck.remove(0);
				if(deck.size() < 2) {
					output += disc;
				}else {
					output += disc + ", ";
				}
			}while(deck.size() >= 2);
			System.out.println(output);
			System.out.println("Remaining cards: " + deck.get(0));
			n = sc.nextInt();
		}while(n != 0);
	}

}
