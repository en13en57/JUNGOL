import java.util.Scanner;

/* 배열1-자가진단2
 정수 10 개를 저장할 수 있는 배열을 만들어서
 1 부터 10 까지를 대입하고 차례대로 출력하는 프로그램을 작성하시오..
 */
public class ARRAY102 {
	public static void main(String[] args) {
		int n[] = new int[10];
		int in = 0;
		for(int i=0;i<n.length;i++) {
			in = i+1;
			n[i] = in;
		}
		for(int i=0;i<n.length;i++) {
		System.out.print(n[i] + " ");
		}
	}	
}
