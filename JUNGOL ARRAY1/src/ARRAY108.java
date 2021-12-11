import java.util.Scanner;

/* 배열1-자가진단8
10개의 정수를 입력받아 배열에 저장한 후 짝수 번째 입력된 값의 합과 
홀수 번째 입력된 값의 평균을 출력하는 프로그램을 작성하시오.

평균은 반올림하여 소수첫째자리까지 출력한다.
 */
public class ARRAY108 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int odd=0, even = 0, count = 0;
		double avg = 0;
		for(int i=0;i<arr.length;i++) {
			int input = sc.nextInt();
			arr[i] = input;
			if((i)%2==0) {
				odd += arr[i];
				count++;
			} else 
				even += arr[i];
			}
			avg = even/(double)count;
			System.out.printf("sum : %d\navg : %.1f", odd, avg);
			
	}	
}
