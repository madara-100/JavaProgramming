package practicepattern;

import java.util.Scanner;

public class Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		no or rows : 5
//		work in a single row : nst* and nsp_
//		updation : nst+=1 nsp-=1 row+=1 sysoln
//		initial value : nsp=n-1 nst =1 row =1  
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int row=1;
		int nst =1;
		int nsp=n-1;
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
			nsp -=1;
			System.out.println();
			nst+=1;
			row+=1;
			
		}
	}

}
