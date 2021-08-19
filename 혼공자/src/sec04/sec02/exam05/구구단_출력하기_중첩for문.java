package sec04.sec02.exam05;

public class 구구단_출력하기_중첩for문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int m=2; m<=9; m++) {  // 바깥쪽 for 문
			System.out.println("***" + m + "단***");
			for(int n=1; n<=9; n++) {			// 중첩 FOR문
				System.out.println(m+ "x" + n + "=" + (m*n));  //중첩 for문
			}
		}
	}

}
