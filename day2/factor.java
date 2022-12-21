package day2;

import java.util.Scanner;

public class factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int n = scn.nextInt();
		int i=1;
		while(i<=n) {
			if(n%i==0) {
				System.out.println(i);
			}
			i+=1;
		}

	}

}
