package practicepattern;

import java.util.Scanner;

public class Ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		no of rows : 5
//		work in a single row : nst* nsp_
//		updation : row+=1 nst -=1 nsp+=1 sysoln
//		intial values : row 1 nsp =0 nst =n 
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int row =1;
		int nsp =0;
		int nst =n;
		while(row<=n) {
			int csp=1;
			while(csp<=nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst=1;
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
			}
			nsp+=1;
			System.out.println();
			nst-=1;
			row+=1;
			
		}
		
	}

}
