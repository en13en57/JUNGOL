import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BaekJoon_1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double sum = 0, avg = 0, temp = 0;
		Double ar[] = new Double[n];
		for(int i=0;i<n;i++) {
			int score = sc.nextInt();
			ar[i] = (double) score;
		}
		Arrays.sort(ar, Collections.reverseOrder());
		for(int i=0;i<n;i++) {
			temp = (ar[i]/ar[0])*(double)100;
			sum += temp;
		}
		avg = sum/(double)n;
		System.out.println(avg);
		sc.close();
	}
}
