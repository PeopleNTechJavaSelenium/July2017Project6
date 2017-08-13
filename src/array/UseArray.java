package array;

import java.util.Random;

public class UseArray {

	public static void main(String[] args) {
		Random rm = new Random();
		int [] arrayOfNum = new int[10];
		for(int i=0; i<arrayOfNum.length; i++) {
		   arrayOfNum[i] = rm.nextInt(500);
		}
		for(int j=0; j<arrayOfNum.length; j++) {
		    System.out.println(arrayOfNum[j]);
		}
		for(int ign:arrayOfNum) {
			System.out.println(ign);
		}
	}
}
