package sec03.sec02.exam08;

public class 비교_연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2==v3); // true
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4==v5); // false 0.1f는 0.1근사값으로표현되서 0.1보다 큰값이 되어버림
		System.out.println((float)v4==v5);		// float 타입 변환후 진행하면 true
	}

}
