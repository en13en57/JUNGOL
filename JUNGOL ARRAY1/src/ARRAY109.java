import java.util.Scanner;

/* 배열1-자가진단9
10개의 정수를 입력받아 배열에 저장한 후 내림차순으로 정렬하여 출력하시오.
 */
public class ARRAY109 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int temp = 0;
		for(int i=0;i<arr.length;i++) {
			int input = sc.nextInt();
			arr[i] = input;
		}
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length-1;j++) {
					if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					}
				}
			}
				for(int i=0;i<arr.length;i++) {
					System.out.print(arr[i] + " ");
			}
	   	}	
}
