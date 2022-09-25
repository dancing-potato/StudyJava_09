package JAVA0726_array;

public class Test3_mine {

	public static void main(String[] args) {
	/*
	 * 
	 * 출발 70 80 60 20 30 50 10 80 77 89
	 * 			 ||	   ||	 ||
	 * 	  70 60  40 50 55 65 23 44 37 88 도착  
	 * 
	 * 북쪽에서 남쪽다리 index 번호가 주어진다.
	 * 이때, 가장 최소시간이 소요되는 다리는 몇번 다리인지 출력, 최소시간도 함께 출력
	 * 
	 * ex> 다리번호 6
	 * 	   최소시간 512
	 * 
	 * 주의사항.
	 * 1.무조건 다리1번 건너야함
	 * 2.다리를 여러번건널수x 딱 한번만 가능3
	 * 3.다리를 건널때는 남,북 소요시간이 같이소요. (즉,같이 합산해야함)
	 * 4.소요시간이 같은 경우 발생시 낮은 다리번호 출력	
	 * (4번같은 경우 비교시 메모리랑 속도도 생각해서 문제를 해결해야함. 
	 * 그리고 쓰고 사라지는게 아니라
	 * 배열같은?곳에 넣어서 계속 돌아갈수있도록? 할수있어야 함 ) 
	 * 
	 */
	
		int[] road1 = { 70,80,60,20,30,50,10,80,77,89 };
		int[] road2 = { 70,60,40,50,55,65,23,44,37,88 };
//		int[] road1 = { 10,10,10,10,10,10,10,10,10,10 }; 확인용
//		int[] road2 = { 10,10,10,10,10,10,10,10,10,10 }; 확인용 
		int[] brg = { 2,4,6 };
		
				
		
		int sum= 0;		
		int min = 600;
		int bnum = 0;
		
		
		for(int j=0; j<brg.length;j++) {
			//북
			for(int i = 0;i <= brg[j]; i++) {
				sum += road1[i];
				
			}
			//남
			for(int i = brg[j];i < road2.length; i++) {
				sum += road2[i];
				
			}
			
//		System.out.println(sum);
		
			
		if (min>sum) {
			min = sum;
			bnum = j;
		 }
			sum = 0;
			
		}
		System.out.println("다리번호: " + brg[bnum] + "\n" + "최소시간: " + min);
		}
	}

			
			
