package sec05.sec02.exam01;

public class 값_목록으로_배열_생성 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]scores = {83,90,87};
		
		System.out.println("scores[0]:" + scores[0]);		// 83 반환
		System.out.println("scores[1]:" + scores[1]);		//	90 반환
	System.out.println("scores[2]:" + scores[2]);			//	87 반환
	
	
	int sum = 0;
	for(int i =0; i<3; i++) {
		sum += scores[i];
				
	}
	
	System.out.println("총합 : " + sum);
	double avg = (double) sum /3;
	System.out.println("평균:" + avg);
	
	}
}
