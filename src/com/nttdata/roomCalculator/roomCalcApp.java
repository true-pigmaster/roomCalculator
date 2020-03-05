package com.nttdata.roomCalculator;

import java.util.Scanner;

public class roomCalcApp {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		Scanner floatInput = new Scanner(System.in);
		String menu = "Enter";
		float width = 0; 
		float length = 0; 
		float area = 0;
		byte precision = 2;
		while (!menu.equals("EXIT"))
		{
			System.out.println("Choose an option:");
			System.out.println("[Area] - Calculate Area of a Room");
			System.out.println("[Exit] - Terminate the programm");
			System.out.println("[Precison] - Set Decimal places in showing output [2 - 10]");
			System.out.println("Current Precision: "+precision);
			System.out.print("Choose your destiny: ");
			menu = userInput.nextLine();
			menu = menu.toUpperCase();
			if(menu.equals("AREA")) {
				try {
					System.out.print("Please enter the width in feet: ");
					width = floatInput.nextFloat();
					if(width<0) {
						System.out.print("Width cannot be negative!. Enter it again: ");
						width = floatInput.nextFloat();
					}
					System.out.print("Please enter the length in feet: ");
					length = floatInput.nextFloat();
					if(length<0) {
						System.out.print("Width cannot be negative!. Enter it again: ");
						length = floatInput.nextFloat();
					}
					area = length*width; 
					System.out.print("Area of the room is: ");
					System.out.printf("%."+precision+"f", area);
					System.out.print(" square feet. Which is: ");
					System.out.printf("%."+precision+"f", area*0.09290304);
					System.out.println(" square meters.");
				}catch(Exception e){System.out.println(e);}
				
			}
			else if(!menu.equals("EXIT") && !menu.equals("PRECISION")) System.out.println("Wrong Option Mate, Try again");
			else if(menu.equals("PRECISION")) {
				System.out.print("Enter Precision [2-10]: ");
				precision = floatInput.nextByte();
				while((precision < 2) || (precision > 10)){
					System.out.print("Value out of range!!! It has to be between 2 and 10. Enter Precision: ");
					precision = floatInput.nextByte();
				}
			}
		}
	}

}
