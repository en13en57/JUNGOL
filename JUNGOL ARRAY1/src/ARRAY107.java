import java.util.Scanner;

/* 배열1-자가진단7
10개의 정수를 입력받아 100 미만의 수 중 가장 큰 수와 
100 이상의 수 중 가장 작은 수를 출력하는 프로그램을 작성하시오.

(입력되는 정수의 범위는 1이상 10,000 미만이다. 만약 해당하는 수가 없을 때에는 100 을 출력한다.)
 */
public class ARRAY107 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int min = 1;
		int mid = 100;
		int max = 10000;
		for(int i=0;i<arr.length;i++) {
			int input = sc.nextInt();
			arr[i] = input;
			if(arr[i]<max && arr[i]>=mid) {
				max = arr[i];
			} else if(arr[i]>min && arr[i]<mid) {
				min = arr[i];
			}
		}
		System.out.println(min + " " + max);
	}	
}
