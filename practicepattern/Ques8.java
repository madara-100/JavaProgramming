package practicepattern;

import java.util.Scanner;

public class Ques8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
//		no of rows :n
//		rowk in a single row : nst * nsp space
//		updation : row==cst || cst+row ==n+1
//		init values:  row =1 nst=2 nsp =1 
		int row=1;
		int nst =n;
		
		while(row<=n) {
			int cst=1;
			while(cst<=nst){
				if(cst==row || cst+row==n+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				cst++;
			}
			System.out.println();
			row=row+1;
			
		}
		

	}

}
