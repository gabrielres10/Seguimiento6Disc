package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String output = null;
		while(n != 0) {
			ArrayList<int []> wagons = new ArrayList<>();
			output = "";
			int newInt = 0;
			do {
				wagons.add(new int[n]);
				for(int i = 0; i < n; i++) {
					newInt = sc.nextInt();
					if(newInt == 0) {
						break;
					}else {
						wagons.get(wagons.size() -1 )[i] = newInt;
					}
				}
			}while(newInt != 0);
			for(int [] tempArray : wagons) {
				if(tempArray[0] != 0) {
					int condition = tempArray[0] - tempArray[1];
					for (int i = 0; i < tempArray.length-1; i++) {
						if((tempArray[i] - tempArray[i+1]) != condition) {
							condition = 0;
							output += "No\n";
							break;
						}
					}
					if(condition == tempArray[0] - tempArray[1]) {
						output += "Yes\n";
					}
				}
			
			}
			n = sc.nextInt();
			System.out.println(output);
		}
	}
}

