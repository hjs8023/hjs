package sec04.sec02.exam04;
/*
 * 0.1은 float 타입으로 정확하게 표현할수 없기 때문에
 * 루프카운터 변수  x에 더해지는 실제값은 0.1보다 약간큽니다.
 * 결국 루프는 9번만 실행됩니다.
 * 
 */
public class float타입카운터변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(float x=0.1f; x<=1.0f; x+=0.1f) {
			System.out.println(x);
		}
	}

}
