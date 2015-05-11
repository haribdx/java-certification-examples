//learning making making basic calculator
package frist;
import java.util.Scanner;

public class Basics1 {
	public static void main(String args[]){
		Scanner var = new Scanner(System.in); //variable for scanner
		double fnum,snum,answer;
		System.out.println("enter frist num: ");
		fnum =var.nextDouble();  //stores the frist num
		System.out.println("Enter second num : ");
		snum = var.nextDouble(); //store second num
		answer =fnum+snum;
		System.out.println(answer);
	}

}
