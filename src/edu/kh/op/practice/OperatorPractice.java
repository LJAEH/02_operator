package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		
		/*
		 * 모든 사람이 사탕을 골고루 나눠가지려고 한다. 
		 * 인원 수와 사탕 개수를 키보드로 입력 받고 
		 * 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 
		 * 남은 사탕의 개수를 출력하세요.
		 * 
		 * [실행화면]
		 * 인원 수 : 29
		 * 사탕 개수 : 100
		 * 1인당 사탕 개수 : 3
		 * 남는 사탕 개수 : 13
		 * 
		 */
		
		Scanner sc = new Scanner(System.in); // 입력
			
		System.out.print("인원 수 : "  );
		int input = sc.nextInt();
		
		System.out.print("사탕 개수 : "  );
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : "+ (candy / input) );
		System.out.println("남는 사탕 개수 : " + (candy % input) );
	}

	public void practice2() {
		
		/*
		 * ex.
		 * 이름 : 홍길동
		 * 학년(정수만) : 3
		 * 반(정수만) : 4
		 * 번호(정수만) : 15
		 * 성별(남학생/여학생) : 남학생
		 * 성적(소수점 아래 둘째 자리까지) : 85.75
		 * 3학년 4반 15번 홍길동 남학생의 성적은 85.75이다.
		 * 
		 */
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("학년(정수만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(정수만) : ");
		int classnumber = sc.nextInt();
		
		System.out.print("번호(정수만) : ");
		int number = sc.nextInt();
		
		System.out.print("성별(남학생/여학생) : ");
		String gender = sc.next();
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double score = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s (%s학생)의 성적은 %.2f점 입니다." ,
				grade, classnumber, number, name, gender, score); // 소수점 2번째 자리까지 표시
	}
	
	public void practice3() {
		/*
		 * 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
		 * 세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
		 * [실행화면]
		 * 국어 : 60
		 * 영어 : 80
		 * 수학 : 40
		 * 합계 : 180
		 * 평균 : 60.0
		 * 
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
	
		
		
		int sum = kor + eng + math;
		double avg = sum/3.0;
		
		System.out.println("합계 : " + sum);
		
		System.out.printf("평균 : %.1f", avg); // 소숫점 1자리 까지 표시
		
		boolean result = (kor >= 40) && (eng >= 40) && (math >= 40)
				         && (sum >= 60);
		
		System.out.println();
		System.out.println(result ? "합격" : "불합격");
								// 조건식 ? 식1 : 식2  <-삼항연산자
		
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1과목 : ");
		int first = sc.nextInt();
		
		System.out.print("2과목 : ");
		int sec = sc.nextInt();
		
		System.out.print("3과목 : ");
		int third = sc.nextInt();
		

		String str1 = "합격";
		String str2 = "불합격";
		
		String result = (first>40) && (sec>40) && (third>40) && ((first + sec + third)/3>60  ? str1 : str2;
		System.out.println(result);
		
		
		
		
	}
}
