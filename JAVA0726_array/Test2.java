package JAVA0726_array;

public class Test2 {

	public static void main(String[] args) {

		String[] names = {"우영우","그라미","최수연","권민우","이준호"};
		int[][] score = { {80, 80, 80},
						  {90, 80, 77},
						  {60, 50, 60},
						  {100, 100, 100},
						  {50, 80, 100}
		};
		
		
		
		System.out.println("\t국어\t영어\t수학");
		for(int i = 0; i < score.length; i++) {
			System.out.print(names[i]+ "\t");
			
			for(int j = 0;j < score[i].length; j++) {
				
				System.out.print(score[i][j] + "\t");
				
			}
			System.out.println();
			
		}
		
		System.out.println("----------------------------");		
		System.out.println("< 학생별 총점 >");
		
		
		
		
		for(int i = 0; i < score.length;i++) {
			System.out.print(names[i]+ ": ");
			
			int total=0;
			for(int j = 0; j < score[j].length;j++)
				total += score[i][j];
				System.out.println(total+"점");
		}
		
		
	}

}
