
// Dobby
public class CastingBasic1 {

	public static void main(String[] args) {
		// boolean을 제외한 나머지 7개의 기본형은 서로 형 변환 가능
		// 기본형과 참조형은 서로 형 변환 불가능
		// 서로 다른 타입 간의 연산은 형 변환을 하는 것이 원칙이나,
		// 값의 범위가 작은 타입에서 큰 타입으로 형 변환은 생략 가능
		int firstNum = 0;
		int secondNum = 0;

		int totalNum = 0;
		double avg = 0.0;

		// 총점과 평균 구하기
		firstNum = 10;
		secondNum = 7; // 반올림 올림 처리
		// secondNum = 3; // 반올림 내림 처리
		totalNum = firstNum + secondNum;
		/*
		 * avg = (double)totalNum / 2; System.out.println("총점: " + totalNum);
		 * System.out.println("평균: " + avg);
		 * 
		 * // 소수점 3자리 반올림 // 소수점 1자리 올림 avg = (double)totalNum / 3;
		 * 
		 * System.out.println(avg);
		 */

		
		avg = (int)((double)totalNum / 3 * 100) / 100.0; 
		System.out.println("내림" + avg); // 3번째 자리에서 내림
		avg = ((double)totalNum / 3 + 0.005 * 100) / 100.0;
		System.out.println("반올림" + avg); // 3번째 자리에서 반올림 
		avg = (int)(((double)totalNum / 3 + 0.005) * 100) / 100.0;
		System.out.println("올림" + avg); // 3번째 자리에서 올림 
		 

		// 반올림, 기능 분리
		avg = (double) totalNum / 3;
		System.err.println("(double)totalNum / 3 : " + avg);

		avg += 0.005;
		System.out.println("avg += 0.005 : " + avg);

		avg *= 100;
		System.out.println("avg *= 100 : " + avg);

		avg = (int) avg;
		System.out.println("avg = (int)avg : " + avg);

		avg = avg / 100;
		System.out.println("avg = avg / 100 : " + avg);
	}

}
