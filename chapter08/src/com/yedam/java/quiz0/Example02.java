package com.yedam.java.quiz0;

public class Example02 {

	public static void main(String[] args) {
		// 문제 2 > 다음을 만족하는 클래스 SalaryMan를 작성하시오.
		// - 필드 salary는 월 급여액을 저장하며, int형으로 초기값으로 1,000,000 저장
		// - 메서드 getAnnulGross()는 연봉을 계산해 반환하는 메서드로
		// 연봉은 12월 월급여액에 한달 월급여액 * 500%를 더한 값으로 한다.
		// - 기본생성자에서 필드 salary의 초기 값을 사용하며,
		// 정수형 매개변수를 가지는 생성자에서 해당 매개변수를 월 급여액으로 저장

		System.out.println(new SalaryMan().getAnnualGross());
		System.out.println(new SalaryMan(2000000).getAnnualGross());
		System.out.println();

		// 문제3) 다음은 만족하는 클래스 StudentScores를 작성하시오.
		// -필드로 학생이름(String), 학급(int), 국어점수(int), 영어점수(int), 수학점수(int) 를 가진다.
		// -기본생성자는 없으며,
		// -생성자를 통해 학생이름과 학급을 저장한다.
		// -메서드는 다음과 같이 구성된다.
		// 1) 각 필드별 getter와 setter
		// 2) 메서드 getTOtal()은 모든 과목의 점수를 더한 총합을 반환한다.
		// 3) 메서드 getAverage()은 모든 과목의 점수의 평균을 반환한다.
		StudentScores studentHong = new StudentScores("홍길동", 1);
		studentHong.setKorean(100);
		studentHong.setEnglish(60);
		studentHong.setMath(76);
		System.out.println("이 학생은 " + studentHong.getGrade() + "학년입니다.");
		System.out.println("학생" + studentHong.getName() + "의 총 점수는 " + studentHong.getTotal() + "이고, 평균은 "
				+ studentHong.getAverage() + "입니다.");
		System.out.println();

		// 문제 4) 다음을 만족하는 클래스 account를 작성하시오.
		// -필드로 예금주(String), 잔액(long)을 가진다.
		// -생성자를 통해 예금주를 저장한다.
		// -메서드는 다음과 같이 구성된다.
		// 1) 각 필듸의 getter를 가진다
		// 2) 메서드 deposit은 외부에서 매개변수로 받은 값을 저축한다.
		// 3) 메서드 withdraw은 외부에서 매개변수로 받은 값을 인출한다.

		Account account = new Account("신용권");
		account.deposit(10000);
		account.withdraw(4800);
		account.getPrint();
		System.out.println(account.getName() + "님의 계좌 잔액은" + account.getBalance() + "입니다.");
		
		System.out.println();
		
		NamedCircle w = new NamedCircle(5, "Waffle");
		w.show();
		/*
		
		  문제2) 다음 코드와 실행 결과를 참고하여 추상 클래스 Calculator를 상속받는 Adder와 Subtracter 클래스를 작성하라.
		  		
				
				- 실행결과
				정수 2개를 입력하세요 >> 5 3
				계산된 값은 8
				정수 2개를 입력하세요 >> 3 5
				계산된 값은 -2
	*/
		
		Adder a = new Adder();
		Subtracter b = new Subtracter();
		
		a.run();
		b.run();
		
		
		
		Won2Dollar toDollar = new Won2Dollar(1200); // 1달러는 1200원
			toDollar.run();
		/*
		문제3) 다음은 단위를 변환하는 추상 클래스 Converter이다.
			  Converter 클래스를 상속받아 원화를 달러로 변환하는 Won2Dollar 클래스를 작성하라. 
			  main() 메소드와 실행 결과는 다음과 같다.
			  - abstract class Converter {
   					abstract protected double convert(double src); // 추상 메소드
   					abstract protected String getSrcString(); // 추상 메소드
   					abstract protected String getDestString(); // 추상 메소드
   					protected double ratio; // 비율
   					public void run() {
      					Scanner scanner = new Scanner(System.in);
      					System.out.println(getSrcString()+"을 "+getDestString()+"로 바꿉니다.");
      					System.out.print(getSrcString()+"을 입력하세요>> ");
      					double val = scanner.nextDouble();
      					double res = convert(val);
      					System.out.println("변환 결과: "+res+getDestString()+"입니다");
      					scanner.close();
  					 }
					}
				
				- 실행코드
				public static void main(String args[]) {
   					Won2Dollar toDollar = new Won2Dollar(1200); // 1달러는 1200원
   					toDollar.run();
				}
				
				- 실행결과
				원을 달러로 바꿉니다.
				원을 입력하세요>> 24000
				변환 결과: 20.0달러입니다
*/	
		
		
		
	}

}
