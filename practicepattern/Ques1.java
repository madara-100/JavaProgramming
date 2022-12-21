package practicepattern;

import java.util.Scanner;

public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		no of rows : n
//		work in a single row : nst* print 
//		updation : row =row+1 sysoln
//		initial values : row=1, nst =n
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int row=1;
		int nst =n;
		while(row<=n){
			int cst=1;
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
			}
			System.out.println();
			row++;
		}
		
		
	}

}
