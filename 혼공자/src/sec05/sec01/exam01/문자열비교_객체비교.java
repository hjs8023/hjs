package sec05.sec01.exam01;

public class 문자열비교_객체비교 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		if (strVar1 == strVar2) {
			System.out.println("strVar1 과 strVar2는 참조가 같음 ");
		} else {
			System.out.println("strVar1 과 strVar2는 참조가 다름");
			
		}
		
		if(strVar1.equals(strVar2)) {		//  동일한 String객체이건 다른 객체이건 상관없이 내부 문자열을 비교할때 String객체의 원본문자열.equals(비교문자)메소드를 사용 
			System.out.println("strVar1 과 strVar2는 문자열이 같음 ");
		}
		
		
		String strVar3 = new String("신민철");		// new 연산자 사용해서 힙영역에 새로운 객체 만듦  (객체 생성 연산자)
		
		String strVar4 = new String("신민철");		// new 연산자 사용해서 힙영역에 새로운 객체 만듦  (객체 생성 연산자)
		
		if( strVar3 == strVar4) {
			System.out.println("strVar3 과 strvar4 는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4 참조가 다름");
		}
		if(strVar3.equals(strVar4)) {		//  동일한 String객체이건 다른 객체이건 상관없이 내부 문자열을 비교할때 String객체의 원본문자열.equals(비교문자)메소드를 사용 
			System.out.println("strVar3 과 strvar4 는 문자열 같음");
		}
	}

}
