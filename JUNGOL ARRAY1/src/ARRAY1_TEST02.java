import java.util.Scanner;

/* 배열1-형성평가2
5개의 정수를 입력받은 후 첫 번째 세 번째 다섯 번째 입력받은 
정수의 합을 출력하는 프로그램을 작성하시오.
 */
public class ARRAY1_TEST02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			int input = sc.nextInt();
			arr[i] = input;
		}
		System.out.println(arr[0] + arr[2] + arr[4]);

	}
}
