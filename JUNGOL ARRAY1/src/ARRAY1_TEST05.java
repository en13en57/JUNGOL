import java.util.Scanner;

/* 배열1-형성평가5

6명의 몸무게를 입력받아 몸무게의 평균을 출력하는 프로그램을 작성하시오.

출력은 반올림하여 소수 첫째자리까지로 한다.

 *
 */
public class ARRAY1_TEST05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double arr[] = new double[6];
		double sum = 0, avg = 0;
		for (int i = 0; i < arr.length; i++) {
			double input = sc.nextDouble();
			arr[i] = input;
			sum += arr[i];
		}
		avg = sum/(double)arr.length;
		System.out.printf("%.1f", avg);

	}
}
