package practicepattern;

import java.util.Scanner;

public class Ques11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int row =1;
		int nsp=n-1;
		int nst=1;
		while(row<=n) {
			int csp =1;
			while(csp<=nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst=1;
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
			}
			nsp--;
			System.out.println();
			nst+=2;
			row+=1;
			
		}

	}

}
