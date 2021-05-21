package com.test;
import java.util.Scanner;
public class WorkShop1_2 {
	public static float getUserInput() {
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		return Float.parseFloat(inputString);		
	}
	public static void main(String[] args) {	
		// WorkShop1_2 작성하시오. 
		// 계속적으로 입력처리 가능하도록 처리 
	System.out.println("Computer Science 성적을 입력하세요 : ");
	float a1 = getUserInput();
	System.out.println("JAVA Programming 성적을 입력하세요 : ");
	float a2 = getUserInput();
	System.out.println("공학수학 성적을 입력하세요 : ");
	float a3 = getUserInput();
	System.out.println("오페라의 이해 성적을 입력하세요 : ");
	float a4 = getUserInput();
	System.out.println("배드민턴 성적을 입력하세요 : ");
	float a5 = getUserInput();
	System.out.println("=================== ");
	boolean a1Check = (a1>= 2.5)? true:false;
	boolean a2Check = (a1>= 2.5)? true:false;
	boolean a3Check = (a1>= 2.5)? true:false;
	boolean a4Check = (a1>= 2.5)? true:false;
	boolean a5Check = (a1>= 2.5)? true:false;
	boolean allCheck = a1Check
			&&a2Check && a3Check && a4Check && a5Check;
	float totalScore = (a1 + a2 + a3 + a4 + a5  )/5;
	System.out.println("평점은" + totalScore +  "점 입니다. ");
	if(totalScore>=3.7) {
		if(totalScore>=3.7) {
			if(allCheck) {
				System.out.println("다음 학기 장학금 대상자 입니다.");
			}
		}
	}
	
	
	}
}

	
	