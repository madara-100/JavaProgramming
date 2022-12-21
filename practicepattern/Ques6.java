package practicepattern;

import java.util.Scanner;

public class Ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		no of rowqs :n
//		work in a single row : nst* nsp_
//		updation : nst-=1 nsp+=2 row +=1 syso
//		initial value : nst =n nsp =2 row =1
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int row =1;
		int nst=n;
		int nsp =0;
		while(row <=n) {
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
			nst -=1;
			System.out.println();
			nsp+=2;
			row+=1;
		}
	}

}
