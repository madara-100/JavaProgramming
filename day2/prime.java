package day2;

import java.util.Scanner;


public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i=2;
		boolean counter = true;
		while(i*i<n) {
			if(n%i==0) {
				counter = false;
				break;
			}
			i++;
		}
		if(counter==true)
			System.out.println("Prime");
		else {
		System.out.println("not Prime");
		}

	}

}
