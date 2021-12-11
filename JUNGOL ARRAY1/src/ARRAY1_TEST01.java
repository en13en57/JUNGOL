import java.util.Scanner;

/* 배열1-형성평가1
10개의 문자를 입력받아 마지막으로 입력받은 
문자부터 첫 번째 입력받은 문자까지 차례로 출력하는 프로그램을 작성하시오.
 */
public class ARRAY1_TEST01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[10];
		for (int i = 0; i < arr.length; i++) {
			String input = sc.nextLine();
			arr[i] = input;
			}
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.println(arr[i] + " ");

		}

	}
}
