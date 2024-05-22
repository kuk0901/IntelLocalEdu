import java.util.Scanner;

public class RockPaperScissorsGame {

	public static void main(String[] args) {
		int user, com;
		String userHandStr = "";
		String comHandStr = "";
		
		// 의미 치환
		System.out.println("가위(1), 바위(2), 보(3) 중 하나 선택");
		
		Scanner scan = new Scanner(System.in);
		user = scan.nextInt();
		
		com = (int)(Math.random() * 3) + 1;
		
		switch (user - com) {
			case 1, -2: {
				System.out.println("당신이 졌습니다.");
				break;
				
			}
			case 0:
				System.out.println("당신이 이겼습니다.");
				break;
		}
		
		// 개발 코드와 사용자의 상호 작용 사이의 치환 로직
		if (user == 1) {
			userHandStr = "가위";
		} else if (user == 2) {
			userHandStr = "바위";
		} else if (user == 3) {
			userHandStr = "보";
		}
		
		System.out.println("당신은 " + userHandStr + "입니다");
		System.out.println("컴은 " + com + "입니다");
		System.out.println();

		System.out.println("프로그램 종료");
		

	}

}
