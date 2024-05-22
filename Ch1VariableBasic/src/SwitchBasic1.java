import java.util.Scanner;

public class SwitchBasic1 {

	public static void main(String[] args) {
		// 제어문 중 하나
		// switch문 
		System.out.println("점수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		String grade = "";
		
		switch (score / 10) {
			case 9: {
				grade = "A";
				break;
			}
			case 8: {
				grade = "B";
				break;
			}
			case 7: {
				grade = "C";
				break;
			}
			case 6: {
				grade = "D";
				break;
			}
			default : {
				grade = "F";
				break;
			}
		}
		System.out.println("학점 : " + grade);
	}

}
