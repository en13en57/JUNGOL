import java.util.Scanner;

/* 배열1-형성평가7

세 자리 이하의 정수를 차례로 입력 받다가 999가 입력되면 
프로그램을 종료하고 그 때까지 입력된 최대값과 최소값을 출력하는 프로그램을 작성하시오.
입력받는 정수는 100개 이하이다.
 *
 */
public class ARRAY1_TEST07_check {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[100];
		int temp=0;
		for(int i=0;i<arr.length;i++);
		int input = sc.nextInt();
			if(input==999) {
				
						
			}
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(input)) {
				System.out.println(i);
				count++;
			}
			}
		if (count == 0) {
			System.out.println("none");
		}
	}
}