package practicepattern;

import java.util.Scanner;

public class Ques16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		
		// TODO Auto-generated method stub
//		no of rows :2*n-1
//		work in a single row : nsp ,nst
//		updation : if row<n nsp-=1  nst-=2  if row>n nsp+=1  nst+=2 ; 
//		initial values : nst =5 nsp=n-1 row=1 
		int row =1;
		int nst =n;
		int nsp=n-1;
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
				nsp-=1;
				nst-=1;
			}
			else {
				nsp+=1;
				nst+=1;
			}
			System.out.println();
			row++;
		}

	}

}
