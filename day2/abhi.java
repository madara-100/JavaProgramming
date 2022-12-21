package day2;

import java.util.Scanner;

public class abhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		int sum=0;
		while(i<=n) {
			sum+=i;
			i+=1;
		}
		System.out.println(sum);

	}

}
