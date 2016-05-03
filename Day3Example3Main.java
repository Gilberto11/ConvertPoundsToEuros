import java.util.Scanner;

public class Day3Example3Main {

	public static void main(String[] args) {
		// Write a program that converts from pounds to euros
		//ask the user to put a start and end value
		
		double start, end, pounds, euros;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a start value in pounds: ");
		start = input.nextDouble();
		System.out.println("Enter an end value in pounds: ");
		end = input.nextDouble();
		
		if (start > end){
			System.out.println("Sorry that is not a valid range");
					
		} else {
			System.out.println("Conversion from pounds to euros");
			for (pounds = start; pounds <=end; pounds=  pounds +1){
				euros = (pounds / 0.71);
				System.out.println(pounds + " Pounds = " + euros + " Euros ");
				
				
			}
		}
	}

}
