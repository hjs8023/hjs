
public class 비트연산자96P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte n1 = 13;
		byte n2 = 7;
		byte n3 = (byte)(n1 &  n2);
		System.out.println(n3);
		//  비트 연산자는 각가의 비트를 대상으로 연산을 진행한다.
		// 그리고 각 비트를 대상으로 진행된 연산 결과를 묶어서 하나의 연산 결과를 반환한다.
		// 이진수 로 계산 13 = ( 0 0 0 0 1 1 0 1)
		// 이진수로  계산 05 = ( 0 0 0 0 0 1 0 1)  
		// 1<->1= 1  1<->0= 0  0<->1=0 0<->0=0 
	}

}
