import java.util.Scanner;

/* 배열1-자가진단6
10개의 정수를 입력받아 그 중 가장 작은 수를 출력하는 프로그램을 작성하시오.
(입력받을 정수는 1000을 넘지 않는다.)
 */
public class ARRAY106 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int min = 1000;
		for(int i=0;i<arr.length;i++) {
			int input = sc.nextInt();
			arr[i] = input;
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}	
}
