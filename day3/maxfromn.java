package day3;

import java.util.Scanner;

public class maxfromn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max =Integer.MIN_VALUE;
		int i=1;
		while(i<=n) {
			int p = sc.nextInt();
			if(p>max) {
				max=p;
			}
			i++;
		}
		System.out.println(max);

	}

}
