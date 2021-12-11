import java.util.Scanner;

/* 배열1-자가진단3
 10개의 문자를 입력받아서 첫 번째 네 번째 일곱 번째 입력받은 
 문자를 차례로 출력하는 프로그램을 작성하시오.
 */
public class ARRAY103 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char word[] = new char[10];
		for(int i=0;i<word.length;i++) {
			String alphabet = sc.nextLine();
			word[i] = alphabet.charAt(0);
		}
		System.out.print((word[0] + " " + word[3] + " " + word[6]));
		
	}	
}
