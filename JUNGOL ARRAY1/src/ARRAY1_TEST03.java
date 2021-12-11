import java.util.Scanner;

/* 배열1-형성평가3

10개의 정수를 입력받아 홀수 번째 입력받은 정수의 합과 
짝수 번째 입력받은 정수의 합을 출력하는 프로그램을 작성하시오.

 *
 */
public class ARRAY1_TEST03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int odd = 0, even = 0;
		for (int i = 0; i < arr.length; i++) {
			int input = sc.nextInt();
			arr[i] = input;
			if(i%2==0) odd += arr[i];
			else even += arr[i];
		}
		System.out.printf("odd : %d\neven : %d", odd, even);

	}
}
