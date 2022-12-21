package practicepattern;

import java.util.Scanner;

public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		no of rows : n
//		work in a single row : nst * print
//		updation : 
//			nst+=1  row+=1  
//		initial value 
//			nst =1 row=1 sysoln
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int row =1;
		int nst =1;
		while(row<=n) {
			int cst=1;
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
			}
			nst+=1;
			System.out.println("");
			row+=1;
			
		}
	}

}
