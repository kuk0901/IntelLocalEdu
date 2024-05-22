import java.util.Scanner;

// 
public class VarStringBasic2 {

	public static void main(String[] args) {
		// 문자열
		String str = "Hello world";
		
		// 문자
		char ch = 'a';
		
		byte b = 1;
		
		int num = 100;
		
		// concat, 합성 / 더하다
		System.out.println("sdqwfawfwq " + num);
		System.out.println("와 한글이... ㅋㅋ..");
		System.out.println("아\t" + "한글이 된다");
		System.out.println(str + " ㄷㄷ");
		
		System.out.printf("오 c언어 생각나네%d\n", num);
		System.out.printf("오 c언어 생각나네%d\n", num);
		
		System.out.print("아");
		System.out.print("하");
		System.out.print(" 이게 라인 넘기는 것 없이 출력\n");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("놀랐지? 아무 글이나 작성해봐");
		String input = sc.nextLine();
		
		System.out.println("작성한 글 -> " + input);
		
		num = sc.nextInt();
		System.out.println("작성한 글 -> " + (num + 10));
		
		
	}

}
