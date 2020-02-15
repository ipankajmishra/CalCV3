package com.sapient.ui;

import java.util.Scanner;
import java.util.StringTokenizer;

import p1.exceptions.Invalid_Number_System;
import p1.exceptions.Invalid_date_Exception;
import p1.runtimepoly.ConversionMethods;



public class CalculatorDemoV3 extends History{
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {



		while(true) {
			System.out.println();
			System.out.println("-----------Choose the Calculator functionality ------");
			System.out.println("1:Scientific Calculator");
			System.out.println("2:Date Calculator");
			System.out.println("3:Conversions");
			System.out.println("4:History");

			int input = Integer.parseInt(sc.nextLine());
			switch(input) {
			case 1:
				String expression = sc.nextLine();
				try {
					System.out.println(scientificCalculation(expression));
				}catch(Exception e) {
					System.out.println("Error Message : "+e.getMessage());
				}
				break;
			case 2:
				System.out.println("Enter dates(yyyy/MM/dd hh:mm) to calculate\nFor Example - 2019/10/20 - 3 or 2019/10/20 + 3");

				String x = sc.nextLine();
				//System.out.println(dateCalculator(0,x));

				try {
					History ob = dateCalculator(0,x);
					System.out.println("Output : "+ob);
					System.out.println();
					System.out.println("History : ");
					//ob.displayHistory();
					System.out.println();
				}catch(Exception e) {
					System.out.println("Error Message : "+e.getMessage());
				}


				break;
			case 3:
				try {
					otherConversions();

				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				System.out.println("--------------History-------------");
				displayHistory();
				break;
			default: 
				System.out.println("Invalid input"); 
				break; 
			} 
		}










	}

	private static void otherConversions() {
		System.out.println("Enter the input");
		String expressions = sc.nextLine();
		System.out.println("Choose from below conversion options:");
		System.out.println();

		System.out.println("1) Decimal to binary\r\n" + 
				"		2) Decimal to octal\r\n" + 
				"		3) Decimal to hexadecimal\r\n" + 
				"		4) Binary to decimal\r\n" + 
				"		5) Octal to decimal\r\n" + 
				"		6) Hexadecimal to decimal");
		int input = Integer.parseInt(sc.nextLine());
		switch(input) {
		case 1:
			try {

				ConversionMethods conversionMethods = new ConversionMethods();
				System.out.println(conversionMethods.decimalToBinary(expressions));
			}catch(Exception e) {
				System.out.println("Error Message : "+e.getMessage());
			}
			break;
		case 2:
			try {

				ConversionMethods conversionMethods = new ConversionMethods();
				System.out.println(conversionMethods.decimalToOctal(expressions));
			}catch(Exception e) {
				System.out.println("Error Message : "+e.getMessage());
			}
			break;
		case 3:
			try {

				ConversionMethods conversionMethods = new ConversionMethods();
				System.out.println(conversionMethods.decimalToHexaDecimal(expressions));
			}catch(Exception e) {
				System.out.println("Error Message : "+e.getMessage());
			}
			break;
		case 4:
			try {

				ConversionMethods conversionMethods = new ConversionMethods();
				System.out.println(conversionMethods.BinaryToDecimal(expressions));
			}catch(Exception e) {
				System.out.println("Error Message : "+e.getMessage());
			}
			break;
		case 5:
			try {

				ConversionMethods conversionMethods = new ConversionMethods();
				System.out.println(conversionMethods.OctalToDecimal(expressions));
			}catch(Exception e) {
				System.out.println("Error Message : "+e.getMessage());
			}
			break;
		case 6:
			try {

				ConversionMethods conversionMethods = new ConversionMethods();
				System.out.println(conversionMethods.HexadecimalTodecimal(expressions));
			}catch(Exception e) {
				System.out.println("Error Message : "+e.getMessage());
			}
			break;
		default: 
			System.out.println("Invalid Number System"); 
			break; 
		}


	}

	public static History dateCalculator(int a,String x1) throws Exception {
		History ob = Factory.getEvaluatro(0,x1);
		try {
			//Date_Evaluator ob = new Date_Evaluator(x);

			ob.evaluate();


			return(ob);
		}
		catch (Invalid_date_Exception e) {
			// TODO: handle exception
			//System.out.println(e);
			throw e;
		}
	}

	public static Expression_Evaluator scientificCalculation(String expression) throws Exception {
		try {
			return(expressionEval(expression));
		}catch(Exception e) {
			//System.out.println(e.getMessage());
			//e.printStackTrace();
			throw e;
		}

	}

	private static Expression_Evaluator expressionEval(String expression) throws Exception {
		try {

			Expression_Evaluator ob = new Expression_Evaluator(expression);
			ob.evaluate();
			return ob;

		}
		catch (Exception e) {
			throw e;
		}// TODO Auto-generated method stub

	}

	@Override
	public void evaluate() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
