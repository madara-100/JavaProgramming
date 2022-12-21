package practicepattern;

import java.util.Scanner;

public class Ques15 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		
		// TODO Auto-generated method stub
//		no of rows :2*n-1
//		work in a single row : nsp ,nst
//		updation : if row<=n nsp+=2  nst--  if row>n nsp-=2  nst++ ; 
//		initial values : nst =5 nsp=0 row=1 
		int row =1;
		int nst =n;
		int nsp=0;
		while(row <=2*n-1){
			int csp=1;
			while(csp<=nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst =1;
			while(cst<= nst) {
				System.out.print("* ");
				cst++;
			}
			if(row<n) {
				nsp+=2;
				nst--;
			}
			else {
				nsp-=2;
				nst++;
			}
			System.out.println();
			row++;
		}
	}

}
