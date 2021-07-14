
public class 복합대입연산자CompAssignOp83p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short num = 10;
		num = (short)(num + 77L);  // 롱형 변환 안하면 컴파일 오류 발생
		int rate = 3;
		rate = (int) (rate * 3.5); // 형 변환 안하면 컴파일 오류 발생
		System.out.println(num);
		System.out.println(rate);
		
		num = 10;
		num += 77L; //형변환 필요하지 않음  복합 대입연산자 사용으로 형변환 x
		rate = 3;
		rate *= 3.5;  // 형 변환 필요 하지 않다. 복합 대입연산자 사용하면 형변환 x
		System.out.println(num);
		System.out.println(rate);
		
	}

}
