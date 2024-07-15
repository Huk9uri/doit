package stack;

import java.util.EmptyStackException;
import java.util.Scanner;

public class backjoon_10828 {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt(); // 첫 입력은 명령의 개수
	int[] arr = new int[n]; // 배열 최대 길이는 명령의 개수보다 작을 수 밖에 없다. 
	// 모든 명령을 push로 해도 명령 개수만큼만 배열 사이즈를 만들어주면 됨
	private int ptr; // 스택 포인터
	
	public void push(int value) {
		ptr = 0;
		ptr++;
		arr[ptr-1] = value;
		
	}
	
	public int pop() {
		if(ptr == 0) { // 비어있다면
			System.out.println("-1");
		}
		int value = arr[ptr-1];
		arr[ptr] = (Integer) null;
		ptr--;
		return value;
		
	}
	
	public int size() {
		int result = ptr + 1;
		return result;
	}
	
	public int empty() {
		int result = 1;
		if (ptr == -1) { // 스택이 비어있다면
			return result; // 1을 출력한다.
		}else { // 스택이 비어있지 않다면
			result = 0; //0을 출력한다.
		}
		return result;
	}
	
	public int top() {
		int result = arr[ptr-1];
		return result;
	}
}
