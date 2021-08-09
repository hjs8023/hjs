package sec03.exam06;

public class 문자열_결합_연산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 숫자 연산
		int value = 10 + 2 + 8;
		System.out.println(value);
		
		//문자열 결합 연산
		String str1 = 10 + 2 + "8";
		System.out.println("str1:"+ str1);
		
		String str2 = 10 + "2" + 8;
		System.out.println("str2 :"+ str2);
		
		String str3 = "10" + 2 + 8;
		System.out.println("str3:"+ str3);
		
		String str4 = "10" + (2+8);
		System.out.println("str4:"+ str4);
	}

}
