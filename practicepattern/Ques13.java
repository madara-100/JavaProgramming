package practicepattern;

import java.util.Scanner;

public class Ques13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		no of rowqs :2*n-1
//		work in a single row : nst*
//		updation : nst-=1 nrow +=1 syso
//		initial value : nst =n nsp =2 row =1
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int row =1;
	
		int nst=1;
		while(row<=2*n-1) {
			
			int cst=1;
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
			}
			if(row<n) {
				nst++;
			}
			else if(row>=n) {
				nst--;
			}
			System.out.println();
			row+=1;
			
		}

	}

}
