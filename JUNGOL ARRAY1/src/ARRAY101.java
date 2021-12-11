import java.util.Scanner;

/* 배열1-자가진단1
 문자 10개를 저장할 수 있는 배열을 만들고 
 10개의 문자를 입력받아 입력받은 문자를 이어서 출력하는 프로그램을 작성하시오.
 */
public class ARRAY101 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char word[] = new char[10];
		for(int i=0;i<word.length;i++) {
			String alphabet = sc.nextLine();
			word[i] = alphabet.charAt(0);
		}
		for(int i=0;i<word.length;i++) {
		System.out.print(word[i]);
		}
	}	
}
