public class ForBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// for문은 반복 횟수를 알고 있을 때 적합
		// 구조가 직관적이라 이해하기 쉬움
		
		// 표현식(expression)
		/*
		 for (초기화; 조건식; 증감식) {
			// 조건식이 참일 때 수행할 문장 작성
		}
		*/
		
		for (int i = 0; i < 5; i++) {
			System.out.print("I can do it!.");
			System.out.print("\t1");
			System.out.println();
		}
		
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			System.out.println();
		}
	}

}
