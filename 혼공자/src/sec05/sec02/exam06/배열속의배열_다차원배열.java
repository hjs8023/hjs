package sec05.sec02.exam06;

public class 배열속의배열_다차원배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mathScores = new int[2][3];				// int타입 이차원 배열선언 배열 - 배열변수mathscores선언- new연산자 int타입선언 [2]행,[3]열 형성
		for(int i =0; i<mathScores.length; i++) {			// 0부터 배열변수 길이까지 증감 for문 선언    i = 0~1
			for(int k =0; k<mathScores[i].length; k++) {		// 0부터 배열변수 길이까지 증감 for문 선언  k= 0~2
				System.out.println("mathScores["+i+"]["+k+"]=" + mathScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] englishScores = new int[2][];		// int타입 이차원 배열선언[][] -- 배열변수englishScores선언 -- int타입 new연산자 선언후 [2]행[0]열 형성
		englishScores[0] = new int[2];				// english[0] 인덱스에 길이 2짜리 배열생성
		englishScores[1] = new int[3];				// english[1] 인덱스에 길이 3짜리 배열생성
		for (int i =0; i<englishScores.length; i++) {
			for(int k =0; k<englishScores[i].length; k++) {
				System.out.println("englishScores["+i+"]["+k+"]=" + englishScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] javaScores = { {95,80},{92,96,80} };
		for(int i=0; i<javaScores.length; i++) {
			for(int k =0; k<javaScores[i].length; k++) {
				System.out.println("javaScores["+i+"]["+k+"]=" + javaScores[i][k]);
			}
		}
	}

}
