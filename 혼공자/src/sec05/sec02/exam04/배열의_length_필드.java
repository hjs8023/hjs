package sec05.sec02.exam04;

public class 배열의_length_필드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {83,90,87};					// scores = 배열변수
		
		int sum = 0;
		for(int i =0; i<scores.length; i++) {			// scores.length = 3  .length는 배열의 길이 알수있음 배열의 길이란 배열에 저장할수있는 전체항목갯
			sum += scores[i];
		}
		System.out.println("총합 :" + sum);
		
		double avg = (double) sum / scores.length;		// 10행의 socres.length값 3 여기로 전달.
		System.out.println("평균 :" + avg);
	}

}
