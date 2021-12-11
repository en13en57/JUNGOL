import java.util.Scanner;

/* 배열1-자가진단4
100 개의 정수를 저장할 수 있는 배열을 선언하고 정수를 차례로 입력받다가 0 이 입력되면 0 을 제외하고 
그 때까지 입력된 정수를 가장 나중에 입력된 정수부터 차례대로 출력하는 프로그램을 작성하시오.
 */
public class ARRAY104 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n[] = new int[100];
		
		for(int i=0;i<n.length;i++) {
			int input = sc.nextInt();
			n[i] = input;
			if(input==0) 
				for(int j=1;j<=i;j++) {
					System.out.print(n[i-j] + " ");
			}
		}
	}	
}
