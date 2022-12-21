package practicepattern;

import java.util.Scanner;

public class Ques14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
//		no of rows : 2*n-1
//		work in a single row : nsp ,nst
//		updation : nsp --; nst ++ ,row++
//		intial values : nst =1 nsp =n-1 row=1 
		
		int row =1;
		int nst =1;
		int nsp=n-1;
		
		while(row<=2*n-1){
			int csp=1;
			while(csp<=nsp){
				System.out.print("  ");
				csp++;
			}
			int cst =1;
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
			}
			System.out.println();
			row++;
			if(row<=n) {
				nsp--;
				nst++;
			}else {
				nsp++;
				nst--;
			}
		}
		
	}

}
