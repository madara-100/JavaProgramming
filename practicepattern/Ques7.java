package practicepattern;

import java.util.Scanner;

public class Ques7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		no of row: n
//		work in a single row : nst* ,nsp_
//		updation :  row+=1  syso   n ||1==nst cst ==1 || n  
//		iontial values  nsp =0 nst=n row =1
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int  row =1;
		int nst=n;
		int nsp=0;
		while(row<=n) {
			int csp=1;
			while(csp<=nsp) {
				System.out.println();
				csp++;
			}
			int cst=1;
			while(cst<=nst) {
				if(row==1 || row ==n || cst==1|| cst ==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				cst++;
			}
			System.out.println();
			row+=1;
					
		}
	}

}
