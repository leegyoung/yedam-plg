package com.yedam.java.ch0204;

import java.util.Scanner;

public class VariableExample {

	public static void main(String[] args) {
		//println(), print() 메소드
		System.out.println("오늘은 월요일입니다.");
		System.out.print("2021년 ");
		System.out.print("12월 ");
		System.out.print("27일\n");
		
		//printf()
		int x = 1;
		int y = 2;
		System.out.println("1. x : " + x + ", y : " + y);
		System.out.printf("2. x : %d, y : %d\n", x, y);
		
		int result = x + y;
		System.out.printf("%d + %d = %d\n", x, y, result);
		
		//Scanner
		Scanner scanner = new Scanner(System.in);
		
		/*
		String testData = scanner.nextLine();
		System.out.println(testData);
		*/
		/*String inputData;
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열 : " + inputData);
			if(inputData.equals("exit")) {
				break;
			}
		}*/
	    long var1 = 2L;
	    float var2 = 1.8f;
	    double var3 = 2.5;
	    String var4 = "3.9";
	    
	    int result1 = (int)(var1 + var2 + (int)var3 + Double.parseDouble(var4));
	    System.out.println(result1);
	    
	    //문제11
	    byte value1 = Byte.parseByte("10");
	    int value2 = Integer.parseInt("1000");
	    float value3 = Float.parseFloat("20.5");
	    double value4 = Double.parseDouble("3.14159");
	    
	    System.out.println(value1);
	    System.out.println(value2);
	    System.out.println(value3);
	    System.out.println(value4);
	    
	     		
				

	}

}
