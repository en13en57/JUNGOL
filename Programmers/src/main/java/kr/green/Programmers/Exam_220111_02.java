package kr.green.Programmers;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/*
자연수 뒤집어 배열로 만들기
문제 설명
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 
예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

제한 조건
n은 10,000,000,000이하인 자연수입니다.
입출력 예
n	return
12345	[5,4,3,2,1]
*/
public class Exam_220111_02 {

	public int[] solution(long n) {
		String[] t = new StringBuffer(n+"").reverse().toString().split(""); // 문자로 만들어 뒤집고 배열로 변환
		// 리턴은 int배열이다.
		int[] answer = new int[t.length]; // 정수배열 만들고
		for(int i=0;i<t.length;i++) { // 반복
			answer[i] = t[i].charAt(0)-'0'; // 어차피 1글자
	}
		return answer;
}

	@Test
	public void test() {
		assertArrayEquals(new Exam_220111_02().solution(12345), new int[] {5,4,3,2,1});
	}
}
