import java.util.Scanner;

/* 반복제어문2-자가진단5

 10개의 정수를 입력받아 3의 배수의 개수와 5의 배수의 개수를 각각 출력하는 프로그램을 작성하시오.
 
 */
public class LOOP205 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n3 = 0, n5 = 0;
		for (int i = 0; i < 10; i++) {
			int n = sc.nextInt();
			if(n%3==0) n3++;
			if(n%5==0) n5++;
		}
		System.out.printf("Multiples of 3 : %d\nMultiples of 5 : %d", n3, n5);
		sc.close();
	}
}
