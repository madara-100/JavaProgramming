package practicepattern;

import java.util.Scanner;

public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row =1;
		int nst=n;
		while(row<=n) {
			int cst=1;
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
			}
			nst-=1;
			System.out.println();
			row+=1;
		}
	}

}
