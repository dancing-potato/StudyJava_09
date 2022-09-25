package JAVA0725_array;

public class Test3 {

	public static void main(String[] args) {
		/*
		 * n 개의 숫자가 입력되면
		 * n 개의 숫자를 왼쪽으로 하나씩 돌려서 출력하시오!
		 * 
		 * 입력예시)
		 * 5
		 * 1 2 3 4 5
		 * 출력예시)
		 * 1 2 3 4 5
		 * 2 3 4 5 1
		 * 3 4 5 1 2
		 * 4 5 1 2 3 
		 * 5 1 2 3 4 
		 * 
		 * */
		int[] arr= {1, 2, 3, 4, 5};

		// 5번 반복
		for(int i = 0; i < arr.length; i++) {	
			printArray(arr);
			rotation(arr);
		}
		
	}	// main() 메서드 끝
	
	// 배열확인용 출력
	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	// 배열 rotation
	public static void rotation(int[] arr) {
		int temp = arr[0];
		for(int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = temp;
	}
	
	
	
	
	
	
	
	

}
