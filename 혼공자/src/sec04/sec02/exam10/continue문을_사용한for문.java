package sec04.sec02.exam10;

public class continue문을_사용한for문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =1; i<=10; i++) {
			if(i%2 !=0) {		// 2로 나눈 나머지가 0이 아닐경우, 즉 홀수일경우		i를 2로나눴을때 0이아니라면 continue문 실행
				continue;		// 2로 나눈 나머지가 0이 아닐경우, 즉 홀수일경우 for문에 증감식 수행
			}
			System.out.println(i);			// 홀수는 실행되지않음
		}
	}

}
